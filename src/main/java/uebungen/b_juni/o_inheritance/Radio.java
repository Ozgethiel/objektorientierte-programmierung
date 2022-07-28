package uebungen.b_juni.o_inheritance;

public class Radio extends Elektrogeräte {
    public Radio(boolean zustand) {
        super(zustand);


    }
    private int volume;
    public void volumeUp() {
        volume++;
    }

    public void volumeDown() {
        volume--;
    }

    public int getVolume(){
        return volume;

    }
    @Override
    public String toString(){
        String x= " Radio is " + " on ";
        return x;
    }
}
