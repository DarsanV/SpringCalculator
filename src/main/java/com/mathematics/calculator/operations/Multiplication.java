package com.mathematics.calculator.operations;


import org.springframework.stereotype.Component;

@Component("Multiplier")
public class Multiplication implements BaseCalculator{

    public int calculate(int a , int b)
    {
        return a*b;
    }
}
