package uebungen.c_juli.b_generics;

public class GenericsExcecises {

    public static String[] numbersFromZeroToTenAsString() {
        // FIXME: Ändert diese Methode, sodass eine Liste mit den Zahlen von
        //  1 bis 10 als String zurückgegeben wird.
        //  java.util.List
        //  mit der Methode add() kann man Elemente zur Liste hinzufügen.
        //  Nutzt eine Instanz von java.util.ArrayList
        return new String[0];
    }

    public static int[] numbersFromZeroToTenAsInt() {
        // FIXME: Ändert diese Methode, sodass eine Liste mit den Zahlen von
        //  1 bis 10 zurückgegeben wird. Die Liste soll Werte vom Typ int enthalten.
        //  java.util.List
        //  mit der Methode add() kann man Elemente zur Liste hinzufügen.
        //  Nutzt eine Instanz von java.util.ArrayList
        return new int[0];
    }

    public static Box wrap(Object o) {
        // FIXME: Ändert die Klasse Box und diese Methode so, dass sie statt
        //  Object Generics verwendet.
        return new Box(o);
    }

    public static Object unwrap(Box b) {
        // FIXME: Ändert die Klasse Box und diese Methode so, dass sie statt
        //  Object Generics verwendet.
        return b.getContent();
    }

}
