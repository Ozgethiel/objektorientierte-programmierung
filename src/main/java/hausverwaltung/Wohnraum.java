package hausverwaltung;

public interface Wohnraum {

    static final double qmPreis = 10.28;

    double getQm();

    default double getKaltmiete() {
        return qmPreis * getQm();
    }
}
