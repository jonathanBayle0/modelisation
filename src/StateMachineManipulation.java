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
			Data right = calculExpression(((Expression) exp).getRight());
			Data left = calculExpression(((Expression) exp).getLeft());
			
			System.out.println(e);
			
			switch(e.getOperator()) {
				case ADD: 
					IntegerData l = (IntegerData) left;
					IntegerData r = (IntegerData) right;
					IntegerData data = SimplStateMachineFactory.eINSTANCE.createIntegerData();
					data.setValue(l.getValue() + r.getValue());
					return data; 
				case SUB:
					IntegerData l1 = (IntegerData) left;
					IntegerData r1 = (IntegerData) right;
					IntegerData data1 = SimplStateMachineFactory.eINSTANCE.createIntegerData();
					data1.setValue(l1.getValue() - r1.getValue());
					return data1;
				case MUL:
					IntegerData l2 = (IntegerData) left;
					IntegerData r2 = (IntegerData) right;
					IntegerData data2 = SimplStateMachineFactory.eINSTANCE.createIntegerData();
					data2.setValue(l2.getValue() * r2.getValue());
					return data2;
				case DIV:
					IntegerData l3 = (IntegerData) left;
					IntegerData r3 = (IntegerData) right;
					IntegerData data3 = SimplStateMachineFactory.eINSTANCE.createIntegerData();
					data3.setValue(l3.getValue() / r3.getValue());
					return data3;
				case EQ:
					IntegerData l4 = (IntegerData) left;
					IntegerData r4 = (IntegerData) right;
					BooleanData data4 = SimplStateMachineFactory.eINSTANCE.createBooleanData();
					data4.setValue(l4 == r4);
					return data4;
				case NEQ:
					IntegerData l5 = (IntegerData) left;
					IntegerData r5 = (IntegerData) right;
					BooleanData data5 = SimplStateMachineFactory.eINSTANCE.createBooleanData();
					data5.setValue(l5 != r5);
					return data5;
				case GT:
					IntegerData l6 = (IntegerData) left;
					IntegerData r6 = (IntegerData) right;
					BooleanData data6 = SimplStateMachineFactory.eINSTANCE.createBooleanData();
					data6.setValue(l6.getValue() > r6.getValue());
					return data6;
				case GTE:
					IntegerData l7 = (IntegerData) left;
					IntegerData r7 = (IntegerData) right;
					BooleanData data7 = SimplStateMachineFactory.eINSTANCE.createBooleanData();
					data7.setValue(l7.getValue() >= r7.getValue());
					return data7;
				case LT:
					IntegerData l8 = (IntegerData) left;
					IntegerData r8 = (IntegerData) right;
					BooleanData data8 = SimplStateMachineFactory.eINSTANCE.createBooleanData();
					data8.setValue(l8.getValue() < r8.getValue());
					return data8;
				case LTE:
					IntegerData l9 = (IntegerData) left;
					IntegerData r9 = (IntegerData) right;
					BooleanData data9 = SimplStateMachineFactory.eINSTANCE.createBooleanData();
					data9.setValue(l9.getValue() <= r9.getValue());
					return data9;
				case AND:
					BooleanData l10 = (BooleanData) left;
					BooleanData r10 = (BooleanData) right;
					BooleanData data10 = SimplStateMachineFactory.eINSTANCE.createBooleanData();
					data10.setValue(l10.isValue() && r10.isValue());
					return data10;
				case OR :
					BooleanData l11 = (BooleanData) left;
					BooleanData r11 = (BooleanData) right;
					BooleanData data11 = SimplStateMachineFactory.eINSTANCE.createBooleanData();
					data11.setValue(l11.isValue() || r11.isValue());
					return data11;
				case NOT:
					BooleanData l12 = (BooleanData) left;
					BooleanData data12 = SimplStateMachineFactory.eINSTANCE.createBooleanData();
					data12.setValue(!l12.isValue());
					return data12;
				}
			}
			return null;
		}

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