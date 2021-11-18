package exceptionhandling;

public class ExceptionHandlingDemo extends Object {

    public static void main(String[] args) {
        System.out.println("Hii");
        int i = 10;

        try {
            int j = i / 0;//critical statement

            try {
                String str  = null;
                System.out.println(str.length());//critical
            }catch (Exception e){
                e.printStackTrace();
            }

        } catch (NullPointerException nullPointerException) {
            System.out.println("Nullpointer=>" + nullPointerException.getMessage());
        } catch (NumberFormatException numberFormatException) {
            System.out.println("arithmetic=>" + numberFormatException.getMessage());
        } catch (Exception e) {
            System.out.println("Exception =>" + e.getMessage());
        } finally {
            System.out.println("Finally block");
            //            scanner.close();

        }

        //normal statement
        System.out.println(i);
        System.out.println("Hii");
        System.out.println("Hii");
        System.out.println("Hii");

//        FileOutputStream fileOutputStream = new FileOutputStream("Test.txt");

    }
}
