package com.mathematics.calculator.operations;


import org.springframework.stereotype.Component;

@Component("Subractor")
public class Subraction implements BaseCalculator{

    public int calculate(int a , int b)
    {
        return a-b;
    }
}
