package com.example.springbootprojecttwo;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.FactoryBasedNavigableListAssert.assertThat;


@SpringBootTest
class SpringbootProjectTwoApplicationTests {

    @Autowired
    private PartController partController;

    //@Test
    //void contextLoads() {
    //    assertThat(partController).isNotNull();
    //}


}
