package collection;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);
        vector.add(40);
        vector.add(40);
        vector.add(40);
        vector.add(40);
        vector.add(40);
        vector.add(40);
        vector.add(40);
        System.out.println(vector.capacity());

    }
}
