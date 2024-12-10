package gr.aueb.cf.ch8;

import java.io.IOException;

public class ExceptionTypes {

    public static void main(String[] args) {

    }

    /**
     * System.in read() throws IOException.
     * Since a checked exception is thrown, it has
     * to be explicitly to be thrown in method signature
     * Or has to be caught {}
     * When this type of method/exception may be used?
     * When there's no need to handle the exception.
     * This isnt meaningful...ideally we want to handle
     * the exceptions not only propagate.
     * @return
     * @throws IOException
     */
    public static char readOneChar() throws IOException {
        return (char) System.in.read();
    }

    /**
     * If we catch the exception there's no need for 'throws' in method signature
     * Also the exception does not propagate.Is this a good practice?
     * Depends on whether there is a caller.If there is one we have to propagate.
     * If there's a client/user we don't propagate the exception.
     * @return
     */
    public static char readAnotherChar() {
        try{
            return (char) System.in.read();
        } catch (IOException e) {
            System.err.println(e.getMessage());
            return ' ';
        }
    }

    /**
     * In this type of method/exception we take action --Logging and also
     * rethrow the exception to propagate the caller
     * @return
     * @throws IOException
     */
    public static char readAnotherOneChar() throws IOException {
        try{
            return (char) System.in.read();
        } catch (IOException e) {
            System.err.println(e.getMessage());
            throw e;
        }
    }

    public static char readAgainOneChar(char ch) throws IOException, IllegalArgumentException {
        try {
            char inputChar = (char) System.in.read();
            if (inputChar != ch) throw new IllegalArgumentException("Char not fit");
            return inputChar;
        } catch (IOException | IllegalArgumentException e) {
            e.printStackTrace();
            System.err.println(e.getMessage());
            throw e;
        }


//        } catch(IllegalArgumentException ex1) {
//            System.err.println(ex1.getMessage());
//            throw ex1;
//        } catch (IOException ex2) {
//            ex2.printStackTrace();
//            System.err.println(ex2.getMessage());
//            throw ex2;
//        }

    }
}
