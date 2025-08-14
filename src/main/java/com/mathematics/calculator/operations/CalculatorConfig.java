package com.mathematics.calculator.operations;

import org.springframework.context.annotation.Bean;

public class CalculatorConfig
{


    @Bean
    public BaseCalculator add_calculator(){
        return new Addition();
    }
    @Bean
    public BaseCalculator sub_calculator(){
        return new Subraction();
    }
    @Bean
    public BaseCalculator mul_calculator(){
        return new Multiplication();
    }
    @Bean
    public BaseCalculator div_calculator(){
        return new Division();
    }

    @Bean
    public CalculatorService calculatorservice()
    {
        return new CalculatorService();
    }


}
