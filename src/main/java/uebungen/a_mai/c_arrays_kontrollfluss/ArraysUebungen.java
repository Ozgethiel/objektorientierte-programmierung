package uebungen.a_mai.c_arrays_kontrollfluss;

public class ArraysUebungen {

    public static int[] leeresArray() {
        // FIXME: Diese Methode soll ein leeres Array vom Typ int erzeugen. Es soll 10 Elemente beinhalten.
        int[]a= new int[10];
        return a;
    }

    public static int[] primzahlen() {
        // FIXME: Diese Methode soll die ersten 3 Primzahlen (2,3,5) in ein Array vom Typ int schreiben und zurückgeben.
        int [] a={2,3,5};
        return a;
    }

    public static int laenge(int[] zahlen) {
        // FIXME: Diese Methode soll die Länge des Array zahlen zurückgeben.
        int a = zahlen.length;
        return a;
    }

    public static void aendereEintragAnIndex3(int[] zahlen, int neuerWert) {
        // FIXME: Diese Methode soll den Eintrag an Stelle 3 auf den Wert neuerWert ändern. Mit welchem Index beginnt ein Array in Java? Wie viele Zahlen sind
        //  vor dem Index 3?
        zahlen[3]= neuerWert;
    }

    public static void aendereEintragAnIndexI(int[] zahlen, int index, int neuerWert) {
        // FIXME: Diese Methode soll den Eintrag an Stelle index auf den Wert neuerWert ändern.
        zahlen[index]=neuerWert;

    }

}
