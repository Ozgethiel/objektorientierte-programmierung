package uebungen.b_juni.p_interfaces;

public class XxoWithInterfaces {

    public static void main(String[] args) {
        // Versucht mit Tests zu arbeiten. Schreibt pro Klasse einen Test.
        // In dieser Übung erweitern wir die Übung Xxo.
        //  1. Schreibt ein Interface Drawable, das eine Methode getSymbolAtCoordinate
        //     deklariert. Die Methode akzeptiert einen Parameter vom Typ Coordinate
        //     und gibt einen char Wert zurück.
        //     Die Klasse Coordinate könnt ihr weiter verwenden.
        //  2. Erstellt eine neue Klasse Point, die das Interface Drawable implementiert.
        //     Die Funktionalität könnt ihr aus der alten Klasse Point übernehmen.
        //  3. Erstellt eine neue Klasse HorizontalLine, die das Interface Drawable
        //     implementiert. Diese Klasse soll eine horizontale Linie in einer bestimmten
        //     Zeile darstellen.
        //  4. Erstellt eine neue Klasse VerticalLine, die das Interface Drawable
        //     implementiert. Diese Klasse soll eine vertikale Linie in einer bestimmten
        //     Spalte darstellen.
        //  5. Schreibt eine neue Klasse Window. Diese Klasse hat aber keine Methode
        //     addPoint, die einen Parameter vom Typ Point entgegennimmt, sondern eine
        //     Methode addDrawable(), die einen Parameter vom Typ Drawable entgegennimmt.
        //     Außerdem speichert die addDrawable() Methode die übergebenen Drawable's
        //     nicht in einem Point-Array sondern in einem Drawable-Array.
        //     Implementiert die restliche Funktionalität analog zu der Klasse aus der
        //     ersten Xxo Übung.
        //  6. Erstellt das Spielfeld von Xxo in dieser Main Methode. Diesmal nutzt
        //     aber die Klassen HorizontalLine und VerticalLine für das Spielfeld
        //     und Point nur für X und O.
        //  7. Prüft in der neuen Klasse Window, ob sich eine horizontale und eine
        //     vertikale Linie überschneiden. Wenn sie sich überschneiden, gebt ein +
        //     statt einer | oder einem - aus.
        // Fortgeschritten: Nutzt die neuen Klassen für das Schachbrett.
    }
}
