package gr.aueb.cf.exersices;

import java.util.Scanner;

public class BicentennialYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputYear;
        inputYear = scanner.nextInt();
        if ((inputYear % 4 == 0 && inputYear % 100 !=0) || (inputYear / 400 == 0)){
            System.out.println("Year "+inputYear+" is bicentennial");
        } else {
            System.out.println("Year "+inputYear+" is NOT bicentennial");
        }


    }
}
