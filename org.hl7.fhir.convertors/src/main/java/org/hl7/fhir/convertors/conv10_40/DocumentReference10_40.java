package org.hl7.fhir.convertors.conv10_40;

import org.hl7.fhir.convertors.VersionConvertor_10_40;
import org.hl7.fhir.dstu2.model.CodeableConcept;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.DocumentReference.ReferredDocumentStatus;

public class DocumentReference10_40 {

    static public CodeableConcept convertDocStatus(ReferredDocumentStatus docStatus) {
        CodeableConcept cc = new CodeableConcept();
        switch(docStatus) {
            case AMENDED:
                cc.addCoding().setSystem("http://hl7.org/fhir/composition-status").setCode("amended");
                break;
            case ENTEREDINERROR:
                cc.addCoding().setSystem("http://hl7.org/fhir/composition-status").setCode("entered-in-error");
                break;
            case FINAL:
                cc.addCoding().setSystem("http://hl7.org/fhir/composition-status").setCode("final");
                break;
            case PRELIMINARY:
                cc.addCoding().setSystem("http://hl7.org/fhir/composition-status").setCode("preliminary");
                break;
            default:
                return null;
        }
        return cc;
    }

    static public ReferredDocumentStatus convertDocStatus(CodeableConcept cc) {
        if (VersionConvertor_10_40.hasConcept(cc, "http://hl7.org/fhir/composition-status", "preliminary"))
            return ReferredDocumentStatus.PRELIMINARY;
        if (VersionConvertor_10_40.hasConcept(cc, "http://hl7.org/fhir/composition-status", "final"))
            return ReferredDocumentStatus.FINAL;
        if (VersionConvertor_10_40.hasConcept(cc, "http://hl7.org/fhir/composition-status", "amended"))
            return ReferredDocumentStatus.AMENDED;
        if (VersionConvertor_10_40.hasConcept(cc, "http://hl7.org/fhir/composition-status", "entered-in-error"))
            return ReferredDocumentStatus.ENTEREDINERROR;
        return null;
    }

    public static org.hl7.fhir.dstu2.model.DocumentReference convertDocumentReference(org.hl7.fhir.r4.model.DocumentReference src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu2.model.DocumentReference tgt = new org.hl7.fhir.dstu2.model.DocumentReference();
        VersionConvertor_10_40.copyDomainResource(src, tgt);
        tgt.setMasterIdentifier(VersionConvertor_10_40.convertIdentifier(src.getMasterIdentifier()));
        for (org.hl7.fhir.r4.model.Identifier t : src.getIdentifier()) tgt.addIdentifier(VersionConvertor_10_40.convertIdentifier(t));
        tgt.setSubject(VersionConvertor_10_40.convertReference(src.getSubject()));
        tgt.setType(VersionConvertor_10_40.convertCodeableConcept(src.getType()));
        tgt.setClass_(VersionConvertor_10_40.convertCodeableConcept(src.getCategoryFirstRep()));
        tgt.setCustodian(VersionConvertor_10_40.convertReference(src.getCustodian()));
        tgt.setAuthenticator(VersionConvertor_10_40.convertReference(src.getAuthenticator()));
        tgt.setCreated(src.getDate());
        tgt.setStatus(convertDocumentReferenceStatus(src.getStatus()));
        tgt.setDocStatus(convertDocStatus(src.getDocStatus()));
        for (org.hl7.fhir.r4.model.DocumentReference.DocumentReferenceRelatesToComponent t : src.getRelatesTo()) tgt.addRelatesTo(convertDocumentReferenceRelatesToComponent(t));
        tgt.setDescription(src.getDescription());
        for (org.hl7.fhir.r4.model.CodeableConcept t : src.getSecurityLabel()) tgt.addSecurityLabel(VersionConvertor_10_40.convertCodeableConcept(t));
        for (org.hl7.fhir.r4.model.DocumentReference.DocumentReferenceContentComponent t : src.getContent()) tgt.addContent(convertDocumentReferenceContentComponent(t));
        tgt.setContext(convertDocumentReferenceContextComponent(src.getContext()));
        return tgt;
    }

    public static org.hl7.fhir.r4.model.DocumentReference convertDocumentReference(org.hl7.fhir.dstu2.model.DocumentReference src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.r4.model.DocumentReference tgt = new org.hl7.fhir.r4.model.DocumentReference();
        VersionConvertor_10_40.copyDomainResource(src, tgt);
        tgt.setMasterIdentifier(VersionConvertor_10_40.convertIdentifier(src.getMasterIdentifier()));
        for (org.hl7.fhir.dstu2.model.Identifier t : src.getIdentifier()) tgt.addIdentifier(VersionConvertor_10_40.convertIdentifier(t));
        tgt.setSubject(VersionConvertor_10_40.convertReference(src.getSubject()));
        tgt.setType(VersionConvertor_10_40.convertCodeableConcept(src.getType()));
        tgt.addCategory(VersionConvertor_10_40.convertCodeableConcept(src.getClass_()));
        tgt.setCustodian(VersionConvertor_10_40.convertReference(src.getCustodian()));
        tgt.setAuthenticator(VersionConvertor_10_40.convertReference(src.getAuthenticator()));
        tgt.setDate(src.getCreated());
        tgt.setStatus(convertDocumentReferenceStatus(src.getStatus()));
        tgt.setDocStatus(convertDocStatus(src.getDocStatus()));
        for (org.hl7.fhir.dstu2.model.DocumentReference.DocumentReferenceRelatesToComponent t : src.getRelatesTo()) tgt.addRelatesTo(convertDocumentReferenceRelatesToComponent(t));
        tgt.setDescription(src.getDescription());
        for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getSecurityLabel()) tgt.addSecurityLabel(VersionConvertor_10_40.convertCodeableConcept(t));
        for (org.hl7.fhir.dstu2.model.DocumentReference.DocumentReferenceContentComponent t : src.getContent()) tgt.addContent(convertDocumentReferenceContentComponent(t));
        tgt.setContext(convertDocumentReferenceContextComponent(src.getContext()));
        return tgt;
    }

    public static org.hl7.fhir.r4.model.DocumentReference.DocumentReferenceContentComponent convertDocumentReferenceContentComponent(org.hl7.fhir.dstu2.model.DocumentReference.DocumentReferenceContentComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.r4.model.DocumentReference.DocumentReferenceContentComponent tgt = new org.hl7.fhir.r4.model.DocumentReference.DocumentReferenceContentComponent();
        VersionConvertor_10_40.copyElement(src, tgt);
        tgt.setAttachment(VersionConvertor_10_40.convertAttachment(src.getAttachment()));
        for (org.hl7.fhir.dstu2.model.Coding t : src.getFormat()) tgt.setFormat(VersionConvertor_10_40.convertCoding(t));
        return tgt;
    }

    public static org.hl7.fhir.dstu2.model.DocumentReference.DocumentReferenceContentComponent convertDocumentReferenceContentComponent(org.hl7.fhir.r4.model.DocumentReference.DocumentReferenceContentComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu2.model.DocumentReference.DocumentReferenceContentComponent tgt = new org.hl7.fhir.dstu2.model.DocumentReference.DocumentReferenceContentComponent();
        VersionConvertor_10_40.copyElement(src, tgt);
        tgt.setAttachment(VersionConvertor_10_40.convertAttachment(src.getAttachment()));
        tgt.addFormat(VersionConvertor_10_40.convertCoding(src.getFormat()));
        return tgt;
    }

    public static org.hl7.fhir.r4.model.DocumentReference.DocumentReferenceContextComponent convertDocumentReferenceContextComponent(org.hl7.fhir.dstu2.model.DocumentReference.DocumentReferenceContextComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.r4.model.DocumentReference.DocumentReferenceContextComponent tgt = new org.hl7.fhir.r4.model.DocumentReference.DocumentReferenceContextComponent();
        VersionConvertor_10_40.copyElement(src, tgt);
        tgt.addEncounter(VersionConvertor_10_40.convertReference(src.getEncounter()));
        for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getEvent()) tgt.addEvent(VersionConvertor_10_40.convertCodeableConcept(t));
        tgt.setPeriod(VersionConvertor_10_40.convertPeriod(src.getPeriod()));
        tgt.setFacilityType(VersionConvertor_10_40.convertCodeableConcept(src.getFacilityType()));
        tgt.setPracticeSetting(VersionConvertor_10_40.convertCodeableConcept(src.getPracticeSetting()));
        tgt.setSourcePatientInfo(VersionConvertor_10_40.convertReference(src.getSourcePatientInfo()));
        for (org.hl7.fhir.dstu2.model.DocumentReference.DocumentReferenceContextRelatedComponent t : src.getRelated()) tgt.addRelated(convertDocumentReferenceContextRelatedComponent(t));
        return tgt;
    }

    public static org.hl7.fhir.dstu2.model.DocumentReference.DocumentReferenceContextComponent convertDocumentReferenceContextComponent(org.hl7.fhir.r4.model.DocumentReference.DocumentReferenceContextComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu2.model.DocumentReference.DocumentReferenceContextComponent tgt = new org.hl7.fhir.dstu2.model.DocumentReference.DocumentReferenceContextComponent();
        VersionConvertor_10_40.copyElement(src, tgt);
        if (src.hasEncounter())
            tgt.setEncounter(VersionConvertor_10_40.convertReference(src.getEncounterFirstRep()));
        for (org.hl7.fhir.r4.model.CodeableConcept t : src.getEvent()) tgt.addEvent(VersionConvertor_10_40.convertCodeableConcept(t));
        tgt.setPeriod(VersionConvertor_10_40.convertPeriod(src.getPeriod()));
        tgt.setFacilityType(VersionConvertor_10_40.convertCodeableConcept(src.getFacilityType()));
        tgt.setPracticeSetting(VersionConvertor_10_40.convertCodeableConcept(src.getPracticeSetting()));
        tgt.setSourcePatientInfo(VersionConvertor_10_40.convertReference(src.getSourcePatientInfo()));
        for (org.hl7.fhir.r4.model.Reference t : src.getRelated()) tgt.addRelated(convertDocumentReferenceContextRelatedComponent(t));
        return tgt;
    }

    public static org.hl7.fhir.dstu2.model.DocumentReference.DocumentReferenceContextRelatedComponent convertDocumentReferenceContextRelatedComponent(org.hl7.fhir.r4.model.Reference src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu2.model.DocumentReference.DocumentReferenceContextRelatedComponent tgt = new org.hl7.fhir.dstu2.model.DocumentReference.DocumentReferenceContextRelatedComponent();
        VersionConvertor_10_40.copyElement(src, tgt);
        tgt.setIdentifier(VersionConvertor_10_40.convertIdentifier(src.getIdentifier()));
        tgt.setRef(VersionConvertor_10_40.convertReference(src));
        return tgt;
    }

    public static org.hl7.fhir.r4.model.Reference convertDocumentReferenceContextRelatedComponent(org.hl7.fhir.dstu2.model.DocumentReference.DocumentReferenceContextRelatedComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.r4.model.Reference tgt = VersionConvertor_10_40.convertReference(src.getRef());
        VersionConvertor_10_40.copyElement(src, tgt);
        tgt.setIdentifier(VersionConvertor_10_40.convertIdentifier(src.getIdentifier()));
        return tgt;
    }

    public static org.hl7.fhir.r4.model.DocumentReference.DocumentReferenceRelatesToComponent convertDocumentReferenceRelatesToComponent(org.hl7.fhir.dstu2.model.DocumentReference.DocumentReferenceRelatesToComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.r4.model.DocumentReference.DocumentReferenceRelatesToComponent tgt = new org.hl7.fhir.r4.model.DocumentReference.DocumentReferenceRelatesToComponent();
        VersionConvertor_10_40.copyElement(src, tgt);
        tgt.setCode(convertDocumentRelationshipType(src.getCode()));
        tgt.setTarget(VersionConvertor_10_40.convertReference(src.getTarget()));
        return tgt;
    }

    public static org.hl7.fhir.dstu2.model.DocumentReference.DocumentReferenceRelatesToComponent convertDocumentReferenceRelatesToComponent(org.hl7.fhir.r4.model.DocumentReference.DocumentReferenceRelatesToComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu2.model.DocumentReference.DocumentReferenceRelatesToComponent tgt = new org.hl7.fhir.dstu2.model.DocumentReference.DocumentReferenceRelatesToComponent();
        VersionConvertor_10_40.copyElement(src, tgt);
        tgt.setCode(convertDocumentRelationshipType(src.getCode()));
        tgt.setTarget(VersionConvertor_10_40.convertReference(src.getTarget()));
        return tgt;
    }

    public static org.hl7.fhir.r4.model.Enumerations.DocumentReferenceStatus convertDocumentReferenceStatus(org.hl7.fhir.dstu2.model.Enumerations.DocumentReferenceStatus src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case CURRENT:
                return org.hl7.fhir.r4.model.Enumerations.DocumentReferenceStatus.CURRENT;
            case SUPERSEDED:
                return org.hl7.fhir.r4.model.Enumerations.DocumentReferenceStatus.SUPERSEDED;
            case ENTEREDINERROR:
                return org.hl7.fhir.r4.model.Enumerations.DocumentReferenceStatus.ENTEREDINERROR;
            default:
                return org.hl7.fhir.r4.model.Enumerations.DocumentReferenceStatus.NULL;
        }
    }

    public static org.hl7.fhir.dstu2.model.Enumerations.DocumentReferenceStatus convertDocumentReferenceStatus(org.hl7.fhir.r4.model.Enumerations.DocumentReferenceStatus src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case CURRENT:
                return org.hl7.fhir.dstu2.model.Enumerations.DocumentReferenceStatus.CURRENT;
            case SUPERSEDED:
                return org.hl7.fhir.dstu2.model.Enumerations.DocumentReferenceStatus.SUPERSEDED;
            case ENTEREDINERROR:
                return org.hl7.fhir.dstu2.model.Enumerations.DocumentReferenceStatus.ENTEREDINERROR;
            default:
                return org.hl7.fhir.dstu2.model.Enumerations.DocumentReferenceStatus.NULL;
        }
    }

    public static org.hl7.fhir.dstu2.model.DocumentReference.DocumentRelationshipType convertDocumentRelationshipType(org.hl7.fhir.r4.model.DocumentReference.DocumentRelationshipType src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case REPLACES:
                return org.hl7.fhir.dstu2.model.DocumentReference.DocumentRelationshipType.REPLACES;
            case TRANSFORMS:
                return org.hl7.fhir.dstu2.model.DocumentReference.DocumentRelationshipType.TRANSFORMS;
            case SIGNS:
                return org.hl7.fhir.dstu2.model.DocumentReference.DocumentRelationshipType.SIGNS;
            case APPENDS:
                return org.hl7.fhir.dstu2.model.DocumentReference.DocumentRelationshipType.APPENDS;
            default:
                return org.hl7.fhir.dstu2.model.DocumentReference.DocumentRelationshipType.NULL;
        }
    }

    public static org.hl7.fhir.r4.model.DocumentReference.DocumentRelationshipType convertDocumentRelationshipType(org.hl7.fhir.dstu2.model.DocumentReference.DocumentRelationshipType src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case REPLACES:
                return org.hl7.fhir.r4.model.DocumentReference.DocumentRelationshipType.REPLACES;
            case TRANSFORMS:
                return org.hl7.fhir.r4.model.DocumentReference.DocumentRelationshipType.TRANSFORMS;
            case SIGNS:
                return org.hl7.fhir.r4.model.DocumentReference.DocumentRelationshipType.SIGNS;
            case APPENDS:
                return org.hl7.fhir.r4.model.DocumentReference.DocumentRelationshipType.APPENDS;
            default:
                return org.hl7.fhir.r4.model.DocumentReference.DocumentRelationshipType.NULL;
        }
    }
}
