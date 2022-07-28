package uebungen.a_mai.c_arrays_kontrollfluss;

import java.sql.SQLOutput;

public class SchleifenUebungen {

    public static void timer(int kochzeitInMillisekunden) throws InterruptedException {
        // FIXME: Ihr möchtet leckeres Essen kochen und benötigt einen Timer um herauszufinden, wann das Essen gar ist.
        //  Diese Methode soll einen einfachen Timer nachbilden. Die Methode hat eine Variable millisekunden, die angibt, wie lange das Essen noch kochen muss.
        //  Wenn der Timer abgelaufen ist, soll das Wort Alarm auf der Konsole ausgegeben und die Ausführung dieser Methode beendet werden.
        //  System.currentTimeMillis() liefert die aktuelle Zeit in Millisekunden seit dem 1.1.1970 um 0:00 als long-Wert.
        //  Thread.sleep(10) pausiert die Ausführung für ungefähr 10 Millisekunden.
        //  Übergebt keine zu großen Zahlen an diese Methode. Sonst verbrennt euer Essen!
        //  Diese Lösung ist natürlich nicht optimal. Wir werden noch bessere Methoden kennenlernen.
        long startZeit = System.currentTimeMillis();
        long aktuelleZeit= System.currentTimeMillis();
        while(aktuelleZeit-startZeit<kochzeitInMillisekunden){
            Thread.sleep(10); // Beispeil schlafen
            aktuelleZeit=System.currentTimeMillis();
        }
        System.out.println("Alarm");
    }

    public static void zaehlen() {
        // FIXME: Gib die Zahlen von 10 (inklusive) bis 20 (exklusive) auf der Konsole aus.

        for (int i = 10; i < 20; i++) {
            System.out.println(i);

        }
    }

    public static int gluecksspiel(int startgeld, int glueckszahl) {
        // FIXME: Ihr seid im Casino und würfelt. Ihr habt startgeld Euro mitgenommen und setzt immer auf eure Glückszahl glueckszahl. Wenn ihr eure
        //  Glückszahl würfelt, bekommt ihr den doppelten Einsatz zurück. Ihr setzt immer einen Euro.
        //  Wie lange dauert es, bis ihr pleite seid? Wie oft könnt ihr würfeln?
        //  Ein Würfelwurf soll mit der Methode Math.random() simuliert werden. Die Methode gibt Zufallszahlen im Bereich 0-1 als double zurück.
        //  startgeld ist immer eine Zahl größer 0, glückszahl ist immer eine Zahl zwischen 1 und 6 (inclusive).
        //  Gib jeden Würfelwurf auf der Konsole aus.
        int einsatz= 1;
        int spielgespielt = 0;
        int gewonnenspiel=0;

        while(startgeld>=einsatz){
             int zufallszahl = (int)(Math.random()+6*1); // 1 und 6 inklusive ( würfel)
            startgeld= startgeld-einsatz;

            if(zufallszahl==glueckszahl) {
            startgeld = startgeld + 2 * einsatz;
            gewonnenspiel++;

        }else {
            startgeld = startgeld + 0;
        }
        spielgespielt++;
        System.out.println(zufallszahl);

        }
        return spielgespielt;
        }

    }

