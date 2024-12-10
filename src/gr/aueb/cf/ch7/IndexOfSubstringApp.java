package gr.aueb.cf.ch7;

public class IndexOfSubstringApp {

    public static void main(String[] args) {

        String cf = "Coding Factory";

        int positionOfo = cf.indexOf("o"); //1
        int positionOfSecondo = cf.indexOf("o",2);
        int lastPositionOfo = cf.lastIndexOf("o"); //εδω ξεκιναει να ψαχνει απο τα δεξια προς τα αριστερα

        System.out.println(positionOfo);
        System.out.println(positionOfSecondo);
        System.out.println(lastPositionOfo);

        String cf2 = cf.substring(1); //"oding Factory"
        String slice = cf.substring(1, 3); //"od"

        System.out.println(cf2);
        System.out.println(slice);

    }

}
