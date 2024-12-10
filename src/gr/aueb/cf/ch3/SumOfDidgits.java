package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το άθροισμα των ψηφίων ενός ακεραίου
 */

public class SumOfDidgits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int inputNum = 0;
        int tempNum = 0;
        int rightDidgit = 0;

        System.out.println("Enter a positive integer");
        inputNum = scanner.nextInt();

        tempNum = inputNum;
        while (tempNum > 0){
            rightDidgit = tempNum % 10;
            sum += rightDidgit;
            tempNum /= 10; // tempNum = tempNum / 10 ;

        }

        System.out.println("The sum of didgits of "+inputNum+" is "+sum);
    }
}
