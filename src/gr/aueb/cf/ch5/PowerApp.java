package gr.aueb.cf.ch5;

import java.util.Scanner;

public class PowerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int n=1;
        int base = 1;
        System.out.println("Please insert base and power");
        base = scanner.nextInt();
        n = scanner.nextInt();
        System.out.println(base+"^"+n+"="+pow(base,n));

    }

    /**
     * Calculate a^n
     * @param a the base
     * @param n the power
     * @return the base raised to the power
     */

    public static long pow(long a, long n){
//        long result = 1;
//
//        for (int i = 1; i <=n; i++ ){
//            result *= a
//        return result;
//        }
        return (long) Math.pow(a , n);

    }



}
