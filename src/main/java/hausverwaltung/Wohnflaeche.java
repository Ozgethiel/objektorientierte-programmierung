package hausverwaltung;

public class Wohnflaeche implements Wohnraum {

    private final double breite;
    private final double laenge;
    private final double hoehe;

    private final double qm;

    public Wohnflaeche(double breite, double laenge, double hoehe) {
        this.breite = breite;
        this.laenge = laenge;
        this.hoehe = hoehe;

        final double flaeche = breite * laenge;
        final double faktor;
        if (hoehe < 1.0) {
            faktor = 0.0;
        } else if (hoehe < 2.0) {
            faktor = 0.5;
        } else {
            faktor = 1.0;
        }

        qm = faktor * flaeche;
    }

    @Override
    public double getQm() {
        return qm;
    }

    @Override
    public String toString() {
        return "Wohnflaeche{" +
                "breite=" + breite +
                ", laenge=" + laenge +
                ", hoehe=" + hoehe +
                ", qm=" + qm +
                '}';
    }
}
