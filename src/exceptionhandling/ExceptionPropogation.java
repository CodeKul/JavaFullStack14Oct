package exceptionhandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ExceptionPropogation {

    public void a() throws FileNotFoundException {
        int i=10;

        FileOutputStream fileOutputStream = new FileOutputStream("Test.txt");
    }
    public void b() throws FileNotFoundException {
        a();
    }
    public void c(){
        try {
            b();
        }catch (FileNotFoundException e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        ExceptionPropogation obj = new ExceptionPropogation();
        obj.c();
    }
}
