package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {

        /**
         * LinkedList stores duplicate values
         * LinkedList maintains insertion order
         * LinkedList uses doubly linked list to store element
         */
        LinkedList<Integer> list = new LinkedList<>();
        list.add(100);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println(list);

        Iterator<Integer> iterator = list.descendingIterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
