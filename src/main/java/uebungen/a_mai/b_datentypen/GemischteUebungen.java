package uebungen.a_mai.b_datentypen;

public class GemischteUebungen {

    public static void ganzzahlenSindGleich(int a, int b) {
        // FIXME Wenn a und b gleich sind, soll das Ergebnis als boolean auf der Konsole ausgegeben werden.
        if(a == b){
            System.out.print("true");

        }
    }

    public static void ganzzahlenSindUngleich(int a, int b) {
        // FIXME Wenn a und b ungleich sind, soll das Ergebnis als boolean auf der Konsole ausgegeben werden.
        if (a != b) {
            System.out.println("false");
        }
    }

    public static void aIstGroesserGanzzahlB(int a, int b){
            // FIXME Wenn a größer als b ist, soll das Ergebnis als boolean auf der Konsole ausgegeben werden.
            if (a > b) {
                System.out.println("true");
            }
        }


    public static void aIstKleinerGanzzahlB(int a, int b) {
        // FIXME Wenn a kleiner als b ist, soll das Ergebnis als boolean auf der Konsole ausgegeben werden.
        if (a < b) {
            System.out.println("false");
        }
    }

    public static void aIstGroesserGleichGanzzahlB(int a, int b) {
        // FIXME Wenn a größer oder gleich b ist, soll das Ergebnis als boolean auf der Konsole ausgegeben werden.
        if (a >= b) {
            System.out.println("true");
        }

    }

    public static void aIstKleinerGleichGanzzahlB(int a, int b) {
        // FIXME Wenn a kleiner oder gleich b ist, soll das Ergebnis als boolean auf der Konsole ausgegeben werden.
        if (a <= b) {
            System.out.println("false");
        }
    }

    public static void kommazahlenSindGleich(double a, double b) {
        // FIXME Wenn a und b gleich sind, soll das Ergebnis als boolean auf der Konsole ausgegeben werden.
        System.out.println((a==b)? true: false);


    }

    public static void kommazahlenSindUngleich(double a, double b) {
        // FIXME Wenn a und b ungleich sind, soll das Ergebnis als boolean auf der Konsole ausgegeben werden.
        System.out.println((a!=b)?true:false);
    }

    public static void aIstGroesserKommazahlB(double a, double b) {
        // FIXME Wenn a größer als b ist, soll das Ergebnis als boolean auf der Konsole ausgegeben werden.
        System.out.println(a>b?true:false);
    }

    public static void aIstKleinerKommazahlB(double a, double b) {
        // FIXME Wenn a kleiner als b ist, soll das Ergebnis als boolean auf der Konsole ausgegeben werden.
        System.out.println(a<b?true:false);
    }

    public static void aIstGroesserGleichKommazahlB(double a, double b) {
        // FIXME Wenn a größer oder gleich b ist, soll das Ergebnis als boolean auf der Konsole ausgegeben werden.
        System.out.println(a>=b?true:false);
    }

    public static void aIstKleinerGleichKommazahlB(double a, double b) {
        // FIXME Wenn a kleiner oder gleich b ist, soll das Ergebnis als boolean auf der Konsole ausgegeben werden.
        System.out.println(a<=b?true:false);
    }
}
