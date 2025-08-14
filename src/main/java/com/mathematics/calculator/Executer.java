package com.mathematics.calculator;

import com.mathematics.calculator.operations.CalculatorConfig;
import com.mathematics.calculator.operations.CalculatorService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class Executer {

    public static void main(String[] args)
    {
        var context = new AnnotationConfigApplicationContext(CalculatorConfig.class);
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the val1:");
        int a = sc.nextInt();

        System.out.println("Enter the val2");
        int b = sc.nextInt();

        System.out.println("Enter the Operation (add | sub | mul | div ");
        String operation = sc.next().trim().toLowerCase();

        CalculatorService service = context.getBean(CalculatorService.class);

        switch (operation)
        {
            case "add":
               service.setCalculator(context.getBean("add_calculator",com.mathematics.calculator.operations.BaseCalculator.class));
               break;

            case "sub":
                service.setCalculator(context.getBean("sub_calculator",com.mathematics.calculator.operations.BaseCalculator.class));
                break;

            case "mul":
                service.setCalculator(context.getBean("mul_calculator",com.mathematics.calculator.operations.BaseCalculator.class));
                break;

            case "div":
                service.setCalculator(context.getBean("div_calculator",com.mathematics.calculator.operations.BaseCalculator.class));
                break;

            default:
                System.out.println("Enter Valid Input");
                break;

        }
        service.calculatedval(a,b);
        context.close();
    }
}
