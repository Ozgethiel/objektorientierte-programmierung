package uebungen.a_mai.c_arrays_kontrollfluss;

public class BedingungenUebungen {

    public static void kleiner(int a, int b) {
        // FIXME: Diese Methode soll den char Wert < aus der Konsole ausgeben, wenn a kleiner als b ist. Wenn a größer oder gleich ist, soll nichts passieren.
        if (a < b) {
            System.out.println("<");
        }
    }

    public static void groesserOderKleiner(int a, int b) {
        // FIXME: Diese Methode soll den char Wert < aus der Konsole ausgeben, wenn a kleiner als b ist. Wenn a größer ist, soll der char Wert > auf der
        //  Konsole ausgegeben werden. Wenn die Werte gleich sind, soll nichts passieren.
        if (a < b) {
            System.out.println("");
        } else if (a > b) {
            System.out.println(">");
        }
        System.out.println("");

    }



    public static void groesserKleinerOderGleich(int a, int b) {
        // FIXME: Diese Methode soll den char Wert < aus der Konsole ausgeben, wenn a kleiner als b ist. Wenn a größer ist, soll der char Wert > auf der
        //  Konsole ausgegeben werden. Wenn die Werte gleich sind, soll der char Wert = auf der Konsole ausgegeben werden.
        if (a < b) {
            System.out.println("<");
        }else if (a>b){
            System.out.println(">");
        }
        else if (a == b) {
            System.out.println("=");
        }
        }


    public static void wuerfelausgabe(int zahl) {
        // FIXME: Diese Methode soll die Zahl zahl als Text auf der Konsole ausgeben.
        //  Beispiel: wenn zahl 5 ist, soll auf der Konsole fünf ausgegeben werden.
        //  Es werden nur Zahlen zwischen 1 (inklusive) und 6 (inklusive) an diese Methode übergeben.
        //  Wenn eine andere Zahl übergeben wird, soll das Wort Fehler auf der Konsole ausgegeben werden.

    }

}
