package package1;

public class Test1 {

    protected int i = 10;

    public static void main(String[] args) {
        Test1 obj = new Test1();
        System.out.println(obj.i);
    }
}

/**
 *
 * private =>  access within a class
 * default => access within package only.it is more restrictive  than protected
 * protected => access within package and through inheritance outside the package
 * public  =>    access in whole project
 */