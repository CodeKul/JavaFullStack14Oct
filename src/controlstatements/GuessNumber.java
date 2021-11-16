package controlstatements;

import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {
        int randomNo = (int) (Math.random() * 100) + 1;
        int guess;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter value");
            guess = scanner.nextInt();
            if (randomNo > guess) {
                System.out.println("no is high");
            } else if (randomNo < guess) {
                System.out.println("no is low");
            } else {
                System.out.println("You guess correct");
            }
        } while (randomNo != guess);
    }
}
