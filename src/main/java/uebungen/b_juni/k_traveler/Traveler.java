package uebungen.b_juni.k_traveler;

public class Traveler {

    public static void main(String[] args) {
        // FIXME: In Deutschland gibt es die folgenden Flughäfen:
        //  - Bremen
        //  - Frankfurt
        //  - München
        //  - Berlin
        //  Zwischen allen diesen Städten gibt es eine Flug-Verbindung.
        //  - Bremen <-> Frankfurt 470km
        //  - Bremen <-> München 770km
        //  - Bremen <-> Berlin 390km
        //  - Frankfurt <-> München 550km
        //  - Frankfurt <-> Berlin 550km
        //  - München <-> Berlin 580km
        //  Ein Mann im Anzug fliegt beruflich sehr viel. Er wohnt in Bremen.
        //  Montags fliegt er nach Frankfurt. Dienstags fliegt er von Frankfurt nach Berlin.
        //  Mittwochs muss er dann nach München. Donnerstags hat er Termine in München
        //  bevor er Freitags nach Hause nach Bremen fliegt.
        //  Modelliert die Städte und Flugverbindungen und berechnet mit deren Hilfe
        //  wie viele Kilometer der Mann im Anzug zurückgelegt hat.

        int travelled = 0;
        // Mo
        travelled = travelled + Bremen.getDistance(City.FRANKFURT);
        // Di
//        travelled = travelled + Frankfurt.getDistance(City.BERLIN);
        // Mi
//        ...
//
        System.out.println("Der Mann im Anzug hat " + travelled + " km zurückgelegt.");

    }

}
