package org.example.Code;

import java.util.Scanner;

public class F14 {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner in = new Scanner(System.in);

        // Declare variables
        int a, b, temp;

        // Read input values from the user
        System.out.print("Enter value of a: ");
        a = in.nextInt();

        System.out.print("Enter value of b: ");
        b = in.nextInt();

        // Display before swapping
        System.out.println("Before swapping : a = " + a + ", b = " + b);

        // Swapping logic
        temp = a;
        a = b;
        b = temp;

        // Display after swapping
        System.out.println("After swapping : a = " + a + ", b = " + b);

        // Close the scanner
        in.close();
    }
}
