package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListOfMap {

    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Pune");
        map.put(2,"Mumbai");
        map.put(3,"Nashik");

        Map<Integer,String> map1 = new HashMap<>();
        map1.put(1,"Pune");
        map1.put(2,"Mumbai");
        map1.put(3,"Nashik");

        Map<Integer,String> map2 = new HashMap<>();
        map2.put(1,"Pune");
        map2.put(2,"Mumbai");
        map2.put(3,"Nashik");

        List<Map<Integer,String>> list = new ArrayList<>();

        list.add(map);
        list.add(map1);
        list.add(map2);

        list.forEach(s->{
            s.forEach((k,v)->{
                System.out.println(k+" "+v);
            });
        });
    }
}
