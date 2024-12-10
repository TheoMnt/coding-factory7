package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Calculates the price with 24% vat
 */
public class PriceWithVat {
    public static void main(String[] args) {
        final double VAT_RATE = 0.24 ;
        double inputPrice = 0.0 ;
        double priceWithVat = 0.0 ;
        double vat = 0.0;

        Scanner in = new Scanner(System.in);
        System.out.println("Please insert the price");
        inputPrice = in.nextDouble();
        vat = inputPrice * VAT_RATE;
        priceWithVat = inputPrice + vat;

        System.out.printf("Price : %f , Vat: %f,Price with vat : %.2f",inputPrice,vat,priceWithVat);

        /**
         * with %.2f i choose to show 2 decimals...i can choose how many i want
         */








    }
}
