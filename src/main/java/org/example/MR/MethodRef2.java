package org.example.MR;
interface MyInterface1{
    public void m1();
}
public class MethodRef2 {
    public static void m2()
    {
        System.out.println("this is m2() method");
    }

    public static void main(String[] args) {
        MethodRef2.m2();// calling static method or
        MyInterface1 mi=MethodRef2::m2;
        mi.m1();
    }

}
