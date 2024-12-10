package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 *na lamvanei ena dipsifio akeraio apo to xristi kai na upologizei kai
 * ektupwnei to athroisma twn psifiwn tou p.x.  15 ---> 1 + 5 = 6
 */

public class DidgitsSum {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int leftDidgit = 0;
        int rightDidgit = 0;
        int sum = 0;
        int inputNum = 0;


        System.out.printf("Δώστε έναν διψήφιο ακέραιο");
        inputNum = in.nextInt();

        leftDidgit= inputNum / 10;
        rightDidgit = inputNum % 10;
        sum = leftDidgit + rightDidgit;

        System.out.printf("To άθροισμα του ακεραίου είναι %d",sum);





    }
}
