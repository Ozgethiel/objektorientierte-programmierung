package uebungen.a_mai.c_arrays_kontrollfluss;

public class FortgeschritteneUebungen {

    public static void umkehren(int[] zahlen) {
        // FIXME: Diese Funktion soll die Zahlen im Array zahlen in umgekehrter Reihenfolge in das selbe Array speichern.
        //  Beispiel: Aus 1,2,3 wird 3,2,1
    }

    public static char[][] dame() {
        // FIXME: Diese Methode soll ein 2-dimensionales char-Array erzeugen. Das Array soll die Start-Aufstellung in einem Dame-Feld repräsentieren.
        //  In Deutschland hat ein Dame Feld 8x8 Felder. Jeder Spieler hat 12 Spielsteine. Es gibt 2 Spieler: schwarz und weis.
        //  https://de.wikipedia.org/wiki/Dame_(Spiel)#/media/Datei:Damiera_cropped_mirrored.JPG
        //  Diese Methode soll ein solches Spielfeld erzeugen.
        //  Wenn auf dem Feld kein Spielstein liegt, soll der Eintrag ein Leerzeichen enthalten.
        //  Wenn auf dem Feld ein schwarzer Stein liegt, soll der Eintrag ein großes S enthalten.
        //  Wenn auf dem Feld ein weißer Stein liegt, soll der Eintrag ein großes W enthalten.
        //  Der erste Index identifiziert die Zeilen, der zweite Index die Spalten.
        //  Die weißen Steine sind in den ersten 3 Zeilen aufgestellt, die schwarzen Steine sind den letzten 3 Zeilen aufgestellt.
        return null;
    }

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
