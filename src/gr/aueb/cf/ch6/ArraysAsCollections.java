package gr.aueb.cf.ch6;

public class ArraysAsCollections {

    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 9};

    }

    // φτιαχνει εναν πινακα με τους ζυγους του αρχικου(filtering)
    public static int[] getEvens(int[] arr) {
        int count = 0;

        for (int el: arr){
            if (el % 2 == 0) count ++;
        }

        int[] evens = new int[count];

        int pivot = 0;
        for (int el: arr) {
            if (el % 2 == 0) evens[pivot++] = el;
        }
        return evens;
    }

    //επιστρέφει έναν πίνακα με τη διπλάσια τιμή στο κάθε κελί απο του αρχικού
    //(mapping)
    public static int[] mapToDouble(int[] arr){
        int[] mapped = new int[arr.length];

        for(int i = 0; i < arr.length;i++) {
            mapped[i] = 2* arr[i];
        }
        return mapped;

    }
    // Βρίσκει το άθροισμα των στοιχείων του πίνακα
    //(reducing)
    public static int sum(int[] arr){
        int sum = 0;
        for ( int el: arr){
            sum+=el;
        }
        return sum;
    }

    //Βρίσκει το μέσο όρο απο τα στοιχεία ενός πίνακα
    public static double avg(int[] arr){

        return sum(arr) / (double) arr.length;
    }


    //Βρίσκει αν υπάρχει έστω και ένας άρτιος μλεσα στον πίνακα
    public static boolean anyEven(int[] arr) {
        boolean isAnyEven = false;
        for(int el : arr ) {
            if (el % 2 == 0){
                isAnyEven = true;
                break;
            }
        }
        return isAnyEven;
    }

    //Βρίσκει αν έχει περισσότερους απο δύο άρτιους
    public static boolean moreThanTwoEvens(int[] arr){
        int count = 0;
        for(int el : arr ) {
            if (el % 2 == 0)count++;
        }
        return count > 2;
    }

    //βρίσκει αν έχει πάνω απο 2 συνεχόμενους αριθμούς π.χ 3,4,5
    public static boolean moreThanTwoConsecutives(int[] arr){
        int count = 0;

        for (int i = 0; i < arr.length-2; i++ ){
            if(arr[i] == arr[i+1] -1 && arr[i] == arr[i+2] -2) {
                count++;
                break;
            }
        }
        return count >= 1;
    }

    //Βρίσκει αν έχει περισσότερους απο 2 αριθμούς με τον ίδιο λήγοντα π.χ. 1 ,11 ,21
    //με την προυπόθεση ότι έιναι διψήφιοι αριθμοι
    public static boolean moreThanTwoWithSameEnding(int[] arr){
        int[] endings = new int[10];
        boolean isSameEnding = false;

        for(int num : arr){
            endings[num % 10]++;
        }

        for (int count : endings) {
            if (count >= 3) {
                isSameEnding = true;
                break;
            }
        }
        return isSameEnding;
    }

    //Βρίσκει αν είναι ΟΛΟΙ άρτιοι
    public static boolean AllAreEven(int[] arr) {
//            return getEvens(arr).length == arr.length;

        boolean allEven = false;
        int count = 0;

        for (int el : arr){
            if(el % 2 == 0) count++;
        }
        return count == arr.length;
    }

}
