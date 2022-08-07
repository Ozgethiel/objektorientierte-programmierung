package hausverwaltung;

import java.util.List;

public class Wohnung implements Wohnraum {

    private final String id;
    private final int etage;

    private Mieter mieter;
    private boolean vermietet;

    private final List<Zimmer> zimmerListe;

    public Wohnung(String id, int etage, List<Zimmer> zimmerListe) {
        this.id = id;
        this.etage = etage;
        this.zimmerListe = zimmerListe;
    }

    public Mieter getMieter() {
        return mieter;
    }

    public void setMieter(Mieter mieter) {
        this.mieter = mieter;
        this.vermietet = true;
    }
    public boolean getVermietet() {
        return vermietet;
    }

    @Override
    public double getQm() {
        double qm = 0.0;
        for (Zimmer w : zimmerListe) {
            qm += w.getQm();
        }
        return qm;
    }

    @Override
    public String toString() {
        return "Wohnung{" +
                "id='" + id + '\'' +
                ", etage=" + etage +
                ", mieter=" + mieter +
                ", zimmerListe=" + zimmerListe +
                '}';
    }
}
