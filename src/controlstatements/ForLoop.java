package controlstatements;

import java.util.ArrayList;
import java.util.List;

public class ForLoop {
    public static void main(String[] args) {
        int[] arr = new int[4];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;

//        for(int i= 0;i<arr.length;i++) {
//            System.out.println(arr[i]);
//        }
//
//        System.out.println("hiii");

        for (int i : arr) {
            System.out.println(i);
        }

//        List<Integer> list = new ArrayList<>();
//        list.add(10);
//        list.add(20);
//        list.add(30);
//
//        list.forEach(s -> {
//            System.out.println(s);
//        });

    }
}
