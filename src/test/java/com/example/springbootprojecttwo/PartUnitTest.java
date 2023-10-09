package com.example.springbootprojecttwo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtensionConfigurationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;


@SpringBootTest
public class PartUnitTest {


    // testing only this one thing in isolation, so how to test a service that is dependant of repo.
    // so we make a mock test, "fake": -_-______----__--------_-__-
    @Autowired
    private PartService partService;

    @MockBean
    private PartRepository partRepository;

    // mockuptests::

    // ------ testing PartService
    @Test
    void shouldGetPartsFromService() {
        ArrayList<Part> partArrayList = new ArrayList<>(List.of(new Part("pogo",7)));

        when(partRepository.getParts()).thenReturn(partArrayList);

        assertThat(partService.getParts().size()).isEqualTo(1);
    }

    //@Test
    //void shouldDeleteFromRepo() {
    //    ArrayList<Part> myList = new ArrayList<>(List.of(new Part("Frog", 10)));
    //    int idOfPart = 10;
    //
    //    when(partRepository.deletePart(10));
    //
    //    assertThat(partService.getParts().size()).isEqualTo(0);
    //}


    @Test
    void checkForNameAddingMethod() {
        // ArrayList<Part> temp = new ArrayList<>(List.of(new Part("justName",8)));
        Part parttt = new Part("justName", 8);

        when(partRepository.getPart(8)).thenReturn(parttt);

        assertThat(partService.getPart(8).name()).isEqualTo("justName");
    }



    // -_------___--------__---__-_-----

    // regular tests ::
    @Test
    void shouldRetrieveValueFromRepo() {
        PartRepository partRepository = new PartRepository();

        assertThat(partRepository.getParts().size()).isEqualTo(2);

    }
    @Test
    void addingNewPartShouldIncreaseArraySize() {
        PartRepository partRepository = new PartRepository();

        partRepository.addPart(new Part("apple", 5));
        assertThat(partRepository.getParts().size()).isEqualTo(3);
    }



}
