package gr.aueb.cf.ch2.ScannerAddApp;

import java.util.Scanner;

/**
 * Scanner demo reads two integers from the
 * std input and calculates the result
 */
public class ScannerAddApp {

    //Δήλωση και αρχικοποίηση
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        int sum = 0;
        Scanner in = new Scanner(System.in);

        //Εντολές
        System.out.println("Please insert two integers");
        num1 = in.nextInt();
        num2 = in.nextInt();
        sum = num1 + num2;

        //Εκτύπωση αποτελεσμάτων
        System.out.printf("Το άθροισμα των %d και %d είναι ίσο με %d",num1,num2,sum);




    }

}
