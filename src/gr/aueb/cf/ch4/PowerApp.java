package gr.aueb.cf.ch4;

/**
 * Calculates a^n
 */
public class PowerApp {
    public static void main(String[] args) {
        int base = 2;
        int power = 10;
        int result = 1;
        //for calculation base^ power\

        for(int i = 1; i <= power; i++){
            result *= base;
        }

        System.out.println("Result: " + result);
    }
}
