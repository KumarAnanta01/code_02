package org.example.Code;

import java.util.Scanner;

public class F2 {
    //Write a Java program to print the sum of two numbers.
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int a1, a2, a3;
        System.out.println("Enter two numbers");
        a1 = s1.nextInt();
        a2 = s1.nextInt();

        a3 = a1 + a2;

        System.out.println("the sum of the two numbers is "+a3);


    }
}
