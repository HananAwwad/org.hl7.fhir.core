package org.hl7.fhir.convertors.conv30_40;

import org.hl7.fhir.convertors.VersionConvertor_30_40;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Questionnaire;

public class Questionnaire30_40 {

    public static org.hl7.fhir.r4.model.Questionnaire convertQuestionnaire(org.hl7.fhir.dstu3.model.Questionnaire src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.r4.model.Questionnaire tgt = new org.hl7.fhir.r4.model.Questionnaire();
        VersionConvertor_30_40.copyDomainResource(src, tgt);
        if (src.hasUrl())
            tgt.setUrl(src.getUrl());
        for (org.hl7.fhir.dstu3.model.Identifier t : src.getIdentifier()) tgt.addIdentifier(VersionConvertor_30_40.convertIdentifier(t));
        if (src.hasVersion())
            tgt.setVersion(src.getVersion());
        if (src.hasName())
            tgt.setName(src.getName());
        if (src.hasTitle())
            tgt.setTitle(src.getTitle());
        if (src.hasStatus())
            tgt.setStatus(VersionConvertor_30_40.convertPublicationStatus(src.getStatus()));
        if (src.hasExperimental())
            tgt.setExperimental(src.getExperimental());
        if (src.hasDateElement())
            tgt.setDateElement(VersionConvertor_30_40.convertDateTime(src.getDateElement()));
        if (src.hasPublisher())
            tgt.setPublisher(src.getPublisher());
        if (src.hasDescription())
            tgt.setDescription(src.getDescription());
        if (src.hasPurpose())
            tgt.setPurpose(src.getPurpose());
        if (src.hasApprovalDate())
            tgt.setApprovalDateElement(VersionConvertor_30_40.convertDate(src.getApprovalDateElement()));
        if (src.hasLastReviewDate())
            tgt.setLastReviewDateElement(VersionConvertor_30_40.convertDate(src.getLastReviewDateElement()));
        if (src.hasEffectivePeriod())
            tgt.setEffectivePeriod(VersionConvertor_30_40.convertPeriod(src.getEffectivePeriod()));
        for (org.hl7.fhir.dstu3.model.UsageContext t : src.getUseContext()) tgt.addUseContext(VersionConvertor_30_40.convertUsageContext(t));
        for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getJurisdiction()) tgt.addJurisdiction(VersionConvertor_30_40.convertCodeableConcept(t));
        for (org.hl7.fhir.dstu3.model.ContactDetail t : src.getContact()) tgt.addContact(VersionConvertor_30_40.convertContactDetail(t));
        if (src.hasCopyright())
            tgt.setCopyright(src.getCopyright());
        for (org.hl7.fhir.dstu3.model.Coding t : src.getCode()) tgt.addCode(VersionConvertor_30_40.convertCoding(t));
        for (org.hl7.fhir.dstu3.model.CodeType t : src.getSubjectType()) tgt.addSubjectType(t.getValue());
        for (org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemComponent t : src.getItem()) tgt.addItem(convertQuestionnaireItemComponent(t));
        return tgt;
    }

    public static org.hl7.fhir.dstu3.model.Questionnaire convertQuestionnaire(org.hl7.fhir.r4.model.Questionnaire src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.dstu3.model.Questionnaire tgt = new org.hl7.fhir.dstu3.model.Questionnaire();
        VersionConvertor_30_40.copyDomainResource(src, tgt);
        if (src.hasUrl())
            tgt.setUrl(src.getUrl());
        for (org.hl7.fhir.r4.model.Identifier t : src.getIdentifier()) tgt.addIdentifier(VersionConvertor_30_40.convertIdentifier(t));
        if (src.hasVersion())
            tgt.setVersion(src.getVersion());
        if (src.hasName())
            tgt.setName(src.getName());
        if (src.hasTitle())
            tgt.setTitle(src.getTitle());
        if (src.hasStatus())
            tgt.setStatus(VersionConvertor_30_40.convertPublicationStatus(src.getStatus()));
        if (src.hasExperimental())
            tgt.setExperimental(src.getExperimental());
        if (src.hasDateElement())
            tgt.setDateElement(VersionConvertor_30_40.convertDateTime(src.getDateElement()));
        if (src.hasPublisher())
            tgt.setPublisher(src.getPublisher());
        if (src.hasDescription())
            tgt.setDescription(src.getDescription());
        if (src.hasPurpose())
            tgt.setPurpose(src.getPurpose());
        if (src.hasApprovalDate())
            tgt.setApprovalDateElement(VersionConvertor_30_40.convertDate(src.getApprovalDateElement()));
        if (src.hasLastReviewDate())
            tgt.setLastReviewDateElement(VersionConvertor_30_40.convertDate(src.getLastReviewDateElement()));
        if (src.hasEffectivePeriod())
            tgt.setEffectivePeriod(VersionConvertor_30_40.convertPeriod(src.getEffectivePeriod()));
        for (org.hl7.fhir.r4.model.UsageContext t : src.getUseContext()) tgt.addUseContext(VersionConvertor_30_40.convertUsageContext(t));
        for (org.hl7.fhir.r4.model.CodeableConcept t : src.getJurisdiction()) tgt.addJurisdiction(VersionConvertor_30_40.convertCodeableConcept(t));
        for (org.hl7.fhir.r4.model.ContactDetail t : src.getContact()) tgt.addContact(VersionConvertor_30_40.convertContactDetail(t));
        if (src.hasCopyright())
            tgt.setCopyright(src.getCopyright());
        for (org.hl7.fhir.r4.model.Coding t : src.getCode()) tgt.addCode(VersionConvertor_30_40.convertCoding(t));
        for (org.hl7.fhir.r4.model.CodeType t : src.getSubjectType()) tgt.addSubjectType(t.getValue());
        for (org.hl7.fhir.r4.model.Questionnaire.QuestionnaireItemComponent t : src.getItem()) tgt.addItem(convertQuestionnaireItemComponent(t));
        return tgt;
    }

    public static org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemComponent convertQuestionnaireItemComponent(org.hl7.fhir.r4.model.Questionnaire.QuestionnaireItemComponent src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemComponent tgt = new org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemComponent();
        VersionConvertor_30_40.copyElement(src, tgt);
        if (src.hasLinkId())
            tgt.setLinkId(src.getLinkId());
        if (src.hasDefinition())
            tgt.setDefinition(src.getDefinition());
        for (org.hl7.fhir.r4.model.Coding t : src.getCode()) tgt.addCode(VersionConvertor_30_40.convertCoding(t));
        if (src.hasPrefix())
            tgt.setPrefix(src.getPrefix());
        if (src.hasText())
            tgt.setText(src.getText());
        if (src.hasType())
            tgt.setType(convertQuestionnaireItemType(src.getType()));
        for (org.hl7.fhir.r4.model.Questionnaire.QuestionnaireItemEnableWhenComponent t : src.getEnableWhen()) tgt.addEnableWhen(convertQuestionnaireItemEnableWhenComponent(t));
        if (src.hasRequired())
            tgt.setRequired(src.getRequired());
        if (src.hasRepeats())
            tgt.setRepeats(src.getRepeats());
        if (src.hasReadOnly())
            tgt.setReadOnly(src.getReadOnly());
        if (src.hasMaxLength())
            tgt.setMaxLength(src.getMaxLength());
        if (src.hasAnswerValueSet())
            tgt.setOptions(VersionConvertor_30_40.convertCanonicalToReference(src.getAnswerValueSetElement()));
        for (org.hl7.fhir.r4.model.Questionnaire.QuestionnaireItemAnswerOptionComponent t : src.getAnswerOption()) tgt.addOption(convertQuestionnaireItemOptionComponent(t));
        if (src.hasInitial())
            tgt.setInitial(VersionConvertor_30_40.convertType(src.getInitialFirstRep().getValue()));
        for (org.hl7.fhir.r4.model.Questionnaire.QuestionnaireItemComponent t : src.getItem()) tgt.addItem(convertQuestionnaireItemComponent(t));
        return tgt;
    }

    public static org.hl7.fhir.r4.model.Questionnaire.QuestionnaireItemComponent convertQuestionnaireItemComponent(org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemComponent src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.r4.model.Questionnaire.QuestionnaireItemComponent tgt = new org.hl7.fhir.r4.model.Questionnaire.QuestionnaireItemComponent();
        VersionConvertor_30_40.copyElement(src, tgt);
        if (src.hasLinkId())
            tgt.setLinkId(src.getLinkId());
        if (src.hasDefinition())
            tgt.setDefinition(src.getDefinition());
        for (org.hl7.fhir.dstu3.model.Coding t : src.getCode()) tgt.addCode(VersionConvertor_30_40.convertCoding(t));
        if (src.hasPrefix())
            tgt.setPrefix(src.getPrefix());
        if (src.hasText())
            tgt.setText(src.getText());
        if (src.hasType())
            tgt.setType(convertQuestionnaireItemType(src.getType()));
        for (org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemEnableWhenComponent t : src.getEnableWhen()) tgt.addEnableWhen(convertQuestionnaireItemEnableWhenComponent(t));
        tgt.setEnableBehavior(Questionnaire.EnableWhenBehavior.ANY);
        if (src.hasRequired())
            tgt.setRequired(src.getRequired());
        if (src.hasRepeats())
            tgt.setRepeats(src.getRepeats());
        if (src.hasReadOnly())
            tgt.setReadOnly(src.getReadOnly());
        if (src.hasMaxLength())
            tgt.setMaxLength(src.getMaxLength());
        if (src.hasOptions())
            tgt.setAnswerValueSetElement(VersionConvertor_30_40.convertReferenceToCanonical(src.getOptions()));
        for (org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemOptionComponent t : src.getOption()) tgt.addAnswerOption(convertQuestionnaireItemOptionComponent(t));
        if (src.hasInitial())
            tgt.addInitial().setValue(VersionConvertor_30_40.convertType(src.getInitial()));
        for (org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemComponent t : src.getItem()) tgt.addItem(convertQuestionnaireItemComponent(t));
        for (org.hl7.fhir.dstu3.model.Extension t : src.getModifierExtension()) {
            tgt.addModifierExtension(VersionConvertor_30_40.convertExtension(t));
        }
        return tgt;
    }

    public static org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemEnableWhenComponent convertQuestionnaireItemEnableWhenComponent(org.hl7.fhir.r4.model.Questionnaire.QuestionnaireItemEnableWhenComponent src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemEnableWhenComponent tgt = new org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemEnableWhenComponent();
        VersionConvertor_30_40.copyElement(src, tgt);
        if (src.hasQuestion())
            tgt.setQuestion(src.getQuestion());
        if (src.hasOperator() && src.getOperator() == org.hl7.fhir.r4.model.Questionnaire.QuestionnaireItemOperator.EXISTS)
            tgt.setHasAnswer(src.getAnswerBooleanType().getValue());
        else if (src.hasAnswer())
            tgt.setAnswer(VersionConvertor_30_40.convertType(src.getAnswer()));
        return tgt;
    }

    public static org.hl7.fhir.r4.model.Questionnaire.QuestionnaireItemEnableWhenComponent convertQuestionnaireItemEnableWhenComponent(org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemEnableWhenComponent src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.r4.model.Questionnaire.QuestionnaireItemEnableWhenComponent tgt = new org.hl7.fhir.r4.model.Questionnaire.QuestionnaireItemEnableWhenComponent();
        VersionConvertor_30_40.copyElement(src, tgt);
        if (src.hasQuestion())
            tgt.setQuestion(src.getQuestion());
        if (src.hasHasAnswer()) {
            tgt.setOperator(org.hl7.fhir.r4.model.Questionnaire.QuestionnaireItemOperator.EXISTS);
            tgt.setAnswer(VersionConvertor_30_40.convertType(src.getHasAnswerElement()));
        } else if (src.hasAnswer()) {
            tgt.setOperator(org.hl7.fhir.r4.model.Questionnaire.QuestionnaireItemOperator.EQUAL);
            tgt.setAnswer(VersionConvertor_30_40.convertType(src.getAnswer()));
        }
        return tgt;
    }

    public static org.hl7.fhir.r4.model.Questionnaire.QuestionnaireItemAnswerOptionComponent convertQuestionnaireItemOptionComponent(org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemOptionComponent src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.r4.model.Questionnaire.QuestionnaireItemAnswerOptionComponent tgt = new org.hl7.fhir.r4.model.Questionnaire.QuestionnaireItemAnswerOptionComponent();
        VersionConvertor_30_40.copyElement(src, tgt);
        if (src.hasValue())
            tgt.setValue(VersionConvertor_30_40.convertType(src.getValue()));
        return tgt;
    }

    public static org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemOptionComponent convertQuestionnaireItemOptionComponent(org.hl7.fhir.r4.model.Questionnaire.QuestionnaireItemAnswerOptionComponent src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemOptionComponent tgt = new org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemOptionComponent();
        VersionConvertor_30_40.copyElement(src, tgt);
        if (src.hasValue())
            tgt.setValue(VersionConvertor_30_40.convertType(src.getValue()));
        return tgt;
    }

    static public org.hl7.fhir.r4.model.Questionnaire.QuestionnaireItemType convertQuestionnaireItemType(org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemType src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case GROUP:
                return org.hl7.fhir.r4.model.Questionnaire.QuestionnaireItemType.GROUP;
            case DISPLAY:
                return org.hl7.fhir.r4.model.Questionnaire.QuestionnaireItemType.DISPLAY;
            case QUESTION:
                return org.hl7.fhir.r4.model.Questionnaire.QuestionnaireItemType.QUESTION;
            case BOOLEAN:
                return org.hl7.fhir.r4.model.Questionnaire.QuestionnaireItemType.BOOLEAN;
            case DECIMAL:
                return org.hl7.fhir.r4.model.Questionnaire.QuestionnaireItemType.DECIMAL;
            case INTEGER:
                return org.hl7.fhir.r4.model.Questionnaire.QuestionnaireItemType.INTEGER;
            case DATE:
                return org.hl7.fhir.r4.model.Questionnaire.QuestionnaireItemType.DATE;
            case DATETIME:
                return org.hl7.fhir.r4.model.Questionnaire.QuestionnaireItemType.DATETIME;
            case TIME:
                return org.hl7.fhir.r4.model.Questionnaire.QuestionnaireItemType.TIME;
            case STRING:
                return org.hl7.fhir.r4.model.Questionnaire.QuestionnaireItemType.STRING;
            case TEXT:
                return org.hl7.fhir.r4.model.Questionnaire.QuestionnaireItemType.TEXT;
            case URL:
                return org.hl7.fhir.r4.model.Questionnaire.QuestionnaireItemType.URL;
            case CHOICE:
                return org.hl7.fhir.r4.model.Questionnaire.QuestionnaireItemType.CHOICE;
            case OPENCHOICE:
                return org.hl7.fhir.r4.model.Questionnaire.QuestionnaireItemType.OPENCHOICE;
            case ATTACHMENT:
                return org.hl7.fhir.r4.model.Questionnaire.QuestionnaireItemType.ATTACHMENT;
            case REFERENCE:
                return org.hl7.fhir.r4.model.Questionnaire.QuestionnaireItemType.REFERENCE;
            case QUANTITY:
                return org.hl7.fhir.r4.model.Questionnaire.QuestionnaireItemType.QUANTITY;
            default:
                return org.hl7.fhir.r4.model.Questionnaire.QuestionnaireItemType.NULL;
        }
    }

    static public org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemType convertQuestionnaireItemType(org.hl7.fhir.r4.model.Questionnaire.QuestionnaireItemType src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case GROUP:
                return org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemType.GROUP;
            case DISPLAY:
                return org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemType.DISPLAY;
            case QUESTION:
                return org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemType.QUESTION;
            case BOOLEAN:
                return org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemType.BOOLEAN;
            case DECIMAL:
                return org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemType.DECIMAL;
            case INTEGER:
                return org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemType.INTEGER;
            case DATE:
                return org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemType.DATE;
            case DATETIME:
                return org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemType.DATETIME;
            case TIME:
                return org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemType.TIME;
            case STRING:
                return org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemType.STRING;
            case TEXT:
                return org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemType.TEXT;
            case URL:
                return org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemType.URL;
            case CHOICE:
                return org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemType.CHOICE;
            case OPENCHOICE:
                return org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemType.OPENCHOICE;
            case ATTACHMENT:
                return org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemType.ATTACHMENT;
            case REFERENCE:
                return org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemType.REFERENCE;
            case QUANTITY:
                return org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemType.QUANTITY;
            default:
                return org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemType.NULL;
        }
    }
}
