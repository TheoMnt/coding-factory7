package gr.aueb.cf.exersices;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int number = 0;
        System.out.println("Please enter a number");
        number = in.nextInt();
        if (isPrime(number)) {
            System.out.println(number + " is prime");
        } else {
            System.out.println(number + " is NOT prime");
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
