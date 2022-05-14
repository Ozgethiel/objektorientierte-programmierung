package uebungen.a_mai.c_arrays_kontrollfluss;

import org.junit.jupiter.api.Test;
import uebungen.a_mai.SystemOutMockingTest;

class BedingungenUebungenTest extends SystemOutMockingTest {

    @Test
    void kleinerSollKleinerAusgebenWennAKleinerB() {
        BedingungenUebungen.kleiner(5, 10);
        assertSystemOutEquals("<");
    }

    @Test
    void kleinerSollNichtsAusgebenWennAGleichB() {
        BedingungenUebungen.kleiner(5, 5);
        assertSystemOutEquals("");
    }

    @Test
    void kleinerSollNichtsAusgebenWennAGroesserB() {
        BedingungenUebungen.kleiner(10, 5);
        assertSystemOutEquals("");
    }

    @Test
    void groesserOderKleinerSollKleinerAusgebenWennAGroesserB() {
        BedingungenUebungen.groesserOderKleiner(5, 10);
        assertSystemOutEquals("<");
    }

    @Test
    void groesserOderKleinerSollNichtsAusgebenWennAGleichB() {
        BedingungenUebungen.groesserOderKleiner(5, 5);
        assertSystemOutEquals("");
    }

    @Test
    void groesserOderKleinerSollKleinerAusgebenWennAKleinerB() {
        BedingungenUebungen.groesserOderKleiner(5, 10);
        assertSystemOutEquals("<");
    }

    @Test
    void groesserKleinerOderGleichSollGroesserAusgebenWennAGroesserB() {
        BedingungenUebungen.groesserKleinerOderGleich(10, 5);
        assertSystemOutEquals(">");
    }

    @Test
    void groesserKleinerOderGleichSollGleichAusgebenWennAGleichB() {
        BedingungenUebungen.groesserKleinerOderGleich(5, 5);
        assertSystemOutEquals("=");
    }

    @Test
    void groesserKleinerOderGleichSollKleinerAusgebenWennAKleinerB() {
        BedingungenUebungen.groesserKleinerOderGleich(5, 10);
        assertSystemOutEquals("<");
    }

    @Test
    void zahlenausgabe1() {
        BedingungenUebungen.wuerfelausgabe(1);
        assertSystemOutEquals("eins");
    }

    @Test
    void zahlenausgabe2() {
        BedingungenUebungen.wuerfelausgabe(2);
        assertSystemOutEquals("zwei");
    }

    @Test
    void zahlenausgabe3() {
        BedingungenUebungen.wuerfelausgabe(3);
        assertSystemOutEquals("drei");
    }

    @Test
    void zahlenausgabe4() {
        BedingungenUebungen.wuerfelausgabe(4);
        assertSystemOutEquals("vier");
    }

    @Test
    void zahlenausgabe5() {
        BedingungenUebungen.wuerfelausgabe(5);
        assertSystemOutEquals("fünf");
    }

    @Test
    void zahlenausgabe6() {
        BedingungenUebungen.wuerfelausgabe(6);
        assertSystemOutEquals("sechs");
    }

    @Test
    void zahlenausgabe7() {
        BedingungenUebungen.wuerfelausgabe(7);
        assertSystemOutEquals("Fehler");
    }
}