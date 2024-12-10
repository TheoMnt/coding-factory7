package gr.aueb.cf.ch2;

/**
 * how many leaps does a frog has to do to cover a certain distance
 */
public class FrogJumpsApp {
    public static void main(String[] args) {
        int target = 85;
        int start = 10;
        int hop = 30;
        int jumps = 0;

        jumps = (int)Math.ceil((target - start)/ (double)hop);

        /**
         * byte<short<int<long<float<double
         * so if i have (int-int)/double even if i only have one double the whole sequence becomes double due to the typecast on hop
         * ceil gives back double so we have to typecast again to int the final result
         */

        System.out.println("Jumps :" + jumps);







    }
}
