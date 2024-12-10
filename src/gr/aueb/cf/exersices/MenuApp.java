package gr.aueb.cf.exersices;

import java.util.Scanner;

public class MenuApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;


        do {
            System.out.println("Παρακαλώ επιλέξτε απο τα παρακάτω");
            System.out.println("1.Εισαγωγή");
            System.out.println("2.Διαγραφή");
            System.out.println("3.Ενημέρωση");
            System.out.println("4.Αναζήτηση");
            System.out.println("5.Έξοδος");

            input = scanner.nextInt();

            if (input > 5 || input < 1) {
                System.out.println("Μη έγκυρη επιλογή");
                System.out.println("Δοκιμάστε ξανά");
                continue;
            }

            switch (input) {
                case 1:
                    System.out.println("Επιλέξατε εισαγωγή");
                    break;
                case 2:
                    System.out.println("Επιλέξατε διαγραφή");
                    break;
                case 3:
                    System.out.println("Επιλέξατε ενημέρωση");
                    break;
                case 4:
                    System.out.println("Επιλέξατε αναζήτηση");
                    break;
                default:
                    System.out.println("Επιλέξατε έξοδο");
                    break;

            }


        }while (input != 5);

    }
}
