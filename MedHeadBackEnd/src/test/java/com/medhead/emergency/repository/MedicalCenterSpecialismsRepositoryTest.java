package com.medhead.emergency.repository;

import com.medhead.emergency.entity.MedicalCenter;
import com.medhead.emergency.entity.Speciality;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MedicalCenterSpecialismsRepositoryTest {

    private static MedicalCenterSpecialismsRepository medicalCenterSpecialismsRepository;

    @BeforeEach
    void beforeEach() throws IOException {
        medicalCenterSpecialismsRepository = new MedicalCenterSpecialismsRepositoryPocImpl();
    }

    @Test
    void findMedicalCenterByIdThatExistsTest() {
        MedicalCenter medicalCenter = medicalCenterSpecialismsRepository.findMedicalCenterById(17970);
        assertEquals( "Walton Community Hospital - Virgin Care Services Ltd", medicalCenter.getOrganisationName());
        assertEquals("", medicalCenter.getAddress1()); //or null ?
        assertEquals("Rodney Road", medicalCenter.getAddress2());
        assertEquals("", medicalCenter.getAddress3()); //or null ?
        assertEquals("Walton-on-Thames", medicalCenter.getCity());
        assertEquals("Surrey", medicalCenter.getCounty());
        assertEquals("KT12 3LD", medicalCenter.getPostcode());
        assertEquals(51.379997253417969, medicalCenter.getGeographicCoordinates().getLatitude());
        assertEquals(-0.40604206919670105, medicalCenter.getGeographicCoordinates().getLongitude());
        assertEquals(3, medicalCenter.getSpecialities().size());
    }

    @Test
    void findMedicalCenterByIdThatNotExistsTest() {
        MedicalCenter medicalCenter = medicalCenterSpecialismsRepository.findMedicalCenterById(0);
        assertNull(medicalCenter);
    }

    @Test
    void findAllMedicalCenterTest() {
        List<MedicalCenter> medicalCenters = medicalCenterSpecialismsRepository.findAllMedicalCenters();
        assertEquals(1165, medicalCenters.size());
    }

    @Test
    void findAllMedicalCenterBySpecialityTest() {
        List<MedicalCenter> medicalCenters = medicalCenterSpecialismsRepository.findAllMedicalCentersBySpeciality(Speciality.ANAESTHETICS);
        assertTrue(medicalCenters.getFirst().getSpecialities().contains(Speciality.ANAESTHETICS));
        assertTrue(medicalCenters.size() < 1165);
    }

}
