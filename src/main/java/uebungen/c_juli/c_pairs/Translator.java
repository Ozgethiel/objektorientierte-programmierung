package uebungen.c_juli.c_pairs;

public class Translator {

    public static void main(String[] args) {
        // FIXME:
        //   1. Erstellt eine Klasse Pair. Die Klasse Pair hat zwei Typ-
        //      Parameter, K und V.
        //   2. Außerdem hat die Klasse zwei Felder.
        //      Ein Feld key vom Typ K und ein Feld value vom Typ V.
        //   3. Mit dem Konstruktor werden beide Felder gesetzt.
        //   4. Es gibt eine Methode getKey und eine Methode getValue,
        //      die die entsprechenden Werte aus key und value zurückgibt.
        //   5. Erstellt eine Klasse Map. Auch die Klasse Map hat die
        //      beiden Typ-Parameter K und V.
        //   6. Die Klasse Map enthält eine List vom Typ Pair.
        //      Jedes Pair in der List besitzt einen key vom Typ K
        //      und einen value vom Typ V.
        //   7. Die Klasse Map wird mit einem Konstruktor in dem Die List
        //      vom Typ Pair mit einer ArrayList initialisiert wird.
        //   8. Außerdem hat die Klasse Map eine Methode put, die einen
        //      Wert K und einen Wert V entgegennimmt. Die Methode erzeugt
        //      ein Pair von diesen beiden Werten und fügt es in die List
        //      Pair hinzu. Die Methode put hat keinen Rückgabetyp (void).
        //   9. Desweiteren hat die Klasse Map eine Methode get, die
        //      einen Parameter vom Typ K entgegennimmt. Sie sucht das
        //      Pair mit dem gleichen key aus ihrer List und gibt den
        //      entsprechenden Value zurück. Wenn kein Eintrag gefunden
        //      wird, wird eine IllegalArgumentException geworfen.
        //  10. Erstellt in dieser Main Klasse eine Map germanNumbers,
        //      die Pair's mit dem Key-Typ Integer und Value-Typ String
        //      fassen kann.
        //  11. Fügt in die Map 10 Werte ein:
        //      0 - "Null"
        //      1 - "Eins"
        //      2 - "Zwei"
        //      3 - "Drei"
        //      ...
        //      9 - "Neun"
        //  12. Schreibt in dieser Klasse Translator eine static Methode
        //      translate mit 2 Typ-Parametern, K und V. Die Methode
        //      akzeptiert 2 Parametern:
        //      einen Parameter vom Typ List mit Einträgen vom Typ K
        //      und einen Parameter vom Typ Map mit dem Key-Typ K und
        //      Value-Typ V.
        //      Die Methode gibt eine List mit Einträgen vom Typ V
        //      zurückgibt. Die Methode übersetzt jeden Key in der List
        //      mit den entsprechenden Value, der in dem Map-Parameter
        //      angegeben ist.
        //  13. Benutzt die Methode mit der Variable germanNumbers
        //      um eine beliebige Zahlenfolge in die entsprechenden
        //      natürlichsprachlichen Zahlen zu übersetzen
        //      (z.B. eure Matrikelnummer oder eure Postleitzahl).
        //      Also aus einem int-List
        //      {2,8,2,0,7}
        //      wird eine String-List
        //      {"Zwei", "Acht", "Zwei", "Null", "Sieben"}
        //      Gebt die String-List auf der Konsole aus.
        //  14. Erstellt eine zweite Map vom gleichen Typ wie germanNumbers,
        //      aber diesmal speichert die Zahlen in der Sprache eurer Wahl
        //      ein.
        //      Gebt die List auf der Konsole aus.
        //  15. Nutzt die Methode translate um eure Zeichenfolge in der
        //      anderen Sprache auszugeben.
        //  16. Schreibt eine Methode flip in der Klasse Map, die eine Map
        //      mit umgekehrten key- und value-Typen erzeugt.
        //      Also aus einer Map mit den Key-Typ int und Value-Typ String
        //      wird eine Map mit dem Key-Typ String und dem Value-Typ int.
        //      Die Werte sollen beibehalten bleiben.
        //  17. Benutzt die translate-Methode um die natürlich-sprachlichen
        //      Zahlen wieder in die Zahlen zu übersetzen.
        //      Also aus einer String-List
        //      {"Zwei", "Acht", "Zwei", "Null", "Sieben"}
        //      wird wieder die int-List
        //      {2,8,2,0,7}
        //  18. Erstellt eine Map mit Key-Typ String und Value-Typ String.
        //      Speichert dieses Mal die natürlich-sprachlichen Zahlen auf
        //      Deutsch als Keys und die natürlich-sprachlichen Zahlen
        //      in einer beliebigen anderen Sprache als Values ab.
        //      z.B.:
        //      "Eins" - "One"
        //      "Zwei" - "Two"
        //      ...
        //  19. Benutzt die Map um eine Zahl in einer Sprache in eine andere
        //      zu übersetzen.
        //  Hinweis: Mit List.of() könnt ihr schnell und einfach Listen mit
        //  festen Werten erzeugen.
    }
}
