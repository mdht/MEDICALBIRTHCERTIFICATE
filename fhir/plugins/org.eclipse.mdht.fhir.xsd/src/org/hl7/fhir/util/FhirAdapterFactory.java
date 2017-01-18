/**
 */
package org.hl7.fhir.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.hl7.fhir.Account;
import org.hl7.fhir.AccountGuarantor;
import org.hl7.fhir.AccountStatus;
import org.hl7.fhir.ActionList;
import org.hl7.fhir.ActivityDefinition;
import org.hl7.fhir.ActivityDefinitionCategory;
import org.hl7.fhir.ActivityDefinitionDynamicValue;
import org.hl7.fhir.Address;
import org.hl7.fhir.AddressType;
import org.hl7.fhir.AddressUse;
import org.hl7.fhir.AdministrativeGender;
import org.hl7.fhir.Age;
import org.hl7.fhir.AggregationMode;
import org.hl7.fhir.AllergyIntolerance;
import org.hl7.fhir.AllergyIntoleranceCategory;
import org.hl7.fhir.AllergyIntoleranceCertainty;
import org.hl7.fhir.AllergyIntoleranceClinicalStatus;
import org.hl7.fhir.AllergyIntoleranceCriticality;
import org.hl7.fhir.AllergyIntoleranceReaction;
import org.hl7.fhir.AllergyIntoleranceSeverity;
import org.hl7.fhir.AllergyIntoleranceType;
import org.hl7.fhir.AllergyIntoleranceVerificationStatus;
import org.hl7.fhir.Annotation;
import org.hl7.fhir.Appointment;
import org.hl7.fhir.AppointmentParticipant;
import org.hl7.fhir.AppointmentResponse;
import org.hl7.fhir.AppointmentStatus;
import org.hl7.fhir.AssertionDirectionType;
import org.hl7.fhir.AssertionOperatorType;
import org.hl7.fhir.AssertionResponseTypes;
import org.hl7.fhir.Attachment;
import org.hl7.fhir.AuditEvent;
import org.hl7.fhir.AuditEventAction;
import org.hl7.fhir.AuditEventAgent;
import org.hl7.fhir.AuditEventAgentNetworkType;
import org.hl7.fhir.AuditEventDetail;
import org.hl7.fhir.AuditEventEntity;
import org.hl7.fhir.AuditEventNetwork;
import org.hl7.fhir.AuditEventOutcome;
import org.hl7.fhir.AuditEventSource;
import org.hl7.fhir.BackboneElement;
import org.hl7.fhir.Base64Binary;
import org.hl7.fhir.Basic;
import org.hl7.fhir.Binary;
import org.hl7.fhir.BindingStrength;
import org.hl7.fhir.BodySite;
import org.hl7.fhir.Bundle;
import org.hl7.fhir.BundleEntry;
import org.hl7.fhir.BundleLink;
import org.hl7.fhir.BundleRequest;
import org.hl7.fhir.BundleResponse;
import org.hl7.fhir.BundleSearch;
import org.hl7.fhir.BundleType;
import org.hl7.fhir.CapabilityStatement;
import org.hl7.fhir.CapabilityStatementCertificate;
import org.hl7.fhir.CapabilityStatementDocument;
import org.hl7.fhir.CapabilityStatementEndpoint;
import org.hl7.fhir.CapabilityStatementEvent;
import org.hl7.fhir.CapabilityStatementImplementation;
import org.hl7.fhir.CapabilityStatementInteraction;
import org.hl7.fhir.CapabilityStatementInteraction1;
import org.hl7.fhir.CapabilityStatementKind;
import org.hl7.fhir.CapabilityStatementMessaging;
import org.hl7.fhir.CapabilityStatementOperation;
import org.hl7.fhir.CapabilityStatementResource;
import org.hl7.fhir.CapabilityStatementRest;
import org.hl7.fhir.CapabilityStatementSearchParam;
import org.hl7.fhir.CapabilityStatementSecurity;
import org.hl7.fhir.CapabilityStatementSoftware;
import org.hl7.fhir.CarePlan;
import org.hl7.fhir.CarePlanActivity;
import org.hl7.fhir.CarePlanActivityStatus;
import org.hl7.fhir.CarePlanDetail;
import org.hl7.fhir.CarePlanRelatedPlan;
import org.hl7.fhir.CarePlanRelationship;
import org.hl7.fhir.CarePlanStatus;
import org.hl7.fhir.CareTeam;
import org.hl7.fhir.CareTeamParticipant;
import org.hl7.fhir.Claim;
import org.hl7.fhir.ClaimAccident;
import org.hl7.fhir.ClaimCareTeam;
import org.hl7.fhir.ClaimDetail;
import org.hl7.fhir.ClaimDiagnosis;
import org.hl7.fhir.ClaimInformation;
import org.hl7.fhir.ClaimInsurance;
import org.hl7.fhir.ClaimItem;
import org.hl7.fhir.ClaimPayee;
import org.hl7.fhir.ClaimProcedure;
import org.hl7.fhir.ClaimProsthesis;
import org.hl7.fhir.ClaimRelated;
import org.hl7.fhir.ClaimResponse;
import org.hl7.fhir.ClaimResponseAddItem;
import org.hl7.fhir.ClaimResponseAdjudication;
import org.hl7.fhir.ClaimResponseDetail;
import org.hl7.fhir.ClaimResponseDetail1;
import org.hl7.fhir.ClaimResponseError;
import org.hl7.fhir.ClaimResponseInsurance;
import org.hl7.fhir.ClaimResponseItem;
import org.hl7.fhir.ClaimResponseNote;
import org.hl7.fhir.ClaimResponsePayment;
import org.hl7.fhir.ClaimResponseSubDetail;
import org.hl7.fhir.ClaimSubDetail;
import org.hl7.fhir.ClinicalImpression;
import org.hl7.fhir.ClinicalImpressionFinding;
import org.hl7.fhir.ClinicalImpressionInvestigation;
import org.hl7.fhir.ClinicalImpressionStatus;
import org.hl7.fhir.Code;
import org.hl7.fhir.CodeSystem;
import org.hl7.fhir.CodeSystemConcept;
import org.hl7.fhir.CodeSystemContentMode;
import org.hl7.fhir.CodeSystemDesignation;
import org.hl7.fhir.CodeSystemFilter;
import org.hl7.fhir.CodeSystemHierarchyMeaning;
import org.hl7.fhir.CodeSystemProperty;
import org.hl7.fhir.CodeSystemProperty1;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.Coding;
import org.hl7.fhir.Communication;
import org.hl7.fhir.CommunicationPayload;
import org.hl7.fhir.CommunicationRequest;
import org.hl7.fhir.CommunicationRequestPayload;
import org.hl7.fhir.CommunicationRequestStatus;
import org.hl7.fhir.CommunicationStatus;
import org.hl7.fhir.CompartmentDefinition;
import org.hl7.fhir.CompartmentDefinitionResource;
import org.hl7.fhir.CompartmentType;
import org.hl7.fhir.CompositeMeasureScoring;
import org.hl7.fhir.Composition;
import org.hl7.fhir.CompositionAttestationMode;
import org.hl7.fhir.CompositionAttester;
import org.hl7.fhir.CompositionEvent;
import org.hl7.fhir.CompositionSection;
import org.hl7.fhir.CompositionStatus;
import org.hl7.fhir.ConceptMap;
import org.hl7.fhir.ConceptMapDependsOn;
import org.hl7.fhir.ConceptMapElement;
import org.hl7.fhir.ConceptMapEquivalence;
import org.hl7.fhir.ConceptMapGroup;
import org.hl7.fhir.ConceptMapTarget;
import org.hl7.fhir.Condition;
import org.hl7.fhir.ConditionEvidence;
import org.hl7.fhir.ConditionStage;
import org.hl7.fhir.ConditionVerificationStatus;
import org.hl7.fhir.ConditionalDeleteStatus;
import org.hl7.fhir.ConditionalReadStatus;
import org.hl7.fhir.Consent;
import org.hl7.fhir.ConsentActor;
import org.hl7.fhir.ConsentData;
import org.hl7.fhir.ConsentDataMeaning;
import org.hl7.fhir.ConsentExcept;
import org.hl7.fhir.ConsentExceptType;
import org.hl7.fhir.ConsentStatus;
import org.hl7.fhir.ConstraintSeverity;
import org.hl7.fhir.ContactDetail;
import org.hl7.fhir.ContactPoint;
import org.hl7.fhir.ContactPointSystem;
import org.hl7.fhir.ContactPointUse;
import org.hl7.fhir.ContentType;
import org.hl7.fhir.Contract;
import org.hl7.fhir.ContractAgent;
import org.hl7.fhir.ContractAgent1;
import org.hl7.fhir.ContractFriendly;
import org.hl7.fhir.ContractLegal;
import org.hl7.fhir.ContractRule;
import org.hl7.fhir.ContractSigner;
import org.hl7.fhir.ContractTerm;
import org.hl7.fhir.ContractValuedItem;
import org.hl7.fhir.ContractValuedItem1;
import org.hl7.fhir.Contributor;
import org.hl7.fhir.ContributorType;
import org.hl7.fhir.Count;
import org.hl7.fhir.Coverage;
import org.hl7.fhir.CoverageGroup;
import org.hl7.fhir.DataElement;
import org.hl7.fhir.DataElementMapping;
import org.hl7.fhir.DataElementStringency;
import org.hl7.fhir.DataRequirement;
import org.hl7.fhir.DataRequirementCodeFilter;
import org.hl7.fhir.DataRequirementDateFilter;
import org.hl7.fhir.Date;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.DaysOfWeek;
import org.hl7.fhir.Decimal;
import org.hl7.fhir.DetectedIssue;
import org.hl7.fhir.DetectedIssueMitigation;
import org.hl7.fhir.DetectedIssueSeverity;
import org.hl7.fhir.Device;
import org.hl7.fhir.DeviceComponent;
import org.hl7.fhir.DeviceComponentProductionSpecification;
import org.hl7.fhir.DeviceMetric;
import org.hl7.fhir.DeviceMetricCalibration;
import org.hl7.fhir.DeviceMetricCalibrationState;
import org.hl7.fhir.DeviceMetricCalibrationType;
import org.hl7.fhir.DeviceMetricCategory;
import org.hl7.fhir.DeviceMetricColor;
import org.hl7.fhir.DeviceMetricOperationalStatus;
import org.hl7.fhir.DeviceStatus;
import org.hl7.fhir.DeviceUseRequest;
import org.hl7.fhir.DeviceUseStatement;
import org.hl7.fhir.DiagnosticReport;
import org.hl7.fhir.DiagnosticReportImage;
import org.hl7.fhir.DiagnosticReportStatus;
import org.hl7.fhir.DiagnosticRequest;
import org.hl7.fhir.DigitalMediaType;
import org.hl7.fhir.Distance;
import org.hl7.fhir.DocumentManifest;
import org.hl7.fhir.DocumentManifestContent;
import org.hl7.fhir.DocumentManifestRelated;
import org.hl7.fhir.DocumentMode;
import org.hl7.fhir.DocumentReference;
import org.hl7.fhir.DocumentReferenceContent;
import org.hl7.fhir.DocumentReferenceContext;
import org.hl7.fhir.DocumentReferenceRelated;
import org.hl7.fhir.DocumentReferenceRelatesTo;
import org.hl7.fhir.DocumentReferenceStatus;
import org.hl7.fhir.DocumentRelationshipType;
import org.hl7.fhir.DocumentRoot;
import org.hl7.fhir.DomainResource;
import org.hl7.fhir.DosageInstruction;
import org.hl7.fhir.Duration;
import org.hl7.fhir.Element;
import org.hl7.fhir.ElementDefinition;
import org.hl7.fhir.ElementDefinitionBase;
import org.hl7.fhir.ElementDefinitionBinding;
import org.hl7.fhir.ElementDefinitionConstraint;
import org.hl7.fhir.ElementDefinitionExample;
import org.hl7.fhir.ElementDefinitionMapping;
import org.hl7.fhir.ElementDefinitionSlicing;
import org.hl7.fhir.ElementDefinitionType;
import org.hl7.fhir.EligibilityRequest;
import org.hl7.fhir.EligibilityResponse;
import org.hl7.fhir.EligibilityResponseBenefitBalance;
import org.hl7.fhir.EligibilityResponseError;
import org.hl7.fhir.EligibilityResponseFinancial;
import org.hl7.fhir.EligibilityResponseInsurance;
import org.hl7.fhir.Encounter;
import org.hl7.fhir.EncounterHospitalization;
import org.hl7.fhir.EncounterLocation;
import org.hl7.fhir.EncounterLocationStatus;
import org.hl7.fhir.EncounterParticipant;
import org.hl7.fhir.EncounterStatus;
import org.hl7.fhir.EncounterStatusHistory;
import org.hl7.fhir.Endpoint;
import org.hl7.fhir.EndpointStatus;
import org.hl7.fhir.EnrollmentRequest;
import org.hl7.fhir.EnrollmentResponse;
import org.hl7.fhir.EpisodeOfCare;
import org.hl7.fhir.EpisodeOfCareStatus;
import org.hl7.fhir.EpisodeOfCareStatusHistory;
import org.hl7.fhir.EventCapabilityMode;
import org.hl7.fhir.EventTiming;
import org.hl7.fhir.ExpansionProfile;
import org.hl7.fhir.ExpansionProfileDesignation;
import org.hl7.fhir.ExpansionProfileDesignation1;
import org.hl7.fhir.ExpansionProfileDesignation2;
import org.hl7.fhir.ExpansionProfileExclude;
import org.hl7.fhir.ExpansionProfileExcludedSystem;
import org.hl7.fhir.ExpansionProfileFixedVersion;
import org.hl7.fhir.ExpansionProfileInclude;
import org.hl7.fhir.ExplanationOfBenefit;
import org.hl7.fhir.ExplanationOfBenefitAccident;
import org.hl7.fhir.ExplanationOfBenefitAddItem;
import org.hl7.fhir.ExplanationOfBenefitAdjudication;
import org.hl7.fhir.ExplanationOfBenefitBenefitBalance;
import org.hl7.fhir.ExplanationOfBenefitCareTeam;
import org.hl7.fhir.ExplanationOfBenefitDetail;
import org.hl7.fhir.ExplanationOfBenefitDetail1;
import org.hl7.fhir.ExplanationOfBenefitDiagnosis;
import org.hl7.fhir.ExplanationOfBenefitFinancial;
import org.hl7.fhir.ExplanationOfBenefitInformation;
import org.hl7.fhir.ExplanationOfBenefitInsurance;
import org.hl7.fhir.ExplanationOfBenefitItem;
import org.hl7.fhir.ExplanationOfBenefitNote;
import org.hl7.fhir.ExplanationOfBenefitPayee;
import org.hl7.fhir.ExplanationOfBenefitPayment;
import org.hl7.fhir.ExplanationOfBenefitProcedure;
import org.hl7.fhir.ExplanationOfBenefitProsthesis;
import org.hl7.fhir.ExplanationOfBenefitRelated;
import org.hl7.fhir.ExplanationOfBenefitStatus;
import org.hl7.fhir.ExplanationOfBenefitSubDetail;
import org.hl7.fhir.Extension;
import org.hl7.fhir.ExtensionContext;
import org.hl7.fhir.FamilyHistoryStatus;
import org.hl7.fhir.FamilyMemberHistory;
import org.hl7.fhir.FamilyMemberHistoryCondition;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.FilterOperator;
import org.hl7.fhir.Flag;
import org.hl7.fhir.FlagStatus;
import org.hl7.fhir.Goal;
import org.hl7.fhir.GoalOutcome;
import org.hl7.fhir.GoalStatus;
import org.hl7.fhir.Group;
import org.hl7.fhir.GroupCharacteristic;
import org.hl7.fhir.GroupMember;
import org.hl7.fhir.GroupType;
import org.hl7.fhir.GuidanceResponse;
import org.hl7.fhir.GuidanceResponseStatus;
import org.hl7.fhir.GuideDependencyType;
import org.hl7.fhir.GuidePageKind;
import org.hl7.fhir.HTTPVerb;
import org.hl7.fhir.HealthcareService;
import org.hl7.fhir.HealthcareServiceAvailableTime;
import org.hl7.fhir.HealthcareServiceNotAvailable;
import org.hl7.fhir.HumanName;
import org.hl7.fhir.Id;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.IdentifierUse;
import org.hl7.fhir.IdentityAssuranceLevel;
import org.hl7.fhir.ImagingManifest;
import org.hl7.fhir.ImagingManifestBaseLocation;
import org.hl7.fhir.ImagingManifestBaseLocation1;
import org.hl7.fhir.ImagingManifestInstance;
import org.hl7.fhir.ImagingManifestSeries;
import org.hl7.fhir.ImagingManifestStudy;
import org.hl7.fhir.ImagingStudy;
import org.hl7.fhir.ImagingStudyBaseLocation;
import org.hl7.fhir.ImagingStudyBaseLocation1;
import org.hl7.fhir.ImagingStudyInstance;
import org.hl7.fhir.ImagingStudySeries;
import org.hl7.fhir.Immunization;
import org.hl7.fhir.ImmunizationExplanation;
import org.hl7.fhir.ImmunizationReaction;
import org.hl7.fhir.ImmunizationRecommendation;
import org.hl7.fhir.ImmunizationRecommendationDateCriterion;
import org.hl7.fhir.ImmunizationRecommendationProtocol;
import org.hl7.fhir.ImmunizationRecommendationRecommendation;
import org.hl7.fhir.ImmunizationVaccinationProtocol;
import org.hl7.fhir.ImplementationGuide;
import org.hl7.fhir.ImplementationGuideDependency;
import org.hl7.fhir.ImplementationGuideGlobal;
import org.hl7.fhir.ImplementationGuidePackage;
import org.hl7.fhir.ImplementationGuidePage;
import org.hl7.fhir.ImplementationGuideResource;
import org.hl7.fhir.InstanceAvailability;
import org.hl7.fhir.Instant;
import org.hl7.fhir.IssueSeverity;
import org.hl7.fhir.IssueType;
import org.hl7.fhir.Library;
import org.hl7.fhir.LinkType;
import org.hl7.fhir.Linkage;
import org.hl7.fhir.LinkageItem;
import org.hl7.fhir.LinkageType;
import org.hl7.fhir.List;
import org.hl7.fhir.ListEntry;
import org.hl7.fhir.ListMode;
import org.hl7.fhir.ListStatus;
import org.hl7.fhir.Location;
import org.hl7.fhir.LocationMode;
import org.hl7.fhir.LocationPosition;
import org.hl7.fhir.LocationStatus;
import org.hl7.fhir.Markdown;
import org.hl7.fhir.MeasmntPrinciple;
import org.hl7.fhir.Measure;
import org.hl7.fhir.MeasureDataUsage;
import org.hl7.fhir.MeasureGroup;
import org.hl7.fhir.MeasurePopulation;
import org.hl7.fhir.MeasurePopulationType;
import org.hl7.fhir.MeasureReport;
import org.hl7.fhir.MeasureReportGroup;
import org.hl7.fhir.MeasureReportGroup1;
import org.hl7.fhir.MeasureReportGroup2;
import org.hl7.fhir.MeasureReportPopulation;
import org.hl7.fhir.MeasureReportPopulation1;
import org.hl7.fhir.MeasureReportStatus;
import org.hl7.fhir.MeasureReportStratifier;
import org.hl7.fhir.MeasureReportSupplementalData;
import org.hl7.fhir.MeasureReportType;
import org.hl7.fhir.MeasureScoring;
import org.hl7.fhir.MeasureStratifier;
import org.hl7.fhir.MeasureSupplementalData;
import org.hl7.fhir.MeasureType;
import org.hl7.fhir.Media;
import org.hl7.fhir.Medication;
import org.hl7.fhir.MedicationAdministration;
import org.hl7.fhir.MedicationAdministrationDosage;
import org.hl7.fhir.MedicationAdministrationStatus;
import org.hl7.fhir.MedicationBatch;
import org.hl7.fhir.MedicationContent;
import org.hl7.fhir.MedicationDispense;
import org.hl7.fhir.MedicationDispenseStatus;
import org.hl7.fhir.MedicationDispenseSubstitution;
import org.hl7.fhir.MedicationIngredient;
import org.hl7.fhir.MedicationPackage;
import org.hl7.fhir.MedicationProduct;
import org.hl7.fhir.MedicationRequest;
import org.hl7.fhir.MedicationRequestDispenseRequest;
import org.hl7.fhir.MedicationRequestStatus;
import org.hl7.fhir.MedicationRequestSubstitution;
import org.hl7.fhir.MedicationStatement;
import org.hl7.fhir.MedicationStatementCategory;
import org.hl7.fhir.MedicationStatementNotTaken;
import org.hl7.fhir.MedicationStatementStatus;
import org.hl7.fhir.MessageDefinition;
import org.hl7.fhir.MessageDefinitionAllowedResponse;
import org.hl7.fhir.MessageDefinitionFocus;
import org.hl7.fhir.MessageHeader;
import org.hl7.fhir.MessageHeaderDestination;
import org.hl7.fhir.MessageHeaderResponse;
import org.hl7.fhir.MessageHeaderSource;
import org.hl7.fhir.MessageSignificanceCategory;
import org.hl7.fhir.Meta;
import org.hl7.fhir.Money;
import org.hl7.fhir.NameUse;
import org.hl7.fhir.NamingSystem;
import org.hl7.fhir.NamingSystemIdentifierType;
import org.hl7.fhir.NamingSystemType;
import org.hl7.fhir.NamingSystemUniqueId;
import org.hl7.fhir.Narrative;
import org.hl7.fhir.NarrativeStatus;
import org.hl7.fhir.NoteType;
import org.hl7.fhir.NutritionOrderStatus;
import org.hl7.fhir.NutritionRequest;
import org.hl7.fhir.NutritionRequestAdministration;
import org.hl7.fhir.NutritionRequestEnteralFormula;
import org.hl7.fhir.NutritionRequestNutrient;
import org.hl7.fhir.NutritionRequestOralDiet;
import org.hl7.fhir.NutritionRequestSupplement;
import org.hl7.fhir.NutritionRequestTexture;
import org.hl7.fhir.Observation;
import org.hl7.fhir.ObservationComponent;
import org.hl7.fhir.ObservationReferenceRange;
import org.hl7.fhir.ObservationRelated;
import org.hl7.fhir.ObservationRelationshipType;
import org.hl7.fhir.ObservationStatus;
import org.hl7.fhir.Oid;
import org.hl7.fhir.OperationDefinition;
import org.hl7.fhir.OperationDefinitionBinding;
import org.hl7.fhir.OperationDefinitionOverload;
import org.hl7.fhir.OperationDefinitionParameter;
import org.hl7.fhir.OperationKind;
import org.hl7.fhir.OperationOutcome;
import org.hl7.fhir.OperationOutcomeIssue;
import org.hl7.fhir.OperationParameterUse;
import org.hl7.fhir.Organization;
import org.hl7.fhir.OrganizationContact;
import org.hl7.fhir.ParameterDefinition;
import org.hl7.fhir.Parameters;
import org.hl7.fhir.ParametersParameter;
import org.hl7.fhir.ParticipantRequired;
import org.hl7.fhir.ParticipationStatus;
import org.hl7.fhir.Patient;
import org.hl7.fhir.PatientAnimal;
import org.hl7.fhir.PatientCommunication;
import org.hl7.fhir.PatientContact;
import org.hl7.fhir.PatientLink;
import org.hl7.fhir.PaymentNotice;
import org.hl7.fhir.PaymentReconciliation;
import org.hl7.fhir.PaymentReconciliationDetail;
import org.hl7.fhir.PaymentReconciliationNote;
import org.hl7.fhir.Period;
import org.hl7.fhir.Person;
import org.hl7.fhir.PersonLink;
import org.hl7.fhir.PlanActionCardinalityBehavior;
import org.hl7.fhir.PlanActionConditionKind;
import org.hl7.fhir.PlanActionGroupingBehavior;
import org.hl7.fhir.PlanActionParticipantType;
import org.hl7.fhir.PlanActionPrecheckBehavior;
import org.hl7.fhir.PlanActionRelationshipType;
import org.hl7.fhir.PlanActionRequiredBehavior;
import org.hl7.fhir.PlanActionSelectionBehavior;
import org.hl7.fhir.PlanDefinition;
import org.hl7.fhir.PlanDefinitionActionDefinition;
import org.hl7.fhir.PlanDefinitionCondition;
import org.hl7.fhir.PlanDefinitionDynamicValue;
import org.hl7.fhir.PlanDefinitionRelatedAction;
import org.hl7.fhir.PositiveInt;
import org.hl7.fhir.Practitioner;
import org.hl7.fhir.PractitionerQualification;
import org.hl7.fhir.PractitionerRole;
import org.hl7.fhir.PractitionerRole1;
import org.hl7.fhir.PractitionerRoleAvailableTime;
import org.hl7.fhir.PractitionerRoleNotAvailable;
import org.hl7.fhir.Procedure;
import org.hl7.fhir.ProcedureFocalDevice;
import org.hl7.fhir.ProcedurePerformer;
import org.hl7.fhir.ProcedureRequest;
import org.hl7.fhir.ProcedureRequestPriority;
import org.hl7.fhir.ProcedureRequestStatus;
import org.hl7.fhir.ProcedureStatus;
import org.hl7.fhir.ProcessRequest;
import org.hl7.fhir.ProcessRequestItem;
import org.hl7.fhir.ProcessResponse;
import org.hl7.fhir.ProcessResponseNote;
import org.hl7.fhir.PropertyRepresentation;
import org.hl7.fhir.PropertyType;
import org.hl7.fhir.Provenance;
import org.hl7.fhir.ProvenanceAgent;
import org.hl7.fhir.ProvenanceEntity;
import org.hl7.fhir.ProvenanceEntityRole;
import org.hl7.fhir.PublicationStatus;
import org.hl7.fhir.QualityType;
import org.hl7.fhir.Quantity;
import org.hl7.fhir.QuantityComparator;
import org.hl7.fhir.Questionnaire;
import org.hl7.fhir.QuestionnaireEnableWhen;
import org.hl7.fhir.QuestionnaireItem;
import org.hl7.fhir.QuestionnaireItemType;
import org.hl7.fhir.QuestionnaireOption;
import org.hl7.fhir.QuestionnaireResponse;
import org.hl7.fhir.QuestionnaireResponseAnswer;
import org.hl7.fhir.QuestionnaireResponseItem;
import org.hl7.fhir.QuestionnaireResponseStatus;
import org.hl7.fhir.QuestionnaireStatus;
import org.hl7.fhir.Range;
import org.hl7.fhir.Ratio;
import org.hl7.fhir.Reference;
import org.hl7.fhir.ReferenceHandlingPolicy;
import org.hl7.fhir.ReferenceVersionRules;
import org.hl7.fhir.ReferralCategory;
import org.hl7.fhir.ReferralRequest;
import org.hl7.fhir.ReferralStatus;
import org.hl7.fhir.RelatedArtifact;
import org.hl7.fhir.RelatedArtifactType;
import org.hl7.fhir.RelatedPerson;
import org.hl7.fhir.RemittanceOutcome;
import org.hl7.fhir.RepositoryType;
import org.hl7.fhir.RequestGroup;
import org.hl7.fhir.RequestGroupAction;
import org.hl7.fhir.RequestGroupCondition;
import org.hl7.fhir.RequestGroupRelatedAction;
import org.hl7.fhir.ResearchStudy;
import org.hl7.fhir.ResearchStudyArm;
import org.hl7.fhir.ResearchStudyStatus;
import org.hl7.fhir.ResearchSubject;
import org.hl7.fhir.ResearchSubjectStatus;
import org.hl7.fhir.Resource;
import org.hl7.fhir.ResourceContainer;
import org.hl7.fhir.ResourceVersionPolicy;
import org.hl7.fhir.ResponseType;
import org.hl7.fhir.RestfulCapabilityMode;
import org.hl7.fhir.RiskAssessment;
import org.hl7.fhir.RiskAssessmentPrediction;
import org.hl7.fhir.SampledData;
import org.hl7.fhir.SampledDataDataType;
import org.hl7.fhir.Schedule;
import org.hl7.fhir.SearchComparator;
import org.hl7.fhir.SearchEntryMode;
import org.hl7.fhir.SearchModifierCode;
import org.hl7.fhir.SearchParamType;
import org.hl7.fhir.SearchParameter;
import org.hl7.fhir.SearchParameterComponent;
import org.hl7.fhir.Sequence;
import org.hl7.fhir.SequenceInner;
import org.hl7.fhir.SequenceOuter;
import org.hl7.fhir.SequenceQuality;
import org.hl7.fhir.SequenceReferenceSeq;
import org.hl7.fhir.SequenceRepository;
import org.hl7.fhir.SequenceStructureVariant;
import org.hl7.fhir.SequenceType;
import org.hl7.fhir.SequenceVariant;
import org.hl7.fhir.ServiceDefinition;
import org.hl7.fhir.Signature;
import org.hl7.fhir.SlicingRules;
import org.hl7.fhir.Slot;
import org.hl7.fhir.SlotStatus;
import org.hl7.fhir.Specimen;
import org.hl7.fhir.SpecimenCollection;
import org.hl7.fhir.SpecimenContainer;
import org.hl7.fhir.SpecimenStatus;
import org.hl7.fhir.SpecimenTreatment;
import org.hl7.fhir.StructureDefinition;
import org.hl7.fhir.StructureDefinitionDifferential;
import org.hl7.fhir.StructureDefinitionKind;
import org.hl7.fhir.StructureDefinitionMapping;
import org.hl7.fhir.StructureDefinitionSnapshot;
import org.hl7.fhir.StructureMap;
import org.hl7.fhir.StructureMapContextType;
import org.hl7.fhir.StructureMapDependent;
import org.hl7.fhir.StructureMapGroup;
import org.hl7.fhir.StructureMapInput;
import org.hl7.fhir.StructureMapInputMode;
import org.hl7.fhir.StructureMapListMode;
import org.hl7.fhir.StructureMapModelMode;
import org.hl7.fhir.StructureMapParameter;
import org.hl7.fhir.StructureMapRule;
import org.hl7.fhir.StructureMapSource;
import org.hl7.fhir.StructureMapStructure;
import org.hl7.fhir.StructureMapTarget;
import org.hl7.fhir.StructureMapTransform;
import org.hl7.fhir.Subscription;
import org.hl7.fhir.SubscriptionChannel;
import org.hl7.fhir.SubscriptionChannelType;
import org.hl7.fhir.SubscriptionStatus;
import org.hl7.fhir.Substance;
import org.hl7.fhir.SubstanceIngredient;
import org.hl7.fhir.SubstanceInstance;
import org.hl7.fhir.SupplyDelivery;
import org.hl7.fhir.SupplyDeliveryStatus;
import org.hl7.fhir.SupplyRequest;
import org.hl7.fhir.SupplyRequestStatus;
import org.hl7.fhir.SupplyRequestWhen;
import org.hl7.fhir.SystemRestfulInteraction;
import org.hl7.fhir.SystemVersionProcessingMode;
import org.hl7.fhir.Task;
import org.hl7.fhir.TaskInput;
import org.hl7.fhir.TaskOutput;
import org.hl7.fhir.TaskRequester;
import org.hl7.fhir.TaskRestriction;
import org.hl7.fhir.TaskStatus;
import org.hl7.fhir.TestReport;
import org.hl7.fhir.TestReportAction;
import org.hl7.fhir.TestReportAction1;
import org.hl7.fhir.TestReportAction2;
import org.hl7.fhir.TestReportAssert;
import org.hl7.fhir.TestReportOperation;
import org.hl7.fhir.TestReportParticipant;
import org.hl7.fhir.TestReportParticipantType;
import org.hl7.fhir.TestReportResultCodes;
import org.hl7.fhir.TestReportSetup;
import org.hl7.fhir.TestReportStatus;
import org.hl7.fhir.TestReportTeardown;
import org.hl7.fhir.TestReportTest;
import org.hl7.fhir.TestScript;
import org.hl7.fhir.TestScriptAction;
import org.hl7.fhir.TestScriptAction1;
import org.hl7.fhir.TestScriptAction2;
import org.hl7.fhir.TestScriptAssert;
import org.hl7.fhir.TestScriptCapability;
import org.hl7.fhir.TestScriptDestination;
import org.hl7.fhir.TestScriptFixture;
import org.hl7.fhir.TestScriptLink;
import org.hl7.fhir.TestScriptMetadata;
import org.hl7.fhir.TestScriptOperation;
import org.hl7.fhir.TestScriptOrigin;
import org.hl7.fhir.TestScriptParam;
import org.hl7.fhir.TestScriptParam1;
import org.hl7.fhir.TestScriptParam2;
import org.hl7.fhir.TestScriptParam3;
import org.hl7.fhir.TestScriptRequestHeader;
import org.hl7.fhir.TestScriptRule;
import org.hl7.fhir.TestScriptRule1;
import org.hl7.fhir.TestScriptRule2;
import org.hl7.fhir.TestScriptRule3;
import org.hl7.fhir.TestScriptRuleset;
import org.hl7.fhir.TestScriptRuleset1;
import org.hl7.fhir.TestScriptSetup;
import org.hl7.fhir.TestScriptTeardown;
import org.hl7.fhir.TestScriptTest;
import org.hl7.fhir.TestScriptVariable;
import org.hl7.fhir.Time;
import org.hl7.fhir.Timing;
import org.hl7.fhir.TimingRepeat;
import org.hl7.fhir.TriggerDefinition;
import org.hl7.fhir.TriggerType;
import org.hl7.fhir.TypeDerivationRule;
import org.hl7.fhir.TypeRestfulInteraction;
import org.hl7.fhir.UnitsOfTime;
import org.hl7.fhir.UnknownContentCode;
import org.hl7.fhir.UnsignedInt;
import org.hl7.fhir.Uri;
import org.hl7.fhir.UsageContext;
import org.hl7.fhir.Use;
import org.hl7.fhir.Uuid;
import org.hl7.fhir.ValueSet;
import org.hl7.fhir.ValueSetCompose;
import org.hl7.fhir.ValueSetConcept;
import org.hl7.fhir.ValueSetContains;
import org.hl7.fhir.ValueSetDesignation;
import org.hl7.fhir.ValueSetExpansion;
import org.hl7.fhir.ValueSetFilter;
import org.hl7.fhir.ValueSetInclude;
import org.hl7.fhir.ValueSetParameter;
import org.hl7.fhir.VisionPrescription;
import org.hl7.fhir.VisionPrescriptionDispense;
import org.hl7.fhir.XPathUsageType;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage
 * @generated
 */
public class FhirAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FhirPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FhirAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = FhirPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FhirSwitch<Adapter> modelSwitch =
		new FhirSwitch<Adapter>() {
			@Override
			public Adapter caseAccount(Account object) {
				return createAccountAdapter();
			}
			@Override
			public Adapter caseAccountGuarantor(AccountGuarantor object) {
				return createAccountGuarantorAdapter();
			}
			@Override
			public Adapter caseAccountStatus(AccountStatus object) {
				return createAccountStatusAdapter();
			}
			@Override
			public Adapter caseActionList(ActionList object) {
				return createActionListAdapter();
			}
			@Override
			public Adapter caseActivityDefinition(ActivityDefinition object) {
				return createActivityDefinitionAdapter();
			}
			@Override
			public Adapter caseActivityDefinitionCategory(ActivityDefinitionCategory object) {
				return createActivityDefinitionCategoryAdapter();
			}
			@Override
			public Adapter caseActivityDefinitionDynamicValue(ActivityDefinitionDynamicValue object) {
				return createActivityDefinitionDynamicValueAdapter();
			}
			@Override
			public Adapter caseAddress(Address object) {
				return createAddressAdapter();
			}
			@Override
			public Adapter caseAddressType(AddressType object) {
				return createAddressTypeAdapter();
			}
			@Override
			public Adapter caseAddressUse(AddressUse object) {
				return createAddressUseAdapter();
			}
			@Override
			public Adapter caseAdministrativeGender(AdministrativeGender object) {
				return createAdministrativeGenderAdapter();
			}
			@Override
			public Adapter caseAge(Age object) {
				return createAgeAdapter();
			}
			@Override
			public Adapter caseAggregationMode(AggregationMode object) {
				return createAggregationModeAdapter();
			}
			@Override
			public Adapter caseAllergyIntolerance(AllergyIntolerance object) {
				return createAllergyIntoleranceAdapter();
			}
			@Override
			public Adapter caseAllergyIntoleranceCategory(AllergyIntoleranceCategory object) {
				return createAllergyIntoleranceCategoryAdapter();
			}
			@Override
			public Adapter caseAllergyIntoleranceCertainty(AllergyIntoleranceCertainty object) {
				return createAllergyIntoleranceCertaintyAdapter();
			}
			@Override
			public Adapter caseAllergyIntoleranceClinicalStatus(AllergyIntoleranceClinicalStatus object) {
				return createAllergyIntoleranceClinicalStatusAdapter();
			}
			@Override
			public Adapter caseAllergyIntoleranceCriticality(AllergyIntoleranceCriticality object) {
				return createAllergyIntoleranceCriticalityAdapter();
			}
			@Override
			public Adapter caseAllergyIntoleranceReaction(AllergyIntoleranceReaction object) {
				return createAllergyIntoleranceReactionAdapter();
			}
			@Override
			public Adapter caseAllergyIntoleranceSeverity(AllergyIntoleranceSeverity object) {
				return createAllergyIntoleranceSeverityAdapter();
			}
			@Override
			public Adapter caseAllergyIntoleranceType(AllergyIntoleranceType object) {
				return createAllergyIntoleranceTypeAdapter();
			}
			@Override
			public Adapter caseAllergyIntoleranceVerificationStatus(AllergyIntoleranceVerificationStatus object) {
				return createAllergyIntoleranceVerificationStatusAdapter();
			}
			@Override
			public Adapter caseAnnotation(Annotation object) {
				return createAnnotationAdapter();
			}
			@Override
			public Adapter caseAppointment(Appointment object) {
				return createAppointmentAdapter();
			}
			@Override
			public Adapter caseAppointmentParticipant(AppointmentParticipant object) {
				return createAppointmentParticipantAdapter();
			}
			@Override
			public Adapter caseAppointmentResponse(AppointmentResponse object) {
				return createAppointmentResponseAdapter();
			}
			@Override
			public Adapter caseAppointmentStatus(AppointmentStatus object) {
				return createAppointmentStatusAdapter();
			}
			@Override
			public Adapter caseAssertionDirectionType(AssertionDirectionType object) {
				return createAssertionDirectionTypeAdapter();
			}
			@Override
			public Adapter caseAssertionOperatorType(AssertionOperatorType object) {
				return createAssertionOperatorTypeAdapter();
			}
			@Override
			public Adapter caseAssertionResponseTypes(AssertionResponseTypes object) {
				return createAssertionResponseTypesAdapter();
			}
			@Override
			public Adapter caseAttachment(Attachment object) {
				return createAttachmentAdapter();
			}
			@Override
			public Adapter caseAuditEvent(AuditEvent object) {
				return createAuditEventAdapter();
			}
			@Override
			public Adapter caseAuditEventAction(AuditEventAction object) {
				return createAuditEventActionAdapter();
			}
			@Override
			public Adapter caseAuditEventAgent(AuditEventAgent object) {
				return createAuditEventAgentAdapter();
			}
			@Override
			public Adapter caseAuditEventAgentNetworkType(AuditEventAgentNetworkType object) {
				return createAuditEventAgentNetworkTypeAdapter();
			}
			@Override
			public Adapter caseAuditEventDetail(AuditEventDetail object) {
				return createAuditEventDetailAdapter();
			}
			@Override
			public Adapter caseAuditEventEntity(AuditEventEntity object) {
				return createAuditEventEntityAdapter();
			}
			@Override
			public Adapter caseAuditEventNetwork(AuditEventNetwork object) {
				return createAuditEventNetworkAdapter();
			}
			@Override
			public Adapter caseAuditEventOutcome(AuditEventOutcome object) {
				return createAuditEventOutcomeAdapter();
			}
			@Override
			public Adapter caseAuditEventSource(AuditEventSource object) {
				return createAuditEventSourceAdapter();
			}
			@Override
			public Adapter caseBackboneElement(BackboneElement object) {
				return createBackboneElementAdapter();
			}
			@Override
			public Adapter caseBase64Binary(Base64Binary object) {
				return createBase64BinaryAdapter();
			}
			@Override
			public Adapter caseBasic(Basic object) {
				return createBasicAdapter();
			}
			@Override
			public Adapter caseBinary(Binary object) {
				return createBinaryAdapter();
			}
			@Override
			public Adapter caseBindingStrength(BindingStrength object) {
				return createBindingStrengthAdapter();
			}
			@Override
			public Adapter caseBodySite(BodySite object) {
				return createBodySiteAdapter();
			}
			@Override
			public Adapter caseBoolean(org.hl7.fhir.Boolean object) {
				return createBooleanAdapter();
			}
			@Override
			public Adapter caseBundle(Bundle object) {
				return createBundleAdapter();
			}
			@Override
			public Adapter caseBundleEntry(BundleEntry object) {
				return createBundleEntryAdapter();
			}
			@Override
			public Adapter caseBundleLink(BundleLink object) {
				return createBundleLinkAdapter();
			}
			@Override
			public Adapter caseBundleRequest(BundleRequest object) {
				return createBundleRequestAdapter();
			}
			@Override
			public Adapter caseBundleResponse(BundleResponse object) {
				return createBundleResponseAdapter();
			}
			@Override
			public Adapter caseBundleSearch(BundleSearch object) {
				return createBundleSearchAdapter();
			}
			@Override
			public Adapter caseBundleType(BundleType object) {
				return createBundleTypeAdapter();
			}
			@Override
			public Adapter caseCapabilityStatement(CapabilityStatement object) {
				return createCapabilityStatementAdapter();
			}
			@Override
			public Adapter caseCapabilityStatementCertificate(CapabilityStatementCertificate object) {
				return createCapabilityStatementCertificateAdapter();
			}
			@Override
			public Adapter caseCapabilityStatementDocument(CapabilityStatementDocument object) {
				return createCapabilityStatementDocumentAdapter();
			}
			@Override
			public Adapter caseCapabilityStatementEndpoint(CapabilityStatementEndpoint object) {
				return createCapabilityStatementEndpointAdapter();
			}
			@Override
			public Adapter caseCapabilityStatementEvent(CapabilityStatementEvent object) {
				return createCapabilityStatementEventAdapter();
			}
			@Override
			public Adapter caseCapabilityStatementImplementation(CapabilityStatementImplementation object) {
				return createCapabilityStatementImplementationAdapter();
			}
			@Override
			public Adapter caseCapabilityStatementInteraction(CapabilityStatementInteraction object) {
				return createCapabilityStatementInteractionAdapter();
			}
			@Override
			public Adapter caseCapabilityStatementInteraction1(CapabilityStatementInteraction1 object) {
				return createCapabilityStatementInteraction1Adapter();
			}
			@Override
			public Adapter caseCapabilityStatementKind(CapabilityStatementKind object) {
				return createCapabilityStatementKindAdapter();
			}
			@Override
			public Adapter caseCapabilityStatementMessaging(CapabilityStatementMessaging object) {
				return createCapabilityStatementMessagingAdapter();
			}
			@Override
			public Adapter caseCapabilityStatementOperation(CapabilityStatementOperation object) {
				return createCapabilityStatementOperationAdapter();
			}
			@Override
			public Adapter caseCapabilityStatementResource(CapabilityStatementResource object) {
				return createCapabilityStatementResourceAdapter();
			}
			@Override
			public Adapter caseCapabilityStatementRest(CapabilityStatementRest object) {
				return createCapabilityStatementRestAdapter();
			}
			@Override
			public Adapter caseCapabilityStatementSearchParam(CapabilityStatementSearchParam object) {
				return createCapabilityStatementSearchParamAdapter();
			}
			@Override
			public Adapter caseCapabilityStatementSecurity(CapabilityStatementSecurity object) {
				return createCapabilityStatementSecurityAdapter();
			}
			@Override
			public Adapter caseCapabilityStatementSoftware(CapabilityStatementSoftware object) {
				return createCapabilityStatementSoftwareAdapter();
			}
			@Override
			public Adapter caseCarePlan(CarePlan object) {
				return createCarePlanAdapter();
			}
			@Override
			public Adapter caseCarePlanActivity(CarePlanActivity object) {
				return createCarePlanActivityAdapter();
			}
			@Override
			public Adapter caseCarePlanActivityStatus(CarePlanActivityStatus object) {
				return createCarePlanActivityStatusAdapter();
			}
			@Override
			public Adapter caseCarePlanDetail(CarePlanDetail object) {
				return createCarePlanDetailAdapter();
			}
			@Override
			public Adapter caseCarePlanRelatedPlan(CarePlanRelatedPlan object) {
				return createCarePlanRelatedPlanAdapter();
			}
			@Override
			public Adapter caseCarePlanRelationship(CarePlanRelationship object) {
				return createCarePlanRelationshipAdapter();
			}
			@Override
			public Adapter caseCarePlanStatus(CarePlanStatus object) {
				return createCarePlanStatusAdapter();
			}
			@Override
			public Adapter caseCareTeam(CareTeam object) {
				return createCareTeamAdapter();
			}
			@Override
			public Adapter caseCareTeamParticipant(CareTeamParticipant object) {
				return createCareTeamParticipantAdapter();
			}
			@Override
			public Adapter caseClaim(Claim object) {
				return createClaimAdapter();
			}
			@Override
			public Adapter caseClaimAccident(ClaimAccident object) {
				return createClaimAccidentAdapter();
			}
			@Override
			public Adapter caseClaimCareTeam(ClaimCareTeam object) {
				return createClaimCareTeamAdapter();
			}
			@Override
			public Adapter caseClaimDetail(ClaimDetail object) {
				return createClaimDetailAdapter();
			}
			@Override
			public Adapter caseClaimDiagnosis(ClaimDiagnosis object) {
				return createClaimDiagnosisAdapter();
			}
			@Override
			public Adapter caseClaimInformation(ClaimInformation object) {
				return createClaimInformationAdapter();
			}
			@Override
			public Adapter caseClaimInsurance(ClaimInsurance object) {
				return createClaimInsuranceAdapter();
			}
			@Override
			public Adapter caseClaimItem(ClaimItem object) {
				return createClaimItemAdapter();
			}
			@Override
			public Adapter caseClaimPayee(ClaimPayee object) {
				return createClaimPayeeAdapter();
			}
			@Override
			public Adapter caseClaimProcedure(ClaimProcedure object) {
				return createClaimProcedureAdapter();
			}
			@Override
			public Adapter caseClaimProsthesis(ClaimProsthesis object) {
				return createClaimProsthesisAdapter();
			}
			@Override
			public Adapter caseClaimRelated(ClaimRelated object) {
				return createClaimRelatedAdapter();
			}
			@Override
			public Adapter caseClaimResponse(ClaimResponse object) {
				return createClaimResponseAdapter();
			}
			@Override
			public Adapter caseClaimResponseAddItem(ClaimResponseAddItem object) {
				return createClaimResponseAddItemAdapter();
			}
			@Override
			public Adapter caseClaimResponseAdjudication(ClaimResponseAdjudication object) {
				return createClaimResponseAdjudicationAdapter();
			}
			@Override
			public Adapter caseClaimResponseDetail(ClaimResponseDetail object) {
				return createClaimResponseDetailAdapter();
			}
			@Override
			public Adapter caseClaimResponseDetail1(ClaimResponseDetail1 object) {
				return createClaimResponseDetail1Adapter();
			}
			@Override
			public Adapter caseClaimResponseError(ClaimResponseError object) {
				return createClaimResponseErrorAdapter();
			}
			@Override
			public Adapter caseClaimResponseInsurance(ClaimResponseInsurance object) {
				return createClaimResponseInsuranceAdapter();
			}
			@Override
			public Adapter caseClaimResponseItem(ClaimResponseItem object) {
				return createClaimResponseItemAdapter();
			}
			@Override
			public Adapter caseClaimResponseNote(ClaimResponseNote object) {
				return createClaimResponseNoteAdapter();
			}
			@Override
			public Adapter caseClaimResponsePayment(ClaimResponsePayment object) {
				return createClaimResponsePaymentAdapter();
			}
			@Override
			public Adapter caseClaimResponseSubDetail(ClaimResponseSubDetail object) {
				return createClaimResponseSubDetailAdapter();
			}
			@Override
			public Adapter caseClaimSubDetail(ClaimSubDetail object) {
				return createClaimSubDetailAdapter();
			}
			@Override
			public Adapter caseClinicalImpression(ClinicalImpression object) {
				return createClinicalImpressionAdapter();
			}
			@Override
			public Adapter caseClinicalImpressionFinding(ClinicalImpressionFinding object) {
				return createClinicalImpressionFindingAdapter();
			}
			@Override
			public Adapter caseClinicalImpressionInvestigation(ClinicalImpressionInvestigation object) {
				return createClinicalImpressionInvestigationAdapter();
			}
			@Override
			public Adapter caseClinicalImpressionStatus(ClinicalImpressionStatus object) {
				return createClinicalImpressionStatusAdapter();
			}
			@Override
			public Adapter caseCode(Code object) {
				return createCodeAdapter();
			}
			@Override
			public Adapter caseCodeableConcept(CodeableConcept object) {
				return createCodeableConceptAdapter();
			}
			@Override
			public Adapter caseCodeSystem(CodeSystem object) {
				return createCodeSystemAdapter();
			}
			@Override
			public Adapter caseCodeSystemConcept(CodeSystemConcept object) {
				return createCodeSystemConceptAdapter();
			}
			@Override
			public Adapter caseCodeSystemContentMode(CodeSystemContentMode object) {
				return createCodeSystemContentModeAdapter();
			}
			@Override
			public Adapter caseCodeSystemDesignation(CodeSystemDesignation object) {
				return createCodeSystemDesignationAdapter();
			}
			@Override
			public Adapter caseCodeSystemFilter(CodeSystemFilter object) {
				return createCodeSystemFilterAdapter();
			}
			@Override
			public Adapter caseCodeSystemHierarchyMeaning(CodeSystemHierarchyMeaning object) {
				return createCodeSystemHierarchyMeaningAdapter();
			}
			@Override
			public Adapter caseCodeSystemProperty(CodeSystemProperty object) {
				return createCodeSystemPropertyAdapter();
			}
			@Override
			public Adapter caseCodeSystemProperty1(CodeSystemProperty1 object) {
				return createCodeSystemProperty1Adapter();
			}
			@Override
			public Adapter caseCoding(Coding object) {
				return createCodingAdapter();
			}
			@Override
			public Adapter caseCommunication(Communication object) {
				return createCommunicationAdapter();
			}
			@Override
			public Adapter caseCommunicationPayload(CommunicationPayload object) {
				return createCommunicationPayloadAdapter();
			}
			@Override
			public Adapter caseCommunicationRequest(CommunicationRequest object) {
				return createCommunicationRequestAdapter();
			}
			@Override
			public Adapter caseCommunicationRequestPayload(CommunicationRequestPayload object) {
				return createCommunicationRequestPayloadAdapter();
			}
			@Override
			public Adapter caseCommunicationRequestStatus(CommunicationRequestStatus object) {
				return createCommunicationRequestStatusAdapter();
			}
			@Override
			public Adapter caseCommunicationStatus(CommunicationStatus object) {
				return createCommunicationStatusAdapter();
			}
			@Override
			public Adapter caseCompartmentDefinition(CompartmentDefinition object) {
				return createCompartmentDefinitionAdapter();
			}
			@Override
			public Adapter caseCompartmentDefinitionResource(CompartmentDefinitionResource object) {
				return createCompartmentDefinitionResourceAdapter();
			}
			@Override
			public Adapter caseCompartmentType(CompartmentType object) {
				return createCompartmentTypeAdapter();
			}
			@Override
			public Adapter caseCompositeMeasureScoring(CompositeMeasureScoring object) {
				return createCompositeMeasureScoringAdapter();
			}
			@Override
			public Adapter caseComposition(Composition object) {
				return createCompositionAdapter();
			}
			@Override
			public Adapter caseCompositionAttestationMode(CompositionAttestationMode object) {
				return createCompositionAttestationModeAdapter();
			}
			@Override
			public Adapter caseCompositionAttester(CompositionAttester object) {
				return createCompositionAttesterAdapter();
			}
			@Override
			public Adapter caseCompositionEvent(CompositionEvent object) {
				return createCompositionEventAdapter();
			}
			@Override
			public Adapter caseCompositionSection(CompositionSection object) {
				return createCompositionSectionAdapter();
			}
			@Override
			public Adapter caseCompositionStatus(CompositionStatus object) {
				return createCompositionStatusAdapter();
			}
			@Override
			public Adapter caseConceptMap(ConceptMap object) {
				return createConceptMapAdapter();
			}
			@Override
			public Adapter caseConceptMapDependsOn(ConceptMapDependsOn object) {
				return createConceptMapDependsOnAdapter();
			}
			@Override
			public Adapter caseConceptMapElement(ConceptMapElement object) {
				return createConceptMapElementAdapter();
			}
			@Override
			public Adapter caseConceptMapEquivalence(ConceptMapEquivalence object) {
				return createConceptMapEquivalenceAdapter();
			}
			@Override
			public Adapter caseConceptMapGroup(ConceptMapGroup object) {
				return createConceptMapGroupAdapter();
			}
			@Override
			public Adapter caseConceptMapTarget(ConceptMapTarget object) {
				return createConceptMapTargetAdapter();
			}
			@Override
			public Adapter caseCondition(Condition object) {
				return createConditionAdapter();
			}
			@Override
			public Adapter caseConditionalDeleteStatus(ConditionalDeleteStatus object) {
				return createConditionalDeleteStatusAdapter();
			}
			@Override
			public Adapter caseConditionalReadStatus(ConditionalReadStatus object) {
				return createConditionalReadStatusAdapter();
			}
			@Override
			public Adapter caseConditionEvidence(ConditionEvidence object) {
				return createConditionEvidenceAdapter();
			}
			@Override
			public Adapter caseConditionStage(ConditionStage object) {
				return createConditionStageAdapter();
			}
			@Override
			public Adapter caseConditionVerificationStatus(ConditionVerificationStatus object) {
				return createConditionVerificationStatusAdapter();
			}
			@Override
			public Adapter caseConsent(Consent object) {
				return createConsentAdapter();
			}
			@Override
			public Adapter caseConsentActor(ConsentActor object) {
				return createConsentActorAdapter();
			}
			@Override
			public Adapter caseConsentData(ConsentData object) {
				return createConsentDataAdapter();
			}
			@Override
			public Adapter caseConsentDataMeaning(ConsentDataMeaning object) {
				return createConsentDataMeaningAdapter();
			}
			@Override
			public Adapter caseConsentExcept(ConsentExcept object) {
				return createConsentExceptAdapter();
			}
			@Override
			public Adapter caseConsentExceptType(ConsentExceptType object) {
				return createConsentExceptTypeAdapter();
			}
			@Override
			public Adapter caseConsentStatus(ConsentStatus object) {
				return createConsentStatusAdapter();
			}
			@Override
			public Adapter caseConstraintSeverity(ConstraintSeverity object) {
				return createConstraintSeverityAdapter();
			}
			@Override
			public Adapter caseContactDetail(ContactDetail object) {
				return createContactDetailAdapter();
			}
			@Override
			public Adapter caseContactPoint(ContactPoint object) {
				return createContactPointAdapter();
			}
			@Override
			public Adapter caseContactPointSystem(ContactPointSystem object) {
				return createContactPointSystemAdapter();
			}
			@Override
			public Adapter caseContactPointUse(ContactPointUse object) {
				return createContactPointUseAdapter();
			}
			@Override
			public Adapter caseContentType(ContentType object) {
				return createContentTypeAdapter();
			}
			@Override
			public Adapter caseContract(Contract object) {
				return createContractAdapter();
			}
			@Override
			public Adapter caseContractAgent(ContractAgent object) {
				return createContractAgentAdapter();
			}
			@Override
			public Adapter caseContractAgent1(ContractAgent1 object) {
				return createContractAgent1Adapter();
			}
			@Override
			public Adapter caseContractFriendly(ContractFriendly object) {
				return createContractFriendlyAdapter();
			}
			@Override
			public Adapter caseContractLegal(ContractLegal object) {
				return createContractLegalAdapter();
			}
			@Override
			public Adapter caseContractRule(ContractRule object) {
				return createContractRuleAdapter();
			}
			@Override
			public Adapter caseContractSigner(ContractSigner object) {
				return createContractSignerAdapter();
			}
			@Override
			public Adapter caseContractTerm(ContractTerm object) {
				return createContractTermAdapter();
			}
			@Override
			public Adapter caseContractValuedItem(ContractValuedItem object) {
				return createContractValuedItemAdapter();
			}
			@Override
			public Adapter caseContractValuedItem1(ContractValuedItem1 object) {
				return createContractValuedItem1Adapter();
			}
			@Override
			public Adapter caseContributor(Contributor object) {
				return createContributorAdapter();
			}
			@Override
			public Adapter caseContributorType(ContributorType object) {
				return createContributorTypeAdapter();
			}
			@Override
			public Adapter caseCount(Count object) {
				return createCountAdapter();
			}
			@Override
			public Adapter caseCoverage(Coverage object) {
				return createCoverageAdapter();
			}
			@Override
			public Adapter caseCoverageGroup(CoverageGroup object) {
				return createCoverageGroupAdapter();
			}
			@Override
			public Adapter caseDataElement(DataElement object) {
				return createDataElementAdapter();
			}
			@Override
			public Adapter caseDataElementMapping(DataElementMapping object) {
				return createDataElementMappingAdapter();
			}
			@Override
			public Adapter caseDataElementStringency(DataElementStringency object) {
				return createDataElementStringencyAdapter();
			}
			@Override
			public Adapter caseDataRequirement(DataRequirement object) {
				return createDataRequirementAdapter();
			}
			@Override
			public Adapter caseDataRequirementCodeFilter(DataRequirementCodeFilter object) {
				return createDataRequirementCodeFilterAdapter();
			}
			@Override
			public Adapter caseDataRequirementDateFilter(DataRequirementDateFilter object) {
				return createDataRequirementDateFilterAdapter();
			}
			@Override
			public Adapter caseDate(Date object) {
				return createDateAdapter();
			}
			@Override
			public Adapter caseDateTime(DateTime object) {
				return createDateTimeAdapter();
			}
			@Override
			public Adapter caseDaysOfWeek(DaysOfWeek object) {
				return createDaysOfWeekAdapter();
			}
			@Override
			public Adapter caseDecimal(Decimal object) {
				return createDecimalAdapter();
			}
			@Override
			public Adapter caseDetectedIssue(DetectedIssue object) {
				return createDetectedIssueAdapter();
			}
			@Override
			public Adapter caseDetectedIssueMitigation(DetectedIssueMitigation object) {
				return createDetectedIssueMitigationAdapter();
			}
			@Override
			public Adapter caseDetectedIssueSeverity(DetectedIssueSeverity object) {
				return createDetectedIssueSeverityAdapter();
			}
			@Override
			public Adapter caseDevice(Device object) {
				return createDeviceAdapter();
			}
			@Override
			public Adapter caseDeviceComponent(DeviceComponent object) {
				return createDeviceComponentAdapter();
			}
			@Override
			public Adapter caseDeviceComponentProductionSpecification(DeviceComponentProductionSpecification object) {
				return createDeviceComponentProductionSpecificationAdapter();
			}
			@Override
			public Adapter caseDeviceMetric(DeviceMetric object) {
				return createDeviceMetricAdapter();
			}
			@Override
			public Adapter caseDeviceMetricCalibration(DeviceMetricCalibration object) {
				return createDeviceMetricCalibrationAdapter();
			}
			@Override
			public Adapter caseDeviceMetricCalibrationState(DeviceMetricCalibrationState object) {
				return createDeviceMetricCalibrationStateAdapter();
			}
			@Override
			public Adapter caseDeviceMetricCalibrationType(DeviceMetricCalibrationType object) {
				return createDeviceMetricCalibrationTypeAdapter();
			}
			@Override
			public Adapter caseDeviceMetricCategory(DeviceMetricCategory object) {
				return createDeviceMetricCategoryAdapter();
			}
			@Override
			public Adapter caseDeviceMetricColor(DeviceMetricColor object) {
				return createDeviceMetricColorAdapter();
			}
			@Override
			public Adapter caseDeviceMetricOperationalStatus(DeviceMetricOperationalStatus object) {
				return createDeviceMetricOperationalStatusAdapter();
			}
			@Override
			public Adapter caseDeviceStatus(DeviceStatus object) {
				return createDeviceStatusAdapter();
			}
			@Override
			public Adapter caseDeviceUseRequest(DeviceUseRequest object) {
				return createDeviceUseRequestAdapter();
			}
			@Override
			public Adapter caseDeviceUseStatement(DeviceUseStatement object) {
				return createDeviceUseStatementAdapter();
			}
			@Override
			public Adapter caseDiagnosticReport(DiagnosticReport object) {
				return createDiagnosticReportAdapter();
			}
			@Override
			public Adapter caseDiagnosticReportImage(DiagnosticReportImage object) {
				return createDiagnosticReportImageAdapter();
			}
			@Override
			public Adapter caseDiagnosticReportStatus(DiagnosticReportStatus object) {
				return createDiagnosticReportStatusAdapter();
			}
			@Override
			public Adapter caseDiagnosticRequest(DiagnosticRequest object) {
				return createDiagnosticRequestAdapter();
			}
			@Override
			public Adapter caseDigitalMediaType(DigitalMediaType object) {
				return createDigitalMediaTypeAdapter();
			}
			@Override
			public Adapter caseDistance(Distance object) {
				return createDistanceAdapter();
			}
			@Override
			public Adapter caseDocumentManifest(DocumentManifest object) {
				return createDocumentManifestAdapter();
			}
			@Override
			public Adapter caseDocumentManifestContent(DocumentManifestContent object) {
				return createDocumentManifestContentAdapter();
			}
			@Override
			public Adapter caseDocumentManifestRelated(DocumentManifestRelated object) {
				return createDocumentManifestRelatedAdapter();
			}
			@Override
			public Adapter caseDocumentMode(DocumentMode object) {
				return createDocumentModeAdapter();
			}
			@Override
			public Adapter caseDocumentReference(DocumentReference object) {
				return createDocumentReferenceAdapter();
			}
			@Override
			public Adapter caseDocumentReferenceContent(DocumentReferenceContent object) {
				return createDocumentReferenceContentAdapter();
			}
			@Override
			public Adapter caseDocumentReferenceContext(DocumentReferenceContext object) {
				return createDocumentReferenceContextAdapter();
			}
			@Override
			public Adapter caseDocumentReferenceRelated(DocumentReferenceRelated object) {
				return createDocumentReferenceRelatedAdapter();
			}
			@Override
			public Adapter caseDocumentReferenceRelatesTo(DocumentReferenceRelatesTo object) {
				return createDocumentReferenceRelatesToAdapter();
			}
			@Override
			public Adapter caseDocumentReferenceStatus(DocumentReferenceStatus object) {
				return createDocumentReferenceStatusAdapter();
			}
			@Override
			public Adapter caseDocumentRelationshipType(DocumentRelationshipType object) {
				return createDocumentRelationshipTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseDomainResource(DomainResource object) {
				return createDomainResourceAdapter();
			}
			@Override
			public Adapter caseDosageInstruction(DosageInstruction object) {
				return createDosageInstructionAdapter();
			}
			@Override
			public Adapter caseDuration(Duration object) {
				return createDurationAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseElementDefinition(ElementDefinition object) {
				return createElementDefinitionAdapter();
			}
			@Override
			public Adapter caseElementDefinitionBase(ElementDefinitionBase object) {
				return createElementDefinitionBaseAdapter();
			}
			@Override
			public Adapter caseElementDefinitionBinding(ElementDefinitionBinding object) {
				return createElementDefinitionBindingAdapter();
			}
			@Override
			public Adapter caseElementDefinitionConstraint(ElementDefinitionConstraint object) {
				return createElementDefinitionConstraintAdapter();
			}
			@Override
			public Adapter caseElementDefinitionExample(ElementDefinitionExample object) {
				return createElementDefinitionExampleAdapter();
			}
			@Override
			public Adapter caseElementDefinitionMapping(ElementDefinitionMapping object) {
				return createElementDefinitionMappingAdapter();
			}
			@Override
			public Adapter caseElementDefinitionSlicing(ElementDefinitionSlicing object) {
				return createElementDefinitionSlicingAdapter();
			}
			@Override
			public Adapter caseElementDefinitionType(ElementDefinitionType object) {
				return createElementDefinitionTypeAdapter();
			}
			@Override
			public Adapter caseEligibilityRequest(EligibilityRequest object) {
				return createEligibilityRequestAdapter();
			}
			@Override
			public Adapter caseEligibilityResponse(EligibilityResponse object) {
				return createEligibilityResponseAdapter();
			}
			@Override
			public Adapter caseEligibilityResponseBenefitBalance(EligibilityResponseBenefitBalance object) {
				return createEligibilityResponseBenefitBalanceAdapter();
			}
			@Override
			public Adapter caseEligibilityResponseError(EligibilityResponseError object) {
				return createEligibilityResponseErrorAdapter();
			}
			@Override
			public Adapter caseEligibilityResponseFinancial(EligibilityResponseFinancial object) {
				return createEligibilityResponseFinancialAdapter();
			}
			@Override
			public Adapter caseEligibilityResponseInsurance(EligibilityResponseInsurance object) {
				return createEligibilityResponseInsuranceAdapter();
			}
			@Override
			public Adapter caseEncounter(Encounter object) {
				return createEncounterAdapter();
			}
			@Override
			public Adapter caseEncounterHospitalization(EncounterHospitalization object) {
				return createEncounterHospitalizationAdapter();
			}
			@Override
			public Adapter caseEncounterLocation(EncounterLocation object) {
				return createEncounterLocationAdapter();
			}
			@Override
			public Adapter caseEncounterLocationStatus(EncounterLocationStatus object) {
				return createEncounterLocationStatusAdapter();
			}
			@Override
			public Adapter caseEncounterParticipant(EncounterParticipant object) {
				return createEncounterParticipantAdapter();
			}
			@Override
			public Adapter caseEncounterStatus(EncounterStatus object) {
				return createEncounterStatusAdapter();
			}
			@Override
			public Adapter caseEncounterStatusHistory(EncounterStatusHistory object) {
				return createEncounterStatusHistoryAdapter();
			}
			@Override
			public Adapter caseEndpoint(Endpoint object) {
				return createEndpointAdapter();
			}
			@Override
			public Adapter caseEndpointStatus(EndpointStatus object) {
				return createEndpointStatusAdapter();
			}
			@Override
			public Adapter caseEnrollmentRequest(EnrollmentRequest object) {
				return createEnrollmentRequestAdapter();
			}
			@Override
			public Adapter caseEnrollmentResponse(EnrollmentResponse object) {
				return createEnrollmentResponseAdapter();
			}
			@Override
			public Adapter caseEpisodeOfCare(EpisodeOfCare object) {
				return createEpisodeOfCareAdapter();
			}
			@Override
			public Adapter caseEpisodeOfCareStatus(EpisodeOfCareStatus object) {
				return createEpisodeOfCareStatusAdapter();
			}
			@Override
			public Adapter caseEpisodeOfCareStatusHistory(EpisodeOfCareStatusHistory object) {
				return createEpisodeOfCareStatusHistoryAdapter();
			}
			@Override
			public Adapter caseEventCapabilityMode(EventCapabilityMode object) {
				return createEventCapabilityModeAdapter();
			}
			@Override
			public Adapter caseEventTiming(EventTiming object) {
				return createEventTimingAdapter();
			}
			@Override
			public Adapter caseExpansionProfile(ExpansionProfile object) {
				return createExpansionProfileAdapter();
			}
			@Override
			public Adapter caseExpansionProfileDesignation(ExpansionProfileDesignation object) {
				return createExpansionProfileDesignationAdapter();
			}
			@Override
			public Adapter caseExpansionProfileDesignation1(ExpansionProfileDesignation1 object) {
				return createExpansionProfileDesignation1Adapter();
			}
			@Override
			public Adapter caseExpansionProfileDesignation2(ExpansionProfileDesignation2 object) {
				return createExpansionProfileDesignation2Adapter();
			}
			@Override
			public Adapter caseExpansionProfileExclude(ExpansionProfileExclude object) {
				return createExpansionProfileExcludeAdapter();
			}
			@Override
			public Adapter caseExpansionProfileExcludedSystem(ExpansionProfileExcludedSystem object) {
				return createExpansionProfileExcludedSystemAdapter();
			}
			@Override
			public Adapter caseExpansionProfileFixedVersion(ExpansionProfileFixedVersion object) {
				return createExpansionProfileFixedVersionAdapter();
			}
			@Override
			public Adapter caseExpansionProfileInclude(ExpansionProfileInclude object) {
				return createExpansionProfileIncludeAdapter();
			}
			@Override
			public Adapter caseExplanationOfBenefit(ExplanationOfBenefit object) {
				return createExplanationOfBenefitAdapter();
			}
			@Override
			public Adapter caseExplanationOfBenefitAccident(ExplanationOfBenefitAccident object) {
				return createExplanationOfBenefitAccidentAdapter();
			}
			@Override
			public Adapter caseExplanationOfBenefitAddItem(ExplanationOfBenefitAddItem object) {
				return createExplanationOfBenefitAddItemAdapter();
			}
			@Override
			public Adapter caseExplanationOfBenefitAdjudication(ExplanationOfBenefitAdjudication object) {
				return createExplanationOfBenefitAdjudicationAdapter();
			}
			@Override
			public Adapter caseExplanationOfBenefitBenefitBalance(ExplanationOfBenefitBenefitBalance object) {
				return createExplanationOfBenefitBenefitBalanceAdapter();
			}
			@Override
			public Adapter caseExplanationOfBenefitCareTeam(ExplanationOfBenefitCareTeam object) {
				return createExplanationOfBenefitCareTeamAdapter();
			}
			@Override
			public Adapter caseExplanationOfBenefitDetail(ExplanationOfBenefitDetail object) {
				return createExplanationOfBenefitDetailAdapter();
			}
			@Override
			public Adapter caseExplanationOfBenefitDetail1(ExplanationOfBenefitDetail1 object) {
				return createExplanationOfBenefitDetail1Adapter();
			}
			@Override
			public Adapter caseExplanationOfBenefitDiagnosis(ExplanationOfBenefitDiagnosis object) {
				return createExplanationOfBenefitDiagnosisAdapter();
			}
			@Override
			public Adapter caseExplanationOfBenefitFinancial(ExplanationOfBenefitFinancial object) {
				return createExplanationOfBenefitFinancialAdapter();
			}
			@Override
			public Adapter caseExplanationOfBenefitInformation(ExplanationOfBenefitInformation object) {
				return createExplanationOfBenefitInformationAdapter();
			}
			@Override
			public Adapter caseExplanationOfBenefitInsurance(ExplanationOfBenefitInsurance object) {
				return createExplanationOfBenefitInsuranceAdapter();
			}
			@Override
			public Adapter caseExplanationOfBenefitItem(ExplanationOfBenefitItem object) {
				return createExplanationOfBenefitItemAdapter();
			}
			@Override
			public Adapter caseExplanationOfBenefitNote(ExplanationOfBenefitNote object) {
				return createExplanationOfBenefitNoteAdapter();
			}
			@Override
			public Adapter caseExplanationOfBenefitPayee(ExplanationOfBenefitPayee object) {
				return createExplanationOfBenefitPayeeAdapter();
			}
			@Override
			public Adapter caseExplanationOfBenefitPayment(ExplanationOfBenefitPayment object) {
				return createExplanationOfBenefitPaymentAdapter();
			}
			@Override
			public Adapter caseExplanationOfBenefitProcedure(ExplanationOfBenefitProcedure object) {
				return createExplanationOfBenefitProcedureAdapter();
			}
			@Override
			public Adapter caseExplanationOfBenefitProsthesis(ExplanationOfBenefitProsthesis object) {
				return createExplanationOfBenefitProsthesisAdapter();
			}
			@Override
			public Adapter caseExplanationOfBenefitRelated(ExplanationOfBenefitRelated object) {
				return createExplanationOfBenefitRelatedAdapter();
			}
			@Override
			public Adapter caseExplanationOfBenefitStatus(ExplanationOfBenefitStatus object) {
				return createExplanationOfBenefitStatusAdapter();
			}
			@Override
			public Adapter caseExplanationOfBenefitSubDetail(ExplanationOfBenefitSubDetail object) {
				return createExplanationOfBenefitSubDetailAdapter();
			}
			@Override
			public Adapter caseExtension(Extension object) {
				return createExtensionAdapter();
			}
			@Override
			public Adapter caseExtensionContext(ExtensionContext object) {
				return createExtensionContextAdapter();
			}
			@Override
			public Adapter caseFamilyHistoryStatus(FamilyHistoryStatus object) {
				return createFamilyHistoryStatusAdapter();
			}
			@Override
			public Adapter caseFamilyMemberHistory(FamilyMemberHistory object) {
				return createFamilyMemberHistoryAdapter();
			}
			@Override
			public Adapter caseFamilyMemberHistoryCondition(FamilyMemberHistoryCondition object) {
				return createFamilyMemberHistoryConditionAdapter();
			}
			@Override
			public Adapter caseFilterOperator(FilterOperator object) {
				return createFilterOperatorAdapter();
			}
			@Override
			public Adapter caseFlag(Flag object) {
				return createFlagAdapter();
			}
			@Override
			public Adapter caseFlagStatus(FlagStatus object) {
				return createFlagStatusAdapter();
			}
			@Override
			public Adapter caseGoal(Goal object) {
				return createGoalAdapter();
			}
			@Override
			public Adapter caseGoalOutcome(GoalOutcome object) {
				return createGoalOutcomeAdapter();
			}
			@Override
			public Adapter caseGoalStatus(GoalStatus object) {
				return createGoalStatusAdapter();
			}
			@Override
			public Adapter caseGroup(Group object) {
				return createGroupAdapter();
			}
			@Override
			public Adapter caseGroupCharacteristic(GroupCharacteristic object) {
				return createGroupCharacteristicAdapter();
			}
			@Override
			public Adapter caseGroupMember(GroupMember object) {
				return createGroupMemberAdapter();
			}
			@Override
			public Adapter caseGroupType(GroupType object) {
				return createGroupTypeAdapter();
			}
			@Override
			public Adapter caseGuidanceResponse(GuidanceResponse object) {
				return createGuidanceResponseAdapter();
			}
			@Override
			public Adapter caseGuidanceResponseStatus(GuidanceResponseStatus object) {
				return createGuidanceResponseStatusAdapter();
			}
			@Override
			public Adapter caseGuideDependencyType(GuideDependencyType object) {
				return createGuideDependencyTypeAdapter();
			}
			@Override
			public Adapter caseGuidePageKind(GuidePageKind object) {
				return createGuidePageKindAdapter();
			}
			@Override
			public Adapter caseHealthcareService(HealthcareService object) {
				return createHealthcareServiceAdapter();
			}
			@Override
			public Adapter caseHealthcareServiceAvailableTime(HealthcareServiceAvailableTime object) {
				return createHealthcareServiceAvailableTimeAdapter();
			}
			@Override
			public Adapter caseHealthcareServiceNotAvailable(HealthcareServiceNotAvailable object) {
				return createHealthcareServiceNotAvailableAdapter();
			}
			@Override
			public Adapter caseHTTPVerb(HTTPVerb object) {
				return createHTTPVerbAdapter();
			}
			@Override
			public Adapter caseHumanName(HumanName object) {
				return createHumanNameAdapter();
			}
			@Override
			public Adapter caseId(Id object) {
				return createIdAdapter();
			}
			@Override
			public Adapter caseIdentifier(Identifier object) {
				return createIdentifierAdapter();
			}
			@Override
			public Adapter caseIdentifierUse(IdentifierUse object) {
				return createIdentifierUseAdapter();
			}
			@Override
			public Adapter caseIdentityAssuranceLevel(IdentityAssuranceLevel object) {
				return createIdentityAssuranceLevelAdapter();
			}
			@Override
			public Adapter caseImagingManifest(ImagingManifest object) {
				return createImagingManifestAdapter();
			}
			@Override
			public Adapter caseImagingManifestBaseLocation(ImagingManifestBaseLocation object) {
				return createImagingManifestBaseLocationAdapter();
			}
			@Override
			public Adapter caseImagingManifestBaseLocation1(ImagingManifestBaseLocation1 object) {
				return createImagingManifestBaseLocation1Adapter();
			}
			@Override
			public Adapter caseImagingManifestInstance(ImagingManifestInstance object) {
				return createImagingManifestInstanceAdapter();
			}
			@Override
			public Adapter caseImagingManifestSeries(ImagingManifestSeries object) {
				return createImagingManifestSeriesAdapter();
			}
			@Override
			public Adapter caseImagingManifestStudy(ImagingManifestStudy object) {
				return createImagingManifestStudyAdapter();
			}
			@Override
			public Adapter caseImagingStudy(ImagingStudy object) {
				return createImagingStudyAdapter();
			}
			@Override
			public Adapter caseImagingStudyBaseLocation(ImagingStudyBaseLocation object) {
				return createImagingStudyBaseLocationAdapter();
			}
			@Override
			public Adapter caseImagingStudyBaseLocation1(ImagingStudyBaseLocation1 object) {
				return createImagingStudyBaseLocation1Adapter();
			}
			@Override
			public Adapter caseImagingStudyInstance(ImagingStudyInstance object) {
				return createImagingStudyInstanceAdapter();
			}
			@Override
			public Adapter caseImagingStudySeries(ImagingStudySeries object) {
				return createImagingStudySeriesAdapter();
			}
			@Override
			public Adapter caseImmunization(Immunization object) {
				return createImmunizationAdapter();
			}
			@Override
			public Adapter caseImmunizationExplanation(ImmunizationExplanation object) {
				return createImmunizationExplanationAdapter();
			}
			@Override
			public Adapter caseImmunizationReaction(ImmunizationReaction object) {
				return createImmunizationReactionAdapter();
			}
			@Override
			public Adapter caseImmunizationRecommendation(ImmunizationRecommendation object) {
				return createImmunizationRecommendationAdapter();
			}
			@Override
			public Adapter caseImmunizationRecommendationDateCriterion(ImmunizationRecommendationDateCriterion object) {
				return createImmunizationRecommendationDateCriterionAdapter();
			}
			@Override
			public Adapter caseImmunizationRecommendationProtocol(ImmunizationRecommendationProtocol object) {
				return createImmunizationRecommendationProtocolAdapter();
			}
			@Override
			public Adapter caseImmunizationRecommendationRecommendation(ImmunizationRecommendationRecommendation object) {
				return createImmunizationRecommendationRecommendationAdapter();
			}
			@Override
			public Adapter caseImmunizationVaccinationProtocol(ImmunizationVaccinationProtocol object) {
				return createImmunizationVaccinationProtocolAdapter();
			}
			@Override
			public Adapter caseImplementationGuide(ImplementationGuide object) {
				return createImplementationGuideAdapter();
			}
			@Override
			public Adapter caseImplementationGuideDependency(ImplementationGuideDependency object) {
				return createImplementationGuideDependencyAdapter();
			}
			@Override
			public Adapter caseImplementationGuideGlobal(ImplementationGuideGlobal object) {
				return createImplementationGuideGlobalAdapter();
			}
			@Override
			public Adapter caseImplementationGuidePackage(ImplementationGuidePackage object) {
				return createImplementationGuidePackageAdapter();
			}
			@Override
			public Adapter caseImplementationGuidePage(ImplementationGuidePage object) {
				return createImplementationGuidePageAdapter();
			}
			@Override
			public Adapter caseImplementationGuideResource(ImplementationGuideResource object) {
				return createImplementationGuideResourceAdapter();
			}
			@Override
			public Adapter caseInstanceAvailability(InstanceAvailability object) {
				return createInstanceAvailabilityAdapter();
			}
			@Override
			public Adapter caseInstant(Instant object) {
				return createInstantAdapter();
			}
			@Override
			public Adapter caseInteger(org.hl7.fhir.Integer object) {
				return createIntegerAdapter();
			}
			@Override
			public Adapter caseIssueSeverity(IssueSeverity object) {
				return createIssueSeverityAdapter();
			}
			@Override
			public Adapter caseIssueType(IssueType object) {
				return createIssueTypeAdapter();
			}
			@Override
			public Adapter caseLibrary(Library object) {
				return createLibraryAdapter();
			}
			@Override
			public Adapter caseLinkage(Linkage object) {
				return createLinkageAdapter();
			}
			@Override
			public Adapter caseLinkageItem(LinkageItem object) {
				return createLinkageItemAdapter();
			}
			@Override
			public Adapter caseLinkageType(LinkageType object) {
				return createLinkageTypeAdapter();
			}
			@Override
			public Adapter caseLinkType(LinkType object) {
				return createLinkTypeAdapter();
			}
			@Override
			public Adapter caseList(List object) {
				return createListAdapter();
			}
			@Override
			public Adapter caseListEntry(ListEntry object) {
				return createListEntryAdapter();
			}
			@Override
			public Adapter caseListMode(ListMode object) {
				return createListModeAdapter();
			}
			@Override
			public Adapter caseListStatus(ListStatus object) {
				return createListStatusAdapter();
			}
			@Override
			public Adapter caseLocation(Location object) {
				return createLocationAdapter();
			}
			@Override
			public Adapter caseLocationMode(LocationMode object) {
				return createLocationModeAdapter();
			}
			@Override
			public Adapter caseLocationPosition(LocationPosition object) {
				return createLocationPositionAdapter();
			}
			@Override
			public Adapter caseLocationStatus(LocationStatus object) {
				return createLocationStatusAdapter();
			}
			@Override
			public Adapter caseMarkdown(Markdown object) {
				return createMarkdownAdapter();
			}
			@Override
			public Adapter caseMeasmntPrinciple(MeasmntPrinciple object) {
				return createMeasmntPrincipleAdapter();
			}
			@Override
			public Adapter caseMeasure(Measure object) {
				return createMeasureAdapter();
			}
			@Override
			public Adapter caseMeasureDataUsage(MeasureDataUsage object) {
				return createMeasureDataUsageAdapter();
			}
			@Override
			public Adapter caseMeasureGroup(MeasureGroup object) {
				return createMeasureGroupAdapter();
			}
			@Override
			public Adapter caseMeasurePopulation(MeasurePopulation object) {
				return createMeasurePopulationAdapter();
			}
			@Override
			public Adapter caseMeasurePopulationType(MeasurePopulationType object) {
				return createMeasurePopulationTypeAdapter();
			}
			@Override
			public Adapter caseMeasureReport(MeasureReport object) {
				return createMeasureReportAdapter();
			}
			@Override
			public Adapter caseMeasureReportGroup(MeasureReportGroup object) {
				return createMeasureReportGroupAdapter();
			}
			@Override
			public Adapter caseMeasureReportGroup1(MeasureReportGroup1 object) {
				return createMeasureReportGroup1Adapter();
			}
			@Override
			public Adapter caseMeasureReportGroup2(MeasureReportGroup2 object) {
				return createMeasureReportGroup2Adapter();
			}
			@Override
			public Adapter caseMeasureReportPopulation(MeasureReportPopulation object) {
				return createMeasureReportPopulationAdapter();
			}
			@Override
			public Adapter caseMeasureReportPopulation1(MeasureReportPopulation1 object) {
				return createMeasureReportPopulation1Adapter();
			}
			@Override
			public Adapter caseMeasureReportStatus(MeasureReportStatus object) {
				return createMeasureReportStatusAdapter();
			}
			@Override
			public Adapter caseMeasureReportStratifier(MeasureReportStratifier object) {
				return createMeasureReportStratifierAdapter();
			}
			@Override
			public Adapter caseMeasureReportSupplementalData(MeasureReportSupplementalData object) {
				return createMeasureReportSupplementalDataAdapter();
			}
			@Override
			public Adapter caseMeasureReportType(MeasureReportType object) {
				return createMeasureReportTypeAdapter();
			}
			@Override
			public Adapter caseMeasureScoring(MeasureScoring object) {
				return createMeasureScoringAdapter();
			}
			@Override
			public Adapter caseMeasureStratifier(MeasureStratifier object) {
				return createMeasureStratifierAdapter();
			}
			@Override
			public Adapter caseMeasureSupplementalData(MeasureSupplementalData object) {
				return createMeasureSupplementalDataAdapter();
			}
			@Override
			public Adapter caseMeasureType(MeasureType object) {
				return createMeasureTypeAdapter();
			}
			@Override
			public Adapter caseMedia(Media object) {
				return createMediaAdapter();
			}
			@Override
			public Adapter caseMedication(Medication object) {
				return createMedicationAdapter();
			}
			@Override
			public Adapter caseMedicationAdministration(MedicationAdministration object) {
				return createMedicationAdministrationAdapter();
			}
			@Override
			public Adapter caseMedicationAdministrationDosage(MedicationAdministrationDosage object) {
				return createMedicationAdministrationDosageAdapter();
			}
			@Override
			public Adapter caseMedicationAdministrationStatus(MedicationAdministrationStatus object) {
				return createMedicationAdministrationStatusAdapter();
			}
			@Override
			public Adapter caseMedicationBatch(MedicationBatch object) {
				return createMedicationBatchAdapter();
			}
			@Override
			public Adapter caseMedicationContent(MedicationContent object) {
				return createMedicationContentAdapter();
			}
			@Override
			public Adapter caseMedicationDispense(MedicationDispense object) {
				return createMedicationDispenseAdapter();
			}
			@Override
			public Adapter caseMedicationDispenseStatus(MedicationDispenseStatus object) {
				return createMedicationDispenseStatusAdapter();
			}
			@Override
			public Adapter caseMedicationDispenseSubstitution(MedicationDispenseSubstitution object) {
				return createMedicationDispenseSubstitutionAdapter();
			}
			@Override
			public Adapter caseMedicationIngredient(MedicationIngredient object) {
				return createMedicationIngredientAdapter();
			}
			@Override
			public Adapter caseMedicationPackage(MedicationPackage object) {
				return createMedicationPackageAdapter();
			}
			@Override
			public Adapter caseMedicationProduct(MedicationProduct object) {
				return createMedicationProductAdapter();
			}
			@Override
			public Adapter caseMedicationRequest(MedicationRequest object) {
				return createMedicationRequestAdapter();
			}
			@Override
			public Adapter caseMedicationRequestDispenseRequest(MedicationRequestDispenseRequest object) {
				return createMedicationRequestDispenseRequestAdapter();
			}
			@Override
			public Adapter caseMedicationRequestStatus(MedicationRequestStatus object) {
				return createMedicationRequestStatusAdapter();
			}
			@Override
			public Adapter caseMedicationRequestSubstitution(MedicationRequestSubstitution object) {
				return createMedicationRequestSubstitutionAdapter();
			}
			@Override
			public Adapter caseMedicationStatement(MedicationStatement object) {
				return createMedicationStatementAdapter();
			}
			@Override
			public Adapter caseMedicationStatementCategory(MedicationStatementCategory object) {
				return createMedicationStatementCategoryAdapter();
			}
			@Override
			public Adapter caseMedicationStatementNotTaken(MedicationStatementNotTaken object) {
				return createMedicationStatementNotTakenAdapter();
			}
			@Override
			public Adapter caseMedicationStatementStatus(MedicationStatementStatus object) {
				return createMedicationStatementStatusAdapter();
			}
			@Override
			public Adapter caseMessageDefinition(MessageDefinition object) {
				return createMessageDefinitionAdapter();
			}
			@Override
			public Adapter caseMessageDefinitionAllowedResponse(MessageDefinitionAllowedResponse object) {
				return createMessageDefinitionAllowedResponseAdapter();
			}
			@Override
			public Adapter caseMessageDefinitionFocus(MessageDefinitionFocus object) {
				return createMessageDefinitionFocusAdapter();
			}
			@Override
			public Adapter caseMessageHeader(MessageHeader object) {
				return createMessageHeaderAdapter();
			}
			@Override
			public Adapter caseMessageHeaderDestination(MessageHeaderDestination object) {
				return createMessageHeaderDestinationAdapter();
			}
			@Override
			public Adapter caseMessageHeaderResponse(MessageHeaderResponse object) {
				return createMessageHeaderResponseAdapter();
			}
			@Override
			public Adapter caseMessageHeaderSource(MessageHeaderSource object) {
				return createMessageHeaderSourceAdapter();
			}
			@Override
			public Adapter caseMessageSignificanceCategory(MessageSignificanceCategory object) {
				return createMessageSignificanceCategoryAdapter();
			}
			@Override
			public Adapter caseMeta(Meta object) {
				return createMetaAdapter();
			}
			@Override
			public Adapter caseMoney(Money object) {
				return createMoneyAdapter();
			}
			@Override
			public Adapter caseNameUse(NameUse object) {
				return createNameUseAdapter();
			}
			@Override
			public Adapter caseNamingSystem(NamingSystem object) {
				return createNamingSystemAdapter();
			}
			@Override
			public Adapter caseNamingSystemIdentifierType(NamingSystemIdentifierType object) {
				return createNamingSystemIdentifierTypeAdapter();
			}
			@Override
			public Adapter caseNamingSystemType(NamingSystemType object) {
				return createNamingSystemTypeAdapter();
			}
			@Override
			public Adapter caseNamingSystemUniqueId(NamingSystemUniqueId object) {
				return createNamingSystemUniqueIdAdapter();
			}
			@Override
			public Adapter caseNarrative(Narrative object) {
				return createNarrativeAdapter();
			}
			@Override
			public Adapter caseNarrativeStatus(NarrativeStatus object) {
				return createNarrativeStatusAdapter();
			}
			@Override
			public Adapter caseNoteType(NoteType object) {
				return createNoteTypeAdapter();
			}
			@Override
			public Adapter caseNutritionOrderStatus(NutritionOrderStatus object) {
				return createNutritionOrderStatusAdapter();
			}
			@Override
			public Adapter caseNutritionRequest(NutritionRequest object) {
				return createNutritionRequestAdapter();
			}
			@Override
			public Adapter caseNutritionRequestAdministration(NutritionRequestAdministration object) {
				return createNutritionRequestAdministrationAdapter();
			}
			@Override
			public Adapter caseNutritionRequestEnteralFormula(NutritionRequestEnteralFormula object) {
				return createNutritionRequestEnteralFormulaAdapter();
			}
			@Override
			public Adapter caseNutritionRequestNutrient(NutritionRequestNutrient object) {
				return createNutritionRequestNutrientAdapter();
			}
			@Override
			public Adapter caseNutritionRequestOralDiet(NutritionRequestOralDiet object) {
				return createNutritionRequestOralDietAdapter();
			}
			@Override
			public Adapter caseNutritionRequestSupplement(NutritionRequestSupplement object) {
				return createNutritionRequestSupplementAdapter();
			}
			@Override
			public Adapter caseNutritionRequestTexture(NutritionRequestTexture object) {
				return createNutritionRequestTextureAdapter();
			}
			@Override
			public Adapter caseObservation(Observation object) {
				return createObservationAdapter();
			}
			@Override
			public Adapter caseObservationComponent(ObservationComponent object) {
				return createObservationComponentAdapter();
			}
			@Override
			public Adapter caseObservationReferenceRange(ObservationReferenceRange object) {
				return createObservationReferenceRangeAdapter();
			}
			@Override
			public Adapter caseObservationRelated(ObservationRelated object) {
				return createObservationRelatedAdapter();
			}
			@Override
			public Adapter caseObservationRelationshipType(ObservationRelationshipType object) {
				return createObservationRelationshipTypeAdapter();
			}
			@Override
			public Adapter caseObservationStatus(ObservationStatus object) {
				return createObservationStatusAdapter();
			}
			@Override
			public Adapter caseOid(Oid object) {
				return createOidAdapter();
			}
			@Override
			public Adapter caseOperationDefinition(OperationDefinition object) {
				return createOperationDefinitionAdapter();
			}
			@Override
			public Adapter caseOperationDefinitionBinding(OperationDefinitionBinding object) {
				return createOperationDefinitionBindingAdapter();
			}
			@Override
			public Adapter caseOperationDefinitionOverload(OperationDefinitionOverload object) {
				return createOperationDefinitionOverloadAdapter();
			}
			@Override
			public Adapter caseOperationDefinitionParameter(OperationDefinitionParameter object) {
				return createOperationDefinitionParameterAdapter();
			}
			@Override
			public Adapter caseOperationKind(OperationKind object) {
				return createOperationKindAdapter();
			}
			@Override
			public Adapter caseOperationOutcome(OperationOutcome object) {
				return createOperationOutcomeAdapter();
			}
			@Override
			public Adapter caseOperationOutcomeIssue(OperationOutcomeIssue object) {
				return createOperationOutcomeIssueAdapter();
			}
			@Override
			public Adapter caseOperationParameterUse(OperationParameterUse object) {
				return createOperationParameterUseAdapter();
			}
			@Override
			public Adapter caseOrganization(Organization object) {
				return createOrganizationAdapter();
			}
			@Override
			public Adapter caseOrganizationContact(OrganizationContact object) {
				return createOrganizationContactAdapter();
			}
			@Override
			public Adapter caseParameterDefinition(ParameterDefinition object) {
				return createParameterDefinitionAdapter();
			}
			@Override
			public Adapter caseParameters(Parameters object) {
				return createParametersAdapter();
			}
			@Override
			public Adapter caseParametersParameter(ParametersParameter object) {
				return createParametersParameterAdapter();
			}
			@Override
			public Adapter caseParticipantRequired(ParticipantRequired object) {
				return createParticipantRequiredAdapter();
			}
			@Override
			public Adapter caseParticipationStatus(ParticipationStatus object) {
				return createParticipationStatusAdapter();
			}
			@Override
			public Adapter casePatient(Patient object) {
				return createPatientAdapter();
			}
			@Override
			public Adapter casePatientAnimal(PatientAnimal object) {
				return createPatientAnimalAdapter();
			}
			@Override
			public Adapter casePatientCommunication(PatientCommunication object) {
				return createPatientCommunicationAdapter();
			}
			@Override
			public Adapter casePatientContact(PatientContact object) {
				return createPatientContactAdapter();
			}
			@Override
			public Adapter casePatientLink(PatientLink object) {
				return createPatientLinkAdapter();
			}
			@Override
			public Adapter casePaymentNotice(PaymentNotice object) {
				return createPaymentNoticeAdapter();
			}
			@Override
			public Adapter casePaymentReconciliation(PaymentReconciliation object) {
				return createPaymentReconciliationAdapter();
			}
			@Override
			public Adapter casePaymentReconciliationDetail(PaymentReconciliationDetail object) {
				return createPaymentReconciliationDetailAdapter();
			}
			@Override
			public Adapter casePaymentReconciliationNote(PaymentReconciliationNote object) {
				return createPaymentReconciliationNoteAdapter();
			}
			@Override
			public Adapter casePeriod(Period object) {
				return createPeriodAdapter();
			}
			@Override
			public Adapter casePerson(Person object) {
				return createPersonAdapter();
			}
			@Override
			public Adapter casePersonLink(PersonLink object) {
				return createPersonLinkAdapter();
			}
			@Override
			public Adapter casePlanActionCardinalityBehavior(PlanActionCardinalityBehavior object) {
				return createPlanActionCardinalityBehaviorAdapter();
			}
			@Override
			public Adapter casePlanActionConditionKind(PlanActionConditionKind object) {
				return createPlanActionConditionKindAdapter();
			}
			@Override
			public Adapter casePlanActionGroupingBehavior(PlanActionGroupingBehavior object) {
				return createPlanActionGroupingBehaviorAdapter();
			}
			@Override
			public Adapter casePlanActionParticipantType(PlanActionParticipantType object) {
				return createPlanActionParticipantTypeAdapter();
			}
			@Override
			public Adapter casePlanActionPrecheckBehavior(PlanActionPrecheckBehavior object) {
				return createPlanActionPrecheckBehaviorAdapter();
			}
			@Override
			public Adapter casePlanActionRelationshipType(PlanActionRelationshipType object) {
				return createPlanActionRelationshipTypeAdapter();
			}
			@Override
			public Adapter casePlanActionRequiredBehavior(PlanActionRequiredBehavior object) {
				return createPlanActionRequiredBehaviorAdapter();
			}
			@Override
			public Adapter casePlanActionSelectionBehavior(PlanActionSelectionBehavior object) {
				return createPlanActionSelectionBehaviorAdapter();
			}
			@Override
			public Adapter casePlanDefinition(PlanDefinition object) {
				return createPlanDefinitionAdapter();
			}
			@Override
			public Adapter casePlanDefinitionActionDefinition(PlanDefinitionActionDefinition object) {
				return createPlanDefinitionActionDefinitionAdapter();
			}
			@Override
			public Adapter casePlanDefinitionCondition(PlanDefinitionCondition object) {
				return createPlanDefinitionConditionAdapter();
			}
			@Override
			public Adapter casePlanDefinitionDynamicValue(PlanDefinitionDynamicValue object) {
				return createPlanDefinitionDynamicValueAdapter();
			}
			@Override
			public Adapter casePlanDefinitionRelatedAction(PlanDefinitionRelatedAction object) {
				return createPlanDefinitionRelatedActionAdapter();
			}
			@Override
			public Adapter casePositiveInt(PositiveInt object) {
				return createPositiveIntAdapter();
			}
			@Override
			public Adapter casePractitioner(Practitioner object) {
				return createPractitionerAdapter();
			}
			@Override
			public Adapter casePractitionerQualification(PractitionerQualification object) {
				return createPractitionerQualificationAdapter();
			}
			@Override
			public Adapter casePractitionerRole(PractitionerRole object) {
				return createPractitionerRoleAdapter();
			}
			@Override
			public Adapter casePractitionerRole1(PractitionerRole1 object) {
				return createPractitionerRole1Adapter();
			}
			@Override
			public Adapter casePractitionerRoleAvailableTime(PractitionerRoleAvailableTime object) {
				return createPractitionerRoleAvailableTimeAdapter();
			}
			@Override
			public Adapter casePractitionerRoleNotAvailable(PractitionerRoleNotAvailable object) {
				return createPractitionerRoleNotAvailableAdapter();
			}
			@Override
			public Adapter caseProcedure(Procedure object) {
				return createProcedureAdapter();
			}
			@Override
			public Adapter caseProcedureFocalDevice(ProcedureFocalDevice object) {
				return createProcedureFocalDeviceAdapter();
			}
			@Override
			public Adapter caseProcedurePerformer(ProcedurePerformer object) {
				return createProcedurePerformerAdapter();
			}
			@Override
			public Adapter caseProcedureRequest(ProcedureRequest object) {
				return createProcedureRequestAdapter();
			}
			@Override
			public Adapter caseProcedureRequestPriority(ProcedureRequestPriority object) {
				return createProcedureRequestPriorityAdapter();
			}
			@Override
			public Adapter caseProcedureRequestStatus(ProcedureRequestStatus object) {
				return createProcedureRequestStatusAdapter();
			}
			@Override
			public Adapter caseProcedureStatus(ProcedureStatus object) {
				return createProcedureStatusAdapter();
			}
			@Override
			public Adapter caseProcessRequest(ProcessRequest object) {
				return createProcessRequestAdapter();
			}
			@Override
			public Adapter caseProcessRequestItem(ProcessRequestItem object) {
				return createProcessRequestItemAdapter();
			}
			@Override
			public Adapter caseProcessResponse(ProcessResponse object) {
				return createProcessResponseAdapter();
			}
			@Override
			public Adapter caseProcessResponseNote(ProcessResponseNote object) {
				return createProcessResponseNoteAdapter();
			}
			@Override
			public Adapter casePropertyRepresentation(PropertyRepresentation object) {
				return createPropertyRepresentationAdapter();
			}
			@Override
			public Adapter casePropertyType(PropertyType object) {
				return createPropertyTypeAdapter();
			}
			@Override
			public Adapter caseProvenance(Provenance object) {
				return createProvenanceAdapter();
			}
			@Override
			public Adapter caseProvenanceAgent(ProvenanceAgent object) {
				return createProvenanceAgentAdapter();
			}
			@Override
			public Adapter caseProvenanceEntity(ProvenanceEntity object) {
				return createProvenanceEntityAdapter();
			}
			@Override
			public Adapter caseProvenanceEntityRole(ProvenanceEntityRole object) {
				return createProvenanceEntityRoleAdapter();
			}
			@Override
			public Adapter casePublicationStatus(PublicationStatus object) {
				return createPublicationStatusAdapter();
			}
			@Override
			public Adapter caseQualityType(QualityType object) {
				return createQualityTypeAdapter();
			}
			@Override
			public Adapter caseQuantity(Quantity object) {
				return createQuantityAdapter();
			}
			@Override
			public Adapter caseQuantityComparator(QuantityComparator object) {
				return createQuantityComparatorAdapter();
			}
			@Override
			public Adapter caseQuestionnaire(Questionnaire object) {
				return createQuestionnaireAdapter();
			}
			@Override
			public Adapter caseQuestionnaireEnableWhen(QuestionnaireEnableWhen object) {
				return createQuestionnaireEnableWhenAdapter();
			}
			@Override
			public Adapter caseQuestionnaireItem(QuestionnaireItem object) {
				return createQuestionnaireItemAdapter();
			}
			@Override
			public Adapter caseQuestionnaireItemType(QuestionnaireItemType object) {
				return createQuestionnaireItemTypeAdapter();
			}
			@Override
			public Adapter caseQuestionnaireOption(QuestionnaireOption object) {
				return createQuestionnaireOptionAdapter();
			}
			@Override
			public Adapter caseQuestionnaireResponse(QuestionnaireResponse object) {
				return createQuestionnaireResponseAdapter();
			}
			@Override
			public Adapter caseQuestionnaireResponseAnswer(QuestionnaireResponseAnswer object) {
				return createQuestionnaireResponseAnswerAdapter();
			}
			@Override
			public Adapter caseQuestionnaireResponseItem(QuestionnaireResponseItem object) {
				return createQuestionnaireResponseItemAdapter();
			}
			@Override
			public Adapter caseQuestionnaireResponseStatus(QuestionnaireResponseStatus object) {
				return createQuestionnaireResponseStatusAdapter();
			}
			@Override
			public Adapter caseQuestionnaireStatus(QuestionnaireStatus object) {
				return createQuestionnaireStatusAdapter();
			}
			@Override
			public Adapter caseRange(Range object) {
				return createRangeAdapter();
			}
			@Override
			public Adapter caseRatio(Ratio object) {
				return createRatioAdapter();
			}
			@Override
			public Adapter caseReference(Reference object) {
				return createReferenceAdapter();
			}
			@Override
			public Adapter caseReferenceHandlingPolicy(ReferenceHandlingPolicy object) {
				return createReferenceHandlingPolicyAdapter();
			}
			@Override
			public Adapter caseReferenceVersionRules(ReferenceVersionRules object) {
				return createReferenceVersionRulesAdapter();
			}
			@Override
			public Adapter caseReferralCategory(ReferralCategory object) {
				return createReferralCategoryAdapter();
			}
			@Override
			public Adapter caseReferralRequest(ReferralRequest object) {
				return createReferralRequestAdapter();
			}
			@Override
			public Adapter caseReferralStatus(ReferralStatus object) {
				return createReferralStatusAdapter();
			}
			@Override
			public Adapter caseRelatedArtifact(RelatedArtifact object) {
				return createRelatedArtifactAdapter();
			}
			@Override
			public Adapter caseRelatedArtifactType(RelatedArtifactType object) {
				return createRelatedArtifactTypeAdapter();
			}
			@Override
			public Adapter caseRelatedPerson(RelatedPerson object) {
				return createRelatedPersonAdapter();
			}
			@Override
			public Adapter caseRemittanceOutcome(RemittanceOutcome object) {
				return createRemittanceOutcomeAdapter();
			}
			@Override
			public Adapter caseRepositoryType(RepositoryType object) {
				return createRepositoryTypeAdapter();
			}
			@Override
			public Adapter caseRequestGroup(RequestGroup object) {
				return createRequestGroupAdapter();
			}
			@Override
			public Adapter caseRequestGroupAction(RequestGroupAction object) {
				return createRequestGroupActionAdapter();
			}
			@Override
			public Adapter caseRequestGroupCondition(RequestGroupCondition object) {
				return createRequestGroupConditionAdapter();
			}
			@Override
			public Adapter caseRequestGroupRelatedAction(RequestGroupRelatedAction object) {
				return createRequestGroupRelatedActionAdapter();
			}
			@Override
			public Adapter caseResearchStudy(ResearchStudy object) {
				return createResearchStudyAdapter();
			}
			@Override
			public Adapter caseResearchStudyArm(ResearchStudyArm object) {
				return createResearchStudyArmAdapter();
			}
			@Override
			public Adapter caseResearchStudyStatus(ResearchStudyStatus object) {
				return createResearchStudyStatusAdapter();
			}
			@Override
			public Adapter caseResearchSubject(ResearchSubject object) {
				return createResearchSubjectAdapter();
			}
			@Override
			public Adapter caseResearchSubjectStatus(ResearchSubjectStatus object) {
				return createResearchSubjectStatusAdapter();
			}
			@Override
			public Adapter caseResource(Resource object) {
				return createResourceAdapter();
			}
			@Override
			public Adapter caseResourceContainer(ResourceContainer object) {
				return createResourceContainerAdapter();
			}
			@Override
			public Adapter caseResourceVersionPolicy(ResourceVersionPolicy object) {
				return createResourceVersionPolicyAdapter();
			}
			@Override
			public Adapter caseResponseType(ResponseType object) {
				return createResponseTypeAdapter();
			}
			@Override
			public Adapter caseRestfulCapabilityMode(RestfulCapabilityMode object) {
				return createRestfulCapabilityModeAdapter();
			}
			@Override
			public Adapter caseRiskAssessment(RiskAssessment object) {
				return createRiskAssessmentAdapter();
			}
			@Override
			public Adapter caseRiskAssessmentPrediction(RiskAssessmentPrediction object) {
				return createRiskAssessmentPredictionAdapter();
			}
			@Override
			public Adapter caseSampledData(SampledData object) {
				return createSampledDataAdapter();
			}
			@Override
			public Adapter caseSampledDataDataType(SampledDataDataType object) {
				return createSampledDataDataTypeAdapter();
			}
			@Override
			public Adapter caseSchedule(Schedule object) {
				return createScheduleAdapter();
			}
			@Override
			public Adapter caseSearchComparator(SearchComparator object) {
				return createSearchComparatorAdapter();
			}
			@Override
			public Adapter caseSearchEntryMode(SearchEntryMode object) {
				return createSearchEntryModeAdapter();
			}
			@Override
			public Adapter caseSearchModifierCode(SearchModifierCode object) {
				return createSearchModifierCodeAdapter();
			}
			@Override
			public Adapter caseSearchParameter(SearchParameter object) {
				return createSearchParameterAdapter();
			}
			@Override
			public Adapter caseSearchParameterComponent(SearchParameterComponent object) {
				return createSearchParameterComponentAdapter();
			}
			@Override
			public Adapter caseSearchParamType(SearchParamType object) {
				return createSearchParamTypeAdapter();
			}
			@Override
			public Adapter caseSequence(Sequence object) {
				return createSequenceAdapter();
			}
			@Override
			public Adapter caseSequenceInner(SequenceInner object) {
				return createSequenceInnerAdapter();
			}
			@Override
			public Adapter caseSequenceOuter(SequenceOuter object) {
				return createSequenceOuterAdapter();
			}
			@Override
			public Adapter caseSequenceQuality(SequenceQuality object) {
				return createSequenceQualityAdapter();
			}
			@Override
			public Adapter caseSequenceReferenceSeq(SequenceReferenceSeq object) {
				return createSequenceReferenceSeqAdapter();
			}
			@Override
			public Adapter caseSequenceRepository(SequenceRepository object) {
				return createSequenceRepositoryAdapter();
			}
			@Override
			public Adapter caseSequenceStructureVariant(SequenceStructureVariant object) {
				return createSequenceStructureVariantAdapter();
			}
			@Override
			public Adapter caseSequenceType(SequenceType object) {
				return createSequenceTypeAdapter();
			}
			@Override
			public Adapter caseSequenceVariant(SequenceVariant object) {
				return createSequenceVariantAdapter();
			}
			@Override
			public Adapter caseServiceDefinition(ServiceDefinition object) {
				return createServiceDefinitionAdapter();
			}
			@Override
			public Adapter caseSignature(Signature object) {
				return createSignatureAdapter();
			}
			@Override
			public Adapter caseSlicingRules(SlicingRules object) {
				return createSlicingRulesAdapter();
			}
			@Override
			public Adapter caseSlot(Slot object) {
				return createSlotAdapter();
			}
			@Override
			public Adapter caseSlotStatus(SlotStatus object) {
				return createSlotStatusAdapter();
			}
			@Override
			public Adapter caseSpecimen(Specimen object) {
				return createSpecimenAdapter();
			}
			@Override
			public Adapter caseSpecimenCollection(SpecimenCollection object) {
				return createSpecimenCollectionAdapter();
			}
			@Override
			public Adapter caseSpecimenContainer(SpecimenContainer object) {
				return createSpecimenContainerAdapter();
			}
			@Override
			public Adapter caseSpecimenStatus(SpecimenStatus object) {
				return createSpecimenStatusAdapter();
			}
			@Override
			public Adapter caseSpecimenTreatment(SpecimenTreatment object) {
				return createSpecimenTreatmentAdapter();
			}
			@Override
			public Adapter caseString(org.hl7.fhir.String object) {
				return createStringAdapter();
			}
			@Override
			public Adapter caseStructureDefinition(StructureDefinition object) {
				return createStructureDefinitionAdapter();
			}
			@Override
			public Adapter caseStructureDefinitionDifferential(StructureDefinitionDifferential object) {
				return createStructureDefinitionDifferentialAdapter();
			}
			@Override
			public Adapter caseStructureDefinitionKind(StructureDefinitionKind object) {
				return createStructureDefinitionKindAdapter();
			}
			@Override
			public Adapter caseStructureDefinitionMapping(StructureDefinitionMapping object) {
				return createStructureDefinitionMappingAdapter();
			}
			@Override
			public Adapter caseStructureDefinitionSnapshot(StructureDefinitionSnapshot object) {
				return createStructureDefinitionSnapshotAdapter();
			}
			@Override
			public Adapter caseStructureMap(StructureMap object) {
				return createStructureMapAdapter();
			}
			@Override
			public Adapter caseStructureMapContextType(StructureMapContextType object) {
				return createStructureMapContextTypeAdapter();
			}
			@Override
			public Adapter caseStructureMapDependent(StructureMapDependent object) {
				return createStructureMapDependentAdapter();
			}
			@Override
			public Adapter caseStructureMapGroup(StructureMapGroup object) {
				return createStructureMapGroupAdapter();
			}
			@Override
			public Adapter caseStructureMapInput(StructureMapInput object) {
				return createStructureMapInputAdapter();
			}
			@Override
			public Adapter caseStructureMapInputMode(StructureMapInputMode object) {
				return createStructureMapInputModeAdapter();
			}
			@Override
			public Adapter caseStructureMapListMode(StructureMapListMode object) {
				return createStructureMapListModeAdapter();
			}
			@Override
			public Adapter caseStructureMapModelMode(StructureMapModelMode object) {
				return createStructureMapModelModeAdapter();
			}
			@Override
			public Adapter caseStructureMapParameter(StructureMapParameter object) {
				return createStructureMapParameterAdapter();
			}
			@Override
			public Adapter caseStructureMapRule(StructureMapRule object) {
				return createStructureMapRuleAdapter();
			}
			@Override
			public Adapter caseStructureMapSource(StructureMapSource object) {
				return createStructureMapSourceAdapter();
			}
			@Override
			public Adapter caseStructureMapStructure(StructureMapStructure object) {
				return createStructureMapStructureAdapter();
			}
			@Override
			public Adapter caseStructureMapTarget(StructureMapTarget object) {
				return createStructureMapTargetAdapter();
			}
			@Override
			public Adapter caseStructureMapTransform(StructureMapTransform object) {
				return createStructureMapTransformAdapter();
			}
			@Override
			public Adapter caseSubscription(Subscription object) {
				return createSubscriptionAdapter();
			}
			@Override
			public Adapter caseSubscriptionChannel(SubscriptionChannel object) {
				return createSubscriptionChannelAdapter();
			}
			@Override
			public Adapter caseSubscriptionChannelType(SubscriptionChannelType object) {
				return createSubscriptionChannelTypeAdapter();
			}
			@Override
			public Adapter caseSubscriptionStatus(SubscriptionStatus object) {
				return createSubscriptionStatusAdapter();
			}
			@Override
			public Adapter caseSubstance(Substance object) {
				return createSubstanceAdapter();
			}
			@Override
			public Adapter caseSubstanceIngredient(SubstanceIngredient object) {
				return createSubstanceIngredientAdapter();
			}
			@Override
			public Adapter caseSubstanceInstance(SubstanceInstance object) {
				return createSubstanceInstanceAdapter();
			}
			@Override
			public Adapter caseSupplyDelivery(SupplyDelivery object) {
				return createSupplyDeliveryAdapter();
			}
			@Override
			public Adapter caseSupplyDeliveryStatus(SupplyDeliveryStatus object) {
				return createSupplyDeliveryStatusAdapter();
			}
			@Override
			public Adapter caseSupplyRequest(SupplyRequest object) {
				return createSupplyRequestAdapter();
			}
			@Override
			public Adapter caseSupplyRequestStatus(SupplyRequestStatus object) {
				return createSupplyRequestStatusAdapter();
			}
			@Override
			public Adapter caseSupplyRequestWhen(SupplyRequestWhen object) {
				return createSupplyRequestWhenAdapter();
			}
			@Override
			public Adapter caseSystemRestfulInteraction(SystemRestfulInteraction object) {
				return createSystemRestfulInteractionAdapter();
			}
			@Override
			public Adapter caseSystemVersionProcessingMode(SystemVersionProcessingMode object) {
				return createSystemVersionProcessingModeAdapter();
			}
			@Override
			public Adapter caseTask(Task object) {
				return createTaskAdapter();
			}
			@Override
			public Adapter caseTaskInput(TaskInput object) {
				return createTaskInputAdapter();
			}
			@Override
			public Adapter caseTaskOutput(TaskOutput object) {
				return createTaskOutputAdapter();
			}
			@Override
			public Adapter caseTaskRequester(TaskRequester object) {
				return createTaskRequesterAdapter();
			}
			@Override
			public Adapter caseTaskRestriction(TaskRestriction object) {
				return createTaskRestrictionAdapter();
			}
			@Override
			public Adapter caseTaskStatus(TaskStatus object) {
				return createTaskStatusAdapter();
			}
			@Override
			public Adapter caseTestReport(TestReport object) {
				return createTestReportAdapter();
			}
			@Override
			public Adapter caseTestReportAction(TestReportAction object) {
				return createTestReportActionAdapter();
			}
			@Override
			public Adapter caseTestReportAction1(TestReportAction1 object) {
				return createTestReportAction1Adapter();
			}
			@Override
			public Adapter caseTestReportAction2(TestReportAction2 object) {
				return createTestReportAction2Adapter();
			}
			@Override
			public Adapter caseTestReportAssert(TestReportAssert object) {
				return createTestReportAssertAdapter();
			}
			@Override
			public Adapter caseTestReportOperation(TestReportOperation object) {
				return createTestReportOperationAdapter();
			}
			@Override
			public Adapter caseTestReportParticipant(TestReportParticipant object) {
				return createTestReportParticipantAdapter();
			}
			@Override
			public Adapter caseTestReportParticipantType(TestReportParticipantType object) {
				return createTestReportParticipantTypeAdapter();
			}
			@Override
			public Adapter caseTestReportResultCodes(TestReportResultCodes object) {
				return createTestReportResultCodesAdapter();
			}
			@Override
			public Adapter caseTestReportSetup(TestReportSetup object) {
				return createTestReportSetupAdapter();
			}
			@Override
			public Adapter caseTestReportStatus(TestReportStatus object) {
				return createTestReportStatusAdapter();
			}
			@Override
			public Adapter caseTestReportTeardown(TestReportTeardown object) {
				return createTestReportTeardownAdapter();
			}
			@Override
			public Adapter caseTestReportTest(TestReportTest object) {
				return createTestReportTestAdapter();
			}
			@Override
			public Adapter caseTestScript(TestScript object) {
				return createTestScriptAdapter();
			}
			@Override
			public Adapter caseTestScriptAction(TestScriptAction object) {
				return createTestScriptActionAdapter();
			}
			@Override
			public Adapter caseTestScriptAction1(TestScriptAction1 object) {
				return createTestScriptAction1Adapter();
			}
			@Override
			public Adapter caseTestScriptAction2(TestScriptAction2 object) {
				return createTestScriptAction2Adapter();
			}
			@Override
			public Adapter caseTestScriptAssert(TestScriptAssert object) {
				return createTestScriptAssertAdapter();
			}
			@Override
			public Adapter caseTestScriptCapability(TestScriptCapability object) {
				return createTestScriptCapabilityAdapter();
			}
			@Override
			public Adapter caseTestScriptDestination(TestScriptDestination object) {
				return createTestScriptDestinationAdapter();
			}
			@Override
			public Adapter caseTestScriptFixture(TestScriptFixture object) {
				return createTestScriptFixtureAdapter();
			}
			@Override
			public Adapter caseTestScriptLink(TestScriptLink object) {
				return createTestScriptLinkAdapter();
			}
			@Override
			public Adapter caseTestScriptMetadata(TestScriptMetadata object) {
				return createTestScriptMetadataAdapter();
			}
			@Override
			public Adapter caseTestScriptOperation(TestScriptOperation object) {
				return createTestScriptOperationAdapter();
			}
			@Override
			public Adapter caseTestScriptOrigin(TestScriptOrigin object) {
				return createTestScriptOriginAdapter();
			}
			@Override
			public Adapter caseTestScriptParam(TestScriptParam object) {
				return createTestScriptParamAdapter();
			}
			@Override
			public Adapter caseTestScriptParam1(TestScriptParam1 object) {
				return createTestScriptParam1Adapter();
			}
			@Override
			public Adapter caseTestScriptParam2(TestScriptParam2 object) {
				return createTestScriptParam2Adapter();
			}
			@Override
			public Adapter caseTestScriptParam3(TestScriptParam3 object) {
				return createTestScriptParam3Adapter();
			}
			@Override
			public Adapter caseTestScriptRequestHeader(TestScriptRequestHeader object) {
				return createTestScriptRequestHeaderAdapter();
			}
			@Override
			public Adapter caseTestScriptRule(TestScriptRule object) {
				return createTestScriptRuleAdapter();
			}
			@Override
			public Adapter caseTestScriptRule1(TestScriptRule1 object) {
				return createTestScriptRule1Adapter();
			}
			@Override
			public Adapter caseTestScriptRule2(TestScriptRule2 object) {
				return createTestScriptRule2Adapter();
			}
			@Override
			public Adapter caseTestScriptRule3(TestScriptRule3 object) {
				return createTestScriptRule3Adapter();
			}
			@Override
			public Adapter caseTestScriptRuleset(TestScriptRuleset object) {
				return createTestScriptRulesetAdapter();
			}
			@Override
			public Adapter caseTestScriptRuleset1(TestScriptRuleset1 object) {
				return createTestScriptRuleset1Adapter();
			}
			@Override
			public Adapter caseTestScriptSetup(TestScriptSetup object) {
				return createTestScriptSetupAdapter();
			}
			@Override
			public Adapter caseTestScriptTeardown(TestScriptTeardown object) {
				return createTestScriptTeardownAdapter();
			}
			@Override
			public Adapter caseTestScriptTest(TestScriptTest object) {
				return createTestScriptTestAdapter();
			}
			@Override
			public Adapter caseTestScriptVariable(TestScriptVariable object) {
				return createTestScriptVariableAdapter();
			}
			@Override
			public Adapter caseTime(Time object) {
				return createTimeAdapter();
			}
			@Override
			public Adapter caseTiming(Timing object) {
				return createTimingAdapter();
			}
			@Override
			public Adapter caseTimingRepeat(TimingRepeat object) {
				return createTimingRepeatAdapter();
			}
			@Override
			public Adapter caseTriggerDefinition(TriggerDefinition object) {
				return createTriggerDefinitionAdapter();
			}
			@Override
			public Adapter caseTriggerType(TriggerType object) {
				return createTriggerTypeAdapter();
			}
			@Override
			public Adapter caseTypeDerivationRule(TypeDerivationRule object) {
				return createTypeDerivationRuleAdapter();
			}
			@Override
			public Adapter caseTypeRestfulInteraction(TypeRestfulInteraction object) {
				return createTypeRestfulInteractionAdapter();
			}
			@Override
			public Adapter caseUnitsOfTime(UnitsOfTime object) {
				return createUnitsOfTimeAdapter();
			}
			@Override
			public Adapter caseUnknownContentCode(UnknownContentCode object) {
				return createUnknownContentCodeAdapter();
			}
			@Override
			public Adapter caseUnsignedInt(UnsignedInt object) {
				return createUnsignedIntAdapter();
			}
			@Override
			public Adapter caseUri(Uri object) {
				return createUriAdapter();
			}
			@Override
			public Adapter caseUsageContext(UsageContext object) {
				return createUsageContextAdapter();
			}
			@Override
			public Adapter caseUse(Use object) {
				return createUseAdapter();
			}
			@Override
			public Adapter caseUuid(Uuid object) {
				return createUuidAdapter();
			}
			@Override
			public Adapter caseValueSet(ValueSet object) {
				return createValueSetAdapter();
			}
			@Override
			public Adapter caseValueSetCompose(ValueSetCompose object) {
				return createValueSetComposeAdapter();
			}
			@Override
			public Adapter caseValueSetConcept(ValueSetConcept object) {
				return createValueSetConceptAdapter();
			}
			@Override
			public Adapter caseValueSetContains(ValueSetContains object) {
				return createValueSetContainsAdapter();
			}
			@Override
			public Adapter caseValueSetDesignation(ValueSetDesignation object) {
				return createValueSetDesignationAdapter();
			}
			@Override
			public Adapter caseValueSetExpansion(ValueSetExpansion object) {
				return createValueSetExpansionAdapter();
			}
			@Override
			public Adapter caseValueSetFilter(ValueSetFilter object) {
				return createValueSetFilterAdapter();
			}
			@Override
			public Adapter caseValueSetInclude(ValueSetInclude object) {
				return createValueSetIncludeAdapter();
			}
			@Override
			public Adapter caseValueSetParameter(ValueSetParameter object) {
				return createValueSetParameterAdapter();
			}
			@Override
			public Adapter caseVisionPrescription(VisionPrescription object) {
				return createVisionPrescriptionAdapter();
			}
			@Override
			public Adapter caseVisionPrescriptionDispense(VisionPrescriptionDispense object) {
				return createVisionPrescriptionDispenseAdapter();
			}
			@Override
			public Adapter caseXPathUsageType(XPathUsageType object) {
				return createXPathUsageTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Account <em>Account</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Account
	 * @generated
	 */
	public Adapter createAccountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.AccountGuarantor <em>Account Guarantor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.AccountGuarantor
	 * @generated
	 */
	public Adapter createAccountGuarantorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.AccountStatus <em>Account Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.AccountStatus
	 * @generated
	 */
	public Adapter createAccountStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ActionList <em>Action List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ActionList
	 * @generated
	 */
	public Adapter createActionListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ActivityDefinition <em>Activity Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ActivityDefinition
	 * @generated
	 */
	public Adapter createActivityDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ActivityDefinitionCategory <em>Activity Definition Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ActivityDefinitionCategory
	 * @generated
	 */
	public Adapter createActivityDefinitionCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ActivityDefinitionDynamicValue <em>Activity Definition Dynamic Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ActivityDefinitionDynamicValue
	 * @generated
	 */
	public Adapter createActivityDefinitionDynamicValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Address <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Address
	 * @generated
	 */
	public Adapter createAddressAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.AddressType <em>Address Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.AddressType
	 * @generated
	 */
	public Adapter createAddressTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.AddressUse <em>Address Use</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.AddressUse
	 * @generated
	 */
	public Adapter createAddressUseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.AdministrativeGender <em>Administrative Gender</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.AdministrativeGender
	 * @generated
	 */
	public Adapter createAdministrativeGenderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Age <em>Age</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Age
	 * @generated
	 */
	public Adapter createAgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.AggregationMode <em>Aggregation Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.AggregationMode
	 * @generated
	 */
	public Adapter createAggregationModeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.AllergyIntolerance <em>Allergy Intolerance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.AllergyIntolerance
	 * @generated
	 */
	public Adapter createAllergyIntoleranceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.AllergyIntoleranceCategory <em>Allergy Intolerance Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.AllergyIntoleranceCategory
	 * @generated
	 */
	public Adapter createAllergyIntoleranceCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.AllergyIntoleranceCertainty <em>Allergy Intolerance Certainty</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.AllergyIntoleranceCertainty
	 * @generated
	 */
	public Adapter createAllergyIntoleranceCertaintyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.AllergyIntoleranceClinicalStatus <em>Allergy Intolerance Clinical Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.AllergyIntoleranceClinicalStatus
	 * @generated
	 */
	public Adapter createAllergyIntoleranceClinicalStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.AllergyIntoleranceCriticality <em>Allergy Intolerance Criticality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.AllergyIntoleranceCriticality
	 * @generated
	 */
	public Adapter createAllergyIntoleranceCriticalityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.AllergyIntoleranceReaction <em>Allergy Intolerance Reaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.AllergyIntoleranceReaction
	 * @generated
	 */
	public Adapter createAllergyIntoleranceReactionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.AllergyIntoleranceSeverity <em>Allergy Intolerance Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.AllergyIntoleranceSeverity
	 * @generated
	 */
	public Adapter createAllergyIntoleranceSeverityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.AllergyIntoleranceType <em>Allergy Intolerance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.AllergyIntoleranceType
	 * @generated
	 */
	public Adapter createAllergyIntoleranceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.AllergyIntoleranceVerificationStatus <em>Allergy Intolerance Verification Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.AllergyIntoleranceVerificationStatus
	 * @generated
	 */
	public Adapter createAllergyIntoleranceVerificationStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Annotation
	 * @generated
	 */
	public Adapter createAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Appointment <em>Appointment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Appointment
	 * @generated
	 */
	public Adapter createAppointmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.AppointmentParticipant <em>Appointment Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.AppointmentParticipant
	 * @generated
	 */
	public Adapter createAppointmentParticipantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.AppointmentResponse <em>Appointment Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.AppointmentResponse
	 * @generated
	 */
	public Adapter createAppointmentResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.AppointmentStatus <em>Appointment Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.AppointmentStatus
	 * @generated
	 */
	public Adapter createAppointmentStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.AssertionDirectionType <em>Assertion Direction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.AssertionDirectionType
	 * @generated
	 */
	public Adapter createAssertionDirectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.AssertionOperatorType <em>Assertion Operator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.AssertionOperatorType
	 * @generated
	 */
	public Adapter createAssertionOperatorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.AssertionResponseTypes <em>Assertion Response Types</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.AssertionResponseTypes
	 * @generated
	 */
	public Adapter createAssertionResponseTypesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Attachment <em>Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Attachment
	 * @generated
	 */
	public Adapter createAttachmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.AuditEvent <em>Audit Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.AuditEvent
	 * @generated
	 */
	public Adapter createAuditEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.AuditEventAction <em>Audit Event Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.AuditEventAction
	 * @generated
	 */
	public Adapter createAuditEventActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.AuditEventAgent <em>Audit Event Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.AuditEventAgent
	 * @generated
	 */
	public Adapter createAuditEventAgentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.AuditEventAgentNetworkType <em>Audit Event Agent Network Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.AuditEventAgentNetworkType
	 * @generated
	 */
	public Adapter createAuditEventAgentNetworkTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.AuditEventDetail <em>Audit Event Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.AuditEventDetail
	 * @generated
	 */
	public Adapter createAuditEventDetailAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.AuditEventEntity <em>Audit Event Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.AuditEventEntity
	 * @generated
	 */
	public Adapter createAuditEventEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.AuditEventNetwork <em>Audit Event Network</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.AuditEventNetwork
	 * @generated
	 */
	public Adapter createAuditEventNetworkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.AuditEventOutcome <em>Audit Event Outcome</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.AuditEventOutcome
	 * @generated
	 */
	public Adapter createAuditEventOutcomeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.AuditEventSource <em>Audit Event Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.AuditEventSource
	 * @generated
	 */
	public Adapter createAuditEventSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.BackboneElement <em>Backbone Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.BackboneElement
	 * @generated
	 */
	public Adapter createBackboneElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Base64Binary <em>Base64 Binary</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Base64Binary
	 * @generated
	 */
	public Adapter createBase64BinaryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Basic <em>Basic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Basic
	 * @generated
	 */
	public Adapter createBasicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Binary <em>Binary</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Binary
	 * @generated
	 */
	public Adapter createBinaryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.BindingStrength <em>Binding Strength</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.BindingStrength
	 * @generated
	 */
	public Adapter createBindingStrengthAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.BodySite <em>Body Site</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.BodySite
	 * @generated
	 */
	public Adapter createBodySiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Boolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Boolean
	 * @generated
	 */
	public Adapter createBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Bundle <em>Bundle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Bundle
	 * @generated
	 */
	public Adapter createBundleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.BundleEntry <em>Bundle Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.BundleEntry
	 * @generated
	 */
	public Adapter createBundleEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.BundleLink <em>Bundle Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.BundleLink
	 * @generated
	 */
	public Adapter createBundleLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.BundleRequest <em>Bundle Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.BundleRequest
	 * @generated
	 */
	public Adapter createBundleRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.BundleResponse <em>Bundle Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.BundleResponse
	 * @generated
	 */
	public Adapter createBundleResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.BundleSearch <em>Bundle Search</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.BundleSearch
	 * @generated
	 */
	public Adapter createBundleSearchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.BundleType <em>Bundle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.BundleType
	 * @generated
	 */
	public Adapter createBundleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CapabilityStatement <em>Capability Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CapabilityStatement
	 * @generated
	 */
	public Adapter createCapabilityStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CapabilityStatementCertificate <em>Capability Statement Certificate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CapabilityStatementCertificate
	 * @generated
	 */
	public Adapter createCapabilityStatementCertificateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CapabilityStatementDocument <em>Capability Statement Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CapabilityStatementDocument
	 * @generated
	 */
	public Adapter createCapabilityStatementDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CapabilityStatementEndpoint <em>Capability Statement Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CapabilityStatementEndpoint
	 * @generated
	 */
	public Adapter createCapabilityStatementEndpointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CapabilityStatementEvent <em>Capability Statement Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CapabilityStatementEvent
	 * @generated
	 */
	public Adapter createCapabilityStatementEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CapabilityStatementImplementation <em>Capability Statement Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CapabilityStatementImplementation
	 * @generated
	 */
	public Adapter createCapabilityStatementImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CapabilityStatementInteraction <em>Capability Statement Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CapabilityStatementInteraction
	 * @generated
	 */
	public Adapter createCapabilityStatementInteractionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CapabilityStatementInteraction1 <em>Capability Statement Interaction1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CapabilityStatementInteraction1
	 * @generated
	 */
	public Adapter createCapabilityStatementInteraction1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CapabilityStatementKind <em>Capability Statement Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CapabilityStatementKind
	 * @generated
	 */
	public Adapter createCapabilityStatementKindAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CapabilityStatementMessaging <em>Capability Statement Messaging</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CapabilityStatementMessaging
	 * @generated
	 */
	public Adapter createCapabilityStatementMessagingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CapabilityStatementOperation <em>Capability Statement Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CapabilityStatementOperation
	 * @generated
	 */
	public Adapter createCapabilityStatementOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CapabilityStatementResource <em>Capability Statement Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CapabilityStatementResource
	 * @generated
	 */
	public Adapter createCapabilityStatementResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CapabilityStatementRest <em>Capability Statement Rest</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CapabilityStatementRest
	 * @generated
	 */
	public Adapter createCapabilityStatementRestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CapabilityStatementSearchParam <em>Capability Statement Search Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CapabilityStatementSearchParam
	 * @generated
	 */
	public Adapter createCapabilityStatementSearchParamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CapabilityStatementSecurity <em>Capability Statement Security</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CapabilityStatementSecurity
	 * @generated
	 */
	public Adapter createCapabilityStatementSecurityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CapabilityStatementSoftware <em>Capability Statement Software</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CapabilityStatementSoftware
	 * @generated
	 */
	public Adapter createCapabilityStatementSoftwareAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CarePlan <em>Care Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CarePlan
	 * @generated
	 */
	public Adapter createCarePlanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CarePlanActivity <em>Care Plan Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CarePlanActivity
	 * @generated
	 */
	public Adapter createCarePlanActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CarePlanActivityStatus <em>Care Plan Activity Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CarePlanActivityStatus
	 * @generated
	 */
	public Adapter createCarePlanActivityStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CarePlanDetail <em>Care Plan Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CarePlanDetail
	 * @generated
	 */
	public Adapter createCarePlanDetailAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CarePlanRelatedPlan <em>Care Plan Related Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CarePlanRelatedPlan
	 * @generated
	 */
	public Adapter createCarePlanRelatedPlanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CarePlanRelationship <em>Care Plan Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CarePlanRelationship
	 * @generated
	 */
	public Adapter createCarePlanRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CarePlanStatus <em>Care Plan Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CarePlanStatus
	 * @generated
	 */
	public Adapter createCarePlanStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CareTeam <em>Care Team</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CareTeam
	 * @generated
	 */
	public Adapter createCareTeamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CareTeamParticipant <em>Care Team Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CareTeamParticipant
	 * @generated
	 */
	public Adapter createCareTeamParticipantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Claim <em>Claim</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Claim
	 * @generated
	 */
	public Adapter createClaimAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ClaimAccident <em>Claim Accident</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ClaimAccident
	 * @generated
	 */
	public Adapter createClaimAccidentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ClaimCareTeam <em>Claim Care Team</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ClaimCareTeam
	 * @generated
	 */
	public Adapter createClaimCareTeamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ClaimDetail <em>Claim Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ClaimDetail
	 * @generated
	 */
	public Adapter createClaimDetailAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ClaimDiagnosis <em>Claim Diagnosis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ClaimDiagnosis
	 * @generated
	 */
	public Adapter createClaimDiagnosisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ClaimInformation <em>Claim Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ClaimInformation
	 * @generated
	 */
	public Adapter createClaimInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ClaimInsurance <em>Claim Insurance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ClaimInsurance
	 * @generated
	 */
	public Adapter createClaimInsuranceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ClaimItem <em>Claim Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ClaimItem
	 * @generated
	 */
	public Adapter createClaimItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ClaimPayee <em>Claim Payee</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ClaimPayee
	 * @generated
	 */
	public Adapter createClaimPayeeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ClaimProcedure <em>Claim Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ClaimProcedure
	 * @generated
	 */
	public Adapter createClaimProcedureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ClaimProsthesis <em>Claim Prosthesis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ClaimProsthesis
	 * @generated
	 */
	public Adapter createClaimProsthesisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ClaimRelated <em>Claim Related</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ClaimRelated
	 * @generated
	 */
	public Adapter createClaimRelatedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ClaimResponse <em>Claim Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ClaimResponse
	 * @generated
	 */
	public Adapter createClaimResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ClaimResponseAddItem <em>Claim Response Add Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ClaimResponseAddItem
	 * @generated
	 */
	public Adapter createClaimResponseAddItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ClaimResponseAdjudication <em>Claim Response Adjudication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ClaimResponseAdjudication
	 * @generated
	 */
	public Adapter createClaimResponseAdjudicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ClaimResponseDetail <em>Claim Response Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ClaimResponseDetail
	 * @generated
	 */
	public Adapter createClaimResponseDetailAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ClaimResponseDetail1 <em>Claim Response Detail1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ClaimResponseDetail1
	 * @generated
	 */
	public Adapter createClaimResponseDetail1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ClaimResponseError <em>Claim Response Error</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ClaimResponseError
	 * @generated
	 */
	public Adapter createClaimResponseErrorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ClaimResponseInsurance <em>Claim Response Insurance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ClaimResponseInsurance
	 * @generated
	 */
	public Adapter createClaimResponseInsuranceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ClaimResponseItem <em>Claim Response Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ClaimResponseItem
	 * @generated
	 */
	public Adapter createClaimResponseItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ClaimResponseNote <em>Claim Response Note</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ClaimResponseNote
	 * @generated
	 */
	public Adapter createClaimResponseNoteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ClaimResponsePayment <em>Claim Response Payment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ClaimResponsePayment
	 * @generated
	 */
	public Adapter createClaimResponsePaymentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ClaimResponseSubDetail <em>Claim Response Sub Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ClaimResponseSubDetail
	 * @generated
	 */
	public Adapter createClaimResponseSubDetailAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ClaimSubDetail <em>Claim Sub Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ClaimSubDetail
	 * @generated
	 */
	public Adapter createClaimSubDetailAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ClinicalImpression <em>Clinical Impression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ClinicalImpression
	 * @generated
	 */
	public Adapter createClinicalImpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ClinicalImpressionFinding <em>Clinical Impression Finding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ClinicalImpressionFinding
	 * @generated
	 */
	public Adapter createClinicalImpressionFindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ClinicalImpressionInvestigation <em>Clinical Impression Investigation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ClinicalImpressionInvestigation
	 * @generated
	 */
	public Adapter createClinicalImpressionInvestigationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ClinicalImpressionStatus <em>Clinical Impression Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ClinicalImpressionStatus
	 * @generated
	 */
	public Adapter createClinicalImpressionStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Code <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Code
	 * @generated
	 */
	public Adapter createCodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CodeableConcept <em>Codeable Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CodeableConcept
	 * @generated
	 */
	public Adapter createCodeableConceptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CodeSystem <em>Code System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CodeSystem
	 * @generated
	 */
	public Adapter createCodeSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CodeSystemConcept <em>Code System Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CodeSystemConcept
	 * @generated
	 */
	public Adapter createCodeSystemConceptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CodeSystemContentMode <em>Code System Content Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CodeSystemContentMode
	 * @generated
	 */
	public Adapter createCodeSystemContentModeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CodeSystemDesignation <em>Code System Designation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CodeSystemDesignation
	 * @generated
	 */
	public Adapter createCodeSystemDesignationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CodeSystemFilter <em>Code System Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CodeSystemFilter
	 * @generated
	 */
	public Adapter createCodeSystemFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CodeSystemHierarchyMeaning <em>Code System Hierarchy Meaning</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CodeSystemHierarchyMeaning
	 * @generated
	 */
	public Adapter createCodeSystemHierarchyMeaningAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CodeSystemProperty <em>Code System Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CodeSystemProperty
	 * @generated
	 */
	public Adapter createCodeSystemPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CodeSystemProperty1 <em>Code System Property1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CodeSystemProperty1
	 * @generated
	 */
	public Adapter createCodeSystemProperty1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Coding <em>Coding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Coding
	 * @generated
	 */
	public Adapter createCodingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Communication <em>Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Communication
	 * @generated
	 */
	public Adapter createCommunicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CommunicationPayload <em>Communication Payload</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CommunicationPayload
	 * @generated
	 */
	public Adapter createCommunicationPayloadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CommunicationRequest <em>Communication Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CommunicationRequest
	 * @generated
	 */
	public Adapter createCommunicationRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CommunicationRequestPayload <em>Communication Request Payload</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CommunicationRequestPayload
	 * @generated
	 */
	public Adapter createCommunicationRequestPayloadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CommunicationRequestStatus <em>Communication Request Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CommunicationRequestStatus
	 * @generated
	 */
	public Adapter createCommunicationRequestStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CommunicationStatus <em>Communication Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CommunicationStatus
	 * @generated
	 */
	public Adapter createCommunicationStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CompartmentDefinition <em>Compartment Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CompartmentDefinition
	 * @generated
	 */
	public Adapter createCompartmentDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CompartmentDefinitionResource <em>Compartment Definition Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CompartmentDefinitionResource
	 * @generated
	 */
	public Adapter createCompartmentDefinitionResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CompartmentType <em>Compartment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CompartmentType
	 * @generated
	 */
	public Adapter createCompartmentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CompositeMeasureScoring <em>Composite Measure Scoring</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CompositeMeasureScoring
	 * @generated
	 */
	public Adapter createCompositeMeasureScoringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Composition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Composition
	 * @generated
	 */
	public Adapter createCompositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CompositionAttestationMode <em>Composition Attestation Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CompositionAttestationMode
	 * @generated
	 */
	public Adapter createCompositionAttestationModeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CompositionAttester <em>Composition Attester</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CompositionAttester
	 * @generated
	 */
	public Adapter createCompositionAttesterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CompositionEvent <em>Composition Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CompositionEvent
	 * @generated
	 */
	public Adapter createCompositionEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CompositionSection <em>Composition Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CompositionSection
	 * @generated
	 */
	public Adapter createCompositionSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CompositionStatus <em>Composition Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CompositionStatus
	 * @generated
	 */
	public Adapter createCompositionStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ConceptMap <em>Concept Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ConceptMap
	 * @generated
	 */
	public Adapter createConceptMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ConceptMapDependsOn <em>Concept Map Depends On</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ConceptMapDependsOn
	 * @generated
	 */
	public Adapter createConceptMapDependsOnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ConceptMapElement <em>Concept Map Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ConceptMapElement
	 * @generated
	 */
	public Adapter createConceptMapElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ConceptMapEquivalence <em>Concept Map Equivalence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ConceptMapEquivalence
	 * @generated
	 */
	public Adapter createConceptMapEquivalenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ConceptMapGroup <em>Concept Map Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ConceptMapGroup
	 * @generated
	 */
	public Adapter createConceptMapGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ConceptMapTarget <em>Concept Map Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ConceptMapTarget
	 * @generated
	 */
	public Adapter createConceptMapTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Condition
	 * @generated
	 */
	public Adapter createConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ConditionalDeleteStatus <em>Conditional Delete Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ConditionalDeleteStatus
	 * @generated
	 */
	public Adapter createConditionalDeleteStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ConditionalReadStatus <em>Conditional Read Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ConditionalReadStatus
	 * @generated
	 */
	public Adapter createConditionalReadStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ConditionEvidence <em>Condition Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ConditionEvidence
	 * @generated
	 */
	public Adapter createConditionEvidenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ConditionStage <em>Condition Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ConditionStage
	 * @generated
	 */
	public Adapter createConditionStageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ConditionVerificationStatus <em>Condition Verification Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ConditionVerificationStatus
	 * @generated
	 */
	public Adapter createConditionVerificationStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Consent <em>Consent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Consent
	 * @generated
	 */
	public Adapter createConsentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ConsentActor <em>Consent Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ConsentActor
	 * @generated
	 */
	public Adapter createConsentActorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ConsentData <em>Consent Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ConsentData
	 * @generated
	 */
	public Adapter createConsentDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ConsentDataMeaning <em>Consent Data Meaning</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ConsentDataMeaning
	 * @generated
	 */
	public Adapter createConsentDataMeaningAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ConsentExcept <em>Consent Except</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ConsentExcept
	 * @generated
	 */
	public Adapter createConsentExceptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ConsentExceptType <em>Consent Except Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ConsentExceptType
	 * @generated
	 */
	public Adapter createConsentExceptTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ConsentStatus <em>Consent Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ConsentStatus
	 * @generated
	 */
	public Adapter createConsentStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ConstraintSeverity <em>Constraint Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ConstraintSeverity
	 * @generated
	 */
	public Adapter createConstraintSeverityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ContactDetail <em>Contact Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ContactDetail
	 * @generated
	 */
	public Adapter createContactDetailAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ContactPoint <em>Contact Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ContactPoint
	 * @generated
	 */
	public Adapter createContactPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ContactPointSystem <em>Contact Point System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ContactPointSystem
	 * @generated
	 */
	public Adapter createContactPointSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ContactPointUse <em>Contact Point Use</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ContactPointUse
	 * @generated
	 */
	public Adapter createContactPointUseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ContentType <em>Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ContentType
	 * @generated
	 */
	public Adapter createContentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Contract <em>Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Contract
	 * @generated
	 */
	public Adapter createContractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ContractAgent <em>Contract Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ContractAgent
	 * @generated
	 */
	public Adapter createContractAgentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ContractAgent1 <em>Contract Agent1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ContractAgent1
	 * @generated
	 */
	public Adapter createContractAgent1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ContractFriendly <em>Contract Friendly</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ContractFriendly
	 * @generated
	 */
	public Adapter createContractFriendlyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ContractLegal <em>Contract Legal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ContractLegal
	 * @generated
	 */
	public Adapter createContractLegalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ContractRule <em>Contract Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ContractRule
	 * @generated
	 */
	public Adapter createContractRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ContractSigner <em>Contract Signer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ContractSigner
	 * @generated
	 */
	public Adapter createContractSignerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ContractTerm <em>Contract Term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ContractTerm
	 * @generated
	 */
	public Adapter createContractTermAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ContractValuedItem <em>Contract Valued Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ContractValuedItem
	 * @generated
	 */
	public Adapter createContractValuedItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ContractValuedItem1 <em>Contract Valued Item1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ContractValuedItem1
	 * @generated
	 */
	public Adapter createContractValuedItem1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Contributor <em>Contributor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Contributor
	 * @generated
	 */
	public Adapter createContributorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ContributorType <em>Contributor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ContributorType
	 * @generated
	 */
	public Adapter createContributorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Count <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Count
	 * @generated
	 */
	public Adapter createCountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Coverage <em>Coverage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Coverage
	 * @generated
	 */
	public Adapter createCoverageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CoverageGroup <em>Coverage Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CoverageGroup
	 * @generated
	 */
	public Adapter createCoverageGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DataElement <em>Data Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DataElement
	 * @generated
	 */
	public Adapter createDataElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DataElementMapping <em>Data Element Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DataElementMapping
	 * @generated
	 */
	public Adapter createDataElementMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DataElementStringency <em>Data Element Stringency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DataElementStringency
	 * @generated
	 */
	public Adapter createDataElementStringencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DataRequirement <em>Data Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DataRequirement
	 * @generated
	 */
	public Adapter createDataRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DataRequirementCodeFilter <em>Data Requirement Code Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DataRequirementCodeFilter
	 * @generated
	 */
	public Adapter createDataRequirementCodeFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DataRequirementDateFilter <em>Data Requirement Date Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DataRequirementDateFilter
	 * @generated
	 */
	public Adapter createDataRequirementDateFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Date <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Date
	 * @generated
	 */
	public Adapter createDateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DateTime <em>Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DateTime
	 * @generated
	 */
	public Adapter createDateTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DaysOfWeek <em>Days Of Week</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DaysOfWeek
	 * @generated
	 */
	public Adapter createDaysOfWeekAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Decimal <em>Decimal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Decimal
	 * @generated
	 */
	public Adapter createDecimalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DetectedIssue <em>Detected Issue</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DetectedIssue
	 * @generated
	 */
	public Adapter createDetectedIssueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DetectedIssueMitigation <em>Detected Issue Mitigation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DetectedIssueMitigation
	 * @generated
	 */
	public Adapter createDetectedIssueMitigationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DetectedIssueSeverity <em>Detected Issue Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DetectedIssueSeverity
	 * @generated
	 */
	public Adapter createDetectedIssueSeverityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Device
	 * @generated
	 */
	public Adapter createDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DeviceComponent <em>Device Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DeviceComponent
	 * @generated
	 */
	public Adapter createDeviceComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DeviceComponentProductionSpecification <em>Device Component Production Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DeviceComponentProductionSpecification
	 * @generated
	 */
	public Adapter createDeviceComponentProductionSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DeviceMetric <em>Device Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DeviceMetric
	 * @generated
	 */
	public Adapter createDeviceMetricAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DeviceMetricCalibration <em>Device Metric Calibration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DeviceMetricCalibration
	 * @generated
	 */
	public Adapter createDeviceMetricCalibrationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DeviceMetricCalibrationState <em>Device Metric Calibration State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DeviceMetricCalibrationState
	 * @generated
	 */
	public Adapter createDeviceMetricCalibrationStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DeviceMetricCalibrationType <em>Device Metric Calibration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DeviceMetricCalibrationType
	 * @generated
	 */
	public Adapter createDeviceMetricCalibrationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DeviceMetricCategory <em>Device Metric Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DeviceMetricCategory
	 * @generated
	 */
	public Adapter createDeviceMetricCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DeviceMetricColor <em>Device Metric Color</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DeviceMetricColor
	 * @generated
	 */
	public Adapter createDeviceMetricColorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DeviceMetricOperationalStatus <em>Device Metric Operational Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DeviceMetricOperationalStatus
	 * @generated
	 */
	public Adapter createDeviceMetricOperationalStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DeviceStatus <em>Device Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DeviceStatus
	 * @generated
	 */
	public Adapter createDeviceStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DeviceUseRequest <em>Device Use Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DeviceUseRequest
	 * @generated
	 */
	public Adapter createDeviceUseRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DeviceUseStatement <em>Device Use Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DeviceUseStatement
	 * @generated
	 */
	public Adapter createDeviceUseStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DiagnosticReport <em>Diagnostic Report</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DiagnosticReport
	 * @generated
	 */
	public Adapter createDiagnosticReportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DiagnosticReportImage <em>Diagnostic Report Image</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DiagnosticReportImage
	 * @generated
	 */
	public Adapter createDiagnosticReportImageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DiagnosticReportStatus <em>Diagnostic Report Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DiagnosticReportStatus
	 * @generated
	 */
	public Adapter createDiagnosticReportStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DiagnosticRequest <em>Diagnostic Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DiagnosticRequest
	 * @generated
	 */
	public Adapter createDiagnosticRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DigitalMediaType <em>Digital Media Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DigitalMediaType
	 * @generated
	 */
	public Adapter createDigitalMediaTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Distance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Distance
	 * @generated
	 */
	public Adapter createDistanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DocumentManifest <em>Document Manifest</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DocumentManifest
	 * @generated
	 */
	public Adapter createDocumentManifestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DocumentManifestContent <em>Document Manifest Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DocumentManifestContent
	 * @generated
	 */
	public Adapter createDocumentManifestContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DocumentManifestRelated <em>Document Manifest Related</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DocumentManifestRelated
	 * @generated
	 */
	public Adapter createDocumentManifestRelatedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DocumentMode <em>Document Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DocumentMode
	 * @generated
	 */
	public Adapter createDocumentModeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DocumentReference <em>Document Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DocumentReference
	 * @generated
	 */
	public Adapter createDocumentReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DocumentReferenceContent <em>Document Reference Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DocumentReferenceContent
	 * @generated
	 */
	public Adapter createDocumentReferenceContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DocumentReferenceContext <em>Document Reference Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DocumentReferenceContext
	 * @generated
	 */
	public Adapter createDocumentReferenceContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DocumentReferenceRelated <em>Document Reference Related</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DocumentReferenceRelated
	 * @generated
	 */
	public Adapter createDocumentReferenceRelatedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DocumentReferenceRelatesTo <em>Document Reference Relates To</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DocumentReferenceRelatesTo
	 * @generated
	 */
	public Adapter createDocumentReferenceRelatesToAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DocumentReferenceStatus <em>Document Reference Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DocumentReferenceStatus
	 * @generated
	 */
	public Adapter createDocumentReferenceStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DocumentRelationshipType <em>Document Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DocumentRelationshipType
	 * @generated
	 */
	public Adapter createDocumentRelationshipTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DomainResource <em>Domain Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DomainResource
	 * @generated
	 */
	public Adapter createDomainResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DosageInstruction <em>Dosage Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DosageInstruction
	 * @generated
	 */
	public Adapter createDosageInstructionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Duration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Duration
	 * @generated
	 */
	public Adapter createDurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ElementDefinition <em>Element Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ElementDefinition
	 * @generated
	 */
	public Adapter createElementDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ElementDefinitionBase <em>Element Definition Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ElementDefinitionBase
	 * @generated
	 */
	public Adapter createElementDefinitionBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ElementDefinitionBinding <em>Element Definition Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ElementDefinitionBinding
	 * @generated
	 */
	public Adapter createElementDefinitionBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ElementDefinitionConstraint <em>Element Definition Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ElementDefinitionConstraint
	 * @generated
	 */
	public Adapter createElementDefinitionConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ElementDefinitionExample <em>Element Definition Example</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ElementDefinitionExample
	 * @generated
	 */
	public Adapter createElementDefinitionExampleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ElementDefinitionMapping <em>Element Definition Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ElementDefinitionMapping
	 * @generated
	 */
	public Adapter createElementDefinitionMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ElementDefinitionSlicing <em>Element Definition Slicing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ElementDefinitionSlicing
	 * @generated
	 */
	public Adapter createElementDefinitionSlicingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ElementDefinitionType <em>Element Definition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ElementDefinitionType
	 * @generated
	 */
	public Adapter createElementDefinitionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.EligibilityRequest <em>Eligibility Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.EligibilityRequest
	 * @generated
	 */
	public Adapter createEligibilityRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.EligibilityResponse <em>Eligibility Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.EligibilityResponse
	 * @generated
	 */
	public Adapter createEligibilityResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.EligibilityResponseBenefitBalance <em>Eligibility Response Benefit Balance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.EligibilityResponseBenefitBalance
	 * @generated
	 */
	public Adapter createEligibilityResponseBenefitBalanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.EligibilityResponseError <em>Eligibility Response Error</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.EligibilityResponseError
	 * @generated
	 */
	public Adapter createEligibilityResponseErrorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.EligibilityResponseFinancial <em>Eligibility Response Financial</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.EligibilityResponseFinancial
	 * @generated
	 */
	public Adapter createEligibilityResponseFinancialAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.EligibilityResponseInsurance <em>Eligibility Response Insurance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.EligibilityResponseInsurance
	 * @generated
	 */
	public Adapter createEligibilityResponseInsuranceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Encounter <em>Encounter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Encounter
	 * @generated
	 */
	public Adapter createEncounterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.EncounterHospitalization <em>Encounter Hospitalization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.EncounterHospitalization
	 * @generated
	 */
	public Adapter createEncounterHospitalizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.EncounterLocation <em>Encounter Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.EncounterLocation
	 * @generated
	 */
	public Adapter createEncounterLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.EncounterLocationStatus <em>Encounter Location Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.EncounterLocationStatus
	 * @generated
	 */
	public Adapter createEncounterLocationStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.EncounterParticipant <em>Encounter Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.EncounterParticipant
	 * @generated
	 */
	public Adapter createEncounterParticipantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.EncounterStatus <em>Encounter Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.EncounterStatus
	 * @generated
	 */
	public Adapter createEncounterStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.EncounterStatusHistory <em>Encounter Status History</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.EncounterStatusHistory
	 * @generated
	 */
	public Adapter createEncounterStatusHistoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Endpoint <em>Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Endpoint
	 * @generated
	 */
	public Adapter createEndpointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.EndpointStatus <em>Endpoint Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.EndpointStatus
	 * @generated
	 */
	public Adapter createEndpointStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.EnrollmentRequest <em>Enrollment Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.EnrollmentRequest
	 * @generated
	 */
	public Adapter createEnrollmentRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.EnrollmentResponse <em>Enrollment Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.EnrollmentResponse
	 * @generated
	 */
	public Adapter createEnrollmentResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.EpisodeOfCare <em>Episode Of Care</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.EpisodeOfCare
	 * @generated
	 */
	public Adapter createEpisodeOfCareAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.EpisodeOfCareStatus <em>Episode Of Care Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.EpisodeOfCareStatus
	 * @generated
	 */
	public Adapter createEpisodeOfCareStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.EpisodeOfCareStatusHistory <em>Episode Of Care Status History</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.EpisodeOfCareStatusHistory
	 * @generated
	 */
	public Adapter createEpisodeOfCareStatusHistoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.EventCapabilityMode <em>Event Capability Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.EventCapabilityMode
	 * @generated
	 */
	public Adapter createEventCapabilityModeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.EventTiming <em>Event Timing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.EventTiming
	 * @generated
	 */
	public Adapter createEventTimingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ExpansionProfile <em>Expansion Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ExpansionProfile
	 * @generated
	 */
	public Adapter createExpansionProfileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ExpansionProfileDesignation <em>Expansion Profile Designation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ExpansionProfileDesignation
	 * @generated
	 */
	public Adapter createExpansionProfileDesignationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ExpansionProfileDesignation1 <em>Expansion Profile Designation1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ExpansionProfileDesignation1
	 * @generated
	 */
	public Adapter createExpansionProfileDesignation1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ExpansionProfileDesignation2 <em>Expansion Profile Designation2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ExpansionProfileDesignation2
	 * @generated
	 */
	public Adapter createExpansionProfileDesignation2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ExpansionProfileExclude <em>Expansion Profile Exclude</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ExpansionProfileExclude
	 * @generated
	 */
	public Adapter createExpansionProfileExcludeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ExpansionProfileExcludedSystem <em>Expansion Profile Excluded System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ExpansionProfileExcludedSystem
	 * @generated
	 */
	public Adapter createExpansionProfileExcludedSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ExpansionProfileFixedVersion <em>Expansion Profile Fixed Version</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ExpansionProfileFixedVersion
	 * @generated
	 */
	public Adapter createExpansionProfileFixedVersionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ExpansionProfileInclude <em>Expansion Profile Include</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ExpansionProfileInclude
	 * @generated
	 */
	public Adapter createExpansionProfileIncludeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ExplanationOfBenefit <em>Explanation Of Benefit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ExplanationOfBenefit
	 * @generated
	 */
	public Adapter createExplanationOfBenefitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ExplanationOfBenefitAccident <em>Explanation Of Benefit Accident</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ExplanationOfBenefitAccident
	 * @generated
	 */
	public Adapter createExplanationOfBenefitAccidentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ExplanationOfBenefitAddItem <em>Explanation Of Benefit Add Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ExplanationOfBenefitAddItem
	 * @generated
	 */
	public Adapter createExplanationOfBenefitAddItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ExplanationOfBenefitAdjudication <em>Explanation Of Benefit Adjudication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ExplanationOfBenefitAdjudication
	 * @generated
	 */
	public Adapter createExplanationOfBenefitAdjudicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ExplanationOfBenefitBenefitBalance <em>Explanation Of Benefit Benefit Balance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ExplanationOfBenefitBenefitBalance
	 * @generated
	 */
	public Adapter createExplanationOfBenefitBenefitBalanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ExplanationOfBenefitCareTeam <em>Explanation Of Benefit Care Team</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ExplanationOfBenefitCareTeam
	 * @generated
	 */
	public Adapter createExplanationOfBenefitCareTeamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ExplanationOfBenefitDetail <em>Explanation Of Benefit Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ExplanationOfBenefitDetail
	 * @generated
	 */
	public Adapter createExplanationOfBenefitDetailAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ExplanationOfBenefitDetail1 <em>Explanation Of Benefit Detail1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ExplanationOfBenefitDetail1
	 * @generated
	 */
	public Adapter createExplanationOfBenefitDetail1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ExplanationOfBenefitDiagnosis <em>Explanation Of Benefit Diagnosis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ExplanationOfBenefitDiagnosis
	 * @generated
	 */
	public Adapter createExplanationOfBenefitDiagnosisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ExplanationOfBenefitFinancial <em>Explanation Of Benefit Financial</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ExplanationOfBenefitFinancial
	 * @generated
	 */
	public Adapter createExplanationOfBenefitFinancialAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ExplanationOfBenefitInformation <em>Explanation Of Benefit Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ExplanationOfBenefitInformation
	 * @generated
	 */
	public Adapter createExplanationOfBenefitInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ExplanationOfBenefitInsurance <em>Explanation Of Benefit Insurance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ExplanationOfBenefitInsurance
	 * @generated
	 */
	public Adapter createExplanationOfBenefitInsuranceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ExplanationOfBenefitItem <em>Explanation Of Benefit Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ExplanationOfBenefitItem
	 * @generated
	 */
	public Adapter createExplanationOfBenefitItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ExplanationOfBenefitNote <em>Explanation Of Benefit Note</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ExplanationOfBenefitNote
	 * @generated
	 */
	public Adapter createExplanationOfBenefitNoteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ExplanationOfBenefitPayee <em>Explanation Of Benefit Payee</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ExplanationOfBenefitPayee
	 * @generated
	 */
	public Adapter createExplanationOfBenefitPayeeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ExplanationOfBenefitPayment <em>Explanation Of Benefit Payment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ExplanationOfBenefitPayment
	 * @generated
	 */
	public Adapter createExplanationOfBenefitPaymentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ExplanationOfBenefitProcedure <em>Explanation Of Benefit Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ExplanationOfBenefitProcedure
	 * @generated
	 */
	public Adapter createExplanationOfBenefitProcedureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ExplanationOfBenefitProsthesis <em>Explanation Of Benefit Prosthesis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ExplanationOfBenefitProsthesis
	 * @generated
	 */
	public Adapter createExplanationOfBenefitProsthesisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ExplanationOfBenefitRelated <em>Explanation Of Benefit Related</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ExplanationOfBenefitRelated
	 * @generated
	 */
	public Adapter createExplanationOfBenefitRelatedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ExplanationOfBenefitStatus <em>Explanation Of Benefit Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ExplanationOfBenefitStatus
	 * @generated
	 */
	public Adapter createExplanationOfBenefitStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ExplanationOfBenefitSubDetail <em>Explanation Of Benefit Sub Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ExplanationOfBenefitSubDetail
	 * @generated
	 */
	public Adapter createExplanationOfBenefitSubDetailAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Extension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Extension
	 * @generated
	 */
	public Adapter createExtensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ExtensionContext <em>Extension Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ExtensionContext
	 * @generated
	 */
	public Adapter createExtensionContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.FamilyHistoryStatus <em>Family History Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.FamilyHistoryStatus
	 * @generated
	 */
	public Adapter createFamilyHistoryStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.FamilyMemberHistory <em>Family Member History</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.FamilyMemberHistory
	 * @generated
	 */
	public Adapter createFamilyMemberHistoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.FamilyMemberHistoryCondition <em>Family Member History Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.FamilyMemberHistoryCondition
	 * @generated
	 */
	public Adapter createFamilyMemberHistoryConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.FilterOperator <em>Filter Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.FilterOperator
	 * @generated
	 */
	public Adapter createFilterOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Flag <em>Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Flag
	 * @generated
	 */
	public Adapter createFlagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.FlagStatus <em>Flag Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.FlagStatus
	 * @generated
	 */
	public Adapter createFlagStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Goal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Goal
	 * @generated
	 */
	public Adapter createGoalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.GoalOutcome <em>Goal Outcome</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.GoalOutcome
	 * @generated
	 */
	public Adapter createGoalOutcomeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.GoalStatus <em>Goal Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.GoalStatus
	 * @generated
	 */
	public Adapter createGoalStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Group
	 * @generated
	 */
	public Adapter createGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.GroupCharacteristic <em>Group Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.GroupCharacteristic
	 * @generated
	 */
	public Adapter createGroupCharacteristicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.GroupMember <em>Group Member</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.GroupMember
	 * @generated
	 */
	public Adapter createGroupMemberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.GroupType <em>Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.GroupType
	 * @generated
	 */
	public Adapter createGroupTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.GuidanceResponse <em>Guidance Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.GuidanceResponse
	 * @generated
	 */
	public Adapter createGuidanceResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.GuidanceResponseStatus <em>Guidance Response Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.GuidanceResponseStatus
	 * @generated
	 */
	public Adapter createGuidanceResponseStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.GuideDependencyType <em>Guide Dependency Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.GuideDependencyType
	 * @generated
	 */
	public Adapter createGuideDependencyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.GuidePageKind <em>Guide Page Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.GuidePageKind
	 * @generated
	 */
	public Adapter createGuidePageKindAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.HealthcareService <em>Healthcare Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.HealthcareService
	 * @generated
	 */
	public Adapter createHealthcareServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.HealthcareServiceAvailableTime <em>Healthcare Service Available Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.HealthcareServiceAvailableTime
	 * @generated
	 */
	public Adapter createHealthcareServiceAvailableTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.HealthcareServiceNotAvailable <em>Healthcare Service Not Available</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.HealthcareServiceNotAvailable
	 * @generated
	 */
	public Adapter createHealthcareServiceNotAvailableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.HTTPVerb <em>HTTP Verb</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.HTTPVerb
	 * @generated
	 */
	public Adapter createHTTPVerbAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.HumanName <em>Human Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.HumanName
	 * @generated
	 */
	public Adapter createHumanNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Id <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Id
	 * @generated
	 */
	public Adapter createIdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Identifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Identifier
	 * @generated
	 */
	public Adapter createIdentifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.IdentifierUse <em>Identifier Use</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.IdentifierUse
	 * @generated
	 */
	public Adapter createIdentifierUseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.IdentityAssuranceLevel <em>Identity Assurance Level</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.IdentityAssuranceLevel
	 * @generated
	 */
	public Adapter createIdentityAssuranceLevelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ImagingManifest <em>Imaging Manifest</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ImagingManifest
	 * @generated
	 */
	public Adapter createImagingManifestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ImagingManifestBaseLocation <em>Imaging Manifest Base Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ImagingManifestBaseLocation
	 * @generated
	 */
	public Adapter createImagingManifestBaseLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ImagingManifestBaseLocation1 <em>Imaging Manifest Base Location1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ImagingManifestBaseLocation1
	 * @generated
	 */
	public Adapter createImagingManifestBaseLocation1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ImagingManifestInstance <em>Imaging Manifest Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ImagingManifestInstance
	 * @generated
	 */
	public Adapter createImagingManifestInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ImagingManifestSeries <em>Imaging Manifest Series</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ImagingManifestSeries
	 * @generated
	 */
	public Adapter createImagingManifestSeriesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ImagingManifestStudy <em>Imaging Manifest Study</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ImagingManifestStudy
	 * @generated
	 */
	public Adapter createImagingManifestStudyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ImagingStudy <em>Imaging Study</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ImagingStudy
	 * @generated
	 */
	public Adapter createImagingStudyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ImagingStudyBaseLocation <em>Imaging Study Base Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ImagingStudyBaseLocation
	 * @generated
	 */
	public Adapter createImagingStudyBaseLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ImagingStudyBaseLocation1 <em>Imaging Study Base Location1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ImagingStudyBaseLocation1
	 * @generated
	 */
	public Adapter createImagingStudyBaseLocation1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ImagingStudyInstance <em>Imaging Study Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ImagingStudyInstance
	 * @generated
	 */
	public Adapter createImagingStudyInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ImagingStudySeries <em>Imaging Study Series</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ImagingStudySeries
	 * @generated
	 */
	public Adapter createImagingStudySeriesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Immunization <em>Immunization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Immunization
	 * @generated
	 */
	public Adapter createImmunizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ImmunizationExplanation <em>Immunization Explanation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ImmunizationExplanation
	 * @generated
	 */
	public Adapter createImmunizationExplanationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ImmunizationReaction <em>Immunization Reaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ImmunizationReaction
	 * @generated
	 */
	public Adapter createImmunizationReactionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ImmunizationRecommendation <em>Immunization Recommendation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ImmunizationRecommendation
	 * @generated
	 */
	public Adapter createImmunizationRecommendationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ImmunizationRecommendationDateCriterion <em>Immunization Recommendation Date Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ImmunizationRecommendationDateCriterion
	 * @generated
	 */
	public Adapter createImmunizationRecommendationDateCriterionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ImmunizationRecommendationProtocol <em>Immunization Recommendation Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ImmunizationRecommendationProtocol
	 * @generated
	 */
	public Adapter createImmunizationRecommendationProtocolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ImmunizationRecommendationRecommendation <em>Immunization Recommendation Recommendation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ImmunizationRecommendationRecommendation
	 * @generated
	 */
	public Adapter createImmunizationRecommendationRecommendationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ImmunizationVaccinationProtocol <em>Immunization Vaccination Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ImmunizationVaccinationProtocol
	 * @generated
	 */
	public Adapter createImmunizationVaccinationProtocolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ImplementationGuide <em>Implementation Guide</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ImplementationGuide
	 * @generated
	 */
	public Adapter createImplementationGuideAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ImplementationGuideDependency <em>Implementation Guide Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ImplementationGuideDependency
	 * @generated
	 */
	public Adapter createImplementationGuideDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ImplementationGuideGlobal <em>Implementation Guide Global</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ImplementationGuideGlobal
	 * @generated
	 */
	public Adapter createImplementationGuideGlobalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ImplementationGuidePackage <em>Implementation Guide Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ImplementationGuidePackage
	 * @generated
	 */
	public Adapter createImplementationGuidePackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ImplementationGuidePage <em>Implementation Guide Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ImplementationGuidePage
	 * @generated
	 */
	public Adapter createImplementationGuidePageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ImplementationGuideResource <em>Implementation Guide Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ImplementationGuideResource
	 * @generated
	 */
	public Adapter createImplementationGuideResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.InstanceAvailability <em>Instance Availability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.InstanceAvailability
	 * @generated
	 */
	public Adapter createInstanceAvailabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Instant <em>Instant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Instant
	 * @generated
	 */
	public Adapter createInstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Integer <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Integer
	 * @generated
	 */
	public Adapter createIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.IssueSeverity <em>Issue Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.IssueSeverity
	 * @generated
	 */
	public Adapter createIssueSeverityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.IssueType <em>Issue Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.IssueType
	 * @generated
	 */
	public Adapter createIssueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Library <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Library
	 * @generated
	 */
	public Adapter createLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Linkage <em>Linkage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Linkage
	 * @generated
	 */
	public Adapter createLinkageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.LinkageItem <em>Linkage Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.LinkageItem
	 * @generated
	 */
	public Adapter createLinkageItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.LinkageType <em>Linkage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.LinkageType
	 * @generated
	 */
	public Adapter createLinkageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.LinkType <em>Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.LinkType
	 * @generated
	 */
	public Adapter createLinkTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.List
	 * @generated
	 */
	public Adapter createListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ListEntry <em>List Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ListEntry
	 * @generated
	 */
	public Adapter createListEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ListMode <em>List Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ListMode
	 * @generated
	 */
	public Adapter createListModeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ListStatus <em>List Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ListStatus
	 * @generated
	 */
	public Adapter createListStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Location
	 * @generated
	 */
	public Adapter createLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.LocationMode <em>Location Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.LocationMode
	 * @generated
	 */
	public Adapter createLocationModeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.LocationPosition <em>Location Position</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.LocationPosition
	 * @generated
	 */
	public Adapter createLocationPositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.LocationStatus <em>Location Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.LocationStatus
	 * @generated
	 */
	public Adapter createLocationStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Markdown <em>Markdown</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Markdown
	 * @generated
	 */
	public Adapter createMarkdownAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MeasmntPrinciple <em>Measmnt Principle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MeasmntPrinciple
	 * @generated
	 */
	public Adapter createMeasmntPrincipleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Measure <em>Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Measure
	 * @generated
	 */
	public Adapter createMeasureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MeasureDataUsage <em>Measure Data Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MeasureDataUsage
	 * @generated
	 */
	public Adapter createMeasureDataUsageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MeasureGroup <em>Measure Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MeasureGroup
	 * @generated
	 */
	public Adapter createMeasureGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MeasurePopulation <em>Measure Population</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MeasurePopulation
	 * @generated
	 */
	public Adapter createMeasurePopulationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MeasurePopulationType <em>Measure Population Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MeasurePopulationType
	 * @generated
	 */
	public Adapter createMeasurePopulationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MeasureReport <em>Measure Report</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MeasureReport
	 * @generated
	 */
	public Adapter createMeasureReportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MeasureReportGroup <em>Measure Report Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MeasureReportGroup
	 * @generated
	 */
	public Adapter createMeasureReportGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MeasureReportGroup1 <em>Measure Report Group1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MeasureReportGroup1
	 * @generated
	 */
	public Adapter createMeasureReportGroup1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MeasureReportGroup2 <em>Measure Report Group2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MeasureReportGroup2
	 * @generated
	 */
	public Adapter createMeasureReportGroup2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MeasureReportPopulation <em>Measure Report Population</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MeasureReportPopulation
	 * @generated
	 */
	public Adapter createMeasureReportPopulationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MeasureReportPopulation1 <em>Measure Report Population1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MeasureReportPopulation1
	 * @generated
	 */
	public Adapter createMeasureReportPopulation1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MeasureReportStatus <em>Measure Report Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MeasureReportStatus
	 * @generated
	 */
	public Adapter createMeasureReportStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MeasureReportStratifier <em>Measure Report Stratifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MeasureReportStratifier
	 * @generated
	 */
	public Adapter createMeasureReportStratifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MeasureReportSupplementalData <em>Measure Report Supplemental Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MeasureReportSupplementalData
	 * @generated
	 */
	public Adapter createMeasureReportSupplementalDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MeasureReportType <em>Measure Report Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MeasureReportType
	 * @generated
	 */
	public Adapter createMeasureReportTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MeasureScoring <em>Measure Scoring</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MeasureScoring
	 * @generated
	 */
	public Adapter createMeasureScoringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MeasureStratifier <em>Measure Stratifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MeasureStratifier
	 * @generated
	 */
	public Adapter createMeasureStratifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MeasureSupplementalData <em>Measure Supplemental Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MeasureSupplementalData
	 * @generated
	 */
	public Adapter createMeasureSupplementalDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MeasureType <em>Measure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MeasureType
	 * @generated
	 */
	public Adapter createMeasureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Media <em>Media</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Media
	 * @generated
	 */
	public Adapter createMediaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Medication <em>Medication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Medication
	 * @generated
	 */
	public Adapter createMedicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MedicationAdministration <em>Medication Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MedicationAdministration
	 * @generated
	 */
	public Adapter createMedicationAdministrationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MedicationAdministrationDosage <em>Medication Administration Dosage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MedicationAdministrationDosage
	 * @generated
	 */
	public Adapter createMedicationAdministrationDosageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MedicationAdministrationStatus <em>Medication Administration Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MedicationAdministrationStatus
	 * @generated
	 */
	public Adapter createMedicationAdministrationStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MedicationBatch <em>Medication Batch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MedicationBatch
	 * @generated
	 */
	public Adapter createMedicationBatchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MedicationContent <em>Medication Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MedicationContent
	 * @generated
	 */
	public Adapter createMedicationContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MedicationDispense <em>Medication Dispense</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MedicationDispense
	 * @generated
	 */
	public Adapter createMedicationDispenseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MedicationDispenseStatus <em>Medication Dispense Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MedicationDispenseStatus
	 * @generated
	 */
	public Adapter createMedicationDispenseStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MedicationDispenseSubstitution <em>Medication Dispense Substitution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MedicationDispenseSubstitution
	 * @generated
	 */
	public Adapter createMedicationDispenseSubstitutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MedicationIngredient <em>Medication Ingredient</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MedicationIngredient
	 * @generated
	 */
	public Adapter createMedicationIngredientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MedicationPackage <em>Medication Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MedicationPackage
	 * @generated
	 */
	public Adapter createMedicationPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MedicationProduct <em>Medication Product</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MedicationProduct
	 * @generated
	 */
	public Adapter createMedicationProductAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MedicationRequest <em>Medication Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MedicationRequest
	 * @generated
	 */
	public Adapter createMedicationRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MedicationRequestDispenseRequest <em>Medication Request Dispense Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MedicationRequestDispenseRequest
	 * @generated
	 */
	public Adapter createMedicationRequestDispenseRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MedicationRequestStatus <em>Medication Request Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MedicationRequestStatus
	 * @generated
	 */
	public Adapter createMedicationRequestStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MedicationRequestSubstitution <em>Medication Request Substitution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MedicationRequestSubstitution
	 * @generated
	 */
	public Adapter createMedicationRequestSubstitutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MedicationStatement <em>Medication Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MedicationStatement
	 * @generated
	 */
	public Adapter createMedicationStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MedicationStatementCategory <em>Medication Statement Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MedicationStatementCategory
	 * @generated
	 */
	public Adapter createMedicationStatementCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MedicationStatementNotTaken <em>Medication Statement Not Taken</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MedicationStatementNotTaken
	 * @generated
	 */
	public Adapter createMedicationStatementNotTakenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MedicationStatementStatus <em>Medication Statement Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MedicationStatementStatus
	 * @generated
	 */
	public Adapter createMedicationStatementStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MessageDefinition <em>Message Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MessageDefinition
	 * @generated
	 */
	public Adapter createMessageDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MessageDefinitionAllowedResponse <em>Message Definition Allowed Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MessageDefinitionAllowedResponse
	 * @generated
	 */
	public Adapter createMessageDefinitionAllowedResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MessageDefinitionFocus <em>Message Definition Focus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MessageDefinitionFocus
	 * @generated
	 */
	public Adapter createMessageDefinitionFocusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MessageHeader <em>Message Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MessageHeader
	 * @generated
	 */
	public Adapter createMessageHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MessageHeaderDestination <em>Message Header Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MessageHeaderDestination
	 * @generated
	 */
	public Adapter createMessageHeaderDestinationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MessageHeaderResponse <em>Message Header Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MessageHeaderResponse
	 * @generated
	 */
	public Adapter createMessageHeaderResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MessageHeaderSource <em>Message Header Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MessageHeaderSource
	 * @generated
	 */
	public Adapter createMessageHeaderSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MessageSignificanceCategory <em>Message Significance Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MessageSignificanceCategory
	 * @generated
	 */
	public Adapter createMessageSignificanceCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Meta <em>Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Meta
	 * @generated
	 */
	public Adapter createMetaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Money <em>Money</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Money
	 * @generated
	 */
	public Adapter createMoneyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.NameUse <em>Name Use</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.NameUse
	 * @generated
	 */
	public Adapter createNameUseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.NamingSystem <em>Naming System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.NamingSystem
	 * @generated
	 */
	public Adapter createNamingSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.NamingSystemIdentifierType <em>Naming System Identifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.NamingSystemIdentifierType
	 * @generated
	 */
	public Adapter createNamingSystemIdentifierTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.NamingSystemType <em>Naming System Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.NamingSystemType
	 * @generated
	 */
	public Adapter createNamingSystemTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.NamingSystemUniqueId <em>Naming System Unique Id</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.NamingSystemUniqueId
	 * @generated
	 */
	public Adapter createNamingSystemUniqueIdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Narrative <em>Narrative</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Narrative
	 * @generated
	 */
	public Adapter createNarrativeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.NarrativeStatus <em>Narrative Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.NarrativeStatus
	 * @generated
	 */
	public Adapter createNarrativeStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.NoteType <em>Note Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.NoteType
	 * @generated
	 */
	public Adapter createNoteTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.NutritionOrderStatus <em>Nutrition Order Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.NutritionOrderStatus
	 * @generated
	 */
	public Adapter createNutritionOrderStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.NutritionRequest <em>Nutrition Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.NutritionRequest
	 * @generated
	 */
	public Adapter createNutritionRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.NutritionRequestAdministration <em>Nutrition Request Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.NutritionRequestAdministration
	 * @generated
	 */
	public Adapter createNutritionRequestAdministrationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.NutritionRequestEnteralFormula <em>Nutrition Request Enteral Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.NutritionRequestEnteralFormula
	 * @generated
	 */
	public Adapter createNutritionRequestEnteralFormulaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.NutritionRequestNutrient <em>Nutrition Request Nutrient</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.NutritionRequestNutrient
	 * @generated
	 */
	public Adapter createNutritionRequestNutrientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.NutritionRequestOralDiet <em>Nutrition Request Oral Diet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.NutritionRequestOralDiet
	 * @generated
	 */
	public Adapter createNutritionRequestOralDietAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.NutritionRequestSupplement <em>Nutrition Request Supplement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.NutritionRequestSupplement
	 * @generated
	 */
	public Adapter createNutritionRequestSupplementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.NutritionRequestTexture <em>Nutrition Request Texture</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.NutritionRequestTexture
	 * @generated
	 */
	public Adapter createNutritionRequestTextureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Observation <em>Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Observation
	 * @generated
	 */
	public Adapter createObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ObservationComponent <em>Observation Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ObservationComponent
	 * @generated
	 */
	public Adapter createObservationComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ObservationReferenceRange <em>Observation Reference Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ObservationReferenceRange
	 * @generated
	 */
	public Adapter createObservationReferenceRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ObservationRelated <em>Observation Related</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ObservationRelated
	 * @generated
	 */
	public Adapter createObservationRelatedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ObservationRelationshipType <em>Observation Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ObservationRelationshipType
	 * @generated
	 */
	public Adapter createObservationRelationshipTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ObservationStatus <em>Observation Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ObservationStatus
	 * @generated
	 */
	public Adapter createObservationStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Oid <em>Oid</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Oid
	 * @generated
	 */
	public Adapter createOidAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.OperationDefinition <em>Operation Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.OperationDefinition
	 * @generated
	 */
	public Adapter createOperationDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.OperationDefinitionBinding <em>Operation Definition Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.OperationDefinitionBinding
	 * @generated
	 */
	public Adapter createOperationDefinitionBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.OperationDefinitionOverload <em>Operation Definition Overload</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.OperationDefinitionOverload
	 * @generated
	 */
	public Adapter createOperationDefinitionOverloadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.OperationDefinitionParameter <em>Operation Definition Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.OperationDefinitionParameter
	 * @generated
	 */
	public Adapter createOperationDefinitionParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.OperationKind <em>Operation Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.OperationKind
	 * @generated
	 */
	public Adapter createOperationKindAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.OperationOutcome <em>Operation Outcome</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.OperationOutcome
	 * @generated
	 */
	public Adapter createOperationOutcomeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.OperationOutcomeIssue <em>Operation Outcome Issue</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.OperationOutcomeIssue
	 * @generated
	 */
	public Adapter createOperationOutcomeIssueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.OperationParameterUse <em>Operation Parameter Use</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.OperationParameterUse
	 * @generated
	 */
	public Adapter createOperationParameterUseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Organization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Organization
	 * @generated
	 */
	public Adapter createOrganizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.OrganizationContact <em>Organization Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.OrganizationContact
	 * @generated
	 */
	public Adapter createOrganizationContactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ParameterDefinition <em>Parameter Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ParameterDefinition
	 * @generated
	 */
	public Adapter createParameterDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Parameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Parameters
	 * @generated
	 */
	public Adapter createParametersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ParametersParameter <em>Parameters Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ParametersParameter
	 * @generated
	 */
	public Adapter createParametersParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ParticipantRequired <em>Participant Required</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ParticipantRequired
	 * @generated
	 */
	public Adapter createParticipantRequiredAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ParticipationStatus <em>Participation Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ParticipationStatus
	 * @generated
	 */
	public Adapter createParticipationStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Patient <em>Patient</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Patient
	 * @generated
	 */
	public Adapter createPatientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.PatientAnimal <em>Patient Animal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.PatientAnimal
	 * @generated
	 */
	public Adapter createPatientAnimalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.PatientCommunication <em>Patient Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.PatientCommunication
	 * @generated
	 */
	public Adapter createPatientCommunicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.PatientContact <em>Patient Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.PatientContact
	 * @generated
	 */
	public Adapter createPatientContactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.PatientLink <em>Patient Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.PatientLink
	 * @generated
	 */
	public Adapter createPatientLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.PaymentNotice <em>Payment Notice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.PaymentNotice
	 * @generated
	 */
	public Adapter createPaymentNoticeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.PaymentReconciliation <em>Payment Reconciliation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.PaymentReconciliation
	 * @generated
	 */
	public Adapter createPaymentReconciliationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.PaymentReconciliationDetail <em>Payment Reconciliation Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.PaymentReconciliationDetail
	 * @generated
	 */
	public Adapter createPaymentReconciliationDetailAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.PaymentReconciliationNote <em>Payment Reconciliation Note</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.PaymentReconciliationNote
	 * @generated
	 */
	public Adapter createPaymentReconciliationNoteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Period <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Period
	 * @generated
	 */
	public Adapter createPeriodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Person
	 * @generated
	 */
	public Adapter createPersonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.PersonLink <em>Person Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.PersonLink
	 * @generated
	 */
	public Adapter createPersonLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.PlanActionCardinalityBehavior <em>Plan Action Cardinality Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.PlanActionCardinalityBehavior
	 * @generated
	 */
	public Adapter createPlanActionCardinalityBehaviorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.PlanActionConditionKind <em>Plan Action Condition Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.PlanActionConditionKind
	 * @generated
	 */
	public Adapter createPlanActionConditionKindAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.PlanActionGroupingBehavior <em>Plan Action Grouping Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.PlanActionGroupingBehavior
	 * @generated
	 */
	public Adapter createPlanActionGroupingBehaviorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.PlanActionParticipantType <em>Plan Action Participant Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.PlanActionParticipantType
	 * @generated
	 */
	public Adapter createPlanActionParticipantTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.PlanActionPrecheckBehavior <em>Plan Action Precheck Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.PlanActionPrecheckBehavior
	 * @generated
	 */
	public Adapter createPlanActionPrecheckBehaviorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.PlanActionRelationshipType <em>Plan Action Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.PlanActionRelationshipType
	 * @generated
	 */
	public Adapter createPlanActionRelationshipTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.PlanActionRequiredBehavior <em>Plan Action Required Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.PlanActionRequiredBehavior
	 * @generated
	 */
	public Adapter createPlanActionRequiredBehaviorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.PlanActionSelectionBehavior <em>Plan Action Selection Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.PlanActionSelectionBehavior
	 * @generated
	 */
	public Adapter createPlanActionSelectionBehaviorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.PlanDefinition <em>Plan Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.PlanDefinition
	 * @generated
	 */
	public Adapter createPlanDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.PlanDefinitionActionDefinition <em>Plan Definition Action Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.PlanDefinitionActionDefinition
	 * @generated
	 */
	public Adapter createPlanDefinitionActionDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.PlanDefinitionCondition <em>Plan Definition Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.PlanDefinitionCondition
	 * @generated
	 */
	public Adapter createPlanDefinitionConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.PlanDefinitionDynamicValue <em>Plan Definition Dynamic Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.PlanDefinitionDynamicValue
	 * @generated
	 */
	public Adapter createPlanDefinitionDynamicValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.PlanDefinitionRelatedAction <em>Plan Definition Related Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.PlanDefinitionRelatedAction
	 * @generated
	 */
	public Adapter createPlanDefinitionRelatedActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.PositiveInt <em>Positive Int</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.PositiveInt
	 * @generated
	 */
	public Adapter createPositiveIntAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Practitioner <em>Practitioner</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Practitioner
	 * @generated
	 */
	public Adapter createPractitionerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.PractitionerQualification <em>Practitioner Qualification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.PractitionerQualification
	 * @generated
	 */
	public Adapter createPractitionerQualificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.PractitionerRole <em>Practitioner Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.PractitionerRole
	 * @generated
	 */
	public Adapter createPractitionerRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.PractitionerRole1 <em>Practitioner Role1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.PractitionerRole1
	 * @generated
	 */
	public Adapter createPractitionerRole1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.PractitionerRoleAvailableTime <em>Practitioner Role Available Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.PractitionerRoleAvailableTime
	 * @generated
	 */
	public Adapter createPractitionerRoleAvailableTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.PractitionerRoleNotAvailable <em>Practitioner Role Not Available</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.PractitionerRoleNotAvailable
	 * @generated
	 */
	public Adapter createPractitionerRoleNotAvailableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Procedure <em>Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Procedure
	 * @generated
	 */
	public Adapter createProcedureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ProcedureFocalDevice <em>Procedure Focal Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ProcedureFocalDevice
	 * @generated
	 */
	public Adapter createProcedureFocalDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ProcedurePerformer <em>Procedure Performer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ProcedurePerformer
	 * @generated
	 */
	public Adapter createProcedurePerformerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ProcedureRequest <em>Procedure Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ProcedureRequest
	 * @generated
	 */
	public Adapter createProcedureRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ProcedureRequestPriority <em>Procedure Request Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ProcedureRequestPriority
	 * @generated
	 */
	public Adapter createProcedureRequestPriorityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ProcedureRequestStatus <em>Procedure Request Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ProcedureRequestStatus
	 * @generated
	 */
	public Adapter createProcedureRequestStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ProcedureStatus <em>Procedure Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ProcedureStatus
	 * @generated
	 */
	public Adapter createProcedureStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ProcessRequest <em>Process Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ProcessRequest
	 * @generated
	 */
	public Adapter createProcessRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ProcessRequestItem <em>Process Request Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ProcessRequestItem
	 * @generated
	 */
	public Adapter createProcessRequestItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ProcessResponse <em>Process Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ProcessResponse
	 * @generated
	 */
	public Adapter createProcessResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ProcessResponseNote <em>Process Response Note</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ProcessResponseNote
	 * @generated
	 */
	public Adapter createProcessResponseNoteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.PropertyRepresentation <em>Property Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.PropertyRepresentation
	 * @generated
	 */
	public Adapter createPropertyRepresentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.PropertyType <em>Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.PropertyType
	 * @generated
	 */
	public Adapter createPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Provenance <em>Provenance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Provenance
	 * @generated
	 */
	public Adapter createProvenanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ProvenanceAgent <em>Provenance Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ProvenanceAgent
	 * @generated
	 */
	public Adapter createProvenanceAgentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ProvenanceEntity <em>Provenance Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ProvenanceEntity
	 * @generated
	 */
	public Adapter createProvenanceEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ProvenanceEntityRole <em>Provenance Entity Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ProvenanceEntityRole
	 * @generated
	 */
	public Adapter createProvenanceEntityRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.PublicationStatus <em>Publication Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.PublicationStatus
	 * @generated
	 */
	public Adapter createPublicationStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.QualityType <em>Quality Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.QualityType
	 * @generated
	 */
	public Adapter createQualityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Quantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Quantity
	 * @generated
	 */
	public Adapter createQuantityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.QuantityComparator <em>Quantity Comparator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.QuantityComparator
	 * @generated
	 */
	public Adapter createQuantityComparatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Questionnaire <em>Questionnaire</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Questionnaire
	 * @generated
	 */
	public Adapter createQuestionnaireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.QuestionnaireEnableWhen <em>Questionnaire Enable When</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.QuestionnaireEnableWhen
	 * @generated
	 */
	public Adapter createQuestionnaireEnableWhenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.QuestionnaireItem <em>Questionnaire Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.QuestionnaireItem
	 * @generated
	 */
	public Adapter createQuestionnaireItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.QuestionnaireItemType <em>Questionnaire Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.QuestionnaireItemType
	 * @generated
	 */
	public Adapter createQuestionnaireItemTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.QuestionnaireOption <em>Questionnaire Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.QuestionnaireOption
	 * @generated
	 */
	public Adapter createQuestionnaireOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.QuestionnaireResponse <em>Questionnaire Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.QuestionnaireResponse
	 * @generated
	 */
	public Adapter createQuestionnaireResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.QuestionnaireResponseAnswer <em>Questionnaire Response Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.QuestionnaireResponseAnswer
	 * @generated
	 */
	public Adapter createQuestionnaireResponseAnswerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.QuestionnaireResponseItem <em>Questionnaire Response Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.QuestionnaireResponseItem
	 * @generated
	 */
	public Adapter createQuestionnaireResponseItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.QuestionnaireResponseStatus <em>Questionnaire Response Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.QuestionnaireResponseStatus
	 * @generated
	 */
	public Adapter createQuestionnaireResponseStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.QuestionnaireStatus <em>Questionnaire Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.QuestionnaireStatus
	 * @generated
	 */
	public Adapter createQuestionnaireStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Range <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Range
	 * @generated
	 */
	public Adapter createRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Ratio <em>Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Ratio
	 * @generated
	 */
	public Adapter createRatioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Reference
	 * @generated
	 */
	public Adapter createReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ReferenceHandlingPolicy <em>Reference Handling Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ReferenceHandlingPolicy
	 * @generated
	 */
	public Adapter createReferenceHandlingPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ReferenceVersionRules <em>Reference Version Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ReferenceVersionRules
	 * @generated
	 */
	public Adapter createReferenceVersionRulesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ReferralCategory <em>Referral Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ReferralCategory
	 * @generated
	 */
	public Adapter createReferralCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ReferralRequest <em>Referral Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ReferralRequest
	 * @generated
	 */
	public Adapter createReferralRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ReferralStatus <em>Referral Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ReferralStatus
	 * @generated
	 */
	public Adapter createReferralStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.RelatedArtifact <em>Related Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.RelatedArtifact
	 * @generated
	 */
	public Adapter createRelatedArtifactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.RelatedArtifactType <em>Related Artifact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.RelatedArtifactType
	 * @generated
	 */
	public Adapter createRelatedArtifactTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.RelatedPerson <em>Related Person</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.RelatedPerson
	 * @generated
	 */
	public Adapter createRelatedPersonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.RemittanceOutcome <em>Remittance Outcome</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.RemittanceOutcome
	 * @generated
	 */
	public Adapter createRemittanceOutcomeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.RepositoryType <em>Repository Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.RepositoryType
	 * @generated
	 */
	public Adapter createRepositoryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.RequestGroup <em>Request Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.RequestGroup
	 * @generated
	 */
	public Adapter createRequestGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.RequestGroupAction <em>Request Group Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.RequestGroupAction
	 * @generated
	 */
	public Adapter createRequestGroupActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.RequestGroupCondition <em>Request Group Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.RequestGroupCondition
	 * @generated
	 */
	public Adapter createRequestGroupConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.RequestGroupRelatedAction <em>Request Group Related Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.RequestGroupRelatedAction
	 * @generated
	 */
	public Adapter createRequestGroupRelatedActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ResearchStudy <em>Research Study</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ResearchStudy
	 * @generated
	 */
	public Adapter createResearchStudyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ResearchStudyArm <em>Research Study Arm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ResearchStudyArm
	 * @generated
	 */
	public Adapter createResearchStudyArmAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ResearchStudyStatus <em>Research Study Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ResearchStudyStatus
	 * @generated
	 */
	public Adapter createResearchStudyStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ResearchSubject <em>Research Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ResearchSubject
	 * @generated
	 */
	public Adapter createResearchSubjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ResearchSubjectStatus <em>Research Subject Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ResearchSubjectStatus
	 * @generated
	 */
	public Adapter createResearchSubjectStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Resource
	 * @generated
	 */
	public Adapter createResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ResourceContainer <em>Resource Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ResourceContainer
	 * @generated
	 */
	public Adapter createResourceContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ResourceVersionPolicy <em>Resource Version Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ResourceVersionPolicy
	 * @generated
	 */
	public Adapter createResourceVersionPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ResponseType <em>Response Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ResponseType
	 * @generated
	 */
	public Adapter createResponseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.RestfulCapabilityMode <em>Restful Capability Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.RestfulCapabilityMode
	 * @generated
	 */
	public Adapter createRestfulCapabilityModeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.RiskAssessment <em>Risk Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.RiskAssessment
	 * @generated
	 */
	public Adapter createRiskAssessmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.RiskAssessmentPrediction <em>Risk Assessment Prediction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.RiskAssessmentPrediction
	 * @generated
	 */
	public Adapter createRiskAssessmentPredictionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SampledData <em>Sampled Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SampledData
	 * @generated
	 */
	public Adapter createSampledDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SampledDataDataType <em>Sampled Data Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SampledDataDataType
	 * @generated
	 */
	public Adapter createSampledDataDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Schedule <em>Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Schedule
	 * @generated
	 */
	public Adapter createScheduleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SearchComparator <em>Search Comparator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SearchComparator
	 * @generated
	 */
	public Adapter createSearchComparatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SearchEntryMode <em>Search Entry Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SearchEntryMode
	 * @generated
	 */
	public Adapter createSearchEntryModeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SearchModifierCode <em>Search Modifier Code</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SearchModifierCode
	 * @generated
	 */
	public Adapter createSearchModifierCodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SearchParameter <em>Search Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SearchParameter
	 * @generated
	 */
	public Adapter createSearchParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SearchParameterComponent <em>Search Parameter Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SearchParameterComponent
	 * @generated
	 */
	public Adapter createSearchParameterComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SearchParamType <em>Search Param Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SearchParamType
	 * @generated
	 */
	public Adapter createSearchParamTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Sequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Sequence
	 * @generated
	 */
	public Adapter createSequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SequenceInner <em>Sequence Inner</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SequenceInner
	 * @generated
	 */
	public Adapter createSequenceInnerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SequenceOuter <em>Sequence Outer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SequenceOuter
	 * @generated
	 */
	public Adapter createSequenceOuterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SequenceQuality <em>Sequence Quality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SequenceQuality
	 * @generated
	 */
	public Adapter createSequenceQualityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SequenceReferenceSeq <em>Sequence Reference Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SequenceReferenceSeq
	 * @generated
	 */
	public Adapter createSequenceReferenceSeqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SequenceRepository <em>Sequence Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SequenceRepository
	 * @generated
	 */
	public Adapter createSequenceRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SequenceStructureVariant <em>Sequence Structure Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SequenceStructureVariant
	 * @generated
	 */
	public Adapter createSequenceStructureVariantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SequenceType <em>Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SequenceType
	 * @generated
	 */
	public Adapter createSequenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SequenceVariant <em>Sequence Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SequenceVariant
	 * @generated
	 */
	public Adapter createSequenceVariantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ServiceDefinition <em>Service Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ServiceDefinition
	 * @generated
	 */
	public Adapter createServiceDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Signature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Signature
	 * @generated
	 */
	public Adapter createSignatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SlicingRules <em>Slicing Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SlicingRules
	 * @generated
	 */
	public Adapter createSlicingRulesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Slot <em>Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Slot
	 * @generated
	 */
	public Adapter createSlotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SlotStatus <em>Slot Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SlotStatus
	 * @generated
	 */
	public Adapter createSlotStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Specimen <em>Specimen</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Specimen
	 * @generated
	 */
	public Adapter createSpecimenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SpecimenCollection <em>Specimen Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SpecimenCollection
	 * @generated
	 */
	public Adapter createSpecimenCollectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SpecimenContainer <em>Specimen Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SpecimenContainer
	 * @generated
	 */
	public Adapter createSpecimenContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SpecimenStatus <em>Specimen Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SpecimenStatus
	 * @generated
	 */
	public Adapter createSpecimenStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SpecimenTreatment <em>Specimen Treatment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SpecimenTreatment
	 * @generated
	 */
	public Adapter createSpecimenTreatmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.String
	 * @generated
	 */
	public Adapter createStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.StructureDefinition <em>Structure Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.StructureDefinition
	 * @generated
	 */
	public Adapter createStructureDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.StructureDefinitionDifferential <em>Structure Definition Differential</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.StructureDefinitionDifferential
	 * @generated
	 */
	public Adapter createStructureDefinitionDifferentialAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.StructureDefinitionKind <em>Structure Definition Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.StructureDefinitionKind
	 * @generated
	 */
	public Adapter createStructureDefinitionKindAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.StructureDefinitionMapping <em>Structure Definition Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.StructureDefinitionMapping
	 * @generated
	 */
	public Adapter createStructureDefinitionMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.StructureDefinitionSnapshot <em>Structure Definition Snapshot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.StructureDefinitionSnapshot
	 * @generated
	 */
	public Adapter createStructureDefinitionSnapshotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.StructureMap <em>Structure Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.StructureMap
	 * @generated
	 */
	public Adapter createStructureMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.StructureMapContextType <em>Structure Map Context Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.StructureMapContextType
	 * @generated
	 */
	public Adapter createStructureMapContextTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.StructureMapDependent <em>Structure Map Dependent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.StructureMapDependent
	 * @generated
	 */
	public Adapter createStructureMapDependentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.StructureMapGroup <em>Structure Map Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.StructureMapGroup
	 * @generated
	 */
	public Adapter createStructureMapGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.StructureMapInput <em>Structure Map Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.StructureMapInput
	 * @generated
	 */
	public Adapter createStructureMapInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.StructureMapInputMode <em>Structure Map Input Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.StructureMapInputMode
	 * @generated
	 */
	public Adapter createStructureMapInputModeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.StructureMapListMode <em>Structure Map List Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.StructureMapListMode
	 * @generated
	 */
	public Adapter createStructureMapListModeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.StructureMapModelMode <em>Structure Map Model Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.StructureMapModelMode
	 * @generated
	 */
	public Adapter createStructureMapModelModeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.StructureMapParameter <em>Structure Map Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.StructureMapParameter
	 * @generated
	 */
	public Adapter createStructureMapParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.StructureMapRule <em>Structure Map Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.StructureMapRule
	 * @generated
	 */
	public Adapter createStructureMapRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.StructureMapSource <em>Structure Map Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.StructureMapSource
	 * @generated
	 */
	public Adapter createStructureMapSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.StructureMapStructure <em>Structure Map Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.StructureMapStructure
	 * @generated
	 */
	public Adapter createStructureMapStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.StructureMapTarget <em>Structure Map Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.StructureMapTarget
	 * @generated
	 */
	public Adapter createStructureMapTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.StructureMapTransform <em>Structure Map Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.StructureMapTransform
	 * @generated
	 */
	public Adapter createStructureMapTransformAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Subscription <em>Subscription</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Subscription
	 * @generated
	 */
	public Adapter createSubscriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SubscriptionChannel <em>Subscription Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SubscriptionChannel
	 * @generated
	 */
	public Adapter createSubscriptionChannelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SubscriptionChannelType <em>Subscription Channel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SubscriptionChannelType
	 * @generated
	 */
	public Adapter createSubscriptionChannelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SubscriptionStatus <em>Subscription Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SubscriptionStatus
	 * @generated
	 */
	public Adapter createSubscriptionStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Substance <em>Substance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Substance
	 * @generated
	 */
	public Adapter createSubstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SubstanceIngredient <em>Substance Ingredient</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SubstanceIngredient
	 * @generated
	 */
	public Adapter createSubstanceIngredientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SubstanceInstance <em>Substance Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SubstanceInstance
	 * @generated
	 */
	public Adapter createSubstanceInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SupplyDelivery <em>Supply Delivery</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SupplyDelivery
	 * @generated
	 */
	public Adapter createSupplyDeliveryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SupplyDeliveryStatus <em>Supply Delivery Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SupplyDeliveryStatus
	 * @generated
	 */
	public Adapter createSupplyDeliveryStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SupplyRequest <em>Supply Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SupplyRequest
	 * @generated
	 */
	public Adapter createSupplyRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SupplyRequestStatus <em>Supply Request Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SupplyRequestStatus
	 * @generated
	 */
	public Adapter createSupplyRequestStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SupplyRequestWhen <em>Supply Request When</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SupplyRequestWhen
	 * @generated
	 */
	public Adapter createSupplyRequestWhenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SystemRestfulInteraction <em>System Restful Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SystemRestfulInteraction
	 * @generated
	 */
	public Adapter createSystemRestfulInteractionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SystemVersionProcessingMode <em>System Version Processing Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SystemVersionProcessingMode
	 * @generated
	 */
	public Adapter createSystemVersionProcessingModeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Task
	 * @generated
	 */
	public Adapter createTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TaskInput <em>Task Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TaskInput
	 * @generated
	 */
	public Adapter createTaskInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TaskOutput <em>Task Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TaskOutput
	 * @generated
	 */
	public Adapter createTaskOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TaskRequester <em>Task Requester</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TaskRequester
	 * @generated
	 */
	public Adapter createTaskRequesterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TaskRestriction <em>Task Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TaskRestriction
	 * @generated
	 */
	public Adapter createTaskRestrictionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TaskStatus <em>Task Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TaskStatus
	 * @generated
	 */
	public Adapter createTaskStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TestReport <em>Test Report</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TestReport
	 * @generated
	 */
	public Adapter createTestReportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TestReportAction <em>Test Report Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TestReportAction
	 * @generated
	 */
	public Adapter createTestReportActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TestReportAction1 <em>Test Report Action1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TestReportAction1
	 * @generated
	 */
	public Adapter createTestReportAction1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TestReportAction2 <em>Test Report Action2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TestReportAction2
	 * @generated
	 */
	public Adapter createTestReportAction2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TestReportAssert <em>Test Report Assert</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TestReportAssert
	 * @generated
	 */
	public Adapter createTestReportAssertAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TestReportOperation <em>Test Report Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TestReportOperation
	 * @generated
	 */
	public Adapter createTestReportOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TestReportParticipant <em>Test Report Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TestReportParticipant
	 * @generated
	 */
	public Adapter createTestReportParticipantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TestReportParticipantType <em>Test Report Participant Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TestReportParticipantType
	 * @generated
	 */
	public Adapter createTestReportParticipantTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TestReportResultCodes <em>Test Report Result Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TestReportResultCodes
	 * @generated
	 */
	public Adapter createTestReportResultCodesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TestReportSetup <em>Test Report Setup</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TestReportSetup
	 * @generated
	 */
	public Adapter createTestReportSetupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TestReportStatus <em>Test Report Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TestReportStatus
	 * @generated
	 */
	public Adapter createTestReportStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TestReportTeardown <em>Test Report Teardown</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TestReportTeardown
	 * @generated
	 */
	public Adapter createTestReportTeardownAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TestReportTest <em>Test Report Test</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TestReportTest
	 * @generated
	 */
	public Adapter createTestReportTestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TestScript <em>Test Script</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TestScript
	 * @generated
	 */
	public Adapter createTestScriptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TestScriptAction <em>Test Script Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TestScriptAction
	 * @generated
	 */
	public Adapter createTestScriptActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TestScriptAction1 <em>Test Script Action1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TestScriptAction1
	 * @generated
	 */
	public Adapter createTestScriptAction1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TestScriptAction2 <em>Test Script Action2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TestScriptAction2
	 * @generated
	 */
	public Adapter createTestScriptAction2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TestScriptAssert <em>Test Script Assert</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TestScriptAssert
	 * @generated
	 */
	public Adapter createTestScriptAssertAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TestScriptCapability <em>Test Script Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TestScriptCapability
	 * @generated
	 */
	public Adapter createTestScriptCapabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TestScriptDestination <em>Test Script Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TestScriptDestination
	 * @generated
	 */
	public Adapter createTestScriptDestinationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TestScriptFixture <em>Test Script Fixture</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TestScriptFixture
	 * @generated
	 */
	public Adapter createTestScriptFixtureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TestScriptLink <em>Test Script Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TestScriptLink
	 * @generated
	 */
	public Adapter createTestScriptLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TestScriptMetadata <em>Test Script Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TestScriptMetadata
	 * @generated
	 */
	public Adapter createTestScriptMetadataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TestScriptOperation <em>Test Script Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TestScriptOperation
	 * @generated
	 */
	public Adapter createTestScriptOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TestScriptOrigin <em>Test Script Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TestScriptOrigin
	 * @generated
	 */
	public Adapter createTestScriptOriginAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TestScriptParam <em>Test Script Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TestScriptParam
	 * @generated
	 */
	public Adapter createTestScriptParamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TestScriptParam1 <em>Test Script Param1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TestScriptParam1
	 * @generated
	 */
	public Adapter createTestScriptParam1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TestScriptParam2 <em>Test Script Param2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TestScriptParam2
	 * @generated
	 */
	public Adapter createTestScriptParam2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TestScriptParam3 <em>Test Script Param3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TestScriptParam3
	 * @generated
	 */
	public Adapter createTestScriptParam3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TestScriptRequestHeader <em>Test Script Request Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TestScriptRequestHeader
	 * @generated
	 */
	public Adapter createTestScriptRequestHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TestScriptRule <em>Test Script Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TestScriptRule
	 * @generated
	 */
	public Adapter createTestScriptRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TestScriptRule1 <em>Test Script Rule1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TestScriptRule1
	 * @generated
	 */
	public Adapter createTestScriptRule1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TestScriptRule2 <em>Test Script Rule2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TestScriptRule2
	 * @generated
	 */
	public Adapter createTestScriptRule2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TestScriptRule3 <em>Test Script Rule3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TestScriptRule3
	 * @generated
	 */
	public Adapter createTestScriptRule3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TestScriptRuleset <em>Test Script Ruleset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TestScriptRuleset
	 * @generated
	 */
	public Adapter createTestScriptRulesetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TestScriptRuleset1 <em>Test Script Ruleset1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TestScriptRuleset1
	 * @generated
	 */
	public Adapter createTestScriptRuleset1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TestScriptSetup <em>Test Script Setup</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TestScriptSetup
	 * @generated
	 */
	public Adapter createTestScriptSetupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TestScriptTeardown <em>Test Script Teardown</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TestScriptTeardown
	 * @generated
	 */
	public Adapter createTestScriptTeardownAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TestScriptTest <em>Test Script Test</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TestScriptTest
	 * @generated
	 */
	public Adapter createTestScriptTestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TestScriptVariable <em>Test Script Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TestScriptVariable
	 * @generated
	 */
	public Adapter createTestScriptVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Time <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Time
	 * @generated
	 */
	public Adapter createTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Timing <em>Timing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Timing
	 * @generated
	 */
	public Adapter createTimingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TimingRepeat <em>Timing Repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TimingRepeat
	 * @generated
	 */
	public Adapter createTimingRepeatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TriggerDefinition <em>Trigger Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TriggerDefinition
	 * @generated
	 */
	public Adapter createTriggerDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TriggerType <em>Trigger Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TriggerType
	 * @generated
	 */
	public Adapter createTriggerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TypeDerivationRule <em>Type Derivation Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TypeDerivationRule
	 * @generated
	 */
	public Adapter createTypeDerivationRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TypeRestfulInteraction <em>Type Restful Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TypeRestfulInteraction
	 * @generated
	 */
	public Adapter createTypeRestfulInteractionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.UnitsOfTime <em>Units Of Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.UnitsOfTime
	 * @generated
	 */
	public Adapter createUnitsOfTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.UnknownContentCode <em>Unknown Content Code</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.UnknownContentCode
	 * @generated
	 */
	public Adapter createUnknownContentCodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.UnsignedInt <em>Unsigned Int</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.UnsignedInt
	 * @generated
	 */
	public Adapter createUnsignedIntAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Uri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Uri
	 * @generated
	 */
	public Adapter createUriAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.UsageContext <em>Usage Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.UsageContext
	 * @generated
	 */
	public Adapter createUsageContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Use <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Use
	 * @generated
	 */
	public Adapter createUseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Uuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Uuid
	 * @generated
	 */
	public Adapter createUuidAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ValueSet <em>Value Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ValueSet
	 * @generated
	 */
	public Adapter createValueSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ValueSetCompose <em>Value Set Compose</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ValueSetCompose
	 * @generated
	 */
	public Adapter createValueSetComposeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ValueSetConcept <em>Value Set Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ValueSetConcept
	 * @generated
	 */
	public Adapter createValueSetConceptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ValueSetContains <em>Value Set Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ValueSetContains
	 * @generated
	 */
	public Adapter createValueSetContainsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ValueSetDesignation <em>Value Set Designation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ValueSetDesignation
	 * @generated
	 */
	public Adapter createValueSetDesignationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ValueSetExpansion <em>Value Set Expansion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ValueSetExpansion
	 * @generated
	 */
	public Adapter createValueSetExpansionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ValueSetFilter <em>Value Set Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ValueSetFilter
	 * @generated
	 */
	public Adapter createValueSetFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ValueSetInclude <em>Value Set Include</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ValueSetInclude
	 * @generated
	 */
	public Adapter createValueSetIncludeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ValueSetParameter <em>Value Set Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ValueSetParameter
	 * @generated
	 */
	public Adapter createValueSetParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.VisionPrescription <em>Vision Prescription</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.VisionPrescription
	 * @generated
	 */
	public Adapter createVisionPrescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.VisionPrescriptionDispense <em>Vision Prescription Dispense</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.VisionPrescriptionDispense
	 * @generated
	 */
	public Adapter createVisionPrescriptionDispenseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.XPathUsageType <em>XPath Usage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.XPathUsageType
	 * @generated
	 */
	public Adapter createXPathUsageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //FhirAdapterFactory
