package superkeyword;

import statickeyword.StaticKeywordDemo;

/**
 * 1. it refers immediate parent class instance variable
 * 2. it is used to invoke parent class methods
 * 3. it is used to invoke parent class constructor
 */
public class SuperKeywordDemo {
    int i = 10;

    public SuperKeywordDemo() {
        super();
        System.out.println("In Parent constructor");
    }

    public SuperKeywordDemo(int i){
        System.out.println("In Parent constructor parameter");
    }
    public void show() {
        System.out.println("In Show ");
    }
}

class B extends SuperKeywordDemo {

    int i = 12;
    public B() {

        System.out.println("In child const");
    }

    public B(int i){
        super();
        System.out.println("In B Const parameter");
    }

    public static void main(String[] args) {
        StaticKeywordDemo.show();
        B obj = new B(1);
    }

    public void display() {
        super.show();
        System.out.println("In Display " + super.i);
    }
}

//class C extends B{
//
//    public C(){
//        System.out.println("In c constructor");
//    }
//
//    public static void main(String[] args) {
//        C obj = new C();
//    }
//}