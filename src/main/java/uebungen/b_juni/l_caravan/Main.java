package uebungen.b_juni.l_caravan;

public class Main {

    public static void main(String[] args) {
        // Eine Karavane hat eine flexible Anzahl Kamele. Jedes Kamel ist mit seinem Nachfolger verbunden.
        // Wenn ein Kamel keinen Nachfolger hat, ist sein Nachfolger null. Jedes Kamel hat einen Namen.
        // Erzeugt eine Klasse Caravan und eine Klasse Camel.
        // Caravan hat ein Feld first vom Typ Camel.
        // Camel hat ein Feld next vom Typ Camel, ein Feld maxPace vom Typ int und ein Feld load vom Typ int.
        // Erzeugt eine Karavane mit den 3 Kamelen Thomas, Eva und Erwin. Thomas kann max. 8 km/h,
        // Eva max 5 km/h und Erwin max 6 km/h laufen. Thomas trägt 5kg, Eva trägt 2 kg und Erwin trägt 1kg.
        // Jedes Kilogramm reduziert die Maximalgeschwindigkeit des Kamels um 1km/h.
        // Camel hat eine Methode getPace um die Maximalgeschwindigkeit unter Berücksichtigung der
        // Ladung abzurufen.
        // Karavane soll eine Methode getMaxPace haben, die die maximale Geschwindigkeit der Karavane
        // bestimmen soll ohne dass ein Kamel das andere überholt oder eine Leine reisst.
    }
}
