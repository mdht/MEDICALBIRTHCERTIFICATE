/**
 */
package org.eclipse.mdht.uml.fhir.core.valueSets;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Data Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ValueSetsPackage#getDataType()
 * @model
 * @generated
 */
public enum DataType implements Enumerator {
	/**
	 * The '<em><b>Address</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADDRESS_VALUE
	 * @generated
	 * @ordered
	 */
	ADDRESS(0, "address", "address"),

	/**
	 * The '<em><b>Age</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AGE_VALUE
	 * @generated
	 * @ordered
	 */
	AGE(1, "age", "age"),

	/**
	 * The '<em><b>Annotation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANNOTATION_VALUE
	 * @generated
	 * @ordered
	 */
	ANNOTATION(2, "annotation", "annotation"),

	/**
	 * The '<em><b>Attachment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ATTACHMENT_VALUE
	 * @generated
	 * @ordered
	 */
	ATTACHMENT(3, "attachment", "attachment"),

	/**
	 * The '<em><b>Backbone Element</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BACKBONE_ELEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	BACKBONE_ELEMENT(4, "backboneElement", "backboneElement"),

	/**
	 * The '<em><b>Codeable Concept</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CODEABLE_CONCEPT_VALUE
	 * @generated
	 * @ordered
	 */
	CODEABLE_CONCEPT(5, "codeableConcept", "codeableConcept"),

	/**
	 * The '<em><b>Coding</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CODING_VALUE
	 * @generated
	 * @ordered
	 */
	CODING(6, "coding", "coding"),

	/**
	 * The '<em><b>Contact Detail</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTACT_DETAIL_VALUE
	 * @generated
	 * @ordered
	 */
	CONTACT_DETAIL(7, "contactDetail", "contactDetail"),

	/**
	 * The '<em><b>Contact Point</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTACT_POINT_VALUE
	 * @generated
	 * @ordered
	 */
	CONTACT_POINT(8, "contactPoint", "contactPoint"),

	/**
	 * The '<em><b>Contributor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTRIBUTOR_VALUE
	 * @generated
	 * @ordered
	 */
	CONTRIBUTOR(9, "contributor", "contributor"),

	/**
	 * The '<em><b>Count</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COUNT_VALUE
	 * @generated
	 * @ordered
	 */
	COUNT(10, "count", "count"),

	/**
	 * The '<em><b>Data Requirement</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_REQUIREMENT_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_REQUIREMENT(11, "dataRequirement", "dataRequirement"),

	/**
	 * The '<em><b>Distance</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISTANCE_VALUE
	 * @generated
	 * @ordered
	 */
	DISTANCE(12, "distance", "distance"),

	/**
	 * The '<em><b>Dosage Instruction</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOSAGE_INSTRUCTION_VALUE
	 * @generated
	 * @ordered
	 */
	DOSAGE_INSTRUCTION(13, "dosageInstruction", "dosageInstruction"),

	/**
	 * The '<em><b>Duration</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DURATION_VALUE
	 * @generated
	 * @ordered
	 */
	DURATION(14, "duration", "duration"),

	/**
	 * The '<em><b>Element</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	ELEMENT(15, "element", "element"),

	/**
	 * The '<em><b>Element Definition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELEMENT_DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	ELEMENT_DEFINITION(16, "elementDefinition", "elementDefinition"),

	/**
	 * The '<em><b>Extension</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXTENSION_VALUE
	 * @generated
	 * @ordered
	 */
	EXTENSION(17, "extension", "extension"),

	/**
	 * The '<em><b>Human Name</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HUMAN_NAME_VALUE
	 * @generated
	 * @ordered
	 */
	HUMAN_NAME(18, "humanName", "humanName"),

	/**
	 * The '<em><b>Identifier</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IDENTIFIER_VALUE
	 * @generated
	 * @ordered
	 */
	IDENTIFIER(19, "identifier", "identifier"),

	/**
	 * The '<em><b>Meta</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #META_VALUE
	 * @generated
	 * @ordered
	 */
	META(20, "meta", "meta"),

	/**
	 * The '<em><b>Money</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MONEY_VALUE
	 * @generated
	 * @ordered
	 */
	MONEY(21, "money", "money"),

	/**
	 * The '<em><b>Narrative</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NARRATIVE_VALUE
	 * @generated
	 * @ordered
	 */
	NARRATIVE(22, "narrative", "narrative"),

	/**
	 * The '<em><b>Parameter Definition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARAMETER_DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	PARAMETER_DEFINITION(23, "parameterDefinition", "parameterDefinition"),

	/**
	 * The '<em><b>Period</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERIOD_VALUE
	 * @generated
	 * @ordered
	 */
	PERIOD(24, "period", "period"),

	/**
	 * The '<em><b>Quantity</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUANTITY_VALUE
	 * @generated
	 * @ordered
	 */
	QUANTITY(25, "quantity", "quantity"),

	/**
	 * The '<em><b>Range</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RANGE_VALUE
	 * @generated
	 * @ordered
	 */
	RANGE(26, "range", "range"),

	/**
	 * The '<em><b>Ratio</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RATIO_VALUE
	 * @generated
	 * @ordered
	 */
	RATIO(27, "ratio", "ratio"),

	/**
	 * The '<em><b>Reference</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFERENCE_VALUE
	 * @generated
	 * @ordered
	 */
	REFERENCE(28, "reference", "reference"),

	/**
	 * The '<em><b>Related Artifact</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RELATED_ARTIFACT_VALUE
	 * @generated
	 * @ordered
	 */
	RELATED_ARTIFACT(29, "relatedArtifact", "relatedArtifact"),

	/**
	 * The '<em><b>Sampled Data</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAMPLED_DATA_VALUE
	 * @generated
	 * @ordered
	 */
	SAMPLED_DATA(30, "sampledData", "sampledData"),

	/**
	 * The '<em><b>Signature</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGNATURE_VALUE
	 * @generated
	 * @ordered
	 */
	SIGNATURE(31, "signature", "signature"),

	/**
	 * The '<em><b>Simple Quantity</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIMPLE_QUANTITY_VALUE
	 * @generated
	 * @ordered
	 */
	SIMPLE_QUANTITY(32, "simpleQuantity", "simpleQuantity"),

	/**
	 * The '<em><b>Timing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIMING_VALUE
	 * @generated
	 * @ordered
	 */
	TIMING(33, "timing", "timing"),

	/**
	 * The '<em><b>Trigger Definition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRIGGER_DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	TRIGGER_DEFINITION(34, "triggerDefinition", "triggerDefinition"),

	/**
	 * The '<em><b>Usage Context</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USAGE_CONTEXT_VALUE
	 * @generated
	 * @ordered
	 */
	USAGE_CONTEXT(35, "usageContext", "usageContext"),

	/**
	 * The '<em><b>Base64 Binary</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BASE64_BINARY_VALUE
	 * @generated
	 * @ordered
	 */
	BASE64_BINARY(36, "base64Binary", "base64Binary"),

	/**
	 * The '<em><b>Boolean</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOLEAN_VALUE
	 * @generated
	 * @ordered
	 */
	BOOLEAN(37, "boolean", "boolean"),

	/**
	 * The '<em><b>Code</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CODE_VALUE
	 * @generated
	 * @ordered
	 */
	CODE(38, "code", "code"),

	/**
	 * The '<em><b>Date</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_VALUE
	 * @generated
	 * @ordered
	 */
	DATE(39, "date", "date"),

	/**
	 * The '<em><b>Date Time</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_TIME_VALUE
	 * @generated
	 * @ordered
	 */
	DATE_TIME(40, "dateTime", "dateTime"),

	/**
	 * The '<em><b>Decimal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECIMAL_VALUE
	 * @generated
	 * @ordered
	 */
	DECIMAL(41, "decimal", "decimal"),

	/**
	 * The '<em><b>Id</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ID_VALUE
	 * @generated
	 * @ordered
	 */
	ID(42, "id", "id"),

	/**
	 * The '<em><b>Instant</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSTANT_VALUE
	 * @generated
	 * @ordered
	 */
	INSTANT(43, "instant", "instant"),

	/**
	 * The '<em><b>Integer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGER_VALUE
	 * @generated
	 * @ordered
	 */
	INTEGER(44, "integer", "integer"),

	/**
	 * The '<em><b>Markdown</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MARKDOWN_VALUE
	 * @generated
	 * @ordered
	 */
	MARKDOWN(45, "markdown", "markdown"),

	/**
	 * The '<em><b>Oid</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OID_VALUE
	 * @generated
	 * @ordered
	 */
	OID(46, "oid", "oid"),

	/**
	 * The '<em><b>Positive Int</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POSITIVE_INT_VALUE
	 * @generated
	 * @ordered
	 */
	POSITIVE_INT(47, "positiveInt", "positiveInt"),

	/**
	 * The '<em><b>String</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_VALUE
	 * @generated
	 * @ordered
	 */
	STRING(48, "string", "string"),

	/**
	 * The '<em><b>Time</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_VALUE
	 * @generated
	 * @ordered
	 */
	TIME(49, "time", "time"),

	/**
	 * The '<em><b>Unsigned Int</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSIGNED_INT_VALUE
	 * @generated
	 * @ordered
	 */
	UNSIGNED_INT(50, "unsignedInt", "unsignedInt"),

	/**
	 * The '<em><b>Uri</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #URI_VALUE
	 * @generated
	 * @ordered
	 */
	URI(51, "uri", "uri"),

	/**
	 * The '<em><b>Uuid</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UUID_VALUE
	 * @generated
	 * @ordered
	 */
	UUID(52, "uuid", "uuid"),

	/**
	 * The '<em><b>Xhtml</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XHTML_VALUE
	 * @generated
	 * @ordered
	 */
	XHTML(53, "xhtml", "xhtml");

	/**
	 * The '<em><b>Address</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Address</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ADDRESS
	 * @model name="address"
	 * @generated
	 * @ordered
	 */
	public static final int ADDRESS_VALUE = 0;

	/**
	 * The '<em><b>Age</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Age</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AGE
	 * @model name="age"
	 * @generated
	 * @ordered
	 */
	public static final int AGE_VALUE = 1;

	/**
	 * The '<em><b>Annotation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Annotation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANNOTATION
	 * @model name="annotation"
	 * @generated
	 * @ordered
	 */
	public static final int ANNOTATION_VALUE = 2;

	/**
	 * The '<em><b>Attachment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Attachment</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ATTACHMENT
	 * @model name="attachment"
	 * @generated
	 * @ordered
	 */
	public static final int ATTACHMENT_VALUE = 3;

	/**
	 * The '<em><b>Backbone Element</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Backbone Element</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BACKBONE_ELEMENT
	 * @model name="backboneElement"
	 * @generated
	 * @ordered
	 */
	public static final int BACKBONE_ELEMENT_VALUE = 4;

	/**
	 * The '<em><b>Codeable Concept</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Codeable Concept</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CODEABLE_CONCEPT
	 * @model name="codeableConcept"
	 * @generated
	 * @ordered
	 */
	public static final int CODEABLE_CONCEPT_VALUE = 5;

	/**
	 * The '<em><b>Coding</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Coding</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CODING
	 * @model name="coding"
	 * @generated
	 * @ordered
	 */
	public static final int CODING_VALUE = 6;

	/**
	 * The '<em><b>Contact Detail</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Contact Detail</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONTACT_DETAIL
	 * @model name="contactDetail"
	 * @generated
	 * @ordered
	 */
	public static final int CONTACT_DETAIL_VALUE = 7;

	/**
	 * The '<em><b>Contact Point</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Contact Point</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONTACT_POINT
	 * @model name="contactPoint"
	 * @generated
	 * @ordered
	 */
	public static final int CONTACT_POINT_VALUE = 8;

	/**
	 * The '<em><b>Contributor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Contributor</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONTRIBUTOR
	 * @model name="contributor"
	 * @generated
	 * @ordered
	 */
	public static final int CONTRIBUTOR_VALUE = 9;

	/**
	 * The '<em><b>Count</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Count</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COUNT
	 * @model name="count"
	 * @generated
	 * @ordered
	 */
	public static final int COUNT_VALUE = 10;

	/**
	 * The '<em><b>Data Requirement</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Data Requirement</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DATA_REQUIREMENT
	 * @model name="dataRequirement"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_REQUIREMENT_VALUE = 11;

	/**
	 * The '<em><b>Distance</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Distance</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISTANCE
	 * @model name="distance"
	 * @generated
	 * @ordered
	 */
	public static final int DISTANCE_VALUE = 12;

	/**
	 * The '<em><b>Dosage Instruction</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dosage Instruction</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOSAGE_INSTRUCTION
	 * @model name="dosageInstruction"
	 * @generated
	 * @ordered
	 */
	public static final int DOSAGE_INSTRUCTION_VALUE = 13;

	/**
	 * The '<em><b>Duration</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Duration</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DURATION
	 * @model name="duration"
	 * @generated
	 * @ordered
	 */
	public static final int DURATION_VALUE = 14;

	/**
	 * The '<em><b>Element</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Element</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ELEMENT
	 * @model name="element"
	 * @generated
	 * @ordered
	 */
	public static final int ELEMENT_VALUE = 15;

	/**
	 * The '<em><b>Element Definition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Element Definition</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ELEMENT_DEFINITION
	 * @model name="elementDefinition"
	 * @generated
	 * @ordered
	 */
	public static final int ELEMENT_DEFINITION_VALUE = 16;

	/**
	 * The '<em><b>Extension</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Extension</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXTENSION
	 * @model name="extension"
	 * @generated
	 * @ordered
	 */
	public static final int EXTENSION_VALUE = 17;

	/**
	 * The '<em><b>Human Name</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Human Name</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HUMAN_NAME
	 * @model name="humanName"
	 * @generated
	 * @ordered
	 */
	public static final int HUMAN_NAME_VALUE = 18;

	/**
	 * The '<em><b>Identifier</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Identifier</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IDENTIFIER
	 * @model name="identifier"
	 * @generated
	 * @ordered
	 */
	public static final int IDENTIFIER_VALUE = 19;

	/**
	 * The '<em><b>Meta</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Meta</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #META
	 * @model name="meta"
	 * @generated
	 * @ordered
	 */
	public static final int META_VALUE = 20;

	/**
	 * The '<em><b>Money</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Money</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MONEY
	 * @model name="money"
	 * @generated
	 * @ordered
	 */
	public static final int MONEY_VALUE = 21;

	/**
	 * The '<em><b>Narrative</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Narrative</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NARRATIVE
	 * @model name="narrative"
	 * @generated
	 * @ordered
	 */
	public static final int NARRATIVE_VALUE = 22;

	/**
	 * The '<em><b>Parameter Definition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Parameter Definition</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PARAMETER_DEFINITION
	 * @model name="parameterDefinition"
	 * @generated
	 * @ordered
	 */
	public static final int PARAMETER_DEFINITION_VALUE = 23;

	/**
	 * The '<em><b>Period</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Period</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PERIOD
	 * @model name="period"
	 * @generated
	 * @ordered
	 */
	public static final int PERIOD_VALUE = 24;

	/**
	 * The '<em><b>Quantity</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Quantity</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #QUANTITY
	 * @model name="quantity"
	 * @generated
	 * @ordered
	 */
	public static final int QUANTITY_VALUE = 25;

	/**
	 * The '<em><b>Range</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Range</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RANGE
	 * @model name="range"
	 * @generated
	 * @ordered
	 */
	public static final int RANGE_VALUE = 26;

	/**
	 * The '<em><b>Ratio</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ratio</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RATIO
	 * @model name="ratio"
	 * @generated
	 * @ordered
	 */
	public static final int RATIO_VALUE = 27;

	/**
	 * The '<em><b>Reference</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Reference</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REFERENCE
	 * @model name="reference"
	 * @generated
	 * @ordered
	 */
	public static final int REFERENCE_VALUE = 28;

	/**
	 * The '<em><b>Related Artifact</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Related Artifact</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RELATED_ARTIFACT
	 * @model name="relatedArtifact"
	 * @generated
	 * @ordered
	 */
	public static final int RELATED_ARTIFACT_VALUE = 29;

	/**
	 * The '<em><b>Sampled Data</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sampled Data</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SAMPLED_DATA
	 * @model name="sampledData"
	 * @generated
	 * @ordered
	 */
	public static final int SAMPLED_DATA_VALUE = 30;

	/**
	 * The '<em><b>Signature</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Signature</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SIGNATURE
	 * @model name="signature"
	 * @generated
	 * @ordered
	 */
	public static final int SIGNATURE_VALUE = 31;

	/**
	 * The '<em><b>Simple Quantity</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Simple Quantity</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SIMPLE_QUANTITY
	 * @model name="simpleQuantity"
	 * @generated
	 * @ordered
	 */
	public static final int SIMPLE_QUANTITY_VALUE = 32;

	/**
	 * The '<em><b>Timing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Timing</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIMING
	 * @model name="timing"
	 * @generated
	 * @ordered
	 */
	public static final int TIMING_VALUE = 33;

	/**
	 * The '<em><b>Trigger Definition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Trigger Definition</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRIGGER_DEFINITION
	 * @model name="triggerDefinition"
	 * @generated
	 * @ordered
	 */
	public static final int TRIGGER_DEFINITION_VALUE = 34;

	/**
	 * The '<em><b>Usage Context</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Usage Context</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #USAGE_CONTEXT
	 * @model name="usageContext"
	 * @generated
	 * @ordered
	 */
	public static final int USAGE_CONTEXT_VALUE = 35;

	/**
	 * The '<em><b>Base64 Binary</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Base64 Binary</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BASE64_BINARY
	 * @model name="base64Binary"
	 * @generated
	 * @ordered
	 */
	public static final int BASE64_BINARY_VALUE = 36;

	/**
	 * The '<em><b>Boolean</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Boolean</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BOOLEAN
	 * @model name="boolean"
	 * @generated
	 * @ordered
	 */
	public static final int BOOLEAN_VALUE = 37;

	/**
	 * The '<em><b>Code</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Code</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CODE
	 * @model name="code"
	 * @generated
	 * @ordered
	 */
	public static final int CODE_VALUE = 38;

	/**
	 * The '<em><b>Date</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Date</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DATE
	 * @model name="date"
	 * @generated
	 * @ordered
	 */
	public static final int DATE_VALUE = 39;

	/**
	 * The '<em><b>Date Time</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Date Time</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DATE_TIME
	 * @model name="dateTime"
	 * @generated
	 * @ordered
	 */
	public static final int DATE_TIME_VALUE = 40;

	/**
	 * The '<em><b>Decimal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Decimal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DECIMAL
	 * @model name="decimal"
	 * @generated
	 * @ordered
	 */
	public static final int DECIMAL_VALUE = 41;

	/**
	 * The '<em><b>Id</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Id</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ID
	 * @model name="id"
	 * @generated
	 * @ordered
	 */
	public static final int ID_VALUE = 42;

	/**
	 * The '<em><b>Instant</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Instant</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INSTANT
	 * @model name="instant"
	 * @generated
	 * @ordered
	 */
	public static final int INSTANT_VALUE = 43;

	/**
	 * The '<em><b>Integer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Integer</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTEGER
	 * @model name="integer"
	 * @generated
	 * @ordered
	 */
	public static final int INTEGER_VALUE = 44;

	/**
	 * The '<em><b>Markdown</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Markdown</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MARKDOWN
	 * @model name="markdown"
	 * @generated
	 * @ordered
	 */
	public static final int MARKDOWN_VALUE = 45;

	/**
	 * The '<em><b>Oid</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Oid</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OID
	 * @model name="oid"
	 * @generated
	 * @ordered
	 */
	public static final int OID_VALUE = 46;

	/**
	 * The '<em><b>Positive Int</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Positive Int</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POSITIVE_INT
	 * @model name="positiveInt"
	 * @generated
	 * @ordered
	 */
	public static final int POSITIVE_INT_VALUE = 47;

	/**
	 * The '<em><b>String</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>String</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STRING
	 * @model name="string"
	 * @generated
	 * @ordered
	 */
	public static final int STRING_VALUE = 48;

	/**
	 * The '<em><b>Time</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Time</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIME
	 * @model name="time"
	 * @generated
	 * @ordered
	 */
	public static final int TIME_VALUE = 49;

	/**
	 * The '<em><b>Unsigned Int</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unsigned Int</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNSIGNED_INT
	 * @model name="unsignedInt"
	 * @generated
	 * @ordered
	 */
	public static final int UNSIGNED_INT_VALUE = 50;

	/**
	 * The '<em><b>Uri</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Uri</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #URI
	 * @model name="uri"
	 * @generated
	 * @ordered
	 */
	public static final int URI_VALUE = 51;

	/**
	 * The '<em><b>Uuid</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Uuid</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UUID
	 * @model name="uuid"
	 * @generated
	 * @ordered
	 */
	public static final int UUID_VALUE = 52;

	/**
	 * The '<em><b>Xhtml</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Xhtml</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XHTML
	 * @model name="xhtml"
	 * @generated
	 * @ordered
	 */
	public static final int XHTML_VALUE = 53;

	/**
	 * An array of all the '<em><b>Data Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DataType[] VALUES_ARRAY =
		new DataType[] {
			ADDRESS,
			AGE,
			ANNOTATION,
			ATTACHMENT,
			BACKBONE_ELEMENT,
			CODEABLE_CONCEPT,
			CODING,
			CONTACT_DETAIL,
			CONTACT_POINT,
			CONTRIBUTOR,
			COUNT,
			DATA_REQUIREMENT,
			DISTANCE,
			DOSAGE_INSTRUCTION,
			DURATION,
			ELEMENT,
			ELEMENT_DEFINITION,
			EXTENSION,
			HUMAN_NAME,
			IDENTIFIER,
			META,
			MONEY,
			NARRATIVE,
			PARAMETER_DEFINITION,
			PERIOD,
			QUANTITY,
			RANGE,
			RATIO,
			REFERENCE,
			RELATED_ARTIFACT,
			SAMPLED_DATA,
			SIGNATURE,
			SIMPLE_QUANTITY,
			TIMING,
			TRIGGER_DEFINITION,
			USAGE_CONTEXT,
			BASE64_BINARY,
			BOOLEAN,
			CODE,
			DATE,
			DATE_TIME,
			DECIMAL,
			ID,
			INSTANT,
			INTEGER,
			MARKDOWN,
			OID,
			POSITIVE_INT,
			STRING,
			TIME,
			UNSIGNED_INT,
			URI,
			UUID,
			XHTML,
		};

	/**
	 * A public read-only list of all the '<em><b>Data Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DataType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Data Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataType get(int value) {
		switch (value) {
			case ADDRESS_VALUE: return ADDRESS;
			case AGE_VALUE: return AGE;
			case ANNOTATION_VALUE: return ANNOTATION;
			case ATTACHMENT_VALUE: return ATTACHMENT;
			case BACKBONE_ELEMENT_VALUE: return BACKBONE_ELEMENT;
			case CODEABLE_CONCEPT_VALUE: return CODEABLE_CONCEPT;
			case CODING_VALUE: return CODING;
			case CONTACT_DETAIL_VALUE: return CONTACT_DETAIL;
			case CONTACT_POINT_VALUE: return CONTACT_POINT;
			case CONTRIBUTOR_VALUE: return CONTRIBUTOR;
			case COUNT_VALUE: return COUNT;
			case DATA_REQUIREMENT_VALUE: return DATA_REQUIREMENT;
			case DISTANCE_VALUE: return DISTANCE;
			case DOSAGE_INSTRUCTION_VALUE: return DOSAGE_INSTRUCTION;
			case DURATION_VALUE: return DURATION;
			case ELEMENT_VALUE: return ELEMENT;
			case ELEMENT_DEFINITION_VALUE: return ELEMENT_DEFINITION;
			case EXTENSION_VALUE: return EXTENSION;
			case HUMAN_NAME_VALUE: return HUMAN_NAME;
			case IDENTIFIER_VALUE: return IDENTIFIER;
			case META_VALUE: return META;
			case MONEY_VALUE: return MONEY;
			case NARRATIVE_VALUE: return NARRATIVE;
			case PARAMETER_DEFINITION_VALUE: return PARAMETER_DEFINITION;
			case PERIOD_VALUE: return PERIOD;
			case QUANTITY_VALUE: return QUANTITY;
			case RANGE_VALUE: return RANGE;
			case RATIO_VALUE: return RATIO;
			case REFERENCE_VALUE: return REFERENCE;
			case RELATED_ARTIFACT_VALUE: return RELATED_ARTIFACT;
			case SAMPLED_DATA_VALUE: return SAMPLED_DATA;
			case SIGNATURE_VALUE: return SIGNATURE;
			case SIMPLE_QUANTITY_VALUE: return SIMPLE_QUANTITY;
			case TIMING_VALUE: return TIMING;
			case TRIGGER_DEFINITION_VALUE: return TRIGGER_DEFINITION;
			case USAGE_CONTEXT_VALUE: return USAGE_CONTEXT;
			case BASE64_BINARY_VALUE: return BASE64_BINARY;
			case BOOLEAN_VALUE: return BOOLEAN;
			case CODE_VALUE: return CODE;
			case DATE_VALUE: return DATE;
			case DATE_TIME_VALUE: return DATE_TIME;
			case DECIMAL_VALUE: return DECIMAL;
			case ID_VALUE: return ID;
			case INSTANT_VALUE: return INSTANT;
			case INTEGER_VALUE: return INTEGER;
			case MARKDOWN_VALUE: return MARKDOWN;
			case OID_VALUE: return OID;
			case POSITIVE_INT_VALUE: return POSITIVE_INT;
			case STRING_VALUE: return STRING;
			case TIME_VALUE: return TIME;
			case UNSIGNED_INT_VALUE: return UNSIGNED_INT;
			case URI_VALUE: return URI;
			case UUID_VALUE: return UUID;
			case XHTML_VALUE: return XHTML;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private DataType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //DataType