package uebungen.b_juni.l_caravan;

public class Camel {

    String name;
    Camel next;
    int maxPace;
    int load;

    public Camel(String name, Camel next, int maxPace, int load) {
        this.name = name;
        this.next = next;
        this.maxPace = maxPace;
        this.load = load;
    }

    public int getPace() {
        return maxPace - load;
    }
}
