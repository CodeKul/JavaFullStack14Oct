package java8;

import java.util.Arrays;
import java.util.List;

//method reference to instance method
public class MethodReferences {
    public static void main(String[] args) {
        MethodReferences obj = new MethodReferences();
        //refer
        MyInterface3 myInterface3 = obj::show;
        //calling method
        System.out.println(myInterface3.msg());
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        list.forEach(System.out::println);
    }
    public String show(){
        return "Hello";
    }
}

@FunctionalInterface
interface MyInterface3{
    String msg();
}
