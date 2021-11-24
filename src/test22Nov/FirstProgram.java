package test22Nov;

import java.util.Scanner;

public class FirstProgram {
    public static void main(String[] args) {

        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        num = scanner.nextInt();

        switch (num){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Not matched");
        }
    }
}
