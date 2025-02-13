package org.example;
import java.util.Scanner;

// Q5: Multiple Exception Handling in a Calculator
//Implement a calculator that:
//Accepts two numbers and an operation (+, -, *, /).
//Throws:
//ArithmeticException for division by zero.
//IllegalArgumentException for invalid operations.
//Handle exceptions with try-catch.


public class Calculator {

    double a;
    double b;
    double result;
    char operator;

   void Calculate() throws ArithmeticException
   {
       Scanner sc = new Scanner(System.in);

       System.out.println("Choose an operator: +, -, *, or /");
       operator = sc.next().charAt(0);

       System.out.println("Enter first number");
       a = sc.nextDouble();

       System.out.println("Enter second number");
       b = sc.nextDouble();

       try {
           switch (operator) {


               case '+':
                   result = a + b;
                   System.out.println(a + " + " + b + " = " + result);
                   break;


               case '-':
                   result = a - b;
                   System.out.println(a + " - " + b + " = " + result);
                   break;


               case '*':
                   result = a * b;
                   System.out.println(a + " * " + b + " = " + result);
                   break;


               case '/':


                   if (b == 0) throw new ArithmeticException("Divide by zero not allowed!");
                   result = a / b;
                   System.out.println(a + " / " + b + " = " + result);


                   break;

               default:
                   throw new IllegalArgumentException("Invalid Operator");

           }
       }

        catch(ArithmeticException e)
       {
           System.out.println("Caught Exception" + " "+  e.getMessage());
       }
       catch(IllegalArgumentException e)
       {
           System.out.println("Caught Exception" + " "+  e.getMessage());
       }
       sc.close();
   }
    public static void main(String[] args) {
    Calculator cal = new Calculator();
    cal.Calculate();
    }
}
