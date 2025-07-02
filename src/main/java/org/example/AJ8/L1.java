package org.example.AJ8;
interface Vehicle
{
    public void start();
//    public default void clean(){
//        System.out.println("cleaning completed ");
        public default void clean(){
            System.out.println("cleaning completed ");
    }
}
 class Car implements Vehicle{
     @Override
     public void clean() {
         System.out.println("my clean method..");
     }

     @Override
    public void start() {
        System.out.println("Car start....");

    }
}

public class L1 {
    public static void main(String[] args) {
        Car c1=new Car();
        c1.clean();
        c1.start();

    }
}
