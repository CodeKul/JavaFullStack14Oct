package collection;

import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {

        int[] arr = {22,133,23,444,3};

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);


//        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list.get(0));
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.remove(1));
        System.out.println(list.contains(10));
        System.out.println(list);

//        for(int i=0;i< list.size();i++){
//            System.out.println(list.get(i));
//        }
//
//        System.out.println();
//        Iterator<Integer> iterator = list.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//
//        System.out.println();
//
//        list.forEach(s->{
//            System.out.println(s);
//        });

        ArrayList<Integer> list2 = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        List<Integer> list1 = Arrays.asList(1,233,4,34,234,324);

        List<Integer> list3 = new ArrayList<>(Arrays.asList(1,233,4,34,234,324));

        List<Integer> list4 = new ArrayList<>(List.of(123,3,21,4,3));

        List<Integer> list5 = new ArrayList<>(){{
           add(10);
           add(20) ;
        }};


    }
}
