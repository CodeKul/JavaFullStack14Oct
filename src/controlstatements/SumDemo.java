package controlstatements;

import java.util.Scanner;

public class SumDemo {

    public static void main(String[] args) {
        int num, sum = 0;
        char choose='y';
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter the number");
            num = scanner.nextInt();
            sum = sum + num;

            System.out.println("Do you want to continue");
            choose = scanner.next().charAt(0);
        } while (choose == 'Y' || choose == 'y');

        System.out.println("Sum is=>" + sum);

    }
}
