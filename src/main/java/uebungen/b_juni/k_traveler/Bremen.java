package uebungen.b_juni.k_traveler;

public class Bremen {

    City self = City.BREMEN;

    public static int getDistance(City city) {
        switch (city) {
            case FRANKFURT:
                return 470;
            case MUNICH:
                return 550;
            case BERLIN:
                return 390;
            default:
                return 0;
        }
    }
}
