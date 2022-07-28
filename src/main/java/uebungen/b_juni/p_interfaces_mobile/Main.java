package uebungen.b_juni.p_interfaces_mobile;

public class Main {

    public static void main(String[] args) {
        // Ein Mobile ist ein Zimmerschmuck aus ausbalancierten Stäbchen und Fäden, an die kleine Gegenstände
        // geknüpft sind. Siehe z.B. https://media.fds.fi/product_image/800/52FlenstedMobiles_19_TH.jpg
        // Wir arbeiten mit diesem Mobile mit Sternen:
        //                 |
        //            6    |      4
        //         ------------------
        //        |                 |
        //     6  |  3              |
        // ---------------          * w=9
        // |             |
        // * w=2         * w=4
        // Die Sterne sind unterschiedlich schwer (w=Gewicht). Die Gewichte der Fäden und Stäbchen sind
        // gegenüber den Sternen vernachlässigbar.
        // Schreibt ein Interface Mobile mit den folgenden Methoden:
        // - double weight():    Liefert das Gewicht des gesamten Mobiles.
        // - String toString():  Erzeugt eine lesbare Textdarstellung deines Mobiles
        // - void balance():     Balanciert ein Mobile aus. Das ist unten genauer ausgeführt.
        // Die konkrete Klasse Star repräsentiert Sterne im Mobile. Ein einzelner Stern wird als Mobile
        // betrachtet (wenn auch als sehr einfaches), deshalb implementiert der die Klasse Star das
        // Interface Mobile. Jeder Stern hat ein Gewicht (Typ double), das im Konstruktor übergeben wird.
        // Ein einzelner Stern ist immer ausbalanciert. Die Methode balance in der Klasse Star braucht
        // deshalb nichts zu tun. Die toString Methode des Sterns gibt "Star[<weight>]" zurück, wobei
        // <weight> durch das Gewicht des Sternes zu ersetzen ist.
        // Die Klasse Wire repräsentiert ein Stäbchen im Mobile. Wire implementiert ebenfalls das Interface
        // Mobile. Der Konstruktor erwartet zwei andere Mobiles, die an den Enden des Stäbchens geknüpft sind,
        // und die Länge des Stäbchens. Irgendwo zwischen den beiden Enden des Stäbchens ist der Knoten, an
        // dem es selbst hängt. Die Position des Knotens ist zunächst noch unbestimmt. balance verändert die
        // Positionen aller Knoten, sodass das Mobile ausbalanciert ist. Ein Stäbchen ist ausbalanciert,
        // wenn das Produkt aus Gewicht und Armlänge auf beiden Seiten des Knotens gleich ist. Das oben
        // skizzierte Mobile ist ausbalanciert (für das untere Stäbchen 2*6=4*3, für das obere Stäbchen
        // (2+4)*6=9*4).
        // Daraus ergibt sich:
        // Länge links = Gewicht rechts * Gesamtlänge / (Gewicht rechts + Gewicht links)
        // Länge rechts = Gewicht links * Gesamtlänge / (Gewicht rechts + Gewicht links)
        // Ein Wire gibt in der toString-Methode "Mobile[<längeLinks>:<mobileLinks>, <längeRechts>:<mobileRechts>]"
        // zurück, wobei <längeLinks> durch die Länge des Fadens links, <längeRechts> durch die Länge des
        // Fadens rechts, <mobileLinks> durch die Ausgabe der toString-Methode des linken Mobiles, <mobileRechts>
        // durch die Ausgabe der toString-Methode des rechten Mobiles zu ersetzen ist.
        // Schreibt die Klassen Star und Wire und legt in dieser main Methode das oben skizzierte Mobile an,
        // balanciert das Mobile aus und gebt es dann aus. Dabei sollten sich die in der Skizze angegebenen
        // Knotenpositionen ergeben.
        Star a = new Star(2);
        Star b = new Star (4);
        Star c = new Star(9);
        a.balance();
        b.balance();
        c.balance();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

       a.toString();
       b.toString();


    }
}
