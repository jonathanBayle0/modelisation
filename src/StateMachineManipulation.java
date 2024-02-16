import org.eclipse.emf.common.util.EList;
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
			System.err.println(" Erreur de chargement du modèle");
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

	// Initialise la machine � �tats en activant tous les �tats initiaux
	public void initStateMachine(StateMachine sm) {
		sm.setIsActive(true);
		State s = sm.getInitialState().getReferencedState();
		while (s != null) {
			s.setIsActive(true);
			processOperation(s.getOperation());
			if (s instanceof CompositeState)
				s = ((CompositeState) s).getInitialState().getReferencedState();
			else
				s = null;
		}
	}

	// D�sactive la hi�rarchie haute d'un �tat
	public void unactivateUpStateHierarchy(State s) {
		State up = s.getContainer();
		while (up != null) {
			up.setIsActive(false);
			up = up.getContainer();
		}
	}

	// D�sactive la hi�rarchie basse d'un �tat
	public void unactivateDownStateHierarchy(State s) {
		if (s instanceof CompositeState)
			for (State down : ((CompositeState) s).getStates()) {
				down.setIsActive(false);
				if (down instanceof CompositeState)
					this.unactivateDownStateHierarchy(down);
			}
	}

	// D�sactive un �tat et toute sa hi�rarchie
	public void unactivateStateHierarchy(State s) {
		s.setIsActive(false);
		this.unactivateUpStateHierarchy(s);
		this.unactivateDownStateHierarchy(s);
	}

	// Active la hi�rarchie haute d'un �tat
	public void activateUpStateHierarchy(State s) {
		State up = s.getContainer();
		while (up != null) {
			up.setIsActive(true);
			up = up.getContainer();
		}
	}

	// Active la hi�rarchie basse d'un �tat
	public void activateDownStateHierarchy(State s) {
		if (s instanceof CompositeState) {
			State init = ((CompositeState) s).getInitialState().getReferencedState();
			init.setIsActive(true);
			if (init instanceof CompositeState)
				this.activateDownStateHierarchy(init);
		}
	}

	// Active toute la hi�rarchie d'un �tat
	public void activateStateHierarchy(State s) {
		s.setIsActive(true);
		this.activateUpStateHierarchy(s);
		this.activateDownStateHierarchy(s);
	}

	// Retourne l'�tat actif le plus en bas de la hi�rarchie
	public State getLeafActiveState(CompositeState comp) {
		for (State s : comp.getStates())
			if (s.isIsActive())
				if (s instanceof CompositeState)
					return this.getLeafActiveState((CompositeState) s);
				else
					return s;
		return null;
	}

	// Retourne la transition partant de l'�tat actif le plus bas pour l'�v�nement
	// pr�cis� ou null si aucune transition n'a �t� trouv�e
	public Transition getTriggerableTransition(String evt, StateMachine sm) {
		boolean fini = false;
		State activeState = this.getLeafActiveState(sm);
		Transition trans = null;
		while (!fini) {
			for (Transition t : sm.getTransitions())
				if (t.getEvent().getName().equals(evt) && (activeState == t.getSource())) {
					// Traitement de la garde
					if (trans.getGuard() != null && calculExpression(trans.getGuard()) instanceof BooleanData bool && bool.isValue()) {
						trans = t;
						fini = true;
					}
				}
			if (!fini) {
				activeState = activeState.getContainer();
				if (activeState == null)
					fini = true;
			}
		}
		return trans;
	}

	// Traite un �v�nement : recherche une transition � suivre puis si elle
	// existe, d�sactive la hi�rarchie de l'�tat source puis modifie
	// la hi�rarchie des �tats actifs � partir de la cible de la transition
	// en prenant en compte le cas o� la cible est un �tat historique
	public void processEvent(String event, StateMachine sm) {
		Transition trans = this.getTriggerableTransition(event, sm);
		if (trans != null) {
			this.unactivateStateHierarchy(trans.getSource());
			State target = trans.getTarget();
			this.activateStateHierarchy(target);
			// Traitement des op�ration du nouvel �tat
			if (target.getOperation() != null) processOperation(target.getOperation());
		}
	}
	
	public Data calculExpression(ExpressionElement exp) {
		//if (exp instanceof Data e) return e;
		//else if (exp instanceof VariableReference var) return var.getVariable().getValue();
		if(exp instanceof IntegerData || exp instanceof BooleanData) return (Data)exp;
		else if(exp instanceof IntegerVariable || exp instanceof BooleanVariable) return (Data)((Variable)exp).getValue();
		else if(exp instanceof VariableReference) {//return ((VariableReference) exp).getVariable().getValue();
			Variable v = ((VariableReference) exp).getVariable();
			System.out.println("v: "+v);
			
			IntegerData d = (IntegerData) v.getValue();
			System.out.println("d : "+d);
			return d;
		}
		//if (exp instanceof VariableReference var) return var.getVariable().getValue();
		else {
			Expression e =(Expression) exp;
			Data right = calcul(((Expression) exp).getRight());
			Data left = calcul(((Expression) exp).getLeft());
			
			System.out.println(e);
			
			switch(e.getOperator()) {
				case ADD: {
					IntegerData l = (IntegerData) left;
					IntegerData r = (IntegerData) right;
					IntegerData data = SimplStateMachineFactory.eINSTANCE.createIntegerData();
					data.setValue(l.getValue() + r.getValue());
					return data; 
				}case SUB:{
					IntegerData l = (IntegerData) left;
					IntegerData r = (IntegerData) right;
					IntegerData data = SimplStateMachineFactory.eINSTANCE.createIntegerData();
					data.setValue(l.getValue() - r.getValue());
					return data;
				}case MUL:{
					IntegerData l = (IntegerData) left;
					IntegerData r = (IntegerData) right;
					IntegerData data = SimplStateMachineFactory.eINSTANCE.createIntegerData();
					data.setValue(l.getValue() * r.getValue());
				}case DIV:{
					IntegerData l = (IntegerData) left;
					IntegerData r = (IntegerData) right;
					IntegerData data = SimplStateMachineFactory.eINSTANCE.createIntegerData();
					data.setValue(l.getValue() / r.getValue());
				}case EQ:{
					IntegerData l = (IntegerData) left;
					IntegerData r = (IntegerData) right;
					BooleanData data = SimplStateMachineFactory.eINSTANCE.createBooleanData();
					data.setValue(l == r);
				}case NEQ: {
					IntegerData l = (IntegerData) left;
					IntegerData r = (IntegerData) right;
					BooleanData data = SimplStateMachineFactory.eINSTANCE.createBooleanData();
					data.setValue(l != r);
				}case GT: {
					IntegerData l = (IntegerData) left;
					IntegerData r = (IntegerData) right;
					BooleanData data = SimplStateMachineFactory.eINSTANCE.createBooleanData();
					data.setValue(l.getValue() > r.getValue());
				}case GTE: {
					IntegerData l = (IntegerData) left;
					IntegerData r = (IntegerData) right;
					BooleanData data = SimplStateMachineFactory.eINSTANCE.createBooleanData();
					data.setValue(l.getValue() >= r.getValue());
				}case LT: {
					IntegerData l = (IntegerData) left;
					IntegerData r = (IntegerData) right;
					BooleanData data = SimplStateMachineFactory.eINSTANCE.createBooleanData();
					data.setValue(l.getValue() < r.getValue());
				}case LTE:{
					IntegerData l = (IntegerData) left;
					IntegerData r = (IntegerData) right;
					BooleanData data = SimplStateMachineFactory.eINSTANCE.createBooleanData();
					data.setValue(l.getValue() <= r.getValue());
				}case AND:{
					BooleanData l = (BooleanData) left;
					BooleanData r = (BooleanData) right;
					BooleanData data = SimplStateMachineFactory.eINSTANCE.createBooleanData();
					data.setValue(l.isValue() && r.isValue());
				}case OR : {
					BooleanData l = (BooleanData) left;
					BooleanData r = (BooleanData) right;
					BooleanData data = SimplStateMachineFactory.eINSTANCE.createBooleanData();
					data.setValue(l.isValue() || r.isValue());
				}case NOT:{
					BooleanData l = (BooleanData) left;
					BooleanData r = (BooleanData) right;
					BooleanData data = SimplStateMachineFactory.eINSTANCE.createBooleanData();
					data.setValue(!l.isValue());
				}default: return null;
	/**
	 * Traitement des op�rations d'un �tat
	 */
	public void processOperation(Operation ope) {
		for(Assignment ass: ope.getContents()) {
			if (ass.getExpression() instanceof Expression) {
				Data data = calculExpression((Expression) ass.getExpression());
				Variable var = ass.getVariable();
				var.setName(ass.get_name());
				var.setValue(data);
			}
			else if (ass.getExpression() instanceof Data) {
				Variable var = ass.getVariable();
				var.setName(ass.get_name());
				var.setValue((Data) ass.getExpression());
			} else {
				Variable var = ass.getVariable();
				var.setName(ass.get_name());
				var.setValue(((Variable) ass.getExpression()).getValue());
			}
		}
	}
<<<<<<< HEAD

=======
>>>>>>> main

	public static void main(String argv[]) {

		StateMachineManipulation sm = new StateMachineManipulation();

		System.out.println(" Chargement du modele");

		//StateMachine model = sm.getModelBase("models/Feu.xmi");
		
		//--TEST FONCTION MARIE--
		StateMachine model = sm.getModelBase("models/Voiture.xmi");
		
		sm.initStateMachine(model);
		sm.processEvent(sm.initStateMachine(model), model );
		
		System.out.println(model.getVariables());
		System.out.println(model.getVariables().get(0).getValue());
		System.out.println(model.getVariables().get(1).getValue());
		
		EList<Transition> trans=model.getTransitions();
		
		for (Transition t : trans) {
			if(t.getGuard() != null) {
				Data res = sm.calcul(t.getGuard());
				System.out.println("result return : "+res);
			}	
		}
		
		

		System.out.println(" Modele charge");
	}
}