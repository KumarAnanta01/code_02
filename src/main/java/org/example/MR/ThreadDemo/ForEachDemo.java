package org.example.MR.ThreadDemo;

import java.util.ArrayList;

public class ForEachDemo {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(5);
        al.add(3);
        al.add(4);
        al.add(1);
        al.add(2);

        al.forEach(i -> System.out.println(i));

    }
}
