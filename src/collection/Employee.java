package collection;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    int id;
    String name;
    String  address;

    public Employee(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public static void main(String[] args) {
        Employee obj = new Employee(1,"Rahul","Pune");
        Employee obj1 = new Employee(1,"Rahul","Pune");
        Employee obj2 = new Employee(1,"Rahul","Pune");

        List<Employee> list = new ArrayList<>();
        list.add(obj);
        list.add(obj1);
        list.add(obj2);

        list.forEach(s->{
            System.out.println(s.id+" "+s.name+" "+s.address);
        });
    }
}