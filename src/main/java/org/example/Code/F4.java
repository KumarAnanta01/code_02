package org.example.Code;

import java.util.Scanner;

public class F4 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        // First expression: -a + b * c
        System.out.print("Enter value for a: ");
        int a = s1.nextInt();
        System.out.print("Enter value for b: ");
        int b = s1.nextInt();
        System.out.print("Enter value for c: ");
        int c = s1.nextInt();
        System.out.println("Result of -a + b * c = " + (-a + b * c));

        // Second expression: (x + y) % z
        System.out.print("Enter value for x: ");
        int x = s1.nextInt();
        System.out.print("Enter value for y: ");
        int y = s1.nextInt();
        System.out.print("Enter value for z: ");
        int z = s1.nextInt();
        System.out.println("Result of (x + y) % z = " + ((x + y) % z));

        // Third expression: p + -q * r / s
        System.out.print("Enter value for p: ");
        int p = s1.nextInt();
        System.out.print("Enter value for q: ");
        int q = s1.nextInt();
        System.out.print("Enter value for r: ");
        int r = s1.nextInt();
        System.out.print("Enter value for s: ");
        int s = s1.nextInt();
        System.out.println("Result of p + -q * r / s = " + (p + -q * r / s));

        // Fourth expression: m + n / o * t - u % v
        System.out.print("Enter value for m: ");
        int m = s1.nextInt();
        System.out.print("Enter value for n: ");
        int n = s1.nextInt();
        System.out.print("Enter value for o: ");
        int o = s1.nextInt();
        System.out.print("Enter value for t: ");
        int t = s1.nextInt();
        System.out.print("Enter value for u: ");
        int u = s1.nextInt();
        System.out.print("Enter value for v: ");
        int v = s1.nextInt();
        System.out.println("Result of m + n / o * t - u % v = " + (m + n / o * t - u % v));

        s1.close();
    }
}
