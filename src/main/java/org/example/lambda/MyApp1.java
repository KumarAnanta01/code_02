package org.example.lambda;
interface MyInterfaceOne{
    public void m1();
}




public class MyApp1 implements MyInterfaceOne{
    @Override
    public void m1() {
        System.out.println("m1 method is called ");

    }
    public static void main(String[] args) {
        MyApp1 mao=new MyApp1();
        mao.m1();
    }
}
