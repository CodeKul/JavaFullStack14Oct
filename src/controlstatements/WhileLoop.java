package controlstatements;

public class WhileLoop {
    public static void main(String[] args) {
//
//        for (int j = 1; j <= 10; j++) {
//            System.out.println(j);
//        }
//        for (; ;) {
//            System.out.println("Infinite");
//        }

        int i = 1;

//        while (i == 10) {
//            System.out.println(i);
//            i++;
//        }

//        while (true){
//            System.out.println("Infinite");
//        }

        do{
            System.out.println(i);
            i++;
        }while (i <= 10);

    }
}
