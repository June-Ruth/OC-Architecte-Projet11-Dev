package com.medhead.emergency.entity;

import java.util.Random;

public enum Speciality {

    ANAESTHETICS("Anaesthetics", GroupSpeciality.ANAESTHETICS),
    INTENSIVE_CARE_MEDICINE("Intensive care medicine", GroupSpeciality.ANAESTHETICS),
    CLINICAL_ONCOLOGY("Clinical oncology", GroupSpeciality.CLINICAL_ONCOLOGY),
    ADD_DENTAL_SPE("Additional dental specialities", GroupSpeciality.DENTAL),
    DENTAL_MAXILLO_RADIO("Dental and maxillofacial radiology", GroupSpeciality.DENTAL),
    ENDODONTICS("Endodontics", GroupSpeciality.DENTAL),
    ORAL_MAXILLO_SURGERY("Oral and maxillofacial surgery", GroupSpeciality.DENTAL),
    ORAL_MAXILLO_PATHOLOGY("Oral and maxillofacial pathology", GroupSpeciality.DENTAL),
    ORAL_MEDICINE("Oral medicine", GroupSpeciality.DENTAL),
    ORAL_SURGERY("Oral surgery", GroupSpeciality.DENTAL),
    ORTHODONTICS("Orthodontics", GroupSpeciality.DENTAL);

    private static final Random RANDOM = new Random();

    public static Speciality randomSpeciality() {
        Speciality[] specialities = values();
        return specialities[RANDOM.nextInt(specialities.length)];
    }

    public final String label;

    public final GroupSpeciality groupSpeciality;

    private Speciality(String labelP, GroupSpeciality groupSpecialityP) {
        label = labelP;
        groupSpeciality = groupSpecialityP;

    }

    /**
    Dental group	Paediatric dentistry
    Dental group	Periodontics
    Dental group	Prosthodontics
    Dental group	Restorative dentistry
    Dental group	Special care dentistry
    Emergency Medicine	Emergency medicine
    General medicine group	Acute internal medicine
    General medicine group	Allergy
    General medicine group	Audio vestibular medicine
    General medicine group	Cardiology
    General medicine group	Clinical genetics
    General medicine group	Clinical neurophysiology
    General medicine group	Clinical pharmacology and therapeutics
    General medicine group	Dermatology
    General medicine group	Endocrinology and diabetes mellitus
    General medicine group	Gastroenterology
    General medicine group	General (internal) medicine
    General medicine group	General med practitioner
    General medicine group	General practice (GP) 6 month training
    General medicine group	Genito-urinary medicine
    General medicine group	Geriatric medicine
    General medicine group	Infectious diseases
    General medicine group	Medical oncology
    General medicine group	Medical ophthalmology
    General medicine group	Neurology
    General medicine group	Occupational medicine
    General medicine group	Other
    General medicine group	Palliative medicine
    General medicine group	Rehabilitation medicine
    General medicine group	Renal medicine
    General medicine group	Respiratory medicine
    General medicine group	Rheumatology
    General medicine group	Sport and exercise medicine
    Obstetrics & gynecology	Community sexual and reproductive health
    Paediatric group	Paediatric cardiology
    Paediatric group	Paediatrics
    Pathology group	Chemical pathology
    Pathology group	Diagnostic neuropathology
    Pathology group	Forensic histopathology
    Pathology group	General pathology
    Pathology group	Haematology
    Pathology group	Histopathology
    Pathology group	Immunology
    Pathology group	Medical microbiology
    Pathology group	Paediatric and perinatal pathology
    Pathology group	Virology
    PHM & CHS group	Community health service dental
    PHM & CHS group	Community health service medical
    PHM & CHS group	Dental public health
    PHM & CHS group	General dental practitioner
    PHM & CHS group	Public health medicine
    Psychiatry group	Child and adolescent psychiatry
    Psychiatry group	Forensic psychiatry
    Psychiatry group	General psychiatry
    Psychiatry group	Old age psychiatry
    Psychiatry group	Psychiatry of learning disability
    Psychiatry group	Psychotherapy
    Radiology group	Clinical radiology
    Radiology group	Nuclear medicine
    Surgical group	Cardiothoracic surgery
    Surgical group	General surgery
    Surgical group	Neurosurgery
    Surgical group	Ophthalmology
    Surgical group	Otolaryngology
    Surgical group	Paediatric surgery
    Surgical group	Plastic surgery
    Surgical group	Trauma and orthopedic surgery
    Surgical group	Urology
    Surgical group	Vascular Surgery

     */
}
