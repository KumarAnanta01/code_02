package org.example.Code;
//Write a Java program to divide two numbers and print them on the screen.
//
//Division is one of the four basic operations of arithmetic, the others being addition,
// subtraction, and multiplication. The division of two natural numbers is the process of
// calculating the number of times one number is contained within one another.

import java.util.Scanner;

public class F3 {
    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        int numerator, denominator, result;
        System.out.println("Enter two numbers");

        numerator = s1.nextInt();
        denominator = s1.nextInt();


        if (denominator == 0) {
            System.out.println("Error: Cannot divide by zero.");
        } else {
            result = numerator / denominator;
            System.out.println(" The Result: " + result);
        }
        s1.close();
    }
}
