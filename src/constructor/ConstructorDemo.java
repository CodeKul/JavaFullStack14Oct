package constructor;

import thiskeyword.ThisKeywordDemo;

/**
 * Constructor ->it is  special type function which invoke automatically
 * when you create object of class
 *
 * Rules to create Constructor->
 * 1. your class name and Constructor name should be same
 * 2. there should be no  explicit  return type
 * 3. static,final,synchronized keyword are not allowed with Constructor.
 *
 * Types of Constructor->
 * default Constructor
 * parameterized Constructor
 *
 * Advantage of Constructor ->
 * it initializes variable to their default value
 */
public class ConstructorDemo {

    int i;
    String string;

    public ConstructorDemo() {
        System.out.println("In default Constructor");
    }

    public ConstructorDemo(String str) {
        this();
        System.out.println("In default Constructor " + str);
    }

    public ConstructorDemo(int i,String string){
        this.i = i;
        this.string = string;
        System.out.println("i=> "+i+" string=> "+string);
    }

    public static void main(String[] args) {
//        ConstructorDemo obj = new ConstructorDemo();
//        obj.add();
        ConstructorDemo obj1 = new ConstructorDemo();
        System.out.println(obj1.i);
        System.out.println(obj1.string);

        ConstructorDemo obj2 = new ConstructorDemo(1,"Welcome");
        ThisKeywordDemo thisKeywordDemo = new ThisKeywordDemo();


    }

    public int add() {
        System.out.println("in add");
        return 1;
    }
}
