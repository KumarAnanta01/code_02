package org.example.Code;

import java.util.Scanner;

public class F10 {

    //Write a Java program to compute a specified formula.
    //Specified Formula :
    //4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
    //Expected Output
    //2.9760461760461765
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms to calculate (e.g. 6): ");
        int terms = scanner.nextInt();

        double result = 0.0;
        for (int i = 0; i < terms; i++) {
            // Alternating sign: + for even index, - for odd index
            if (i % 2 == 0) {
                result += 1.0 / (2 * i + 1);
            } else {
                result -= 1.0 / (2 * i + 1);
            }
        }

        result = 4.0 * result;
        System.out.println("Result: " + result);

        scanner.close();
    }
}
