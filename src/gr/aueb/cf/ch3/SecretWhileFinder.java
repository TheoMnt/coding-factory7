package gr.aueb.cf.ch3;
/**
 * Guess an integer number
 */

import java.util.Scanner;

public class SecretWhileFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        final int SECRET = 12;
        boolean isSuccess = false;

        do {

            System.out.println("Isert a number to guess the secret");
            num = scanner.nextInt();

            if (num == SECRET) {
                System.out.println("Secret found!!!");
                isSuccess = true ;
            } else { //num != SECRET
                System.out.println("Try again!");
            }
        }while (!isSuccess);
    }
}