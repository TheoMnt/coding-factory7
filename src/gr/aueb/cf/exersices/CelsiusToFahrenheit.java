package gr.aueb.cf.exersices;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class CelsiusToFahrenheit {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double celsius = 0.0;
        double fahrenheit = 0.0;


        System.out.println("Please insert the degrees in Celcius");
        celsius = in.nextDouble();
        fahrenheit = (celsius * 9/5) +32;

        System.out.printf("%.3f Degrees in celsius is %.3f degrees in fahrenheit",celsius,fahrenheit);




    }









}
