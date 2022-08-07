package exceptions;

public class MainExceptions {
    public static void main(String[] args) {

        // array index outofBounce ArrayIndexOutOfBoundsException

        String[] array = {"cat", "dog", "monkey"};
        try {
            array[3].replace("a", "b");
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(array[0]);
        try {
            System.out.println(array[4]);
        } catch (Exception e) {
            System.out.println(e);
        }

        // Null pointer Exception
        // java.lang.NullPointerException: Cannot invoke "String.getBytes()" because "s" is null
        String s = null;
        try {
            s.getBytes();
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            int myInt = Integer.parseInt("pants");
        } catch (NumberFormatException nfe) {
            System.out.println(" you can not make it ");

        }
        try {
            int myInt = Integer.parseInt("12");
        } catch (NumberFormatException nfe) {
            System.out.println(" you can not make it ");

        }
        finally {
            System.out.println(" in the finally block");
        }
        System.out.println(" end here");

    }
}
