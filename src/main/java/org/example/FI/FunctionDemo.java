package org.example.FI;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {

            Function<String, Integer> f = (name) -> name.length();

            System.out.println(f.apply("ashokit"));
            System.out.println(f.apply("hyd"));
            System.out.println(f.apply("sachin"));
        BiFunction<Integer,Integer,Integer> bif1=(a,b)->a+b;
        //BiFunction<Integer,Integer,Integer> bif1=(a,b)->a+b;
      //  here first 2gen(Integer) is for input and 3Integer for output
        System.out.println(bif1.apply(10,20));



    }
}
