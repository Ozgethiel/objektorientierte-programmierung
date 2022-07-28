package uebungen.c_juli.a_exceptions;


public class ExceptionExercises {

    public static void throwIllegalArgumentException() {
        // FIXME: Diese Methode soll eine IllegalArgumentException werfen.
        //  Muss man diese an der Methode deklarieren?
       // throw new IllegalArgumentxception("Test");
    }

    public static void sleepOneSecond() {
        // FIXME: Diese Methode soll einfach nur eine Sekunde schlafen.
        //  Thread.sleep() wirft aber eine Exception vom Typ InterruptedException.
        //  Deklarieren sie, dass die Methode sleepOneSecond diese InterruptedException
        //  wirft.
        //Thread.sleep(1000);
    }

    public static long sleepOneSecondDoNotThrow() {
        // FIXME: Diese Methode soll einfach nur eine Sekunde schlafen.
        //  Thread.sleep() wirft aber eine Exception vom Typ InterruptedException.
        //  Diesmal soll die Exception abgefangen werden. Wenn die Exception fliegt,
        //  und noch nicht lange genug gewartet wurde, soll die Methode weiter warten.
        //  Die Methode soll dann die Zeit, die beim Warten vergangen ist in
        //  Millisekunden zurückgeben. Die Methode darf nicht mehr als 10 ms zu viel
        //  warten.
        try{
            Thread.sleep(100);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        return 0L;
    }
}
