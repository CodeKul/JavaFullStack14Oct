package java8;

public class MethodRefStatic {
    public static void main(String[] args) {
        //method reference to static method

        //refer
        MyInterface5 myInterface5 = MethodRefStatic::add;
        //call
        System.out.println(myInterface5.show());;
    }

    public static Integer add(){
        return 2;
    }
}

interface MyInterface5{
    Integer show();
}