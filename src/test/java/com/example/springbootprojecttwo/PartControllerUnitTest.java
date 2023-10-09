package com.example.springbootprojecttwo;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.FactoryBasedNavigableListAssert.assertThat;
import static org.mockito.Mockito.when;

@SpringBootTest
public class PartControllerUnitTest {

    @MockBean
    private PartService partService;

    @Autowired
    private PartController partController;



    //@Test
    //void shouldReturnResult() {
    //    ArrayList<Part> partList = new ArrayList<>(List.of(new Part("pogo",7)));
    //    when(partService.getParts()).thenReturn(partList);
    //
    //    //ResponseEntity<List<Part>> responseEntity = partController.getParts();
    //
    //    assertThat(partController.getPartss().getBody().get(0).name()).isEqualTo("pogo");
    //    //assertThat(responseEntity.getBody()).isNotNull();
    //    //assertThat(responseEntity.getBody().get(0).name()).isEqualTo("pogo");
    //}




}
