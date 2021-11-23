package exceptionhandling;

public class MethodOverridingExc {

    public void show() throws ArithmeticException{
        System.out.println("In show");
    }
}

class Sample extends MethodOverridingExc{

//    @Override
//    public void show() throws Exception {
//        super.show();
//    }
}

//if parent class declare exception then you can  declare same exception in child
//if parent class declare no exception then you can  declare unchecked exception in child
//if parent class declare unchecked exception then you can not declare parent in child