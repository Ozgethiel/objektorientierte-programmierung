package uebungen.b_juni.h_icecream;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        // FIXME: Bitte erstellt 2 Klassen:
        //  1. Eine Klasse IceCreamScoop. Die Klasse hat ein String Attribut taste, das den Geschmack der Eiskugel beschreibt. Das Attribut taste wird mithilfe
        //     eines Konstruktors mit
        //
        //     einem Wert belegt. Die Klasse bietet eine Methode getTaste an, die den Geschmack der Klasse als String zurückliefert.
        //  2. Eine Klasse IceCreamCone. Die Klasse hat ein Attribut vom Typ IceCreamScoop Array. Das Array wird per Konstruktor mit einem Wert belegt. Die
        //     Klasse hat eine Methode describe, die alle Geschmäcker in ihrem Array in dem Format "Cone with chocolate vanilla strawberry " auf der Konsole
        //     ausgibt.
        //  Erstellt in dieser main Methode 3 Instanzen vom Typ IceCreamScoop. Eine Instanz hat den Geschmack chocolate, eine den Geschmack vanilla und eine
        //  den Geschmack strawberry. Erstellt dann eine Instanz vom Typ IceCreamCone und weist dieser Klasse mithilfe Ihres Konstruktors die drei Instanzen
        //  vom Typ IceCreamScoop zu. Nutzt dann die Methode describe um die Geschmäcker auszugeben.
        IceCreamScoop[] scoops = new IceCreamScoop[3];
        scoops[0] = new IceCreamScoop("chocolate");
        scoops[1] = new IceCreamScoop("vanilla");
        scoops[2]= new IceCreamScoop("strawberry");

        IceCreamCone cone = new IceCreamCone(scoops);
        System.out.println("I wannt a " + cone.describe());
    }
}
