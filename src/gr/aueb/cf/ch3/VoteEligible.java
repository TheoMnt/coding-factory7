package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Δικαίωμα ψήφου
 * Ελέγχει αν μια ηλικία έχει δικαίωμα να ψηφίσει
 */
public class VoteEligible {

    public static void main(String[] args) {
        final int VOTING_AGE = 18;
        int age = 0;
        boolean isEligible = false;
        Scanner in = new Scanner(System.in);

        System.out.println("Please insert your age");
        age = in.nextInt();
        isEligible = age >= VOTING_AGE;

        System.out.println("Your age is eligible for voting:" +isEligible);

    }
}
