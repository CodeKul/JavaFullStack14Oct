package collection;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {

        //set doesn't maintain  insertion order
        //set doesn't store duplicate elements

        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);

        System.out.println(set);
//        Integer[] list  = set.toArray(new Integer[0]);
//
//        for (Integer integer : list) {
//            System.out.println(integer);
//        }



        //it maintains insertion order
        Set<Integer> set1 = new LinkedHashSet<>();
        set1.add(10);
        set1.add(50);
        set1.add(30);
        set1.add(20);

        System.out.println(set1);

    }

}
