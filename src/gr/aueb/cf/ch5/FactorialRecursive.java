package gr.aueb.cf.ch5;

/**
 * recursive = θα καλεί τον ευατό της
 *  θα χρησημοποιηθεί οτι
 *  n!= (n-1)!*n
 *  n!= (n-2)!*(n-1)*n κτλπ
 *  κάθε φορά καλείται με μικρότερο δεδομένο εισόδου
 */
public class FactorialRecursive {



    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++){
        System.out.println(facto(i));
    }

    }
    public static long facto(int n){
//        if (n <= 1) return 1;
//        return facto(n-1) * n;

        return ( n <= 1) ? 1L : n * facto (n-1);

    }

}
