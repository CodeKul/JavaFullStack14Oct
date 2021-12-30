package java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortedDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(15,52,83,4,85,96);

        list.stream()
                .sorted(Collections.reverseOrder())
                .forEach(System.out::println);

    }
}
