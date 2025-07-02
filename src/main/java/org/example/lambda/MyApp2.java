package org.example.lambda;
@FunctionalInterface
interface MyInterfaceTwo
{
    public void m2();
}
public class MyApp2 {
    public static void main(String[] args) {
        MyInterfaceTwo mit=
        ()-> System.out.println("m2 called");
        mit.m2();
    }
}
