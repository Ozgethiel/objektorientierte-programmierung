package uebungen.a_mai.b_datentypen;

public class GanzzahlUebungen {

    public static void zehn() {
        // FIXME Der Zahlenwert 10 soll auf der Konsole ausgegeben werden.
        int a = 10;
        System.out.println(a);

    }


    public static void negativ(int x) {
        // FIXME Die Variable a soll als negative Zahl auf der Konsole ausgegeben werden.
         x  = -10;
        System.out.println(x);
    }

    public static void addiereEins(int a) {
        // FIXME Die Wert in Variable a soll um den Wert 1 erhöht und auf der Konsole ausgegeben werden.
        a++;
        System.out.println(a);
    }

    public static void addiereZehn(int a) {
        // FIXME Die Variable a soll um 10 addiert werden. Das Ergebnis soll auf der Konsole ausgegeben werden.

        System.out.println(a);
    }

    public static void addiere(int a, int b) {
        // FIXME Die Summe aus zwei Ganzzahlen a und b soll auf der Konsole ausgegeben werden.
        int sum= 0;
        sum = a + b ;
        System.out.println(sum);
    }

    public static void substrahiere(int a, int b) {
        // FIXME Hier soll die Differenz von Zahl a und b auf der Konsole ausgegeben werden.
        int sum= 0;
        sum = a - b ;
        System.out.println(sum);
    }

    public static void dividiere(int a, int b) {
        // FIXME Hier soll die Division von Zahl a und b auf der Konsole ausgegeben werden.
        int sum= 0;
        sum = a / b ;
        System.out.println(sum);
    }

    public static void multipliziere(int a, int b) {
        // FIXME Hier soll das Produkt von Zahl a und b auf der Konsole ausgegeben werden.
        int sum= 0;
        sum = a * b ;
        System.out.println(sum);
    }

    public static void rest(int a, int b) {
        // FIXME Hier soll der Rest nach der Division von Zahl a und b auf der Konsole ausgegeben werden.
        int sum= 0;
        sum = a % b ;
        System.out.println(sum);
    }

    public static void durchschnitt(int a, int b, int c) {
        // FIXME Hier soll der Durchschnitt von den Zahlen a, b und c auf der Konsole ausgegeben werden.
        //  Ist das Ergebnis nicht ganzzahlig, soll immer abgerundet werden.
        System.out.print((a+b+c)/3);
    }
}
