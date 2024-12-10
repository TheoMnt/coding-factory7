package gr.aueb.cf.ch5;

import java.util.Scanner;

public class SwapApp {

    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give two integers a , b");
        num1 = scanner.nextInt();;
        num2 = scanner.nextInt();;
        System.out.println("a="+num1+" ,b="+num2);
        swap(num1 , num2);

    }

    /**
     * Mutually exchanges the values of the two input variables.
     * @param a first input.
     * @param b second input.
     */
    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("new a="+a+"  ,new b="+b);
    }
}


