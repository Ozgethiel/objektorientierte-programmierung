package uebungen.b_juni.i_icecreamparlor;

import uebungen.b_juni.h_icecream.IceCreamCone;
import uebungen.b_juni.h_icecream.IceCreamScoop;

public class IceCreamParlor {

    public IceCreamParlor() {
    }

    public IceCreamCone order(String list) {

        String[] tastes = list.split(" ");
        IceCreamScoop[] scoops = new IceCreamScoop[tastes.length];

        for (int i = 0; i < tastes.length ; i++) {
           scoops[i] = new IceCreamScoop(tastes[i]);
        }

        IceCreamCone cone = new IceCreamCone(scoops);
        return cone;
    }
}
