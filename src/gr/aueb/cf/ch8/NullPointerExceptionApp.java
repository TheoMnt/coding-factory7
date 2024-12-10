package gr.aueb.cf.ch8;

public class NullPointerExceptionApp {
    public static void main(String[] args) {
        String s = null;

        if(s.equals("Athens")) {
            System.out.println("EQUALS");
        }

        /**  θα επρεπε να πουμε
         *   if( s!=null && s.equals("Athens")) {
         *     System.out.println("EQUALS");
         *    }else{
         *     System.out.println("NOT EQUALS");
         *    }
         */

    }
}
