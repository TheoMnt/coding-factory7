package gr.aueb.cf.ch5;

public class MethodOverLoading {

    public static void main(String[] args) {

    }
    public static int add(int a , int b){
        return a = b;
    }

    /**
     * κανονικα δεν μπορω να εχω μεθοδους με ιδιο ονομα
     * αλλα απο τη στιγμη που εχει διαφορετικα types
     * θεωρειται διαφορετικη
      */


    public static int add(int a , long b){
        return a + (int)b;
    }


}
