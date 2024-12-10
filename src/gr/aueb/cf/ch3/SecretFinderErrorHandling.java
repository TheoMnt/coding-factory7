package gr.aueb.cf.ch3;

/**
 * Linearize the branches and check errors first
 */

import java.util.Scanner;

public class SecretFinderErrorHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        final int SECRET = 12;
        boolean isSuccess = false;

        while(true){
            System.out.println("Isert a number to guess the secret");
            num = scanner.nextInt();

            if (num != SECRET) {
                System.out.println("Try again");
                continue;
            }

            System.out.println("CORRECT!!!");
            break;

        }


    }
}