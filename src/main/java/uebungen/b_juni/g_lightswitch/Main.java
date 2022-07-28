package uebungen.b_juni.g_lightswitch;

public class Main {

    public static void main(String[] args) {
        // FIXME: Erstellt 2 Klassen:
        //  1. Eine Klasse Light, die ein boolean Feld illuminated hat. Der Konstruktor der Klasse kann leer bleiben.
        //     Es gibt eine Methode setIlluminated mit einem boolean Parameter und ohne Rückgabetyp (void), die das boolean Feld illuminated auf true bzw.
        //     auf false setzt. Desweiteren gibt es eine Methode isIlluminated ohne Parameter mit Rückgabetyp boolean, die den Zustand der Lampe zurückgibt.
        //  2. Eine Klasse Switch, die ein Feld myLight vom Typ Light hat. Dieses Feld wird per Konstruktor gesetzt. Die Klasse Switch hat eine Methode toggle.
        //     Die Methode hat keine Parameter und keinen Rückgabetyp (void). Wenn das Light mylight gerade leuchtet, schaltet die Methode toggle das Licht aus,
        //     Wenn das Licht gerade nicht leuchtet, schaltet die Methode das Licht an.
        //  Erstellt je eine Instanz vom Typ Light und Switch. Ruft den Zustand vom Licht ab und gebt ihn auf der Konsole aus. Ruft die Methode toggle von
        //  eurem Switch auf und gebt den Zustand des Lichts erneut auf der Konsole aus.
        //  Fortgeschritten: Wenn ihr das geschafft habt, erzeugt 3 Schalter und 3 Lichter und schaltet diese an und aus und gebt deren Zustand auf der
        //  Konsole aus.
        //  Profi: Könnt ihr mit mehreren Scha
        //  ltern das selbe Licht bedienen? Versucht es!
        Light light1 = new Light();
        Switch s1 = new Switch(light1);

        Light light2 = new Light();
        Switch s2 = new Switch(light2);

        Light light3 = new Light();
        Switch s3 = new Switch(light3);

        System.out.println("light 1: " + light1.istIlluminated());
        System.out.println("light 2: " + light2.istIlluminated());
        System.out.println("light 3: " + light3.istIlluminated());
        System.out.println();

        s1.toggle();
        System.out.println("light 1: " + light1.istIlluminated());
        System.out.println("light 2: " + light2.istIlluminated());
        System.out.println("light 3: " + light3.istIlluminated());
        System.out.println();

        s2.toggle();
        s2.toggle();
        System.out.println("light 1: " + light1.istIlluminated());
        System.out.println("light 2: " + light2.istIlluminated());
        System.out.println("light 3: " + light3.istIlluminated());
        System.out.println();

        s3.toggle();
        s3.toggle();
        s3.toggle();
        System.out.println("light 1: " + light1.istIlluminated());
        System.out.println("light 2: " + light2.istIlluminated());
        System.out.println("light 3: " + light3.istIlluminated());
        System.out.println();

        // bonus
        Switch s1too = new Switch(light1);
        System.out.println("light 1: " + light1.istIlluminated());
        s1.toggle();
        System.out.println("light 1: " + light1.istIlluminated());
        s1too.toggle();
        System.out.println("light 1: " + light1.istIlluminated());
    }
}
