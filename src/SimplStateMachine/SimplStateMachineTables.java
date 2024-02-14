/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /StateMachine/metaModels/StateMachine.ecore
 * using:
 *   /StateMachine/metaModels/StateMachine.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package SimplStateMachine;

// import SimplStateMachine.SimplStateMachinePackage;
// import SimplStateMachine.SimplStateMachineTables;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.pivot.TemplateParameters;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.EnumerationId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.RootPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorType;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.TypeUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * SimplStateMachineTables provides the dispatch tables for the SimplStateMachine for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class SimplStateMachineTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(SimplStateMachinePackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ RootPackageId PACKid_$metamodel$ = IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_platform_c_s_resource_s_StateMachine_s_metaModels_s_StateMachine_ecore = IdManager.getNsURIPackageId("platform:/resource/StateMachine/metaModels/StateMachine.ecore", null, SimplStateMachinePackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_Assignment = SimplStateMachineTables.PACKid_platform_c_s_resource_s_StateMachine_s_metaModels_s_StateMachine_ecore.getClassId("Assignment", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Class = SimplStateMachineTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_CompositeState = SimplStateMachineTables.PACKid_platform_c_s_resource_s_StateMachine_s_metaModels_s_StateMachine_ecore.getClassId("CompositeState", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Data = SimplStateMachineTables.PACKid_platform_c_s_resource_s_StateMachine_s_metaModels_s_StateMachine_ecore.getClassId("Data", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Event = SimplStateMachineTables.PACKid_platform_c_s_resource_s_StateMachine_s_metaModels_s_StateMachine_ecore.getClassId("Event", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Expression = SimplStateMachineTables.PACKid_platform_c_s_resource_s_StateMachine_s_metaModels_s_StateMachine_ecore.getClassId("Expression", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ExpressionElement = SimplStateMachineTables.PACKid_platform_c_s_resource_s_StateMachine_s_metaModels_s_StateMachine_ecore.getClassId("ExpressionElement", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_InitialState = SimplStateMachineTables.PACKid_platform_c_s_resource_s_StateMachine_s_metaModels_s_StateMachine_ecore.getClassId("InitialState", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Operation = SimplStateMachineTables.PACKid_platform_c_s_resource_s_StateMachine_s_metaModels_s_StateMachine_ecore.getClassId("Operation", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_State = SimplStateMachineTables.PACKid_platform_c_s_resource_s_StateMachine_s_metaModels_s_StateMachine_ecore.getClassId("State", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_StateMachine = SimplStateMachineTables.PACKid_platform_c_s_resource_s_StateMachine_s_metaModels_s_StateMachine_ecore.getClassId("StateMachine", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Transition = SimplStateMachineTables.PACKid_platform_c_s_resource_s_StateMachine_s_metaModels_s_StateMachine_ecore.getClassId("Transition", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Variable = SimplStateMachineTables.PACKid_platform_c_s_resource_s_StateMachine_s_metaModels_s_StateMachine_ecore.getClassId("Variable", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_VariableReference = SimplStateMachineTables.PACKid_platform_c_s_resource_s_StateMachine_s_metaModels_s_StateMachine_ecore.getClassId("VariableReference", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EInt = SimplStateMachineTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ EnumerationId ENUMid_Operator = SimplStateMachineTables.PACKid_platform_c_s_resource_s_StateMachine_s_metaModels_s_StateMachine_ecore.getEnumerationId("Operator");
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ IntegerValue INT_1 = ValueUtil.integerValueOf("1");
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Assignment = TypeId.BAG.getSpecializedId(SimplStateMachineTables.CLSSid_Assignment, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_InitialState = TypeId.BAG.getSpecializedId(SimplStateMachineTables.CLSSid_InitialState, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Transition = TypeId.BAG.getSpecializedId(SimplStateMachineTables.CLSSid_Transition, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_VariableReference = TypeId.BAG.getSpecializedId(SimplStateMachineTables.CLSSid_VariableReference, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Assignment = TypeId.ORDERED_SET.getSpecializedId(SimplStateMachineTables.CLSSid_Assignment, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Event = TypeId.ORDERED_SET.getSpecializedId(SimplStateMachineTables.CLSSid_Event, true, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_State = TypeId.ORDERED_SET.getSpecializedId(SimplStateMachineTables.CLSSid_State, true, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_State_0 = TypeId.ORDERED_SET.getSpecializedId(SimplStateMachineTables.CLSSid_State, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Transition = TypeId.ORDERED_SET.getSpecializedId(SimplStateMachineTables.CLSSid_Transition, true, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Variable = TypeId.ORDERED_SET.getSpecializedId(SimplStateMachineTables.CLSSid_Variable, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Event = TypeId.SET.getSpecializedId(SimplStateMachineTables.CLSSid_Event, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_StateMachine = TypeId.SET.getSpecializedId(SimplStateMachineTables.CLSSid_StateMachine, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			SimplStateMachineTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SimplStateMachineTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _Assignment = new EcoreExecutorType(SimplStateMachinePackage.Literals.ASSIGNMENT, PACKAGE, 0);
		public static final EcoreExecutorType _BooleanData = new EcoreExecutorType(SimplStateMachinePackage.Literals.BOOLEAN_DATA, PACKAGE, 0);
		public static final EcoreExecutorType _BooleanVariable = new EcoreExecutorType(SimplStateMachinePackage.Literals.BOOLEAN_VARIABLE, PACKAGE, 0);
		public static final EcoreExecutorType _CompositeState = new EcoreExecutorType(SimplStateMachinePackage.Literals.COMPOSITE_STATE, PACKAGE, 0);
		public static final EcoreExecutorType _Data = new EcoreExecutorType(SimplStateMachinePackage.Literals.DATA, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _Event = new EcoreExecutorType(SimplStateMachinePackage.Literals.EVENT, PACKAGE, 0);
		public static final EcoreExecutorType _Expression = new EcoreExecutorType(SimplStateMachinePackage.Literals.EXPRESSION, PACKAGE, 0);
		public static final EcoreExecutorType _ExpressionElement = new EcoreExecutorType(SimplStateMachinePackage.Literals.EXPRESSION_ELEMENT, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _InitialState = new EcoreExecutorType(SimplStateMachinePackage.Literals.INITIAL_STATE, PACKAGE, 0);
		public static final EcoreExecutorType _IntegerData = new EcoreExecutorType(SimplStateMachinePackage.Literals.INTEGER_DATA, PACKAGE, 0);
		public static final EcoreExecutorType _IntegerVariable = new EcoreExecutorType(SimplStateMachinePackage.Literals.INTEGER_VARIABLE, PACKAGE, 0);
		public static final EcoreExecutorType _Operation = new EcoreExecutorType(SimplStateMachinePackage.Literals.OPERATION, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _Operator = new EcoreExecutorEnumeration(SimplStateMachinePackage.Literals.OPERATOR, PACKAGE, 0);
		public static final EcoreExecutorType _State = new EcoreExecutorType(SimplStateMachinePackage.Literals.STATE, PACKAGE, 0);
		public static final EcoreExecutorType _StateMachine = new EcoreExecutorType(SimplStateMachinePackage.Literals.STATE_MACHINE, PACKAGE, 0);
		public static final EcoreExecutorType _Transition = new EcoreExecutorType(SimplStateMachinePackage.Literals.TRANSITION, PACKAGE, 0);
		public static final EcoreExecutorType _Variable = new EcoreExecutorType(SimplStateMachinePackage.Literals.VARIABLE, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _VariableReference = new EcoreExecutorType(SimplStateMachinePackage.Literals.VARIABLE_REFERENCE, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Assignment,
			_BooleanData,
			_BooleanVariable,
			_CompositeState,
			_Data,
			_Event,
			_Expression,
			_ExpressionElement,
			_InitialState,
			_IntegerData,
			_IntegerVariable,
			_Operation,
			_Operator,
			_State,
			_StateMachine,
			_Transition,
			_Variable,
			_VariableReference
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SimplStateMachineTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _Assignment__Assignment = new ExecutorFragment(Types._Assignment, SimplStateMachineTables.Types._Assignment);
		private static final ExecutorFragment _Assignment__OclAny = new ExecutorFragment(Types._Assignment, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Assignment__OclElement = new ExecutorFragment(Types._Assignment, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _BooleanData__BooleanData = new ExecutorFragment(Types._BooleanData, SimplStateMachineTables.Types._BooleanData);
		private static final ExecutorFragment _BooleanData__Data = new ExecutorFragment(Types._BooleanData, SimplStateMachineTables.Types._Data);
		private static final ExecutorFragment _BooleanData__ExpressionElement = new ExecutorFragment(Types._BooleanData, SimplStateMachineTables.Types._ExpressionElement);
		private static final ExecutorFragment _BooleanData__OclAny = new ExecutorFragment(Types._BooleanData, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _BooleanData__OclElement = new ExecutorFragment(Types._BooleanData, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _BooleanVariable__BooleanVariable = new ExecutorFragment(Types._BooleanVariable, SimplStateMachineTables.Types._BooleanVariable);
		private static final ExecutorFragment _BooleanVariable__OclAny = new ExecutorFragment(Types._BooleanVariable, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _BooleanVariable__OclElement = new ExecutorFragment(Types._BooleanVariable, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _BooleanVariable__Variable = new ExecutorFragment(Types._BooleanVariable, SimplStateMachineTables.Types._Variable);

		private static final ExecutorFragment _CompositeState__CompositeState = new ExecutorFragment(Types._CompositeState, SimplStateMachineTables.Types._CompositeState);
		private static final ExecutorFragment _CompositeState__OclAny = new ExecutorFragment(Types._CompositeState, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _CompositeState__OclElement = new ExecutorFragment(Types._CompositeState, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _CompositeState__State = new ExecutorFragment(Types._CompositeState, SimplStateMachineTables.Types._State);

		private static final ExecutorFragment _Data__Data = new ExecutorFragment(Types._Data, SimplStateMachineTables.Types._Data);
		private static final ExecutorFragment _Data__ExpressionElement = new ExecutorFragment(Types._Data, SimplStateMachineTables.Types._ExpressionElement);
		private static final ExecutorFragment _Data__OclAny = new ExecutorFragment(Types._Data, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Data__OclElement = new ExecutorFragment(Types._Data, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Event__Event = new ExecutorFragment(Types._Event, SimplStateMachineTables.Types._Event);
		private static final ExecutorFragment _Event__OclAny = new ExecutorFragment(Types._Event, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Event__OclElement = new ExecutorFragment(Types._Event, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Expression__Expression = new ExecutorFragment(Types._Expression, SimplStateMachineTables.Types._Expression);
		private static final ExecutorFragment _Expression__ExpressionElement = new ExecutorFragment(Types._Expression, SimplStateMachineTables.Types._ExpressionElement);
		private static final ExecutorFragment _Expression__OclAny = new ExecutorFragment(Types._Expression, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Expression__OclElement = new ExecutorFragment(Types._Expression, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _ExpressionElement__ExpressionElement = new ExecutorFragment(Types._ExpressionElement, SimplStateMachineTables.Types._ExpressionElement);
		private static final ExecutorFragment _ExpressionElement__OclAny = new ExecutorFragment(Types._ExpressionElement, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ExpressionElement__OclElement = new ExecutorFragment(Types._ExpressionElement, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _InitialState__InitialState = new ExecutorFragment(Types._InitialState, SimplStateMachineTables.Types._InitialState);
		private static final ExecutorFragment _InitialState__OclAny = new ExecutorFragment(Types._InitialState, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _InitialState__OclElement = new ExecutorFragment(Types._InitialState, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _IntegerData__Data = new ExecutorFragment(Types._IntegerData, SimplStateMachineTables.Types._Data);
		private static final ExecutorFragment _IntegerData__ExpressionElement = new ExecutorFragment(Types._IntegerData, SimplStateMachineTables.Types._ExpressionElement);
		private static final ExecutorFragment _IntegerData__IntegerData = new ExecutorFragment(Types._IntegerData, SimplStateMachineTables.Types._IntegerData);
		private static final ExecutorFragment _IntegerData__OclAny = new ExecutorFragment(Types._IntegerData, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _IntegerData__OclElement = new ExecutorFragment(Types._IntegerData, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _IntegerVariable__IntegerVariable = new ExecutorFragment(Types._IntegerVariable, SimplStateMachineTables.Types._IntegerVariable);
		private static final ExecutorFragment _IntegerVariable__OclAny = new ExecutorFragment(Types._IntegerVariable, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _IntegerVariable__OclElement = new ExecutorFragment(Types._IntegerVariable, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _IntegerVariable__Variable = new ExecutorFragment(Types._IntegerVariable, SimplStateMachineTables.Types._Variable);

		private static final ExecutorFragment _Operation__OclAny = new ExecutorFragment(Types._Operation, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Operation__OclElement = new ExecutorFragment(Types._Operation, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Operation__Operation = new ExecutorFragment(Types._Operation, SimplStateMachineTables.Types._Operation);

		private static final ExecutorFragment _Operator__OclAny = new ExecutorFragment(Types._Operator, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Operator__OclElement = new ExecutorFragment(Types._Operator, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Operator__OclEnumeration = new ExecutorFragment(Types._Operator, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _Operator__OclType = new ExecutorFragment(Types._Operator, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _Operator__Operator = new ExecutorFragment(Types._Operator, SimplStateMachineTables.Types._Operator);

		private static final ExecutorFragment _State__OclAny = new ExecutorFragment(Types._State, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _State__OclElement = new ExecutorFragment(Types._State, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _State__State = new ExecutorFragment(Types._State, SimplStateMachineTables.Types._State);

		private static final ExecutorFragment _StateMachine__CompositeState = new ExecutorFragment(Types._StateMachine, SimplStateMachineTables.Types._CompositeState);
		private static final ExecutorFragment _StateMachine__OclAny = new ExecutorFragment(Types._StateMachine, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _StateMachine__OclElement = new ExecutorFragment(Types._StateMachine, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _StateMachine__State = new ExecutorFragment(Types._StateMachine, SimplStateMachineTables.Types._State);
		private static final ExecutorFragment _StateMachine__StateMachine = new ExecutorFragment(Types._StateMachine, SimplStateMachineTables.Types._StateMachine);

		private static final ExecutorFragment _Transition__OclAny = new ExecutorFragment(Types._Transition, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Transition__OclElement = new ExecutorFragment(Types._Transition, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Transition__Transition = new ExecutorFragment(Types._Transition, SimplStateMachineTables.Types._Transition);

		private static final ExecutorFragment _Variable__OclAny = new ExecutorFragment(Types._Variable, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Variable__OclElement = new ExecutorFragment(Types._Variable, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Variable__Variable = new ExecutorFragment(Types._Variable, SimplStateMachineTables.Types._Variable);

		private static final ExecutorFragment _VariableReference__ExpressionElement = new ExecutorFragment(Types._VariableReference, SimplStateMachineTables.Types._ExpressionElement);
		private static final ExecutorFragment _VariableReference__OclAny = new ExecutorFragment(Types._VariableReference, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _VariableReference__OclElement = new ExecutorFragment(Types._VariableReference, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _VariableReference__VariableReference = new ExecutorFragment(Types._VariableReference, SimplStateMachineTables.Types._VariableReference);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SimplStateMachineTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SimplStateMachineTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		public static final ExecutorOperation _CompositeState__activeSubTree = new ExecutorOperation("activeSubTree", TypeUtil.EMPTY_PARAMETER_TYPES, Types._CompositeState,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final ExecutorOperation _CompositeState__unactiveSubTree = new ExecutorOperation("unactiveSubTree", TypeUtil.EMPTY_PARAMETER_TYPES, Types._CompositeState,
			1, TemplateParameters.EMPTY_LIST, null);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SimplStateMachineTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _Assignment___name = new EcoreExecutorProperty(SimplStateMachinePackage.Literals.ASSIGNMENT__NAME, Types._Assignment, 0);
		public static final ExecutorProperty _Assignment__expression = new EcoreExecutorProperty(SimplStateMachinePackage.Literals.ASSIGNMENT__EXPRESSION, Types._Assignment, 1);
		public static final ExecutorProperty _Assignment__variable = new EcoreExecutorProperty(SimplStateMachinePackage.Literals.ASSIGNMENT__VARIABLE, Types._Assignment, 2);
		public static final ExecutorProperty _Assignment__Operation__contents = new ExecutorPropertyWithImplementation("Operation", Types._Assignment, 3, new EcoreLibraryOppositeProperty(SimplStateMachinePackage.Literals.OPERATION__CONTENTS));

		public static final ExecutorProperty _BooleanData__value = new EcoreExecutorProperty(SimplStateMachinePackage.Literals.BOOLEAN_DATA__VALUE, Types._BooleanData, 0);

		public static final ExecutorProperty _CompositeState__initialState = new EcoreExecutorProperty(SimplStateMachinePackage.Literals.COMPOSITE_STATE__INITIAL_STATE, Types._CompositeState, 0);
		public static final ExecutorProperty _CompositeState__states = new EcoreExecutorProperty(SimplStateMachinePackage.Literals.COMPOSITE_STATE__STATES, Types._CompositeState, 1);

		public static final ExecutorProperty _Data__Variable__value = new ExecutorPropertyWithImplementation("Variable", Types._Data, 0, new EcoreLibraryOppositeProperty(SimplStateMachinePackage.Literals.VARIABLE__VALUE));

		public static final ExecutorProperty _Event__name = new EcoreExecutorProperty(SimplStateMachinePackage.Literals.EVENT__NAME, Types._Event, 0);
		public static final ExecutorProperty _Event__StateMachine__events = new ExecutorPropertyWithImplementation("StateMachine", Types._Event, 1, new EcoreLibraryOppositeProperty(SimplStateMachinePackage.Literals.STATE_MACHINE__EVENTS));
		public static final ExecutorProperty _Event__Transition__event = new ExecutorPropertyWithImplementation("Transition", Types._Event, 2, new EcoreLibraryOppositeProperty(SimplStateMachinePackage.Literals.TRANSITION__EVENT));

		public static final ExecutorProperty _Expression___name = new EcoreExecutorProperty(SimplStateMachinePackage.Literals.EXPRESSION__NAME, Types._Expression, 0);
		public static final ExecutorProperty _Expression__left = new EcoreExecutorProperty(SimplStateMachinePackage.Literals.EXPRESSION__LEFT, Types._Expression, 1);
		public static final ExecutorProperty _Expression__operator = new EcoreExecutorProperty(SimplStateMachinePackage.Literals.EXPRESSION__OPERATOR, Types._Expression, 2);
		public static final ExecutorProperty _Expression__right = new EcoreExecutorProperty(SimplStateMachinePackage.Literals.EXPRESSION__RIGHT, Types._Expression, 3);
		public static final ExecutorProperty _Expression__Transition__guard = new ExecutorPropertyWithImplementation("Transition", Types._Expression, 4, new EcoreLibraryOppositeProperty(SimplStateMachinePackage.Literals.TRANSITION__GUARD));

		public static final ExecutorProperty _ExpressionElement__Assignment__expression = new ExecutorPropertyWithImplementation("Assignment", Types._ExpressionElement, 0, new EcoreLibraryOppositeProperty(SimplStateMachinePackage.Literals.ASSIGNMENT__EXPRESSION));
		public static final ExecutorProperty _ExpressionElement__Expression__left = new ExecutorPropertyWithImplementation("Expression", Types._ExpressionElement, 1, new EcoreLibraryOppositeProperty(SimplStateMachinePackage.Literals.EXPRESSION__LEFT));
		public static final ExecutorProperty _ExpressionElement__Expression__right = new ExecutorPropertyWithImplementation("Expression", Types._ExpressionElement, 2, new EcoreLibraryOppositeProperty(SimplStateMachinePackage.Literals.EXPRESSION__RIGHT));

		public static final ExecutorProperty _InitialState__referencedState = new EcoreExecutorProperty(SimplStateMachinePackage.Literals.INITIAL_STATE__REFERENCED_STATE, Types._InitialState, 0);
		public static final ExecutorProperty _InitialState__CompositeState__initialState = new ExecutorPropertyWithImplementation("CompositeState", Types._InitialState, 1, new EcoreLibraryOppositeProperty(SimplStateMachinePackage.Literals.COMPOSITE_STATE__INITIAL_STATE));

		public static final ExecutorProperty _IntegerData__value = new EcoreExecutorProperty(SimplStateMachinePackage.Literals.INTEGER_DATA__VALUE, Types._IntegerData, 0);

		public static final ExecutorProperty _Operation__contents = new EcoreExecutorProperty(SimplStateMachinePackage.Literals.OPERATION__CONTENTS, Types._Operation, 0);
		public static final ExecutorProperty _Operation__name = new EcoreExecutorProperty(SimplStateMachinePackage.Literals.OPERATION__NAME, Types._Operation, 1);
		public static final ExecutorProperty _Operation__State__operation = new ExecutorPropertyWithImplementation("State", Types._Operation, 2, new EcoreLibraryOppositeProperty(SimplStateMachinePackage.Literals.STATE__OPERATION));

		public static final ExecutorProperty _State__container = new EcoreExecutorProperty(SimplStateMachinePackage.Literals.STATE__CONTAINER, Types._State, 0);
		public static final ExecutorProperty _State__isActive = new EcoreExecutorProperty(SimplStateMachinePackage.Literals.STATE__IS_ACTIVE, Types._State, 1);
		public static final ExecutorProperty _State__name = new EcoreExecutorProperty(SimplStateMachinePackage.Literals.STATE__NAME, Types._State, 2);
		public static final ExecutorProperty _State__operation = new EcoreExecutorProperty(SimplStateMachinePackage.Literals.STATE__OPERATION, Types._State, 3);
		public static final ExecutorProperty _State__InitialState__referencedState = new ExecutorPropertyWithImplementation("InitialState", Types._State, 4, new EcoreLibraryOppositeProperty(SimplStateMachinePackage.Literals.INITIAL_STATE__REFERENCED_STATE));
		public static final ExecutorProperty _State__Transition__source = new ExecutorPropertyWithImplementation("Transition", Types._State, 5, new EcoreLibraryOppositeProperty(SimplStateMachinePackage.Literals.TRANSITION__SOURCE));
		public static final ExecutorProperty _State__Transition__target = new ExecutorPropertyWithImplementation("Transition", Types._State, 6, new EcoreLibraryOppositeProperty(SimplStateMachinePackage.Literals.TRANSITION__TARGET));

		public static final ExecutorProperty _StateMachine__events = new EcoreExecutorProperty(SimplStateMachinePackage.Literals.STATE_MACHINE__EVENTS, Types._StateMachine, 0);
		public static final ExecutorProperty _StateMachine__transitions = new EcoreExecutorProperty(SimplStateMachinePackage.Literals.STATE_MACHINE__TRANSITIONS, Types._StateMachine, 1);
		public static final ExecutorProperty _StateMachine__variables = new EcoreExecutorProperty(SimplStateMachinePackage.Literals.STATE_MACHINE__VARIABLES, Types._StateMachine, 2);

		public static final ExecutorProperty _Transition__event = new EcoreExecutorProperty(SimplStateMachinePackage.Literals.TRANSITION__EVENT, Types._Transition, 0);
		public static final ExecutorProperty _Transition__guard = new EcoreExecutorProperty(SimplStateMachinePackage.Literals.TRANSITION__GUARD, Types._Transition, 1);
		public static final ExecutorProperty _Transition__source = new EcoreExecutorProperty(SimplStateMachinePackage.Literals.TRANSITION__SOURCE, Types._Transition, 2);
		public static final ExecutorProperty _Transition__target = new EcoreExecutorProperty(SimplStateMachinePackage.Literals.TRANSITION__TARGET, Types._Transition, 3);
		public static final ExecutorProperty _Transition__StateMachine__transitions = new ExecutorPropertyWithImplementation("StateMachine", Types._Transition, 4, new EcoreLibraryOppositeProperty(SimplStateMachinePackage.Literals.STATE_MACHINE__TRANSITIONS));

		public static final ExecutorProperty _Variable__name = new EcoreExecutorProperty(SimplStateMachinePackage.Literals.VARIABLE__NAME, Types._Variable, 0);
		public static final ExecutorProperty _Variable__value = new EcoreExecutorProperty(SimplStateMachinePackage.Literals.VARIABLE__VALUE, Types._Variable, 1);
		public static final ExecutorProperty _Variable__Assignment__variable = new ExecutorPropertyWithImplementation("Assignment", Types._Variable, 2, new EcoreLibraryOppositeProperty(SimplStateMachinePackage.Literals.ASSIGNMENT__VARIABLE));
		public static final ExecutorProperty _Variable__StateMachine__variables = new ExecutorPropertyWithImplementation("StateMachine", Types._Variable, 3, new EcoreLibraryOppositeProperty(SimplStateMachinePackage.Literals.STATE_MACHINE__VARIABLES));
		public static final ExecutorProperty _Variable__VariableReference__variable = new ExecutorPropertyWithImplementation("VariableReference", Types._Variable, 4, new EcoreLibraryOppositeProperty(SimplStateMachinePackage.Literals.VARIABLE_REFERENCE__VARIABLE));

		public static final ExecutorProperty _VariableReference___name = new EcoreExecutorProperty(SimplStateMachinePackage.Literals.VARIABLE_REFERENCE__NAME, Types._VariableReference, 0);
		public static final ExecutorProperty _VariableReference__variable = new EcoreExecutorProperty(SimplStateMachinePackage.Literals.VARIABLE_REFERENCE__VARIABLE, Types._VariableReference, 1);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SimplStateMachineTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _Assignment =
			{
				Fragments._Assignment__OclAny /* 0 */,
				Fragments._Assignment__OclElement /* 1 */,
				Fragments._Assignment__Assignment /* 2 */
			};
		private static final int /*@NonNull*/ [] __Assignment = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _BooleanData =
			{
				Fragments._BooleanData__OclAny /* 0 */,
				Fragments._BooleanData__OclElement /* 1 */,
				Fragments._BooleanData__ExpressionElement /* 2 */,
				Fragments._BooleanData__Data /* 3 */,
				Fragments._BooleanData__BooleanData /* 4 */
			};
		private static final int /*@NonNull*/ [] __BooleanData = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _BooleanVariable =
			{
				Fragments._BooleanVariable__OclAny /* 0 */,
				Fragments._BooleanVariable__OclElement /* 1 */,
				Fragments._BooleanVariable__Variable /* 2 */,
				Fragments._BooleanVariable__BooleanVariable /* 3 */
			};
		private static final int /*@NonNull*/ [] __BooleanVariable = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _CompositeState =
			{
				Fragments._CompositeState__OclAny /* 0 */,
				Fragments._CompositeState__OclElement /* 1 */,
				Fragments._CompositeState__State /* 2 */,
				Fragments._CompositeState__CompositeState /* 3 */
			};
		private static final int /*@NonNull*/ [] __CompositeState = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Data =
			{
				Fragments._Data__OclAny /* 0 */,
				Fragments._Data__OclElement /* 1 */,
				Fragments._Data__ExpressionElement /* 2 */,
				Fragments._Data__Data /* 3 */
			};
		private static final int /*@NonNull*/ [] __Data = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Event =
			{
				Fragments._Event__OclAny /* 0 */,
				Fragments._Event__OclElement /* 1 */,
				Fragments._Event__Event /* 2 */
			};
		private static final int /*@NonNull*/ [] __Event = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Expression =
			{
				Fragments._Expression__OclAny /* 0 */,
				Fragments._Expression__OclElement /* 1 */,
				Fragments._Expression__ExpressionElement /* 2 */,
				Fragments._Expression__Expression /* 3 */
			};
		private static final int /*@NonNull*/ [] __Expression = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ExpressionElement =
			{
				Fragments._ExpressionElement__OclAny /* 0 */,
				Fragments._ExpressionElement__OclElement /* 1 */,
				Fragments._ExpressionElement__ExpressionElement /* 2 */
			};
		private static final int /*@NonNull*/ [] __ExpressionElement = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _InitialState =
			{
				Fragments._InitialState__OclAny /* 0 */,
				Fragments._InitialState__OclElement /* 1 */,
				Fragments._InitialState__InitialState /* 2 */
			};
		private static final int /*@NonNull*/ [] __InitialState = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _IntegerData =
			{
				Fragments._IntegerData__OclAny /* 0 */,
				Fragments._IntegerData__OclElement /* 1 */,
				Fragments._IntegerData__ExpressionElement /* 2 */,
				Fragments._IntegerData__Data /* 3 */,
				Fragments._IntegerData__IntegerData /* 4 */
			};
		private static final int /*@NonNull*/ [] __IntegerData = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _IntegerVariable =
			{
				Fragments._IntegerVariable__OclAny /* 0 */,
				Fragments._IntegerVariable__OclElement /* 1 */,
				Fragments._IntegerVariable__Variable /* 2 */,
				Fragments._IntegerVariable__IntegerVariable /* 3 */
			};
		private static final int /*@NonNull*/ [] __IntegerVariable = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Operation =
			{
				Fragments._Operation__OclAny /* 0 */,
				Fragments._Operation__OclElement /* 1 */,
				Fragments._Operation__Operation /* 2 */
			};
		private static final int /*@NonNull*/ [] __Operation = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Operator =
			{
				Fragments._Operator__OclAny /* 0 */,
				Fragments._Operator__OclElement /* 1 */,
				Fragments._Operator__OclType /* 2 */,
				Fragments._Operator__OclEnumeration /* 3 */,
				Fragments._Operator__Operator /* 4 */
			};
		private static final int /*@NonNull*/ [] __Operator = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _State =
			{
				Fragments._State__OclAny /* 0 */,
				Fragments._State__OclElement /* 1 */,
				Fragments._State__State /* 2 */
			};
		private static final int /*@NonNull*/ [] __State = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _StateMachine =
			{
				Fragments._StateMachine__OclAny /* 0 */,
				Fragments._StateMachine__OclElement /* 1 */,
				Fragments._StateMachine__State /* 2 */,
				Fragments._StateMachine__CompositeState /* 3 */,
				Fragments._StateMachine__StateMachine /* 4 */
			};
		private static final int /*@NonNull*/ [] __StateMachine = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Transition =
			{
				Fragments._Transition__OclAny /* 0 */,
				Fragments._Transition__OclElement /* 1 */,
				Fragments._Transition__Transition /* 2 */
			};
		private static final int /*@NonNull*/ [] __Transition = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Variable =
			{
				Fragments._Variable__OclAny /* 0 */,
				Fragments._Variable__OclElement /* 1 */,
				Fragments._Variable__Variable /* 2 */
			};
		private static final int /*@NonNull*/ [] __Variable = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _VariableReference =
			{
				Fragments._VariableReference__OclAny /* 0 */,
				Fragments._VariableReference__OclElement /* 1 */,
				Fragments._VariableReference__ExpressionElement /* 2 */,
				Fragments._VariableReference__VariableReference /* 3 */
			};
		private static final int /*@NonNull*/ [] __VariableReference = { 1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Assignment.initFragments(_Assignment, __Assignment);
			Types._BooleanData.initFragments(_BooleanData, __BooleanData);
			Types._BooleanVariable.initFragments(_BooleanVariable, __BooleanVariable);
			Types._CompositeState.initFragments(_CompositeState, __CompositeState);
			Types._Data.initFragments(_Data, __Data);
			Types._Event.initFragments(_Event, __Event);
			Types._Expression.initFragments(_Expression, __Expression);
			Types._ExpressionElement.initFragments(_ExpressionElement, __ExpressionElement);
			Types._InitialState.initFragments(_InitialState, __InitialState);
			Types._IntegerData.initFragments(_IntegerData, __IntegerData);
			Types._IntegerVariable.initFragments(_IntegerVariable, __IntegerVariable);
			Types._Operation.initFragments(_Operation, __Operation);
			Types._Operator.initFragments(_Operator, __Operator);
			Types._State.initFragments(_State, __State);
			Types._StateMachine.initFragments(_StateMachine, __StateMachine);
			Types._Transition.initFragments(_Transition, __Transition);
			Types._Variable.initFragments(_Variable, __Variable);
			Types._VariableReference.initFragments(_VariableReference, __VariableReference);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SimplStateMachineTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _Assignment__Assignment = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Assignment__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Assignment__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _BooleanData__BooleanData = {};
		private static final ExecutorOperation /*@NonNull*/ [] _BooleanData__Data = {};
		private static final ExecutorOperation /*@NonNull*/ [] _BooleanData__ExpressionElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _BooleanData__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _BooleanData__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _BooleanVariable__BooleanVariable = {};
		private static final ExecutorOperation /*@NonNull*/ [] _BooleanVariable__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _BooleanVariable__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _BooleanVariable__Variable = {};

		private static final ExecutorOperation /*@NonNull*/ [] _CompositeState__CompositeState = {
			SimplStateMachineTables.Operations._CompositeState__activeSubTree /* activeSubTree() */,
			SimplStateMachineTables.Operations._CompositeState__unactiveSubTree /* unactiveSubTree() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CompositeState__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CompositeState__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CompositeState__State = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Data__Data = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Data__ExpressionElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Data__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Data__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Event__Event = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Event__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Event__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Expression__Expression = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Expression__ExpressionElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Expression__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Expression__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ExpressionElement__ExpressionElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ExpressionElement__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ExpressionElement__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _InitialState__InitialState = {};
		private static final ExecutorOperation /*@NonNull*/ [] _InitialState__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _InitialState__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _IntegerData__IntegerData = {};
		private static final ExecutorOperation /*@NonNull*/ [] _IntegerData__Data = {};
		private static final ExecutorOperation /*@NonNull*/ [] _IntegerData__ExpressionElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _IntegerData__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _IntegerData__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _IntegerVariable__IntegerVariable = {};
		private static final ExecutorOperation /*@NonNull*/ [] _IntegerVariable__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _IntegerVariable__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _IntegerVariable__Variable = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Operation__Operation = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Operation__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Operation__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Operator__Operator = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Operator__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Operator__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Operator__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Operator__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _State__State = {};
		private static final ExecutorOperation /*@NonNull*/ [] _State__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _State__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _StateMachine__StateMachine = {};
		private static final ExecutorOperation /*@NonNull*/ [] _StateMachine__CompositeState = {
			SimplStateMachineTables.Operations._CompositeState__activeSubTree /* activeSubTree() */,
			SimplStateMachineTables.Operations._CompositeState__unactiveSubTree /* unactiveSubTree() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _StateMachine__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _StateMachine__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _StateMachine__State = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Transition__Transition = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Transition__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Transition__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Variable__Variable = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Variable__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Variable__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _VariableReference__VariableReference = {};
		private static final ExecutorOperation /*@NonNull*/ [] _VariableReference__ExpressionElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _VariableReference__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _VariableReference__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Assignment__Assignment.initOperations(_Assignment__Assignment);
			Fragments._Assignment__OclAny.initOperations(_Assignment__OclAny);
			Fragments._Assignment__OclElement.initOperations(_Assignment__OclElement);

			Fragments._BooleanData__BooleanData.initOperations(_BooleanData__BooleanData);
			Fragments._BooleanData__Data.initOperations(_BooleanData__Data);
			Fragments._BooleanData__ExpressionElement.initOperations(_BooleanData__ExpressionElement);
			Fragments._BooleanData__OclAny.initOperations(_BooleanData__OclAny);
			Fragments._BooleanData__OclElement.initOperations(_BooleanData__OclElement);

			Fragments._BooleanVariable__BooleanVariable.initOperations(_BooleanVariable__BooleanVariable);
			Fragments._BooleanVariable__OclAny.initOperations(_BooleanVariable__OclAny);
			Fragments._BooleanVariable__OclElement.initOperations(_BooleanVariable__OclElement);
			Fragments._BooleanVariable__Variable.initOperations(_BooleanVariable__Variable);

			Fragments._CompositeState__CompositeState.initOperations(_CompositeState__CompositeState);
			Fragments._CompositeState__OclAny.initOperations(_CompositeState__OclAny);
			Fragments._CompositeState__OclElement.initOperations(_CompositeState__OclElement);
			Fragments._CompositeState__State.initOperations(_CompositeState__State);

			Fragments._Data__Data.initOperations(_Data__Data);
			Fragments._Data__ExpressionElement.initOperations(_Data__ExpressionElement);
			Fragments._Data__OclAny.initOperations(_Data__OclAny);
			Fragments._Data__OclElement.initOperations(_Data__OclElement);

			Fragments._Event__Event.initOperations(_Event__Event);
			Fragments._Event__OclAny.initOperations(_Event__OclAny);
			Fragments._Event__OclElement.initOperations(_Event__OclElement);

			Fragments._Expression__Expression.initOperations(_Expression__Expression);
			Fragments._Expression__ExpressionElement.initOperations(_Expression__ExpressionElement);
			Fragments._Expression__OclAny.initOperations(_Expression__OclAny);
			Fragments._Expression__OclElement.initOperations(_Expression__OclElement);

			Fragments._ExpressionElement__ExpressionElement.initOperations(_ExpressionElement__ExpressionElement);
			Fragments._ExpressionElement__OclAny.initOperations(_ExpressionElement__OclAny);
			Fragments._ExpressionElement__OclElement.initOperations(_ExpressionElement__OclElement);

			Fragments._InitialState__InitialState.initOperations(_InitialState__InitialState);
			Fragments._InitialState__OclAny.initOperations(_InitialState__OclAny);
			Fragments._InitialState__OclElement.initOperations(_InitialState__OclElement);

			Fragments._IntegerData__Data.initOperations(_IntegerData__Data);
			Fragments._IntegerData__ExpressionElement.initOperations(_IntegerData__ExpressionElement);
			Fragments._IntegerData__IntegerData.initOperations(_IntegerData__IntegerData);
			Fragments._IntegerData__OclAny.initOperations(_IntegerData__OclAny);
			Fragments._IntegerData__OclElement.initOperations(_IntegerData__OclElement);

			Fragments._IntegerVariable__IntegerVariable.initOperations(_IntegerVariable__IntegerVariable);
			Fragments._IntegerVariable__OclAny.initOperations(_IntegerVariable__OclAny);
			Fragments._IntegerVariable__OclElement.initOperations(_IntegerVariable__OclElement);
			Fragments._IntegerVariable__Variable.initOperations(_IntegerVariable__Variable);

			Fragments._Operation__OclAny.initOperations(_Operation__OclAny);
			Fragments._Operation__OclElement.initOperations(_Operation__OclElement);
			Fragments._Operation__Operation.initOperations(_Operation__Operation);

			Fragments._Operator__OclAny.initOperations(_Operator__OclAny);
			Fragments._Operator__OclElement.initOperations(_Operator__OclElement);
			Fragments._Operator__OclEnumeration.initOperations(_Operator__OclEnumeration);
			Fragments._Operator__OclType.initOperations(_Operator__OclType);
			Fragments._Operator__Operator.initOperations(_Operator__Operator);

			Fragments._State__OclAny.initOperations(_State__OclAny);
			Fragments._State__OclElement.initOperations(_State__OclElement);
			Fragments._State__State.initOperations(_State__State);

			Fragments._StateMachine__CompositeState.initOperations(_StateMachine__CompositeState);
			Fragments._StateMachine__OclAny.initOperations(_StateMachine__OclAny);
			Fragments._StateMachine__OclElement.initOperations(_StateMachine__OclElement);
			Fragments._StateMachine__State.initOperations(_StateMachine__State);
			Fragments._StateMachine__StateMachine.initOperations(_StateMachine__StateMachine);

			Fragments._Transition__OclAny.initOperations(_Transition__OclAny);
			Fragments._Transition__OclElement.initOperations(_Transition__OclElement);
			Fragments._Transition__Transition.initOperations(_Transition__Transition);

			Fragments._Variable__OclAny.initOperations(_Variable__OclAny);
			Fragments._Variable__OclElement.initOperations(_Variable__OclElement);
			Fragments._Variable__Variable.initOperations(_Variable__Variable);

			Fragments._VariableReference__ExpressionElement.initOperations(_VariableReference__ExpressionElement);
			Fragments._VariableReference__OclAny.initOperations(_VariableReference__OclAny);
			Fragments._VariableReference__OclElement.initOperations(_VariableReference__OclElement);
			Fragments._VariableReference__VariableReference.initOperations(_VariableReference__VariableReference);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SimplStateMachineTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _Assignment = {
			SimplStateMachineTables.Properties._Assignment___name,
			SimplStateMachineTables.Properties._Assignment__expression,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			SimplStateMachineTables.Properties._Assignment__variable
		};

		private static final ExecutorProperty /*@NonNull*/ [] _BooleanData = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			SimplStateMachineTables.Properties._BooleanData__value
		};

		private static final ExecutorProperty /*@NonNull*/ [] _BooleanVariable = {
			SimplStateMachineTables.Properties._Variable__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			SimplStateMachineTables.Properties._Variable__value
		};

		private static final ExecutorProperty /*@NonNull*/ [] _CompositeState = {
			SimplStateMachineTables.Properties._State__container,
			SimplStateMachineTables.Properties._CompositeState__initialState,
			SimplStateMachineTables.Properties._State__isActive,
			SimplStateMachineTables.Properties._State__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			SimplStateMachineTables.Properties._State__operation,
			SimplStateMachineTables.Properties._CompositeState__states
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Data = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Event = {
			SimplStateMachineTables.Properties._Event__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Expression = {
			SimplStateMachineTables.Properties._Expression___name,
			SimplStateMachineTables.Properties._Expression__left,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			SimplStateMachineTables.Properties._Expression__operator,
			SimplStateMachineTables.Properties._Expression__right
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ExpressionElement = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _InitialState = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			SimplStateMachineTables.Properties._InitialState__referencedState
		};

		private static final ExecutorProperty /*@NonNull*/ [] _IntegerData = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			SimplStateMachineTables.Properties._IntegerData__value
		};

		private static final ExecutorProperty /*@NonNull*/ [] _IntegerVariable = {
			SimplStateMachineTables.Properties._Variable__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			SimplStateMachineTables.Properties._Variable__value
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Operation = {
			SimplStateMachineTables.Properties._Operation__contents,
			SimplStateMachineTables.Properties._Operation__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Operator = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _State = {
			SimplStateMachineTables.Properties._State__container,
			SimplStateMachineTables.Properties._State__isActive,
			SimplStateMachineTables.Properties._State__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			SimplStateMachineTables.Properties._State__operation
		};

		private static final ExecutorProperty /*@NonNull*/ [] _StateMachine = {
			SimplStateMachineTables.Properties._State__container,
			SimplStateMachineTables.Properties._StateMachine__events,
			SimplStateMachineTables.Properties._CompositeState__initialState,
			SimplStateMachineTables.Properties._State__isActive,
			SimplStateMachineTables.Properties._State__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			SimplStateMachineTables.Properties._State__operation,
			SimplStateMachineTables.Properties._CompositeState__states,
			SimplStateMachineTables.Properties._StateMachine__transitions,
			SimplStateMachineTables.Properties._StateMachine__variables
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Transition = {
			SimplStateMachineTables.Properties._Transition__event,
			SimplStateMachineTables.Properties._Transition__guard,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			SimplStateMachineTables.Properties._Transition__source,
			SimplStateMachineTables.Properties._Transition__target
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Variable = {
			SimplStateMachineTables.Properties._Variable__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			SimplStateMachineTables.Properties._Variable__value
		};

		private static final ExecutorProperty /*@NonNull*/ [] _VariableReference = {
			SimplStateMachineTables.Properties._VariableReference___name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			SimplStateMachineTables.Properties._VariableReference__variable
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Assignment__Assignment.initProperties(_Assignment);
			Fragments._BooleanData__BooleanData.initProperties(_BooleanData);
			Fragments._BooleanVariable__BooleanVariable.initProperties(_BooleanVariable);
			Fragments._CompositeState__CompositeState.initProperties(_CompositeState);
			Fragments._Data__Data.initProperties(_Data);
			Fragments._Event__Event.initProperties(_Event);
			Fragments._Expression__Expression.initProperties(_Expression);
			Fragments._ExpressionElement__ExpressionElement.initProperties(_ExpressionElement);
			Fragments._InitialState__InitialState.initProperties(_InitialState);
			Fragments._IntegerData__IntegerData.initProperties(_IntegerData);
			Fragments._IntegerVariable__IntegerVariable.initProperties(_IntegerVariable);
			Fragments._Operation__Operation.initProperties(_Operation);
			Fragments._Operator__Operator.initProperties(_Operator);
			Fragments._State__State.initProperties(_State);
			Fragments._StateMachine__StateMachine.initProperties(_StateMachine);
			Fragments._Transition__Transition.initProperties(_Transition);
			Fragments._Variable__Variable.initProperties(_Variable);
			Fragments._VariableReference__VariableReference.initProperties(_VariableReference);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SimplStateMachineTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		public static final EcoreExecutorEnumerationLiteral _Operator__add = new EcoreExecutorEnumerationLiteral(SimplStateMachinePackage.Literals.OPERATOR.getEEnumLiteral("add"), Types._Operator, 0);
		public static final EcoreExecutorEnumerationLiteral _Operator__sub = new EcoreExecutorEnumerationLiteral(SimplStateMachinePackage.Literals.OPERATOR.getEEnumLiteral("sub"), Types._Operator, 1);
		public static final EcoreExecutorEnumerationLiteral _Operator__eq = new EcoreExecutorEnumerationLiteral(SimplStateMachinePackage.Literals.OPERATOR.getEEnumLiteral("eq"), Types._Operator, 2);
		public static final EcoreExecutorEnumerationLiteral _Operator__mul = new EcoreExecutorEnumerationLiteral(SimplStateMachinePackage.Literals.OPERATOR.getEEnumLiteral("mul"), Types._Operator, 3);
		public static final EcoreExecutorEnumerationLiteral _Operator__gt = new EcoreExecutorEnumerationLiteral(SimplStateMachinePackage.Literals.OPERATOR.getEEnumLiteral("gt"), Types._Operator, 4);
		public static final EcoreExecutorEnumerationLiteral _Operator__lt = new EcoreExecutorEnumerationLiteral(SimplStateMachinePackage.Literals.OPERATOR.getEEnumLiteral("lt"), Types._Operator, 5);
		public static final EcoreExecutorEnumerationLiteral _Operator__lte = new EcoreExecutorEnumerationLiteral(SimplStateMachinePackage.Literals.OPERATOR.getEEnumLiteral("lte"), Types._Operator, 6);
		public static final EcoreExecutorEnumerationLiteral _Operator__gte = new EcoreExecutorEnumerationLiteral(SimplStateMachinePackage.Literals.OPERATOR.getEEnumLiteral("gte"), Types._Operator, 7);
		public static final EcoreExecutorEnumerationLiteral _Operator__div = new EcoreExecutorEnumerationLiteral(SimplStateMachinePackage.Literals.OPERATOR.getEEnumLiteral("div"), Types._Operator, 8);
		public static final EcoreExecutorEnumerationLiteral _Operator__and = new EcoreExecutorEnumerationLiteral(SimplStateMachinePackage.Literals.OPERATOR.getEEnumLiteral("and"), Types._Operator, 9);
		public static final EcoreExecutorEnumerationLiteral _Operator__neq = new EcoreExecutorEnumerationLiteral(SimplStateMachinePackage.Literals.OPERATOR.getEEnumLiteral("neq"), Types._Operator, 10);
		public static final EcoreExecutorEnumerationLiteral _Operator__or = new EcoreExecutorEnumerationLiteral(SimplStateMachinePackage.Literals.OPERATOR.getEEnumLiteral("or"), Types._Operator, 11);
		public static final EcoreExecutorEnumerationLiteral _Operator__not = new EcoreExecutorEnumerationLiteral(SimplStateMachinePackage.Literals.OPERATOR.getEEnumLiteral("not"), Types._Operator, 12);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _Operator = {
			_Operator__add,
			_Operator__sub,
			_Operator__eq,
			_Operator__mul,
			_Operator__gt,
			_Operator__lt,
			_Operator__lte,
			_Operator__gte,
			_Operator__div,
			_Operator__and,
			_Operator__neq,
			_Operator__or,
			_Operator__not
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._Operator.initLiterals(_Operator);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SimplStateMachineTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new SimplStateMachineTables();
	}

	private SimplStateMachineTables() {
		super(SimplStateMachinePackage.eNS_URI);
	}

	/*
	 * The EClasses whose instances should be cached to support allInstances().
	 */
	private static final EClass allInstancesEClasses /*@NonNull*/ [] = {
		SimplStateMachinePackage.Literals.EVENT,
		SimplStateMachinePackage.Literals.STATE_MACHINE
	};

	@Override
	public EClass /*@NonNull*/ [] basicGetAllInstancesClasses() {
		return allInstancesEClasses;
	}
}
