package hausverwaltung;

import java.util.List;

public class Immobilie implements Wohnraum {

    private final String adresse;

    private final List<Wohnung> wohnungen;

    public Immobilie(String adresse, List<Wohnung> wohnungen) {
        this.adresse = adresse;
        this.wohnungen = wohnungen;
    }

    public String getAdresse() {
        return adresse;
    }

    public double getQmLeer() {
        double qm = 0.0;
        for (Wohnung w : wohnungen) {
            if (!w.getVermietet()) {
                qm += w.getQm();
            }
        }
        return qm;
    }

    @Override
    public double getQm() {
        double qm = 0.0;
        for (Wohnung w : wohnungen) {
            qm += w.getQm();
        }
        return qm;
    }

    @Override
    public String toString() {
        return "Immobilie{" +
                "adresse='" + adresse + '\'' +
                "kaltMiete='" + getKaltmiete() + '\'' +
                ", wohnungen=" + wohnungen +
                '}';
    }
}
