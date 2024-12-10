package gr.aueb.cf.ch5;

public class PowerUpRecursive {

    public static void main(String[] args) {

    }

    /**
     * recursive version of power
     * @param a  base
     * @param n power
     * @return
     */
    public static int power(int a, int n){
//        if (n == 0) return 1;
//        return power(a,n-1) * a;
        return ( n == 0) ? 1: power(a,n-1) * a;
    }

}
