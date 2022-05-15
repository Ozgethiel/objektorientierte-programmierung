package uebungen.a_mai.c_arrays_kontrollfluss;

public class SchleifenUebungen {

    public static void timer(int millisekunden) throws InterruptedException {
        // FIXME: Ihr möchtet leckeres Essen kochen und benötigt einen Timer um herauszufinden, wann das Essen gar ist.
        //  Diese Methode soll einen einfachen Timer nachbilden. Die Methode hat eine Variable millisekunden, die angibt, wie lange das Essen noch kochen muss.
        //  Wenn der Timer abgelaufen ist, soll das Wort Alarm auf der Konsole ausgegeben und die Ausführung dieser Methode beendet werden.
        //  System.currentTimeMillis() liefert die aktuelle Zeit in Millisekunden seit dem 1.1.1970 um 0:00 als long-Wert.
        //  Thread.sleep(10) pausiert die Ausführung für ungefähr 10 Millisekunden.
        //  Übergebt keine zu großen Zahlen an diese Methode. Sonst verbrennt euer Essen!
        //  Diese Lösung ist natürlich nicht optimal. Wir werden noch bessere Methoden kennenlernen.
        long vorher = System.currentTimeMillis();
        Thread.sleep(10);
    }

    public static boolean alkohol(int[] alter) {
        // FIXME: Du bist KassiererIn im Supermarkt. Einige Jugendliche wollen Alkohol kaufen. Du fragst sie nach ihrem Alter. Die Jugendlichen haben in der
        //  Schule schon Informatik gelernt und übergeben dir ihr Alter in einem int-Array. Du musst jetzt prüfen, ob die Jugendlichen den Alkohol kaufen
        //  dürfen, oder nicht. Wenn eine Person mindestens 18 Jahre alt ist, darf sie den Alkohol kaufen. Wenn keiner in der Gruppe 18 ist, dürfen sie keinen
        //  Alkohol kaufen.
        //  Diese Methode soll einen boolean zurückgeben, ob die Jugendlichen Alkohol kaufen dürfen (true), oder nicht (false).
        //  Versuche hier die Schleife möglichst sofort abzubrechen um die Schleife nicht öfter als nötig zu durchlaufen.
        return false;
    }

    public static void zaehlen() {
        // FIXME: Gib die Zahlen von 10 (inklusive) bis 20 (exklusive) auf der Konsole aus.
    }
}
