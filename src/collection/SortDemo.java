package collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortDemo {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(12,23,4,65,6,7,83,3);

        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}
