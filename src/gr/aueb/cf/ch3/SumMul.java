package gr.aueb.cf.ch3;

/**
 * calculate the sum and multiplication of the first 10 integers
 */

public class SumMul {
    public static void main(String[] args) {

        int i = 1;
        int j =1;
        int sum = 0;
        int mul = 1;

        while(i <= 10){
            //sum = sum + i;
            sum +=i;
            i++;
        }
        while (j <= 10){
            mul *=j;
            j++;
        }
        System.out.println(" sum :" + sum + " Mul :" + mul);

    }


}