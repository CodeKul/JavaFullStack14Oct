package polymorphism;

import java.io.FileOutputStream;

/**
 * the ability to take one form to many form
 * or
 * one thing have many actions
 *
 * method overloading => if class have multiple methods with same name but different number of argument/parameters
 * Rule = >
 * 1.number of argument should be different.
 * 2.return type should be different
 * 3.changing the datatype of parameter
 *
 * advantage =>   it increases the readability of program.
 */
public class PolymorphismDemo {

    public static void main(String[] args) {
        PolymorphismDemo obj = new PolymorphismDemo();
        double c = obj.add(2.9, 4);
        System.out.println(c);
    }

    public double add(double a, int b) {
        return a + b;
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b;
    }

}
