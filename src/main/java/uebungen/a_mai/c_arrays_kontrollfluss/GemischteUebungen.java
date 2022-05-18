package uebungen.a_mai.c_arrays_kontrollfluss;

public class GemischteUebungen {

    public static int[] zahlenVonNullBisZehn() {
        // FIXME: Diese Methode soll alle ganzen Zahlen von 0 bis 10 (exklusive) in ein Array vom Typ int schreiben und zurückgeben.
        //  Die Zahlen sollen keine Lücken haben und der Größe nach sortiert im Array gespeichert sein.
        return null;
    }

    public static int[] zahlenVonABisB(int a, int b) {
        // FIXME: Diese Methode soll alle ganzen Zahlen von a bis b (exklusive) in ein Array vom Typ int schreiben und zurückgeben.
        //  Die Zahlen sollen keine Lücken haben und der Größe nach sortiert im Array gespeichert sein.
        //  a wird immer die kleinere Zahl sein.
        return null;
    }

    public static boolean[] gerade(int[] zahlen) {
        // FIXME: Diese Methode soll ein boolean-Array erzeugen und zurückgeben.
        //  In dem boolean-Array soll definiert werden, ob die Zahl im Array zahlen gerade oder ungerade ist.
        //  Wenn der Eintrag im Zahlen-Array mit dem Index x gerade ist, soll der Eintrag mit dem Index x im boolean Array true sein.
        //  Ist der Eintrag im Zahlen-Array ungerade, soll der Eintrag im boolean-Array false sein.
        //  Beispiel: zahlen hat 3 Einträge. 1. Eintrag = 5, 2. Eintrag = 10, 3. Eintrag = 7
        //  Erwartetes Ergebnis wäre dann ein boolean Array mit 3 Einträgen. 1. Eintrag = false, 2. Eintrag = true, 3. Eintrag = false
        return null;
    }

    public static int[] hinzufuegen(int[] zahlen, int neueZahl) {
        // FIXME: Diese Funktion soll ein Array zurückgeben, das ein Element mehr enthält als zahlen.
        //  Außerdem sollen alle Zahlen aus zahlen in der selben Reihenfolge enthalten sein.
        //  Zusätzlich soll an letzten Stelle die Zahl neueZahl gespeichert werden.
        return null;
    }

    public static int[] entfernen(int[] zahlen, int index) {
        // FIXME: Diese Funktion soll ein Array zurückgeben, das ein Element weniger enthält als zahlen.
        //  Es sollen alle Zahlen aus zahlen in der selben Reihenfolge enthalten sein, außer der Zahl mit dem Index index.
        return null;
    }

    public static int[] groesserAlsPi(double[] zahlen) {
        // FIXME: Diese Methode soll ein Array vom Typ int erzeugen. Dieses Array enthält genau die Indizes aus zahlen, die größer als PI sind.
        //  Wie viele Elemente halt das zahlen-Array? Wie viele Elemente hat das zurückgegebene Array? Muss die Anzahl gleich sein?
        //  Schaffst du es, ein Array zu erzeugen, das nicht größer ist, als es sein muss?
        //  Tipp: Math.PI enthält den genauen Wert für PI (ca. 3.14)
        //  Beispiel: zahlen enthält 5, 3 und 4, dann soll ein Array zurückgegeben werden, das die Indizes von den Zahlen 5 und 4 enthält, also 0 und 2.
        double pi = Math.PI;
        return null;
    }

    public static void ceasarVerschluesselung(char[] zeichenkette) {
        // FIXME: Erinnerst du dich an die Ceasar Übung in FortgeschritteneUebungen? Hier sollst du das selbe mit einem char-Array machen.
        //  Übergeben wird ein char-Array zeichenkette. Das Array enthält nur Kleinbuchstaben von a - z und Leerzeichen.
        //  Verschlüssle jedes char-Element einzeln.
        //  Wenn ein char ein Leerzeichen sein sollte, wird dies nicht verschlüsselt.
        //  Speichere den verschlüsselten Text in dem selben Array zeichenkette.
        //  Das ist nur eine Übung! Normalerweise würde man hier einen String verwenden, statt einem char-Array!
    }
}
