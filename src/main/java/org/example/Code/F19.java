package org.example.Code;

import java.util.Scanner;

public class F19 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input a decimal number
        System.out.print("Input a Decimal Number: ");
        int decimalNumber = scanner.nextInt();

        // Convert decimal to binary using built-in method
        String binary = Integer.toBinaryString(decimalNumber);

        // Print the binary result
        System.out.println("Binary number is: " + binary);

        scanner.close();
    }
}
