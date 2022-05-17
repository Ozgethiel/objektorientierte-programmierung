package uebungen.a_mai.b_datentypen;

public class BooleanUebungen {

    public static void wahr(){
        // FIXME Hier soll der Wert true auf der Konsole ausgegeben werden.
        System.out.print(true);
    }

    public static void falsch(){
        // FIXME Hier soll der Wert false auf der Konsole ausgegeben werden.
        System.out.println(false);
    }

    public static void istWahr(boolean a){
        // FIXME Hier soll geprüft werden, ob der Wert a true ist.
        //  Wenn der Wert in a true ist, soll der Wert true auf der Konsole ausgegeben werden.
        //  Wenn der Wert in a false ist, soll der Wert false auf der Konsole ausgegeben werden.
        boolean ergebnis = a == true?
                (true):
                (false);

             System.out.println(ergebnis);

    }

    public static void istFalsch(boolean a){
        // FIXME Hier soll geprüft werden, ob der Wert a false ist.
        //  Wenn der Wert in a true ist, soll der Wert true auf der Konsole ausgegeben werden.
        //  Wenn der Wert in a false ist, soll der Wert false auf der Konsole ausgegeben werden.
        boolean ergebnis = a == false?
                (true):
                (false);

        System.out.println(ergebnis);
    }

    public static void istGleich(boolean a, boolean b) {
        // FIXME Hier soll geprüft werden, ob der Wert in a und b gleich ist.
        //  Wenn der Wert gleich ist, soll der Wert true auf der Konsole ausgegeben werden.
        //  Ansonsten soll der Wert false auf der Konsole ausgegeben werden.
        boolean ergebnis = a == b?
                (true):
                (false);
        System.out.println(ergebnis);

    }

    public static void istUngleich(boolean a, boolean b) {
        // FIXME Hier soll geprüft werden, ob der Wert in a und b ungleich ist.
        //  Wenn der Wert ungleich ist, soll der Wert true auf der Konsole ausgegeben werden.
        //  Ansonsten soll der Wert false auf der Konsole ausgegeben werden.
        boolean ergebnis = a != b?
                true:
                false;
        System.out.println(ergebnis);
    }

    public static void oder(boolean a, boolean b) {
        // FIXME Hier soll geprüft werden, ob der Wert in a oder b true ist.
        //  Wenn a oder b true ist, soll der Wert true auf der Konsole ausgegeben werden.
        //  Ansonsten soll der Wert false auf der Konsole ausgegeben werden.
        System.out.println(a||b);

    }

    public static void und(boolean a, boolean b) {
        // FIXME Hier soll geprüft werden, ob der Wert in a und b true ist.
        //  Sind beide Werte true, soll der Wert true auf der Konsole ausgegeben werden.
        //  Ansonsten soll der Wert false auf der Konsole ausgegeben werden.
        System.out.println(a&&b);
    }

    public static void nicht(boolean a) {
        // FIXME Hier soll das Gegenteil von Wert a in der Variable nicht gespeichert werden.
        //  Ist der Wert in a false, soll der Wert true auf der Konsole ausgegeben werden.
        //  Ist der Wert in a true, soll der Wert false auf der Konsole ausgegeben werden.
        System.out.println(!a);
    }
}
