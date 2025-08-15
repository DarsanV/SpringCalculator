package com.mathematics.calculator.operations;


import org.springframework.stereotype.Component;

@Component("Additor")
public class Addition implements BaseCalculator{



    public int calculate(int a , int b){
        return a+b;
    }
}
