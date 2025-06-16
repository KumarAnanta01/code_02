package org.example.Code;
//11. Circle: Area and Perimeter
//
//Write a Java program to print the area and perimeter of a circle.
//Test Data:
//Radius = 7.5
//Expected Output
//Perimeter is = 47.12388980384689
//Area is = 176.71458676442586

import java.util.Scanner;

public class F11{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Prompt the user to enter the radius
            System.out.print("Enter the radius of the circle: ");
            double radius = scanner.nextDouble();

            // Calculate perimeter and area
            double perimeter = 2 * Math.PI * radius;
            double area = Math.PI * radius * radius;

            // Print the results
            System.out.println("Perimeter is = " + perimeter);
            System.out.println("Area is = " + area);

            scanner.close();
        }
}
