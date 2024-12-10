package gr.aueb.cf.ch8;

public class IndexOutOfBoundsException {

    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i <= arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}

//εδω δεν κανουμε catch ειναι runtime λαθος στον κωδικο οποτε πρεπει
//να το βρουμε και να το διορθωσουμε