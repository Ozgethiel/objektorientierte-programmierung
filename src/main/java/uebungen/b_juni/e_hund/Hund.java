package uebungen.b_juni.e_hund;

public class Hund {
    private String farbe;
    private Kopf kopf;
    public Hund(String farbe, Kopf kopf) {
        this.farbe = farbe;
        this.kopf = kopf;
    }
    public Kopf getKopf() {
        return kopf;
    }
    public String beschreibung(){
        return "Der Hund ist " + farbe + " und Augenfarbe " + kopf.getAugenfarbe();
    }

}
