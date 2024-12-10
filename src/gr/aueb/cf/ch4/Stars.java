package gr.aueb.cf.ch4;

/**
 * prints diffrent outputs of stars
 */
public class Stars {

    public static void main(String[] args) {

        // horizontal
        for(int i = 1; i <= 10; i++){
            System.out.print("*");
        }

        //vertical
        for(int i = 1; i <= 10; i++){
            System.out.println("*");
        }

        // 10 lines of 10 stars
        for(int i = 1; i <= 10; i++){
            for(int j = 1;j <= 10;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //ascending
        for (int i = 1; i <= 10; i++){
            for(int j = 1; j<= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //descending
        for (int i = 1; i <= 10; i++){
            for(int j = 10; j >= i; j--){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
