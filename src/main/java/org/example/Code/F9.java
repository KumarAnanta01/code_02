package org.example.Code;

import java.util.Scanner;

//Write a Java program to compute the specified expressions and print the output.
//
//Specified Expression :
//(25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)
public class F9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Prompt and read input values
        System.out.print("Enter value for a: ");
        double a = in.nextDouble();

        System.out.print("Enter value for b: ");
        double b = in.nextDouble();

        System.out.print("Enter value for c: ");
        double c = in.nextDouble();

        System.out.print("Enter value for d: ");
        double d = in.nextDouble();

        // Compute the result of the expression: (a * b - b * b) / (c - d)
        double result = (a * b - b * b) / (c - d);

        // Print the result
        System.out.println("Result: " + result);

        in.close();
    }
}
