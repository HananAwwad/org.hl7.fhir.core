package org.hl7.fhir.convertors.conv10_40;

import org.hl7.fhir.convertors.VersionConvertor_10_40;
import org.hl7.fhir.exceptions.FHIRException;

public class Location10_40 {

    public static org.hl7.fhir.dstu2.model.Location convertLocation(org.hl7.fhir.r4.model.Location src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu2.model.Location tgt = new org.hl7.fhir.dstu2.model.Location();
        VersionConvertor_10_40.copyDomainResource(src, tgt);
        for (org.hl7.fhir.r4.model.Identifier t : src.getIdentifier()) tgt.addIdentifier(VersionConvertor_10_40.convertIdentifier(t));
        tgt.setStatus(convertLocationStatus(src.getStatus()));
        tgt.setName(src.getName());
        tgt.setDescription(src.getDescription());
        tgt.setMode(convertLocationMode(src.getMode()));
        tgt.setType(VersionConvertor_10_40.convertCodeableConcept(src.getTypeFirstRep()));
        for (org.hl7.fhir.r4.model.ContactPoint t : src.getTelecom()) tgt.addTelecom(VersionConvertor_10_40.convertContactPoint(t));
        tgt.setAddress(VersionConvertor_10_40.convertAddress(src.getAddress()));
        tgt.setPhysicalType(VersionConvertor_10_40.convertCodeableConcept(src.getPhysicalType()));
        tgt.setPosition(convertLocationPositionComponent(src.getPosition()));
        tgt.setManagingOrganization(VersionConvertor_10_40.convertReference(src.getManagingOrganization()));
        tgt.setPartOf(VersionConvertor_10_40.convertReference(src.getPartOf()));
        return tgt;
    }

    public static org.hl7.fhir.r4.model.Location convertLocation(org.hl7.fhir.dstu2.model.Location src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.r4.model.Location tgt = new org.hl7.fhir.r4.model.Location();
        VersionConvertor_10_40.copyDomainResource(src, tgt);
        for (org.hl7.fhir.dstu2.model.Identifier t : src.getIdentifier()) tgt.addIdentifier(VersionConvertor_10_40.convertIdentifier(t));
        tgt.setStatus(convertLocationStatus(src.getStatus()));
        tgt.setName(src.getName());
        tgt.setDescription(src.getDescription());
        tgt.setMode(convertLocationMode(src.getMode()));
        tgt.addType(VersionConvertor_10_40.convertCodeableConcept(src.getType()));
        for (org.hl7.fhir.dstu2.model.ContactPoint t : src.getTelecom()) tgt.addTelecom(VersionConvertor_10_40.convertContactPoint(t));
        tgt.setAddress(VersionConvertor_10_40.convertAddress(src.getAddress()));
        tgt.setPhysicalType(VersionConvertor_10_40.convertCodeableConcept(src.getPhysicalType()));
        tgt.setPosition(convertLocationPositionComponent(src.getPosition()));
        tgt.setManagingOrganization(VersionConvertor_10_40.convertReference(src.getManagingOrganization()));
        tgt.setPartOf(VersionConvertor_10_40.convertReference(src.getPartOf()));
        return tgt;
    }

    public static org.hl7.fhir.r4.model.Location.LocationMode convertLocationMode(org.hl7.fhir.dstu2.model.Location.LocationMode src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case INSTANCE:
                return org.hl7.fhir.r4.model.Location.LocationMode.INSTANCE;
            case KIND:
                return org.hl7.fhir.r4.model.Location.LocationMode.KIND;
            default:
                return org.hl7.fhir.r4.model.Location.LocationMode.NULL;
        }
    }

    public static org.hl7.fhir.dstu2.model.Location.LocationMode convertLocationMode(org.hl7.fhir.r4.model.Location.LocationMode src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case INSTANCE:
                return org.hl7.fhir.dstu2.model.Location.LocationMode.INSTANCE;
            case KIND:
                return org.hl7.fhir.dstu2.model.Location.LocationMode.KIND;
            default:
                return org.hl7.fhir.dstu2.model.Location.LocationMode.NULL;
        }
    }

    public static org.hl7.fhir.r4.model.Location.LocationPositionComponent convertLocationPositionComponent(org.hl7.fhir.dstu2.model.Location.LocationPositionComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.r4.model.Location.LocationPositionComponent tgt = new org.hl7.fhir.r4.model.Location.LocationPositionComponent();
        VersionConvertor_10_40.copyElement(src, tgt);
        tgt.setLongitude(src.getLongitude());
        tgt.setLatitude(src.getLatitude());
        tgt.setAltitude(src.getAltitude());
        return tgt;
    }

    public static org.hl7.fhir.dstu2.model.Location.LocationPositionComponent convertLocationPositionComponent(org.hl7.fhir.r4.model.Location.LocationPositionComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu2.model.Location.LocationPositionComponent tgt = new org.hl7.fhir.dstu2.model.Location.LocationPositionComponent();
        VersionConvertor_10_40.copyElement(src, tgt);
        tgt.setLongitude(src.getLongitude());
        tgt.setLatitude(src.getLatitude());
        tgt.setAltitude(src.getAltitude());
        return tgt;
    }

    public static org.hl7.fhir.r4.model.Location.LocationStatus convertLocationStatus(org.hl7.fhir.dstu2.model.Location.LocationStatus src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case ACTIVE:
                return org.hl7.fhir.r4.model.Location.LocationStatus.ACTIVE;
            case SUSPENDED:
                return org.hl7.fhir.r4.model.Location.LocationStatus.SUSPENDED;
            case INACTIVE:
                return org.hl7.fhir.r4.model.Location.LocationStatus.INACTIVE;
            default:
                return org.hl7.fhir.r4.model.Location.LocationStatus.NULL;
        }
    }

    public static org.hl7.fhir.dstu2.model.Location.LocationStatus convertLocationStatus(org.hl7.fhir.r4.model.Location.LocationStatus src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case ACTIVE:
                return org.hl7.fhir.dstu2.model.Location.LocationStatus.ACTIVE;
            case SUSPENDED:
                return org.hl7.fhir.dstu2.model.Location.LocationStatus.SUSPENDED;
            case INACTIVE:
                return org.hl7.fhir.dstu2.model.Location.LocationStatus.INACTIVE;
            default:
                return org.hl7.fhir.dstu2.model.Location.LocationStatus.NULL;
        }
    }
}
