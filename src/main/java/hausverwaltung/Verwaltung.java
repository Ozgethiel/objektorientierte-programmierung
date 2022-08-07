package hausverwaltung;

import java.util.ArrayList;
import java.util.List;

public class Verwaltung {

    private final List<Zimmer> wohnungen = new ArrayList<>();

    public static void main(String[] args) {

        Wohnflaeche f1 = new Wohnflaeche(1, 2, 1);
        Wohnflaeche f2 = new Wohnflaeche(1, 4, 1.5);
        Wohnflaeche f3 = new Wohnflaeche(1, 6, 2);
        Wohnflaeche f4 = new Wohnflaeche(1, 8, 2.5);
        Wohnflaeche f5 = new Wohnflaeche(1, 10, 3);

        List<Wohnflaeche> list = new ArrayList<>();
        list.add(f1);
        list.add(f2);
        Zimmer z1 = new Zimmer("Bad", list);
        Zimmer z2 = new Zimmer("Küche", List.of(f2));
        Zimmer z3 = new Zimmer("Flur", List.of(f3));
        Zimmer z4 = new Zimmer("Wohnzimmer", List.of(f4));
        Zimmer z5 = new Zimmer("Schlafzimmer", List.of(f5));
        
        Wohnung w1 = new Wohnung("1re", 1, List.of(z1, z2, z3, z4));
        w1.setMieter(new Mieter("Özge"));
        Wohnung w2 = new Wohnung("1li", 1, List.of(z1, z2, z3, z5));
        w2.setMieter(new Mieter("Mohammed"));
        Wohnung w3= new Wohnung("mitte",1,List.of(z1, z2, z3, z4, z5));
        w3.setMieter(new Mieter("Tithin"));
        Wohnung w4 = new Wohnung("Nord",2,List.of(z1, z2, z3, z4));
        Wohnung w5 = new Wohnung("Süd", 2, List.of(z1, z2, z3, z4, z5));


        Immobilie a = new Immobilie("Bremen", List.of(w1));
//        System.out.println("Immobilie in " + a.getAdresse() + " hat Leerstand von " + a.getQmLeer());
        Immobilie b = new Immobilie("Hamburg", List.of(w2,w4));
        Immobilie c = new Immobilie("Oldenburg", List.of(w3, w5));


        List<Immobilie> alle = List.of(a, b, c);

        for(Immobilie immo : alle){
            System.out.println("Immobilie in " + immo.getAdresse() + " hat Leerstand von " + immo.getQmLeer() + " m²");
        }

        double sum = 0;

        for(Immobilie immo : alle){
            sum += immo.getQmLeer();
        }
        System.out.println("Der Leerstand von alle Immobilie ist " + sum + " m² ");

        w1.getVermietet();
        System.out.println();

        System.out.println(f4);
        System.out.println(z1);


        System.out.println(w1.getQm());

    }
}
