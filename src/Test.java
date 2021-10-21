import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test {

    int i=10;

    public void add(){
        System.out.println("In add");
    }

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        Test test=new Test();
        System.out.println(test.i);

        Test test1 = Test.class.newInstance();
        System.out.println(test1.i);

        Constructor testConstructor = Test.class.getConstructor();

        Test test2 = (Test) testConstructor.newInstance();
        System.out.println(test2.i);
        System.out.println(args[0]);
        System.out.println(args[1]);

        test.add();
    }
}
/**
 *  public => public is access specifier/modifier
 *  static => without creating object of class jvm can access the main method
 *  void => main  function return nothing so, it is void
 *  main => main is  identifier
 *  String[] =>command line argument
 *  args =>  variable name
 *
 */
