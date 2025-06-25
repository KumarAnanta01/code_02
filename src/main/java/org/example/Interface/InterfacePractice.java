package org.example.Interface;

interface Test {
    void meth1();

    void meth2();
}
 class My implements Test{
     @Override
     public void meth1() {
         System.out.println("Meth1 of My Class");
     }

     @Override
     public void meth2() {
         System.out.println("Meth2 of My Class");

     }
     public void meth3() {
         System.out.println("Meth3 of My Class");

     }
 }

public class InterfacePractice {
    public static void main(String[] args) {
        Test t=new My();
        t.meth1();
        t.meth2();
        //t.meth3();
    }
}
