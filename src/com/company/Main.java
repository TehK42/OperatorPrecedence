package com.company;

public class Main {

    public static void main(String[] args) {

        double twentyVariable, eightyVariable, resultValue, remainderValue;

        twentyVariable = 20.00D;
        eightyVariable = 80.00D;
        resultValue = (twentyVariable + eightyVariable) * 100.00D;
        System.out.println("The result is " + resultValue);

        remainderValue = resultValue % 40.00D;
        System.out.println("The remainder value is " + remainderValue);


        //Ternary Operator Example
        boolean lastValue = (remainderValue == 0) ? true : false;
        System.out.println("The value is " + lastValue);
        if (!lastValue) {
            System.out.println("Got some remainder");
        }
    }
}
