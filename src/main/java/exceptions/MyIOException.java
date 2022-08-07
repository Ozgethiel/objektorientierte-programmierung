package exceptions;

public class MyIOException extends Exception{

   int age;

    public MyIOException(int age) {
        this.age = age;

    }

    @Override
    public String toString() {
        return "myIOException{" +
                "age=" + age +
                '}';
    }
}


