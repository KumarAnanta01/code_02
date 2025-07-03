package org.example.MR;

import java.util.function.Consumer;

public class MethodRef {
    public static void main(String[] args) {
        Consumer<String> consumer=(msg)-> System.out.println(msg);
        consumer.accept("Hii");

    }
}
