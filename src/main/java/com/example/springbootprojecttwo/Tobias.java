package com.example.springbootprojecttwo;

import org.springframework.beans.factory.annotation.Value;

public class Tobias {

    public Tobias() {
    }

    @Value("${jason.happyWord}")
    private String happyWord;


    @Value("${rnd.number}")
    private int number1;

    public int getTobias() {
        System.out.println(happyWord);
        return number1;
    }

}
