package com.mathematics.calculator.operations;

import org.springframework.stereotype.Component;

@Component
public class CalculatorService {

    private BaseCalculator calculator;

    public void setCalculator(BaseCalculator calculator)
    {
            this.calculator=calculator;
    }

    public void calculatedval(int a , int b)
    {
          int result= calculator.calculate(a,b);
          System.out.println("Answer:" + result);
    }

}
