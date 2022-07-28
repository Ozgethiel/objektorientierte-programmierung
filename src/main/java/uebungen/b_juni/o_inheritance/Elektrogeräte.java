package uebungen.b_juni.o_inheritance;

public class Elektrogeräte {

    private boolean zustand;

    public boolean isZustand() {
        return zustand;
    }

    public Elektrogeräte(boolean zustand) {
        this.zustand= zustand;
        System.out.println(zustand);
    }
    public void an() {
        System.out.println("an");
        zustand= true;
    }

    public void aus() {
        System.out.println("aus");
        zustand=true;
    }

    public void turnOn(){

    }

}
