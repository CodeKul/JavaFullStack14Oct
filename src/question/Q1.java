package question;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Double units=0.0;
        Double bill = 0.0;
        int extraCharges  = 20;
        Scanner  scanner = new Scanner(System.in);
        System.out.println("Enter units");
        units = scanner.nextDouble();

        if(units>50){
            bill = units * 0.50;
        }
        if(units>100){
            bill = units * 0.75;
        }
        if(units>150){
            bill = units * 1.20;
        }
        if(units>250){
            bill = units * 1.50;
        }

        bill = bill * 1.20;

        System.out.println(bill);
    }
}
