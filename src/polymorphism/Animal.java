package polymorphism;

/**
 * method  overriding
 * if two classes have same method name and same signature
 * advantage => we are implementing parent  class method in child class
 */
public class Animal {

    public void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {

    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.sound();
    }

    @Override
    public void sound() {
        System.out.println("dog sound");
    }
}
