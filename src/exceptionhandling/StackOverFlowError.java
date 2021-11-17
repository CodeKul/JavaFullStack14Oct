package exceptionhandling;

public class StackOverFlowError {
    public static void main(String[] args) {
        recursive(3);
    }

    public static void recursive(int i){
        System.out.println("i=>"+i);
        if(i==0){
            return;
        }else {
            recursive(i);
        }
    }
}

