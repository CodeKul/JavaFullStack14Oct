package controlstatements;

public class IfElseDemo {

    public static void main(String[] args) {
        int age = 19;
        String nationality = "Aus";

        if(age>=18){
            if(nationality.equals("Indian")){
                System.out.println("You can vote");
            }else {
                System.out.println("Not indian");
            }
        }else {
            System.out.println("You can not vote");
        }

        int a = 1000, b = 2003, c = 300;

        if(a>b && a>c){
            System.out.println("a is  greater");
        }else if(b>c){
            System.out.println("b is greater");
        }else {
            System.out.println("c is greater");
        }

        int j = 0;

//        if(j>0){
//            System.out.println("Not zero");
//        }else {
//            System.out.println("zero");
//        }

        String str  = j>0?"Not zero":"zero";//ternary operator
        System.out.println(str);

    }
}
