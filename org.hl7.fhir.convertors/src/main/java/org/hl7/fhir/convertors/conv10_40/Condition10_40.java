package org.hl7.fhir.convertors.conv10_40;

import org.hl7.fhir.convertors.VersionConvertor_10_40;
import org.hl7.fhir.exceptions.FHIRException;

public class Condition10_40 {

    public static org.hl7.fhir.dstu2.model.Condition convertCondition(org.hl7.fhir.r4.model.Condition src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu2.model.Condition tgt = new org.hl7.fhir.dstu2.model.Condition();
        VersionConvertor_10_40.copyDomainResource(src, tgt);
        for (org.hl7.fhir.r4.model.Identifier t : src.getIdentifier()) tgt.addIdentifier(VersionConvertor_10_40.convertIdentifier(t));
        tgt.setPatient(VersionConvertor_10_40.convertReference(src.getSubject()));
        tgt.setEncounter(VersionConvertor_10_40.convertReference(src.getEncounter()));
        tgt.setAsserter(VersionConvertor_10_40.convertReference(src.getAsserter()));
        if (src.hasRecordedDate())
            tgt.setDateRecorded(src.getRecordedDate());
        tgt.setCode(VersionConvertor_10_40.convertCodeableConcept(src.getCode()));
        for (org.hl7.fhir.r4.model.CodeableConcept t : src.getCategory()) tgt.setCategory(VersionConvertor_10_40.convertCodeableConcept(t));
        if (src.hasClinicalStatus())
            tgt.setClinicalStatus(convertConditionClinicalStatus(src.getClinicalStatus()));
        tgt.setVerificationStatus(convertConditionVerificationStatus(src.getVerificationStatus()));
        tgt.setSeverity(VersionConvertor_10_40.convertCodeableConcept(src.getSeverity()));
        tgt.setOnset(VersionConvertor_10_40.convertType(src.getOnset()));
        tgt.setAbatement(VersionConvertor_10_40.convertType(src.getAbatement()));
        tgt.setStage(convertConditionStageComponent(src.getStageFirstRep()));
        for (org.hl7.fhir.r4.model.Condition.ConditionEvidenceComponent t : src.getEvidence()) tgt.addEvidence(convertConditionEvidenceComponent(t));
        for (org.hl7.fhir.r4.model.CodeableConcept t : src.getBodySite()) tgt.addBodySite(VersionConvertor_10_40.convertCodeableConcept(t));
        return tgt;
    }

    public static org.hl7.fhir.r4.model.Condition convertCondition(org.hl7.fhir.dstu2.model.Condition src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.r4.model.Condition tgt = new org.hl7.fhir.r4.model.Condition();
        VersionConvertor_10_40.copyDomainResource(src, tgt);
        for (org.hl7.fhir.dstu2.model.Identifier t : src.getIdentifier()) tgt.addIdentifier(VersionConvertor_10_40.convertIdentifier(t));
        tgt.setSubject(VersionConvertor_10_40.convertReference(src.getPatient()));
        tgt.setEncounter(VersionConvertor_10_40.convertReference(src.getEncounter()));
        tgt.setAsserter(VersionConvertor_10_40.convertReference(src.getAsserter()));
        if (src.hasDateRecorded())
            tgt.setRecordedDate(src.getDateRecorded());
        tgt.setCode(VersionConvertor_10_40.convertCodeableConcept(src.getCode()));
        tgt.addCategory(VersionConvertor_10_40.convertCodeableConcept(src.getCategory()));
        if (src.hasClinicalStatus())
            tgt.setClinicalStatus(convertConditionClinicalStatus(src.getClinicalStatus()));
        tgt.setVerificationStatus(convertConditionVerificationStatus(src.getVerificationStatus()));
        tgt.setSeverity(VersionConvertor_10_40.convertCodeableConcept(src.getSeverity()));
        tgt.setOnset(VersionConvertor_10_40.convertType(src.getOnset()));
        tgt.setAbatement(VersionConvertor_10_40.convertType(src.getAbatement()));
        tgt.addStage(convertConditionStageComponent(src.getStage()));
        for (org.hl7.fhir.dstu2.model.Condition.ConditionEvidenceComponent t : src.getEvidence()) tgt.addEvidence(convertConditionEvidenceComponent(t));
        for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getBodySite()) tgt.addBodySite(VersionConvertor_10_40.convertCodeableConcept(t));
        return tgt;
    }

    static public org.hl7.fhir.r4.model.CodeableConcept convertConditionClinicalStatus(String src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.r4.model.CodeableConcept cc = new org.hl7.fhir.r4.model.CodeableConcept();
        cc.addCoding().setSystem("http://hl7.org/fhir/condition-clinical").setCode(src);
        return cc;
    }

    static public String convertConditionClinicalStatus(org.hl7.fhir.r4.model.CodeableConcept src) throws FHIRException {
        if (src == null)
            return null;
        for (org.hl7.fhir.r4.model.Coding c : src.getCoding()) {
            if ("http://hl7.org/fhir/condition-clinical".equals(c.getSystem()))
                return c.getCode();
        }
        return null;
    }

    public static org.hl7.fhir.r4.model.Condition.ConditionEvidenceComponent convertConditionEvidenceComponent(org.hl7.fhir.dstu2.model.Condition.ConditionEvidenceComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.r4.model.Condition.ConditionEvidenceComponent tgt = new org.hl7.fhir.r4.model.Condition.ConditionEvidenceComponent();
        VersionConvertor_10_40.copyElement(src, tgt);
        tgt.addCode(VersionConvertor_10_40.convertCodeableConcept(src.getCode()));
        for (org.hl7.fhir.dstu2.model.Reference t : src.getDetail()) tgt.addDetail(VersionConvertor_10_40.convertReference(t));
        return tgt;
    }

    public static org.hl7.fhir.dstu2.model.Condition.ConditionEvidenceComponent convertConditionEvidenceComponent(org.hl7.fhir.r4.model.Condition.ConditionEvidenceComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu2.model.Condition.ConditionEvidenceComponent tgt = new org.hl7.fhir.dstu2.model.Condition.ConditionEvidenceComponent();
        VersionConvertor_10_40.copyElement(src, tgt);
        for (org.hl7.fhir.r4.model.CodeableConcept cc : src.getCode()) tgt.setCode(VersionConvertor_10_40.convertCodeableConcept(cc));
        for (org.hl7.fhir.r4.model.Reference t : src.getDetail()) tgt.addDetail(VersionConvertor_10_40.convertReference(t));
        return tgt;
    }

    public static org.hl7.fhir.dstu2.model.Condition.ConditionStageComponent convertConditionStageComponent(org.hl7.fhir.r4.model.Condition.ConditionStageComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu2.model.Condition.ConditionStageComponent tgt = new org.hl7.fhir.dstu2.model.Condition.ConditionStageComponent();
        VersionConvertor_10_40.copyElement(src, tgt);
        tgt.setSummary(VersionConvertor_10_40.convertCodeableConcept(src.getSummary()));
        for (org.hl7.fhir.r4.model.Reference t : src.getAssessment()) tgt.addAssessment(VersionConvertor_10_40.convertReference(t));
        return tgt;
    }

    public static org.hl7.fhir.r4.model.Condition.ConditionStageComponent convertConditionStageComponent(org.hl7.fhir.dstu2.model.Condition.ConditionStageComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.r4.model.Condition.ConditionStageComponent tgt = new org.hl7.fhir.r4.model.Condition.ConditionStageComponent();
        VersionConvertor_10_40.copyElement(src, tgt);
        tgt.setSummary(VersionConvertor_10_40.convertCodeableConcept(src.getSummary()));
        for (org.hl7.fhir.dstu2.model.Reference t : src.getAssessment()) tgt.addAssessment(VersionConvertor_10_40.convertReference(t));
        return tgt;
    }

    static public org.hl7.fhir.r4.model.CodeableConcept convertConditionVerificationStatus(org.hl7.fhir.dstu2.model.Condition.ConditionVerificationStatus src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.r4.model.CodeableConcept cc = new org.hl7.fhir.r4.model.CodeableConcept();
        switch(src) {
            case PROVISIONAL:
                cc.addCoding().setSystem("http://hl7.org/fhir/condition-ver-status").setCode("provisional");
                return cc;
            case DIFFERENTIAL:
                cc.addCoding().setSystem("http://hl7.org/fhir/condition-ver-status").setCode("differential");
                return cc;
            case CONFIRMED:
                cc.addCoding().setSystem("http://hl7.org/fhir/condition-ver-status").setCode("confirmed");
                return cc;
            case REFUTED:
                cc.addCoding().setSystem("http://hl7.org/fhir/condition-ver-status").setCode("refuted");
                return cc;
            case ENTEREDINERROR:
                cc.addCoding().setSystem("http://hl7.org/fhir/condition-ver-status").setCode("entered-in-error");
                return cc;
            default:
                return null;
        }
    }

    static public org.hl7.fhir.dstu2.model.Condition.ConditionVerificationStatus convertConditionVerificationStatus(org.hl7.fhir.r4.model.CodeableConcept src) throws FHIRException {
        if (src == null)
            return null;
        if (src.hasCoding("http://hl7.org/fhir/condition-clinical", "provisional"))
            return org.hl7.fhir.dstu2.model.Condition.ConditionVerificationStatus.PROVISIONAL;
        if (src.hasCoding("http://hl7.org/fhir/condition-clinical", "differential"))
            return org.hl7.fhir.dstu2.model.Condition.ConditionVerificationStatus.DIFFERENTIAL;
        if (src.hasCoding("http://hl7.org/fhir/condition-clinical", "confirmed"))
            return org.hl7.fhir.dstu2.model.Condition.ConditionVerificationStatus.CONFIRMED;
        if (src.hasCoding("http://hl7.org/fhir/condition-clinical", "refuted"))
            return org.hl7.fhir.dstu2.model.Condition.ConditionVerificationStatus.REFUTED;
        if (src.hasCoding("http://hl7.org/fhir/condition-clinical", "entered-in-error"))
            return org.hl7.fhir.dstu2.model.Condition.ConditionVerificationStatus.ENTEREDINERROR;
        return org.hl7.fhir.dstu2.model.Condition.ConditionVerificationStatus.NULL;
    }
}
