package gr.aueb.cf.ch7;

public class TraverseWithSubstr {

    public static void main(String[] args) {

        String s = "Athens Uni Of Econ and Bus";

        for(int i = 0; i < s.length(); i++ ) {
            System.out.println(s.substring(i, i+1));
        }
    }
}
