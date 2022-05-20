package uebungen.a_mai.c_arrays_kontrollfluss;

import java.util.Arrays;

public class FortgeschritteneUebungen {

    public static void umkehren(int[] zahlen) {
        // FIXME: Diese Funktion soll die Zahlen im Array zahlen in umgekehrter Reihenfolge in das selbe Array speichern.
        //  Beispiel: Aus 1,2,3 wird 3,2,1


        for (int i = 0; i < zahlen.length / 2; i++) {

            int swap = zahlen[i];
            zahlen[i] = zahlen[zahlen.length - i - 1];
            zahlen[zahlen.length - i - 1] = swap;
        }

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
        char s = 'S';
        char w = 'W';
        char x = ' ';
        char[] wline1 = {w, x, w, x, w, x, w, x};
        char[] wline2 = {x, w, x, w, x, w, x, w};
        char[] wline3 = {w, x, w, x, w, x, w, x};
        char[] wline4 = {x, x, x, x, x, x, x, x};
        char[] line1 = {x, x, x, x, x, x, x, x};
        char[] line2 = {x, s, x, s, x, s, x, s};
        char[] line3 = {s, x, s, x, s, x, s, x};
        char[] line4 = {x, s, x, s, x, s, x, s};


        char[][] a = {wline1, wline2, wline3, wline4, line1, line2, line3, line4,};
        System.out.println(a);

        return a;
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

        return null; //
    }

    public static void sortieren(int[] zahlen) {
        // FIXME: Die Zahlen im Array zahlen sind durcheinander geraten. Bitte sortiert die Zahlen aufsteigend nach ihrer Größe.
        //  Beispiel: aus 3,1,2 soll 1,2,3 werden.

        int len = zahlen.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len; j++) {
                if (zahlen[i] < zahlen[j]) {
                    int h = zahlen[i];
                    zahlen[i] = zahlen[j];
                    zahlen[j] = h;

                }
            }
        }

    }


    public static void roemischeZahlen(int dezimal) {
        // FIXME: Die Zahl dezimal soll als römische Zahl ausgegeben werden.
        //  Römer zählten mit Buchstaben.
        //  1000 = M
        //  500 = D
        //  100 = C
        //  50 = L
        //  10 = X
        //  5 = V
        //  1 = I
        //  Es werden aber nie 4 gleiche Zeichen hintereinander ausgegeben. Wenn z.B. eine 4 ausgegeben werden soll, wird stattdessen die nächstgrößere
        //  Ziffer um die kleinere verringert, indem sie vor die größere geschrieben wird.
        //  Beispiele: 4 = IV, 90 = XM
        //  Die einzelnen Buchstaben können mit System.out.print(char); ausgegeben werden. Bitte gebt nach eurer Ausgabe noch ein Leerzeichen mit
        //  System.out.println(); aus.
        String roemisch = "";

        int ms = dezimal / 1000;
        for (int i = 0; i < ms; i++) {
            roemisch = roemisch + "M";
        }
        dezimal = dezimal - ms * 1000;

        int ds = dezimal / 500;
        for (int i = 0; i < ds; i++) {
            roemisch = roemisch + "D";
        }
        dezimal = dezimal - ds * 500;

        int cs = dezimal / 100;
        if (cs == 4) {
            roemisch = roemisch + "CD";
        } else {
            for (int i = 0; i < cs; i++) {
                roemisch = roemisch + "C";
            }
        }
        //System.out.println(dezimal);
        dezimal = dezimal - cs * 100;

        int ls = dezimal / 50;
        for (int i = 0; i < ls; i++) {
            roemisch = roemisch + "L";
        }
        dezimal = dezimal - ls * 50;

        int xs = dezimal / 10;
        for (int i = 0; i < xs; i++) {
            roemisch = roemisch + "X";
        }
        dezimal = dezimal - xs * 10;

        int vs = dezimal / 5;
        for (int i = 0; i < vs; i++) {
            roemisch = roemisch + "V";
        }
        dezimal = dezimal - vs * 5;

        int is = dezimal / 1;
        if (is == 4) {
            roemisch = roemisch + "IV";
        } else {
            for (int i = 0; i < is; i++) {
                roemisch = roemisch + "I";
            }
        }
            System.out.println(roemisch);
            // System.out.println(dezimal);
        }
    }

