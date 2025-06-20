package org.example.Code;

import java.util.Scanner;

public class F6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input first number: ");
        int num1 = in.nextInt();

        System.out.print("Input second number: ");
        int num2 = in.nextInt();

        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));

        if (num2 != 0) {
            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
            System.out.println(num1 + " mod " + num2 + " = " + (num1 % num2));
        } else {
            System.out.println("Division and modulo by zero is not allowed.");
        }

        in.close();
    }
}
