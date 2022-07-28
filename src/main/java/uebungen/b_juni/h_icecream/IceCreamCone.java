package uebungen.b_juni.h_icecream;

import java.util.Arrays;

public class IceCreamCone {

    private IceCreamScoop[] scoops;

    public IceCreamCone(IceCreamScoop[] scoops) {
        this.scoops = scoops;
    }

    public String describe() {
        String description = "Cone with";
        for (int i = 0; i < scoops.length; i++) {
            description = description + (" " + scoops[i].getTaste());
        }
        return description;
    }
}
