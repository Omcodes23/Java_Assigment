package com.mycompany.app; 

import com.mycompany.math.Calculator;

public class Main {
    public static void main(String[] args) {
        // Create an instance of the Calculator class
        Calculator calculator = new Calculator();

        // Use the add method to add two integers and display the result
        int sum = calculator.add(10, 5);
        System.out.println("Addition result: " + sum);

        // Use the subtract method to subtract one integer from another and display the
        // result
        int difference = calculator.subtract(20, 7);
        System.out.println("Subtraction result: " + difference);
    }
}
