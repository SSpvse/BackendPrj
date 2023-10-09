package com.example.springbootprojecttwo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootProjectTwoApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringbootProjectTwoApplication.class, args);




        Tobias number = new Tobias();

        int nr = number.getTobias();

        System.out.println(nr);



    }

}
