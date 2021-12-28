package java8;

/**
 * interface in java can only have abstract methods.
 * All the methods of interfaces are public & abstract by default.
 * Java 8 allows the interfaces to have default and static methods.
 * The reason we have default methods in interfaces is to allow the developers to
 * add new methods to the interfaces without affecting the classes that implement these
 * interfaces.
 *
 */
public class DefaultAndStatic implements MyInterface6,MyInterface7{

    @Override
    public String str() {
        return null;
    }

    @Override
    public Integer add(int a, int b) {
        return MyInterface7.super.add(a,b);
    }


    public static void main(String[] args) {
        DefaultAndStatic obj = new DefaultAndStatic();
//        System.out.println(obj.add(3,4));
//
//        Integer i = MyInterface6.multi(6,8);
//        System.out.println(i);
    }

}

@FunctionalInterface
interface MyInterface6{
    String str();

    default Integer add(int a,int b){
        return a+b;
    }
//
//    static Integer multi(int a,int b){
//        return a*b;
//    }
}

interface MyInterface7{

    String str();
    default Integer add(int a,int b){
        return a+b;
    }

}