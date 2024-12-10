package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Εμφανιζει ενα μενου επιλογων και ο χρηστης
 * επιλεγει και στη συνεχεια αναλογα με τη
 * επιλογη εκτελειται καποια ενεργεια
 */
public class MenuApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do{
            printMenu();
            choice = scanner.nextInt();

            if (!isChoiceValid(choice)){
                System.out.println("Error.Choice not valid");
                continue;
            }
            doOnChoice(choice);
        }while (choice != 5);

    }
    public static void printMenu() {
        System.out.println("Pick one of the above");
        System.out.println("1.Insert");
        System.out.println("2.Delete");
        System.out.println("3.Search");
        System.out.println("4.Update");
        System.out.println("5.Exit");
    }

    public static boolean isChoiceValid(int choice) {
        return choice >= 1 && choice <= 5;
    }

    public static void doOnChoice(int choice){
        switch (choice) {
                case 1:
                     System.out.println("Εισαγωγή process");
                     break;
                case 2:
                    System.out.println("Διαγραφή process");
                    break;
                case 3:
                    System.out.println("Αναζήτηση process");
                    break;
                case 4:
                    System.out.println("Ενημέρωση process");
                    break;
                case 5:
                    System.out.println("Έξοδος");
                    break;
                default:
                    System.out.println("Λάθος επιλογή");
                    break;
        }
    }

}
