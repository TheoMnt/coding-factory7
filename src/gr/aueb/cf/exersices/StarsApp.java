package gr.aueb.cf.exersices;

import java.util.Scanner;


    public class StarsApp {


        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            int choice = 0;
            int stars = 0;

            System.out.println("Please select what you want to do");
            do {
                printMenu();
                choice = scanner.nextInt();
                if (choice < 1 || choice > 6) {
                    System.out.println("Wrong choice.Try again");
                    continue;
                }



                if (choice != 6) {
                    System.out.println("Please insert the number of stars/lines you want");
                    stars = scanner.nextInt();
                }

                switch (choice) {
                    case 1:
                        starsHorPrint(stars);
                        break;
                    case 2:
                        starsVertPrint(stars);
                        break;
                    case 3:
                        starsLinesPrint(stars);
                        break;
                    case 4:
                        starsLines1tonPrint(stars);
                        break;
                    case 5:
                        starsLinesnto1Print(stars);
                        break;
                    case 6:
                        System.out.println("Quiting...");
                        break;
                    default :
                        System.out.println("Error in choice ");
                        break;

                }

            } while (choice != 6);


        }

        public static void printMenu() {
            System.out.println("Choose 1 for horizontal line of n stars");
            System.out.println("Choose 2 for vertical line of n stars");
            System.out.println("Choose 3 for n lines of n stars");
            System.out.println("Choose 4 for n lines of 1 to n stars");
            System.out.println("Choose 5 for n lines of n to 1 stars");
            System.out.println("Choose 6 for exit");

        }


        public static void starsHorPrint(int n) {
            for (int i = 1; i <= n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }

        public static void starsVertPrint(int n) {
            for (int i = 1; i <= n; i++) {
                System.out.println("*");
            }
            System.out.println();
        }

        public static void starsLinesPrint(int n) {
            for (int j = 1; j <= n; j++) {
                starsHorPrint(n);
            }
            System.out.println();
        }

        public static void starsLines1tonPrint(int n) {
            for (int j = 1; j <= n; j++) {
                starsHorPrint(j);
            }
            System.out.println();
        }

        public static void starsLinesnto1Print(int n) {
            for (int j = n; j >= 1; j--) {
                starsHorPrint(j);
            }
            System.out.println();
        }
    }



