package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student> {

    int id;
    String name;
    String address;

    public Student(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public static void main(String[] args) {
        Student obj1 = new Student(123, "Arun", "Pune");
        Student obj2 = new Student(123, "Akash", "Mumbai");
        Student obj3 = new Student(542, "Suhas", "Kolhapur");

        List<Student> list = new ArrayList<>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);

        Collections.sort(list);
        list.forEach(s -> {
            System.out.println(s.id + " " + s.name + " " + s.address);
        });
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }

//    @Override
//    public int compareTo(Student student) {
//        if (this.id == student.id) {
//            return 0;
//        } else if (this.id > student.id) {
//            return 1;
//        } else {
//            return -1;
//        }
//    }
}
