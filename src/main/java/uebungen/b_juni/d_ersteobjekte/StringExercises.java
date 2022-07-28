package uebungen.b_juni.d_ersteobjekte;

public class StringExercises {

    public static char charAtPosition(String text, int position) {
        // FIXME: Hier soll das Zeichen an der Stelle position aus dem String text zurückgegeben werden. Der String enthält mindestens
        //  position Zeichen.
        char[] a = text.toCharArray();

        return a[position];
    }

    public static String substringBefore(String text, String word) {
        // FIXME: Hier soll die Zeichenkette text an der Stelle abgetrennt werden, an der das erste Mal der String word auftaucht. Das Wort word existiert
        //  immer in dem String text.

       int position =  text.indexOf(word);

        return text.substring(0, position);
    }

    public static String optimist(String text) {
        // FIXME: Im String text soll das Wort "halbleer" durch das Wort "halbvoll" ersetzt werden.

        return  text.replace("leer", "voll");

    }

}
