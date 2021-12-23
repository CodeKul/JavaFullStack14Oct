package java8;

public class MethodRefConstructor {
    public static void main(String[] args) {
//        method reference to constructor

        //refer
        MyInterface4 myInterface4 = MethodRefConstructor::new;
        //call
        myInterface4.methodRef();
    }

    MethodRefConstructor(){
        System.out.println("In constructor");
    }
}

interface MyInterface4{
    MethodRefConstructor methodRef();
}