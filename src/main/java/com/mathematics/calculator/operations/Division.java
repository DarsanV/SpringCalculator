package com.mathematics.calculator.operations;


import org.springframework.stereotype.Component;

@Component("Dividor")
public class Division implements BaseCalculator {

    public int calculate(int a , int b )
    {
        return a/b;
    }
}
