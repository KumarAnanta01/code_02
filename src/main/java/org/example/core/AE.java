package org.example.core;
abstract class Super
{
    public Super()
    {
        System.out.println("Super Constructor");

    }

    public void meth1()
    {
        System.out.println("meth1 for Super");

    }
    abstract public void meth2();


}
class Sub extends Super{
    @Override
    public void meth2()
    {
        System.out.println("Sub Meth2");
    }
}


public class AE {
    public static void main(String[] args) {

        Super s1=new Sub();
        s1.meth1();
        s1.meth2();

    }
}
