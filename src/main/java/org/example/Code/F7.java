package org.example.Code;
//Write a Java program that takes a number as input and prints its multiplication table up to 10

import java.util.Scanner;

public class F7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num,result;

        System.out.print("Input a number: ");
         num = in.nextInt();

        System.out.println("Multiplication Table for " + num + ":");
        for (int i = 1; i <= 10; i++) {
             result = num * i;
            System.out.println(num + " x " + i + " = " + result);
        }

        in.close();
    }
}
