package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * λαμβάνει μια θερμοκρασία παο τον χρήστη
 * και εμφανίζει κατάλληλο μήνυμα
 */
public class TempApp {
    public static void main(String[] args) {
        Scanner inn = new Scanner(System.in);
        int temp = 0;
        boolean isTempBelowZero;

        System.out.printf("Please insert the current temparature");
        temp= inn.nextInt();

        isTempBelowZero = temp <= 0 ;
        System.out.println("Temparature is below zero : " + isTempBelowZero);
    }
}
