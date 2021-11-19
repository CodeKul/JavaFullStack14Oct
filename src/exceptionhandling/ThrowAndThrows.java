package exceptionhandling;

public class ThrowAndThrows {

    public static void main(String[] args) throws MyException{
        int age = 17;

        if (age >= 18) {
            System.out.println("You can vote");
        } else {
            throw new MyException("You can not vote");
        }

        System.out.println("Hii");
    }
}

class MyException extends Exception{

    public MyException(String str){
      super(str);
    }
}

/**
 *          Throw                                                      Throws
 *
 * 1.Throw is used to throw exception explicitly      1. Throws is used to declaring exception
 *
 * 2.Throw is used within method                      2. Throws is used with method signature
 *
 * 3.You can not throw multiple exception             3  using throws you can declare multiple exception
 *
 * 4.Throw is followed by instance of class           4.throws is followed by class exception
 *
 */