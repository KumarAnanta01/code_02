package org.example.MR;

import java.util.function.Supplier;

public class Test {
    public static void main(String[] args) {
        //Doctor d=new Doctor(); normal way

       Supplier<Doctor> s= Doctor::new;
        System.out.println(s.get().hashCode());

    }

}
class Doctor {
    public Doctor(){
        System.out.println("Doctor constructor......");
    }
}
