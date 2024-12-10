package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * υπάρχει ένας  integer αριθμός και ο χρηστης με μια
 * προσπαθεια προσπαθεί να τον μαντέψει
 */
public class SecretFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        final int SECRET = 12;

        System.out.println("Isert a number to guess the secret");
        num = scanner.nextInt();

        if (num == SECRET) {
            System.out.println("Secret found!!!");
        } else { //num != SECRET
            System.out.println("Failure!");
        }
    }
}