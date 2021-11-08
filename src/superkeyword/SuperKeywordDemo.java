package superkeyword;

/**
 * 1. it refers immediate parent class instance variable
 * 2. it is used to invoke parent class methods
 * 3. it is used to invoke parent class constructor
 */
public class SuperKeywordDemo {
    int i = 10;

    public SuperKeywordDemo() {
        System.out.println("In Parent constructor");
    }

    public void show() {
        System.out.println("In Show ");
    }
}

class B extends SuperKeywordDemo {

    int i = 12;

    public B() {
        super();
        System.out.println("In child const");
    }

    public static void main(String[] args) {
        B obj = new B();
        obj.display();
    }

    public void display() {
        super.show();
        System.out.println("In Display " + super.i);
    }
}
