package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης θα δίνει τους συνολικούς βαθμούς και το πλήθος μαθηματων
 * το πρόγραμμα θα υπολογιζει τον μέσο όρο και θα χαρακτηρίζει αναλόγως
 * άριστα για μ.ο >=9 πολ΄θ καλα αν ο 9 > μ.ο. >= 7 και καλώς αν 7 > μ.ο. >=5
 * αποτυχία για μ.ο <5
 */
public class GradesApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalMarks = 0;
        int coursesCount = 0;
        int average = 0;

        System.out.println("Please insert total Marks");
        totalMarks = scanner.nextInt();

        if (totalMarks <= 0){
            System.out.println("Total marks must not be negative zero");
            System.exit(1); //βγαινει απο το προγραμμα σαν το break
        }

        System.out.println("Please insert courses count.");
        coursesCount = scanner.nextInt();

        if (coursesCount <=0){
            System.out.println("Courses must not be negative or zero");
            System.exit(1);

        }
        average = totalMarks / coursesCount;

        if(average > 10){
            System.out.println("Error.Average must be less or equal than 10.");
            System.exit(1);
        }

        if(average >= 9){
            System.out.println("Excelent!");
        }else if (average >= 7){
            System.out.println("Very Good!");
        }else if(average >=5){
            System.out.println("Good!");
        }else{
            System.out.println("Failure.");
        }

    }
}
