package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * convert years (ages) to days
 */
public class YearsToDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int Days_Per_Year = 365;
        int age = 0;
        int days = 0;

        System.out.println("Please insert your age");
        age = scanner.nextInt();

        days = age * Days_Per_Year;

        System.out.println("Age in years=" + age + ",Age in days=" +days);


    }
}
