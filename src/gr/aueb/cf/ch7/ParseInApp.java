package gr.aueb.cf.ch7;

import java.util.Scanner;

/**
 * Μετατρεπει ενα string σε ακεραιο
 */
public class ParseInApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        String s;

        System.out.println("Please insert an int");
        s = in.nextLine();
        num = Integer.parseInt(s);

        System.out.println(num);
    }
}
