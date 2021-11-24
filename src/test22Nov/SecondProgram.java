package test22Nov;

public class SecondProgram {

    public static void main(String[] args) {
        int age=17;

        if(age>=18){
            System.out.println("You can vote");
        }else {
            System.out.println("you can not vote");
        }

        String  str= age>=18?"You can vote":"you can not vote";

        System.out.println(str);
    }
}
