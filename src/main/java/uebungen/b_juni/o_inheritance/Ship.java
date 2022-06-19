package uebungen.b_juni.o_inheritance;

public class Ship {

    public static void main(String[] args) {
        // Schreibt bitte für die folgenden Aufgaben pro Klasse einen Test, der alle Methoden testet.
        //  1. Ein Kapitän hat auf seinem Schiff Elektrogeräte. Jedes Elektrogerät hat einen Zustand: an / aus.
        //     Außerdem kann jedes Elektrogerät ein und ausgeschaltet sowie der aktuelle Zustand als boolean
        //     abgefragt werden kann.
        //  2. Erstellt einen Konstruktor in der Klasse Elektrogerät. Der Konstruktor nimmt einen boolean
        //     Parameter entgegen, der den aktuellen Zustand des Elektrogeräts beschreibt.
        //  3. Erstellt eine Unterklasse Radio, die von Elektrogerät erbt.
        //  4. Zusätzlich zu den Eigenschaften aus Elektrogerät hat das Radio eine Lautstärke. Die Lautstärke
        //     kann über 2 Methoden erhöht oder verringert werden.
        //  5. Erstellt eine zweite Unterklasse Feuermelder, die von Elektrogerät erbt. Der Feuermelder
        //     kann nicht ausgeschaltet werden. Er überschreibt also die Funktion zum Abschalten und ändert
        //     den Zustand des Elektrogerätes in dieser Funktion nicht. Außerdem kann der Feuermelder mit
        //     einem leeren Konstruktor erstellt werden.
        //  6. Erweitert die Klasse Feuermelder. Ein Feuermelder hat eine Batterie. Sobald ein Feuermelder
        //     erstellt wird, beginnt die Batterie zu entladen. Die Batterie fängt bei 100% an und entlädt
        //     jede Sekunde um 1%. Speichert im Konstruktor die Zeit, zu der der Rauchmelder erstellt
        //     wurde, in einem int-Feld.
        //     Nutzt die Methode System.currentTimeMillis().
        //  7. Ein Elektrogerät kann eine Beschreibung liefern. Überschreibt dazu die toString() Methode
        //     der Klasse java.lang.Object und gebt Folgendes zurück:
        //     z.B. "Das Elektrogerät ist aus" oder "Das Elektrogerät ist an"
        //  8. Überschreibt in der Klasse Radio und Feuermelder auch die toString() Methode.
        //     Die Rückgabe des Radios enthält den Zustand (an/aus) und die Lautstärke.
        //     Die Rückgabe des Feuermelder enthält nur den Batteriezustand. Wenn der Batteriezustand
        //     unter 20% sinkt, beginnt die Rückgabe mit "ALARM!!!"
        //  9. Erstellt in dieser main Methode mehrere Instanzen vom Typ Radio und Feuermelder. Schaltet
        //     manche davon ein und manche aus.
        // 10. Speichert die gerade erstellten Instanzen in einem Elektrogeräte Array.
        // 11. Zählt, wie viele Elektrogeräte in dem Array eingeschaltet sind.
        // 12. Der Kapitän möchte Urlaub machen. Schaltet alle Elektrogeräte in dem Array ab (ruft die
        //     Methode zum Abschalten auf).
        // 13. Gebt die Instanzen in dem Array auf der Konsole aus. Nutzt dazu eure toString() Methode.
    }
}
