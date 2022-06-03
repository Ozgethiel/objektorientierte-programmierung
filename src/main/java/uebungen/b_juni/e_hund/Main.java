package uebungen.b_juni.e_hund;

public class Main {

    public static void main(String[] args) {
        Kopf kopf1 = new Kopf("schwarz");
        Hund hund1 = new Hund("grün", kopf1);
        String s = kopf1.getAugenfarbe();
        System.out.println(s);
        System.out.println(hund1.getKopf().getAugenfarbe());

        Kopf kopf2 = new Kopf("blau");
        Hund hund2 = new Hund("gelb", kopf2);
        System.out.println(hund2.getKopf().getAugenfarbe());
        System.out.println(kopf2.getAugenfarbe());

        Hund hund3 = new Hund("orange", new Kopf("schwarz"));
        System.out.println(hund3.getKopf().getAugenfarbe());


        System.out.println(hund1.beschreibung());
        System.out.println(hund2.beschreibung());
        System.out.println(hund3.beschreibung());
    }
}
