package uebungen.a_mai.c_arrays_kontrollfluss;

public class FortgeschritteneUebungen {

    public static boolean[] siebDesEratosthenes(int max) {
        // FIXME: Das Sieb des Eratosthenes ist ein Algorithmus zur Bestimmung der Primzahlen. Hier sollen alle Primzahlen bis zu einer Zahl kleiner max
        //  bestimmt werden. Der Algorithmus funktioniert wie folgt:
        //  Man notiert alle Zahlen von 2 bis max. Dann beginnt man bei 2 und streicht alle Vielfachen von 2 bis zu dem Wert max. Als nächstes macht man
        //  weiter bei der nächsten Zahl, die nicht gestrichen wurde und streicht die Vielfachen dieser Zahl. Das macht man so lange, bis man bei der Zahl
        //  Wurzel aus max angekommen ist. Zu diesem Zeitpunkt ist man fertig und kennt alle Primzahlen kleiner max.
        //  Hier findet ihr eine Animation, wie das ganze funktioniert:
        //  https://de.wikipedia.org/wiki/Sieb_des_Eratosthenes#/media/Datei:Animation_schnell_-_Sieb_des_Eratosthenes.gif
        //  Füllt diese Methode mit eurer Implementierung des Sieb des Eratosthenes. Die Methode soll ein boolean-Array zurückgeben, welches bestimmt, ob die
        //  Zahl an dem entsprechenden Index eine Primzahl ist oder nicht. Am Index 0 und 1 speichert ihr bitte false.
        //  Math.sqrt(double) berechnet die Wurzel aus einer Zahl.
        int wurzelAusMax = (int) Math.sqrt(max);

        return null;
    }

    public static void sortieren(int[] zahlen) {
        // FIXME: Die Zahlen im Array zahlen sind durcheinander geraten. Bitte sortiert die Zahlen aufsteigend nach ihrer Größe.
        //  Beispiel: aus 3,1,2 soll 1,2,3 werden.
    }
}
