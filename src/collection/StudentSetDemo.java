package collection;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class StudentSetDemo {

    int id;
    String name;
    String address;

    public StudentSetDemo(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }


    @Override
    public boolean equals(Object o) {
        StudentSetDemo studentSetDemo = (StudentSetDemo) o;
        return id == studentSetDemo.id && Objects.equals(name, studentSetDemo.name) && Objects.equals(address, studentSetDemo.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address);
    }

    public static void main(String[] args) {

        StudentSetDemo obj = new StudentSetDemo(1,"Rahul","Pune");
        StudentSetDemo obj1 = new StudentSetDemo(1,"Rahul","Pune");
        StudentSetDemo obj2 = new StudentSetDemo(2,"Mahesh","Mumbai");

//        System.out.println(obj.hashCode());
//        System.out.println(obj1.hashCode());
        Set<StudentSetDemo> setDemos = new HashSet<>();
        setDemos.add(obj);
        setDemos.add(obj1);
        setDemos.add(obj2);

        setDemos.forEach(s->{
            System.out.println(s.id+" "+s.name+ " "+s.address);
        });

    }
}
