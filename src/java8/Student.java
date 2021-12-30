package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Student {

    int id;
    String name;
    Integer marks;


    public Student(int id, String name, Integer marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public static void main(String[] args) {
        Student obj1 = new Student(1,"Yogesh",34);
        Student obj2 = new Student(2,"Rakesh",64);
        Student obj3 = new Student(3,"Amit",34);
        Student obj4 = new Student(4,"Rahul",89);

        List<Student> list = Arrays.asList(obj1,obj2,obj3,obj4);

        Predicate<Student> predicate= f->f.marks==34;
        Function<Student,Integer> function = m->m.marks+1;

        list.stream()
                .filter(predicate)
                .map(function)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

    }
}
