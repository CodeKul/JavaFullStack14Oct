package finalkeyword;

/**
 * final variable =>  you can  not re-assign value
 * final method => you can not override the method
 * final class => you can not inherit the class
 */
public final class FinalKeyword {

    final String direction = "NORTH";
    int i = 19;

    public static void main(String[] args) {
        FinalKeyword obj = new FinalKeyword();
        obj.display();
        System.out.println(obj.i);
    }

    public final void display() {
        i = 33;
    }
}

//class NewFinalKeyword extends FinalKeyword {
//
//    @Override
//    public void display() {
//        System.out.println("In display");
//    }
//}