package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods {
    public static void main(String[] args) {
/**
 * 1 .Arraylist stores duplicate  values
 * 2 .Arraylist maintain insertion order
 * 3 .Arraylist uses dynamic array to store element
 */

        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);

        List<Integer>list2 = new ArrayList<>();
        list2.add(10);
        list2.add(20);
        list2.add(50);
        list2.add(60);

//        list1.addAll(list2);
//        list1.removeAll(list2);
        list1.retainAll(list2);
        System.out.println(list1);


    }
}
