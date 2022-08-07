package hausverwaltung;

import java.util.List;

public class Zimmer implements Wohnraum {

    private final String funktion;

    private final List<Wohnflaeche> wohnflaechen;

    public Zimmer(String funktion, List<Wohnflaeche> wohnflaechen) {
        this.funktion = funktion;
        this.wohnflaechen = wohnflaechen;
    }

    @Override
    public double getQm() {
        double qm = 0.0;
        for (Wohnflaeche w : wohnflaechen) {
            qm += w.getQm();
        }
        return qm;
    }

    @Override
    public String toString() {
        return "Zimmer{" +
                "funktion='" + funktion + '\'' +
                ", wohnflaechen=" + wohnflaechen +
                '}';
    }
}
