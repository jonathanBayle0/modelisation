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
			System.err.println("ERREUR sauvegarde du modele : "+e);
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
		}
		catch(Exception e) {
			System.err.println("ERREUR chargement du modele : "+e);
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
		while(it.hasNext()) {
			EObject obj = it.next();
			if (obj instanceof StateMachine) {
				sm = (StateMachine) obj;
				break;
			}
		}
		return sm;
	}

	
	

	public static void main(String argv[]) {

		StateMachineManipulation sm = new StateMachineManipulation();

		System.out.println(" Chargement du modele");

		StateMachine model = sm.getModelBase("models/Feu.xmi");
		
		System.out.println(" Modele charge");
	}
}