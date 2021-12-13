package collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class DequeDemo {
    public static void main(String[] args) {

        Deque<Integer> deque = new ArrayDeque<>();

        deque.add(10);
        deque.add(10);
        deque.add(20);
        deque.add(30);
        deque.add(40);
        deque.addFirst(5);
        deque.addLast(45);
        deque.add(45);

//        System.out.println(deque.element());
//        System.out.println(deque.remove());
//        System.out.println(deque.removeFirst());
//        System.out.println(deque.removeLast());
        System.out.println(deque.removeLastOccurrence(45));
        System.out.println(deque.removeFirstOccurrence(10));
        System.out.println(deque);

        for(Iterator  iterator= deque.descendingIterator(); iterator.hasNext();){
            System.out.println(iterator.next());
        }
    }
}
