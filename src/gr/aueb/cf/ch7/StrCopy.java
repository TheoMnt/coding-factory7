package gr.aueb.cf.ch7;

/**
 * επειδη τα strings δεν αλλαζουν ειναι εγκυρο αντιγραφο
 * σε αντιθεση με τους πινακες που θα ηταν shallow copy
 */
public class StrCopy {

    public static void main(String[] args) {

        String s1 = "Athens";
        String s2 = s1;
    }
}
