package org.example.Code;

import java.util.Scanner;

public class F20 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input a decimal number
        System.out.print("Input a decimal number: ");
        int decimalNumber = scanner.nextInt();

        // Convert decimal to hexadecimal using built-in method
        String hex = Integer.toHexString(decimalNumber).toUpperCase();

        // Print the hexadecimal result
        System.out.println("Hexadecimal number is: " + hex);

        scanner.close();
    }
}
