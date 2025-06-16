package org.example.Code;

import java.util.Scanner;



public class F13 {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner in = new Scanner(System.in);

        // Prompt the user to input the width of the rectangle
        System.out.print("Enter the width of the rectangle: ");

        // Read and store the width
        double width = in.nextDouble();

        // Prompt the user to input the height of the rectangle
        System.out.print("Enter the height of the rectangle: ");

        // Read and store the height
        double height = in.nextDouble();

        // Calculate perimeter and area
        double perimeter = 2 * (height + width);
        double area = width * height;

        System.out.println("Perimeter of the rectangle is: " + perimeter);
        System.out.println("Area of the rectangle is: " + area);


        in.close();
    }
}
