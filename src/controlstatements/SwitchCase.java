package controlstatements;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        num = scanner.nextInt();
        switch (num){
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            default:
                System.out.println("Number not found");
        }
    }
}
