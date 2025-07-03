package org.example.MR.ThreadDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class NumberSort1 {

        public static void main(String[] args) {

            ArrayList<Integer> al = new ArrayList<>();
            al.add(5);
            al.add(3);
            al.add(4);
            al.add(1);
            al.add(2);

          //  System.out.println("Before Sort :: " + al);

            for (int i=0;i<al.size();i++){
                System.out.println(al.get(i));
            }

          //  Collections.sort(al, new NumberComparator());

          //  System.out.println("After Sort :: " + al);

            System.out.println("============================");
            for (int i: al){
                System.out.println(i);
            }
            System.out.println("=============================");
            al.forEach(i->System.out.println(i));
        }


    }

class NumberComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer i, Integer j) {
        if (i > j) {
            return -1;//-1  do not shift it
        } else if (i < j) {
            return 1;//+1 shift it
        }
        return 0;
    }
}


