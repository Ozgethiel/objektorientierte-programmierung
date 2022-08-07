package exceptions;

public class MyMain {
    public static void main(String[] args) throws MyIOException {
        calculate();
    }
    public static void calculate() throws MyIOException {
        throw new MyIOException(41);

    }

}
