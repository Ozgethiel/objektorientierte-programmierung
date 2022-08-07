package hausverwaltung;

import java.util.ArrayList;
import java.util.List;

public class Mieter {
    
    public static final Mieter leerstand = new Mieter("leer");

    private final String name;

    public Mieter(String name) {
        this.name = name;
    }
}
