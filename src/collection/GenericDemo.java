package collection;

import java.util.Arrays;
import java.util.List;

public class GenericDemo {
    public static void main(String[] args) {
        List<Integer>list1 = Arrays.asList(12,434,34,5,45,324);
        printList(list1);

        List<String>list2 = Arrays.asList("Java","Python",".net");
        printList(list2);

        List list3 = Arrays.asList(324,"Groovy",45.8,'t');
        printList(list3);
    }

    public static void printList(List<?> list){
        list.forEach(s->{
            System.out.println(s);
        });
    }
}
