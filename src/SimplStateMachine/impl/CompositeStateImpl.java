/**
 */
package SimplStateMachine.impl;

import SimplStateMachine.CompositeState;
import SimplStateMachine.InitialState;
import SimplStateMachine.SimplStateMachinePackage;
import SimplStateMachine.SimplStateMachineTables;
import SimplStateMachine.State;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsTypeOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.messages.PivotMessages;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.OrderedSetValue.Accumulator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SimplStateMachine.impl.CompositeStateImpl#getStates <em>States</em>}</li>
 *   <li>{@link SimplStateMachine.impl.CompositeStateImpl#getInitialState <em>Initial State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositeStateImpl extends StateImpl implements CompositeState {
	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> states;

	/**
	 * The cached value of the '{@link #getInitialState() <em>Initial State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialState()
	 * @generated
	 * @ordered
	 */
	protected InitialState initialState;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplStateMachinePackage.Literals.COMPOSITE_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectContainmentWithInverseEList<State>(State.class, this, SimplStateMachinePackage.COMPOSITE_STATE__STATES, SimplStateMachinePackage.STATE__CONTAINER);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InitialState getInitialState() {
		return initialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitialState(InitialState newInitialState, NotificationChain msgs) {
		InitialState oldInitialState = initialState;
		initialState = newInitialState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimplStateMachinePackage.COMPOSITE_STATE__INITIAL_STATE, oldInitialState, newInitialState);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitialState(InitialState newInitialState) {
		if (newInitialState != initialState) {
			NotificationChain msgs = null;
			if (initialState != null)
				msgs = ((InternalEObject)initialState).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimplStateMachinePackage.COMPOSITE_STATE__INITIAL_STATE, null, msgs);
			if (newInitialState != null)
				msgs = ((InternalEObject)newInitialState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimplStateMachinePackage.COMPOSITE_STATE__INITIAL_STATE, null, msgs);
			msgs = basicSetInitialState(newInitialState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplStateMachinePackage.COMPOSITE_STATE__INITIAL_STATE, newInitialState, newInitialState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean activeSubTree() {
		/**
		 *
		 * self.states->select(s | s.isActive)
		 * ->size() = 1 and
		 * self.states->select(s | s.oclIsTypeOf(CompositeState))
		 * ->forAll(s |
		 *   if s.isActive
		 *   then s.oclAsType(CompositeState).activeSubTree()
		 *   else s.oclAsType(CompositeState).unactiveSubTree()
		 *   endif)
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ List<State> states_0 = this.getStates();
		final /*@NonInvalid*/ OrderedSetValue BOXED_states_0 = idResolver.createOrderedSetOfAll(SimplStateMachineTables.ORD_CLSSid_State, states_0);
		/*@Thrown*/ Accumulator accumulator = ValueUtil.createOrderedSetAccumulatorValue(SimplStateMachineTables.ORD_CLSSid_State_0);
		Iterator<Object> ITERATOR_s = BOXED_states_0.iterator();
		/*@NonInvalid*/ OrderedSetValue select;
		while (true) {
			if (!ITERATOR_s.hasNext()) {
				select = accumulator;
				break;
			}
			/*@NonInvalid*/ State s = (State)ITERATOR_s.next();
			/**
			 * s.isActive
			 */
			final /*@NonInvalid*/ boolean isActive = s.isIsActive();
			//
			if (isActive) {
				accumulator.add(s);
			}
		}
		final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(select);
		final /*@NonInvalid*/ boolean eq = size.equals(SimplStateMachineTables.INT_1);
		final /*@Thrown*/ Boolean and;
		if (!eq) {
			and = ValueUtil.FALSE_VALUE;
		}
		else {
			/*@Caught*/ Object CAUGHT_forAll;
			try {
				/*@Thrown*/ Accumulator accumulator_0 = ValueUtil.createOrderedSetAccumulatorValue(SimplStateMachineTables.ORD_CLSSid_State_0);
				Iterator<Object> ITERATOR_s_0 = BOXED_states_0.iterator();
				/*@NonInvalid*/ OrderedSetValue select_0;
				while (true) {
					if (!ITERATOR_s_0.hasNext()) {
						select_0 = accumulator_0;
						break;
					}
					/*@NonInvalid*/ State s_0 = (State)ITERATOR_s_0.next();
					/**
					 * s.oclIsTypeOf(CompositeState)
					 */
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_SimplStateMachine_c_c_CompositeState_0 = idResolver.getClass(SimplStateMachineTables.CLSSid_CompositeState, null);
					final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, s_0, TYP_SimplStateMachine_c_c_CompositeState_0).booleanValue();
					//
					if (oclIsTypeOf) {
						accumulator_0.add(s_0);
					}
				}
				/*@Thrown*/ Object accumulator_1 = ValueUtil.TRUE_VALUE;
				Iterator<Object> ITERATOR_s_1 = select_0.iterator();
				/*@Thrown*/ Boolean forAll;
				while (true) {
					if (!ITERATOR_s_1.hasNext()) {
						if (accumulator_1 == ValueUtil.TRUE_VALUE) {
							forAll = ValueUtil.TRUE_VALUE;
						}
						else {
							throw (InvalidValueException)accumulator_1;
						}
						break;
					}
					/*@NonInvalid*/ State s_1 = (State)ITERATOR_s_1.next();
					/**
					 *
					 * if s.isActive
					 * then s.oclAsType(CompositeState).activeSubTree()
					 * else s.oclAsType(CompositeState).unactiveSubTree()
					 * endif
					 */
					/*@Caught*/ Object CAUGHT_IF_isActive_0;
					try {
						final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_SimplStateMachine_c_c_CompositeState_2 = idResolver.getClass(SimplStateMachineTables.CLSSid_CompositeState, null);
						final /*@Thrown*/ CompositeState oclAsType_0 = (CompositeState)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, s_1, TYP_SimplStateMachine_c_c_CompositeState_2);
						final /*@NonInvalid*/ boolean isActive_0 = s_1.isIsActive();
						/*@Thrown*/ boolean IF_isActive_0;
						if (isActive_0) {
							final /*@Thrown*/ boolean activeSubTree = oclAsType_0.activeSubTree();
							IF_isActive_0 = activeSubTree;
						}
						else {
							final /*@Thrown*/ boolean unactiveSubTree = oclAsType_0.unactiveSubTree();
							IF_isActive_0 = unactiveSubTree;
						}
						CAUGHT_IF_isActive_0 = IF_isActive_0;
					}
					catch (Exception e) {
						CAUGHT_IF_isActive_0 = ValueUtil.createInvalidValue(e);
					}
					//
					if (CAUGHT_IF_isActive_0 == ValueUtil.FALSE_VALUE) {					// Normal unsuccessful body evaluation result
						forAll = ValueUtil.FALSE_VALUE;
						break;														// Stop immediately
					}
					else if (CAUGHT_IF_isActive_0 == ValueUtil.TRUE_VALUE) {				// Normal successful body evaluation result
						;															// Carry on
					}
					else if (CAUGHT_IF_isActive_0 instanceof InvalidValueException) {		// Abnormal exception evaluation result
						accumulator_1 = CAUGHT_IF_isActive_0;									// Cache an exception failure
					}
					else {															// Impossible badly typed result
						accumulator_1 = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
					}
				}
				CAUGHT_forAll = forAll;
			}
			catch (Exception e) {
				CAUGHT_forAll = ValueUtil.createInvalidValue(e);
			}
			if (CAUGHT_forAll == ValueUtil.FALSE_VALUE) {
				and = ValueUtil.FALSE_VALUE;
			}
			else {
				if (CAUGHT_forAll instanceof InvalidValueException) {
					throw (InvalidValueException)CAUGHT_forAll;
				}
				if (CAUGHT_forAll == null) {
					and = null;
				}
				else {
					and = ValueUtil.TRUE_VALUE;
				}
			}
		}
		if (and == null) {
			throw new InvalidValueException("Null body for \'SimplStateMachine::CompositeState::activeSubTree() : Boolean[1]\'");
		}
		return and;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean unactiveSubTree() {
		/**
		 *
		 * self.states->forAll(s | not s.isActive) and
		 * self.states->select(s | s.oclIsTypeOf(CompositeState))
		 * ->forAll(s | s.oclAsType(CompositeState).unactiveSubTree())
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		/*@Caught*/ Object CAUGHT_forAll;
		try {
			final /*@NonInvalid*/ List<State> states = this.getStates();
			final /*@NonInvalid*/ OrderedSetValue BOXED_states = idResolver.createOrderedSetOfAll(SimplStateMachineTables.ORD_CLSSid_State, states);
			/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
			Iterator<Object> ITERATOR_s = BOXED_states.iterator();
			/*@Thrown*/ Boolean forAll;
			while (true) {
				if (!ITERATOR_s.hasNext()) {
					if (accumulator == null) {
						forAll = null;
					}
					else if (accumulator == ValueUtil.TRUE_VALUE) {
						forAll = ValueUtil.TRUE_VALUE;
					}
					else {
						throw (InvalidValueException)accumulator;
					}
					break;
				}
				/*@NonInvalid*/ State s = (State)ITERATOR_s.next();
				/**
				 * not s.isActive
				 */
				final /*@NonInvalid*/ boolean isActive = s.isIsActive();
				final /*@NonInvalid*/ Boolean not;
				if (!isActive) {
					not = ValueUtil.TRUE_VALUE;
				}
				else {
					if (isActive) {
						not = ValueUtil.FALSE_VALUE;
					}
					else {
						not = null;
					}
				}
				//
				if (not == ValueUtil.FALSE_VALUE) {					// Normal unsuccessful body evaluation result
					forAll = ValueUtil.FALSE_VALUE;
					break;														// Stop immediately
				}
				else if (not == ValueUtil.TRUE_VALUE) {				// Normal successful body evaluation result
					;															// Carry on
				}
				else if (not == null) {								// Abnormal null body evaluation result
					if (accumulator == ValueUtil.TRUE_VALUE) {
						accumulator = null;										// Cache a null failure
					}
				}
				else {															// Impossible badly typed result
					accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
				}
			}
			CAUGHT_forAll = forAll;
		}
		catch (Exception e) {
			CAUGHT_forAll = ValueUtil.createInvalidValue(e);
		}
		final /*@Thrown*/ Boolean and;
		if (CAUGHT_forAll == ValueUtil.FALSE_VALUE) {
			and = ValueUtil.FALSE_VALUE;
		}
		else {
			/*@Caught*/ Object CAUGHT_forAll_0;
			try {
				final /*@NonInvalid*/ List<State> states_0 = this.getStates();
				final /*@NonInvalid*/ OrderedSetValue BOXED_states_0 = idResolver.createOrderedSetOfAll(SimplStateMachineTables.ORD_CLSSid_State, states_0);
				/*@Thrown*/ Accumulator accumulator_0 = ValueUtil.createOrderedSetAccumulatorValue(SimplStateMachineTables.ORD_CLSSid_State_0);
				Iterator<Object> ITERATOR_s_0 = BOXED_states_0.iterator();
				/*@NonInvalid*/ OrderedSetValue select;
				while (true) {
					if (!ITERATOR_s_0.hasNext()) {
						select = accumulator_0;
						break;
					}
					/*@NonInvalid*/ State s_0 = (State)ITERATOR_s_0.next();
					/**
					 * s.oclIsTypeOf(CompositeState)
					 */
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_SimplStateMachine_c_c_CompositeState_0 = idResolver.getClass(SimplStateMachineTables.CLSSid_CompositeState, null);
					final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, s_0, TYP_SimplStateMachine_c_c_CompositeState_0).booleanValue();
					//
					if (oclIsTypeOf) {
						accumulator_0.add(s_0);
					}
				}
				/*@Thrown*/ Object accumulator_1 = ValueUtil.TRUE_VALUE;
				Iterator<Object> ITERATOR_s_1 = select.iterator();
				/*@Thrown*/ Boolean forAll_0;
				while (true) {
					if (!ITERATOR_s_1.hasNext()) {
						if (accumulator_1 == ValueUtil.TRUE_VALUE) {
							forAll_0 = ValueUtil.TRUE_VALUE;
						}
						else {
							throw (InvalidValueException)accumulator_1;
						}
						break;
					}
					/*@NonInvalid*/ State s_1 = (State)ITERATOR_s_1.next();
					/**
					 * s.oclAsType(CompositeState).unactiveSubTree()
					 */
					/*@Caught*/ Object CAUGHT_unactiveSubTree;
					try {
						final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_SimplStateMachine_c_c_CompositeState_1 = idResolver.getClass(SimplStateMachineTables.CLSSid_CompositeState, null);
						final /*@Thrown*/ CompositeState oclAsType = (CompositeState)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, s_1, TYP_SimplStateMachine_c_c_CompositeState_1);
						final /*@Thrown*/ boolean unactiveSubTree = oclAsType.unactiveSubTree();
						CAUGHT_unactiveSubTree = unactiveSubTree;
					}
					catch (Exception e) {
						CAUGHT_unactiveSubTree = ValueUtil.createInvalidValue(e);
					}
					//
					if (CAUGHT_unactiveSubTree == ValueUtil.FALSE_VALUE) {					// Normal unsuccessful body evaluation result
						forAll_0 = ValueUtil.FALSE_VALUE;
						break;														// Stop immediately
					}
					else if (CAUGHT_unactiveSubTree == ValueUtil.TRUE_VALUE) {				// Normal successful body evaluation result
						;															// Carry on
					}
					else if (CAUGHT_unactiveSubTree instanceof InvalidValueException) {		// Abnormal exception evaluation result
						accumulator_1 = CAUGHT_unactiveSubTree;									// Cache an exception failure
					}
					else {															// Impossible badly typed result
						accumulator_1 = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
					}
				}
				CAUGHT_forAll_0 = forAll_0;
			}
			catch (Exception e) {
				CAUGHT_forAll_0 = ValueUtil.createInvalidValue(e);
			}
			if (CAUGHT_forAll_0 == ValueUtil.FALSE_VALUE) {
				and = ValueUtil.FALSE_VALUE;
			}
			else {
				if (CAUGHT_forAll instanceof InvalidValueException) {
					throw (InvalidValueException)CAUGHT_forAll;
				}
				if (CAUGHT_forAll_0 instanceof InvalidValueException) {
					throw (InvalidValueException)CAUGHT_forAll_0;
				}
				if ((CAUGHT_forAll == null) || (CAUGHT_forAll_0 == null)) {
					and = null;
				}
				else {
					and = ValueUtil.TRUE_VALUE;
				}
			}
		}
		if (and == null) {
			throw new InvalidValueException("Null body for \'SimplStateMachine::CompositeState::unactiveSubTree() : Boolean[1]\'");
		}
		return and;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean uniqueCompositeName(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "CompositeState::uniqueCompositeName";
		try {
			/**
			 *
			 * inv uniqueCompositeName:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.states->forAll(s1 |
			 *           self.states->forAll(s2 | s1.name = s2.name implies s1 = s2))
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SimplStateMachinePackage.Literals.COMPOSITE_STATE___UNIQUE_COMPOSITE_NAME__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SimplStateMachineTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<State> states = this.getStates();
					final /*@NonInvalid*/ OrderedSetValue BOXED_states = idResolver.createOrderedSetOfAll(SimplStateMachineTables.ORD_CLSSid_State, states);
					/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
					Iterator<Object> ITERATOR_s1 = BOXED_states.iterator();
					/*@Thrown*/ Boolean result;
					while (true) {
						if (!ITERATOR_s1.hasNext()) {
							if (accumulator == null) {
								result = null;
							}
							else if (accumulator == ValueUtil.TRUE_VALUE) {
								result = ValueUtil.TRUE_VALUE;
							}
							else {
								throw (InvalidValueException)accumulator;
							}
							break;
						}
						/*@NonInvalid*/ State s1 = (State)ITERATOR_s1.next();
						/**
						 * self.states->forAll(s2 | s1.name = s2.name implies s1 = s2)
						 */
						/*@Caught*/ Object CAUGHT_forAll;
						try {
							/*@Thrown*/ Object accumulator_0 = ValueUtil.TRUE_VALUE;
							Iterator<Object> ITERATOR_s2 = BOXED_states.iterator();
							/*@Thrown*/ Boolean forAll;
							while (true) {
								if (!ITERATOR_s2.hasNext()) {
									if (accumulator_0 == null) {
										forAll = null;
									}
									else if (accumulator_0 == ValueUtil.TRUE_VALUE) {
										forAll = ValueUtil.TRUE_VALUE;
									}
									else {
										throw (InvalidValueException)accumulator_0;
									}
									break;
								}
								/*@NonInvalid*/ State s2 = (State)ITERATOR_s2.next();
								/**
								 * s1.name = s2.name implies s1 = s2
								 */
								final /*@NonInvalid*/ String name = s1.getName();
								final /*@NonInvalid*/ String name_0 = s2.getName();
								final /*@NonInvalid*/ boolean eq = name.equals(name_0);
								final /*@NonInvalid*/ Boolean implies;
								if (!eq) {
									implies = ValueUtil.TRUE_VALUE;
								}
								else {
									final /*@NonInvalid*/ boolean eq_0 = s1.equals(s2);
									if (eq_0) {
										implies = ValueUtil.TRUE_VALUE;
									}
									else {
										implies = ValueUtil.FALSE_VALUE;
									}
								}
								//
								if (implies == ValueUtil.FALSE_VALUE) {					// Normal unsuccessful body evaluation result
									forAll = ValueUtil.FALSE_VALUE;
									break;														// Stop immediately
								}
								else if (implies == ValueUtil.TRUE_VALUE) {				// Normal successful body evaluation result
									;															// Carry on
								}
								else if (implies == null) {								// Abnormal null body evaluation result
									if (accumulator_0 == ValueUtil.TRUE_VALUE) {
										accumulator_0 = null;										// Cache a null failure
									}
								}
								else {															// Impossible badly typed result
									accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
								}
							}
							CAUGHT_forAll = forAll;
						}
						catch (Exception e) {
							CAUGHT_forAll = ValueUtil.createInvalidValue(e);
						}
						//
						if (CAUGHT_forAll == ValueUtil.FALSE_VALUE) {					// Normal unsuccessful body evaluation result
							result = ValueUtil.FALSE_VALUE;
							break;														// Stop immediately
						}
						else if (CAUGHT_forAll == ValueUtil.TRUE_VALUE) {				// Normal successful body evaluation result
							;															// Carry on
						}
						else if (CAUGHT_forAll == null) {								// Abnormal null body evaluation result
							if (accumulator == ValueUtil.TRUE_VALUE) {
								accumulator = null;										// Cache a null failure
							}
						}
						else if (CAUGHT_forAll instanceof InvalidValueException) {		// Abnormal exception evaluation result
							accumulator = CAUGHT_forAll;									// Cache an exception failure
						}
						else {															// Impossible badly typed result
							accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
						}
					}
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, SimplStateMachineTables.INT_0).booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean initialStateInComposite(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "CompositeState::initialStateInComposite";
		try {
			/**
			 *
			 * inv initialStateInComposite:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = self.states->includes(self.initialState.referencedState)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SimplStateMachinePackage.Literals.COMPOSITE_STATE___INITIAL_STATE_IN_COMPOSITE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SimplStateMachineTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				final /*@NonInvalid*/ List<State> states = this.getStates();
				final /*@NonInvalid*/ OrderedSetValue BOXED_states = idResolver.createOrderedSetOfAll(SimplStateMachineTables.ORD_CLSSid_State, states);
				final /*@NonInvalid*/ InitialState initialState = this.getInitialState();
				final /*@NonInvalid*/ State referencedState = initialState.getReferencedState();
				final /*@NonInvalid*/ boolean result = CollectionIncludesOperation.INSTANCE.evaluate(BOXED_states, referencedState).booleanValue();
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, SimplStateMachineTables.INT_0).booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimplStateMachinePackage.COMPOSITE_STATE__STATES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStates()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimplStateMachinePackage.COMPOSITE_STATE__STATES:
				return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
			case SimplStateMachinePackage.COMPOSITE_STATE__INITIAL_STATE:
				return basicSetInitialState(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimplStateMachinePackage.COMPOSITE_STATE__STATES:
				return getStates();
			case SimplStateMachinePackage.COMPOSITE_STATE__INITIAL_STATE:
				return getInitialState();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SimplStateMachinePackage.COMPOSITE_STATE__STATES:
				getStates().clear();
				getStates().addAll((Collection<? extends State>)newValue);
				return;
			case SimplStateMachinePackage.COMPOSITE_STATE__INITIAL_STATE:
				setInitialState((InitialState)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SimplStateMachinePackage.COMPOSITE_STATE__STATES:
				getStates().clear();
				return;
			case SimplStateMachinePackage.COMPOSITE_STATE__INITIAL_STATE:
				setInitialState((InitialState)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SimplStateMachinePackage.COMPOSITE_STATE__STATES:
				return states != null && !states.isEmpty();
			case SimplStateMachinePackage.COMPOSITE_STATE__INITIAL_STATE:
				return initialState != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SimplStateMachinePackage.COMPOSITE_STATE___ACTIVE_SUB_TREE:
				return activeSubTree();
			case SimplStateMachinePackage.COMPOSITE_STATE___UNACTIVE_SUB_TREE:
				return unactiveSubTree();
			case SimplStateMachinePackage.COMPOSITE_STATE___UNIQUE_COMPOSITE_NAME__DIAGNOSTICCHAIN_MAP:
				return uniqueCompositeName((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SimplStateMachinePackage.COMPOSITE_STATE___INITIAL_STATE_IN_COMPOSITE__DIAGNOSTICCHAIN_MAP:
				return initialStateInComposite((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CompositeStateImpl
