import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.XMLResource.XMLMap;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLMapImpl;

import SimplStateMachine.*;

public class StateMachineManipulation {

	public void sauverModele(String uri, EObject root) {
		Resource resource = null;
		try {
			URI uriUri = URI.createURI(uri);
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
			resource = (new ResourceSetImpl()).createResource(uriUri);
			resource.getContents().add(root);
			resource.save(null);
		} catch (Exception e) {
			System.err.println("ERREUR sauvegarde du modele : " + e);
			e.printStackTrace();
		}
	}

	public Resource chargerModele(String uri, EPackage pack) {
		Resource resource = null;
		try {
			URI uriUri = URI.createURI(uri);
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
			resource = (new ResourceSetImpl()).createResource(uriUri);
			XMLResource.XMLMap xmlMap = new XMLMapImpl();
			xmlMap.setNoNamespacePackage(pack);
			java.util.Map<String, XMLMap> options = new java.util.HashMap<String, XMLMap>();
			options.put(XMLResource.OPTION_XML_MAP, xmlMap);
			resource.load(options);
		} catch (Exception e) {
			System.err.println("ERREUR chargement du modele : " + e);
			e.printStackTrace();
		}
		return resource;
	}

	public StateMachine getModelBase(String modelFile) {
		Resource resource = chargerModele(modelFile, SimplStateMachinePackage.eINSTANCE);
		if (resource == null) {
			System.err.println(" Erreur de chargement du modÃ¨le");
			return null;
		}

		TreeIterator<EObject> it = resource.getAllContents();

		StateMachine sm = null;
		while (it.hasNext()) {
			EObject obj = it.next();
			if (obj instanceof StateMachine) {
				sm = (StateMachine) obj;
				break;
			}
		}
		return sm;
	}

	// Initialise la machine à états en activant tous les états initiaux
	public void initStateMachine(StateMachine sm) {
		sm.setIsActive(true);
		State s = sm.getInitialState().getReferencedState();
		while (s != null) {
			s.setIsActive(true);
			if (s instanceof CompositeState)
				s = ((CompositeState) s).getInitialState().getReferencedState();
			else
				s = null;
		}
	}

	// Désactive la hiérarchie haute d'un état
	public void unactivateUpStateHierarchy(State s) {
		State up = s.getContainer();
		while (up != null) {
			up.setIsActive(false);
			up = up.getContainer();
		}
	}

	// Désactive la hiérarchie basse d'un état
	public void unactivateDownStateHierarchy(State s) {
		if (s instanceof CompositeState)
			for (State down : ((CompositeState) s).getStates()) {
				down.setIsActive(false);
				if (down instanceof CompositeState)
					this.unactivateDownStateHierarchy(down);
			}
	}

	// Désactive un état et toute sa hiérarchie
	public void unactivateStateHierarchy(State s) {
		s.setIsActive(false);
		this.unactivateUpStateHierarchy(s);
		this.unactivateDownStateHierarchy(s);
	}

	// Active la hiérarchie haute d'un état
	public void activateUpStateHierarchy(State s) {
		State up = s.getContainer();
		while (up != null) {
			up.setIsActive(true);
			up = up.getContainer();
		}
	}

	// Active la hiérarchie basse d'un état
	public void activateDownStateHierarchy(State s) {
		if (s instanceof CompositeState) {
			State init = ((CompositeState) s).getInitialState().getReferencedState();
			init.setIsActive(true);
			if (init instanceof CompositeState)
				this.activateDownStateHierarchy(init);
		}
	}

	// Active toute la hiérarchie d'un état
	public void activateStateHierarchy(State s) {
		s.setIsActive(true);
		this.activateUpStateHierarchy(s);
		this.activateDownStateHierarchy(s);
	}

	// Retourne l'état actif le plus en bas de la hiérarchie
	public State getLeafActiveState(CompositeState comp) {
		for (State s : comp.getStates())
			if (s.isIsActive())
				if (s instanceof CompositeState)
					return this.getLeafActiveState((CompositeState) s);
				else
					return s;
		return null;
	}

	// Retourne la transition partant de l'état actif le plus bas pour l'événement
	// précisé ou null si aucune transition n'a été trouvée
	public Transition getTriggerableTransition(String evt, StateMachine sm) {
		boolean fini = false;
		State activeState = this.getLeafActiveState(sm);
		Transition trans = null;
		while (!fini) {
			for (Transition t : sm.getTransitions())
				if (t.getEvent().getName().equals(evt) && (activeState == t.getSource())) {
					trans = t;
					fini = true;
				}
			if (!fini) {
				activeState = activeState.getContainer();
				if (activeState == null)
					fini = true;
			}
		}
		return trans;
	}

	// Traite un événement : recherche une transition à suivre puis si elle
	// existe, désactive la hiérarchie de l'état source puis modifie
	// la hiérarchie des états actifs à partir de la cible de la transition
	// en prenant en compte le cas où la cible est un état historique
	public void processEvent(String event, StateMachine sm) {
		Transition trans = this.getTriggerableTransition(event, sm);
		if (trans != null) {
			this.unactivateStateHierarchy(trans.getSource());
			State target = trans.getTarget();
			this.activateStateHierarchy(target);
		}
	}

	public static void main(String argv[]) {

		StateMachineManipulation sm = new StateMachineManipulation();

		System.out.println(" Chargement du modele");

		StateMachine model = sm.getModelBase("models/Feu.xmi");

		System.out.println(" Modele charge");
	}
}