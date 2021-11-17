package exceptionhandling;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        System.out.println("Hii");
        int i=10;
        try {
            int j = i / 0;//critical statement
        }catch (ArithmeticException e){
            e.printStackTrace();
        }
        //normal statement
        System.out.println(i);
        System.out.println("Hii");
        System.out.println("Hii");
        System.out.println("Hii");
    }
}
