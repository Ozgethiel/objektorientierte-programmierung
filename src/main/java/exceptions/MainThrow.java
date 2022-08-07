package exceptions;

public class MainThrow {
    public static void main(String[]args){
        int a = 0;
        if (a==0) {
            System.out.println("Bölen sifira esit olamaz");
            throw new ArithmeticException("Exception !");
        }
        System.out.println("Kodun devami");


    }
}
