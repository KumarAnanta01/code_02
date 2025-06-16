package org.example.Code;

import java.util.Scanner;

public class F17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two binary numbers as strings
        System.out.print("Enter first binary number: ");
        String binary1 = scanner.nextLine();

        System.out.print("Enter second binary number: ");
        String binary2 = scanner.nextLine();

        // Convert binary strings to decimal integers
        int num1 = Integer.parseInt(binary1, 2);
        int num2 = Integer.parseInt(binary2, 2);

        // Add the decimal numbers
        int sum = num1 + num2;

        // Convert the result back to binary
        String binarySum = Integer.toBinaryString(sum);

        // Print the result
        System.out.println("Sum of two binary numbers: " + binarySum);

        scanner.close();
    }
}
