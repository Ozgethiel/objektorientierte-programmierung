package uebungen.a_mai.b_datentypen;

public class FortgeschritteneUebungen {

    public static void aGroesserAlsBUndKleinerAlsC(int a, int b, int c) {
        // FIXME: Es soll geprüft werden, ob a kleiner als b und größer als c ist.
        //  Wenn das Ergebnis wahr ist, soll true auf der Konsole ausgegeben werden.
        //  Ansonsten soll false auf der Konsole ausgegeben werden.

        if (a < b && a > c) {
            System.out.println("true");
        } else {
            System.out.println("true");
        }
    }



    public static void ceasarVerschluesselung(char klartext) {
        // FIXME: Ceasar soll damals eine Verschlüsselung benutzt haben, in der jeder Buchstabe durch seinen 5. Nachfolger im Alphabet ersetzt wird.
        //  Hier soll der Buchstabe in Variable klartext mithilfe dieser Verschlüsselung verschlüsselt werden.
        //  Beispiel: a wird zu f, b wird zu g
        //  VORSICHT! Was passiert mit z? Bei z geht es wieder von vorne los. Aber wie geht das?
        //  Gib den verschlüsselten Buchstaben auf der Konsole aus. Es werden nur kleine Buchstaben zwischen a und z verwendet.


    }

    public static void restwertBeiKommazahlen(double a, double b) {
        // FIXME: Der Restwert bei der Division der Variablen a und b soll berechnet werden.
        //  Ist das überhaupt möglich? Mit welchen Einschränkungen ginge das?
        //  Gib den ganzzahligen Restwert auf der Konsole aus.

        while (b <= a) {
            a = a - b;
        }
        System.out.println((int) a);
    }

    public static void abrunden(double a) {
        // FIXME: Die Zahl a soll ab der 3. Nachkommastelle abgerundet werden.
        //  Beispiel: Aus PI (3.14159265359...) würde 3.141
        double x = a * 1000;
        int e = (int) x;

        //a = Math.round(1000 * a) / 1000;

        System.out.println((double) e / 1000);
        //System.out.println(a);
    }
}

