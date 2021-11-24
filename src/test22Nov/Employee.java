package test22Nov;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    int empId;
    String empName;
    String empAdd;
    double salary;

    public Employee(int empId, String empName, String empAdd, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.empAdd = empAdd;
        this.salary = salary;
    }

    public static void main(String[] args) {
        Employee employee = new Employee(1,"Rakesh","Pune",32432.8);
        Employee employee1 = new Employee(2,"Umesh","Pune",32432.8);
        Employee employee2 = new Employee(3,"Suhas","Pune",32432.8);

        List<Employee> employees= new ArrayList<>();
        employees.add(employee);
        employees.add(employee1);
        employees.add(employee2);

        employees.forEach(s->{
            System.out.println(s.empId+" "+s.empName+" "+s.empAdd+" "+s.salary);
        });
    }
}
