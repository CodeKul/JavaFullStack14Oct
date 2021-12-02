package multithreading;

public class AnonymousInnerClass {
    public static void main(String[] args) {

        MyInterface myInterface = new MyInterface() {
            @Override
            public String msg() {
                return "Hello";
            }

            @Override
            public Integer add(int i, int j) {
                return i+j;
            }
        };
        System.out.println(myInterface.msg());
        System.out.println(myInterface.add(9,8));
    }
}

interface MyInterface{
    String  msg();
    Integer add(int i,int j);
}
