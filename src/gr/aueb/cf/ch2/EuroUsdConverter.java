package gr.aueb.cf.ch2;

import java.util.Scanner;

public class EuroUsdConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int dollars = 0;
        int cents = 0;
        int euros = 0;
        final int PARITY = 99;

        System.out.printf("Παρακαλώ πατείστε το ποσό των ευρώ που θέλετε να μετατρέψετε σε δολλάρια");
        euros = in.nextInt();

        dollars = (euros * PARITY)/100;
        cents = (euros * PARITY)%100;
        System.out.printf("Έχετε %d $ και %d cents",dollars,cents);

    }
}
