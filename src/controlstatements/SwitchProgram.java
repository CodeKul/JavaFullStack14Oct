package controlstatements;

import java.util.Scanner;

public class SwitchProgram {

    public static void main(String[] args) {
        int num1, num2;
        char operator;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num1");
        num1 = scanner.nextInt();
        System.out.println("Enter num2");
        num2 = scanner.nextInt();
        System.out.println("Enter operator");
        operator = scanner.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
            case '*':
                System.out.println(num1 * num2);
        }
    }
}
