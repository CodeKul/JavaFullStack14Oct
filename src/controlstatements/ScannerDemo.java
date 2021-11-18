package controlstatements;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        int num;
        String name;
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter Name");
        name = scanner.next();

        System.out.println("Your value is=>"+name);

        scanner.close();
    }
}
