/**
 */
package SimplStateMachine;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SimplStateMachine.StateMachine#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link SimplStateMachine.StateMachine#getEvents <em>Events</em>}</li>
 *   <li>{@link SimplStateMachine.StateMachine#getVariables <em>Variables</em>}</li>
 * </ul>
 *
 * @see SimplStateMachine.SimplStateMachinePackage#getStateMachine()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='activeStateHierarchyConsistency'"
 * @generated
 */
public interface StateMachine extends CompositeState {
	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link SimplStateMachine.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see SimplStateMachine.SimplStateMachinePackage#getStateMachine_Transitions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference list.
	 * The list contents are of type {@link SimplStateMachine.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Events</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' containment reference list.
	 * @see SimplStateMachine.SimplStateMachinePackage#getStateMachine_Events()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Event> getEvents();

	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link SimplStateMachine.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see SimplStateMachine.SimplStateMachinePackage#getStateMachine_Variables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getVariables();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.container.oclIsUndefined()'"
	 * @generated
	 */
	boolean noContainerForStatemachine(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='StateMachine.allInstances()-&gt;size() = 1'"
	 * @generated
	 */
	boolean singleStateMachine(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='if self.isActive then self.activeSubTree() else self.unactiveSubTree() endif'"
	 * @generated
	 */
	boolean activeStateHierarchyConsistency(DiagnosticChain diagnostics, Map<Object, Object> context);

} // StateMachine
