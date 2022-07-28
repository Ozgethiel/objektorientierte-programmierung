package uebungen.b_juni.o_inheritance;

import org.joda.time.DateTime;

public class Ship {

    public static void main(String[] args) throws InterruptedException {
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
        //     Nutzt die Bibliothek JodaTime und insb. die Klasse org.joda.time.DateTime.
        //     In eurem Test könnt ihr mit der Methode org.joda.time.DateTimeUtils.setCurrentMillisFixed(long l)
        //     eine feste Zeit einspeichern, die dann von der Klasse DateTime verwendet wird.
        //     Details zu den Klassen findet ihr hier:
        //     https://www.joda.org/joda-time/apidocs/org/joda/time/DateTime.html
        //     https://www.joda.org/joda-time/apidocs/org/joda/time/DateTimeUtils.html#setCurrentMillisFixed-long-
        //     https://www.joda.org/joda-time/apidocs/org/joda/time/DateTimeUtils.html#setCurrentMillisSystem--
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
        // 12. Bevor er in den Urlaub fährt, prüft der Kapitän alle Batterien in seinen Feuermeldern.
        //     Geht das Array durch und prüft, welcher Typ sich an einer Stelle befindet. Wenn es sich um
        //     einen Feuermelder handelt, gebt den Ladezustand der Batterie auf der Konsole aus.
        // 13. Der Kapitän möchte Urlaub machen. Schaltet alle Elektrogeräte in dem Array ab (ruft die
        //     Methode zum Abschalten auf).
        // 14. Gebt die Instanzen in dem Array auf der Konsole aus. Nutzt dazu eure toString() Methode.
        //     Versucht einen anderen Batteriezustand von dem Feuermelder abzurufen. Mit dem folgenden Befehl
        //     könnt ihr eine bestimmte Anzahl Millisekunden warten:
       DateTime vorher = new DateTime();
        Thread.sleep(1000);
        System.out.println(vorher);
        DateTime nachher = new DateTime();
        System.out.println(nachher);

      Radio radio1 = new Radio(true);
      Radio radio2= new Radio ( true);
    }
}
