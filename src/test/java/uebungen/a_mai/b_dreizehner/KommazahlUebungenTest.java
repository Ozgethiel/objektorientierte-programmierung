package uebungen.a_mai.b_dreizehner;

import org.junit.jupiter.api.Test;
import uebungen.a_mai.SystemOutMockingTest;

class KommazahlUebungenTest extends SystemOutMockingTest {

    @Test
    void pi() {
        KommazahlUebungen.pi();

        assertSystemOutEquals("Pi entspricht circa 3.14");
    }

    @Test
    void addierePi() {
        KommazahlUebungen.addierePi(1.23d);

        assertSystemOutEquals("1.23 + 3.14 = 4.37");
    }

    @Test
    void addiere() {
        KommazahlUebungen.addiere(1.23d, 4.56d);

        assertSystemOutEquals("1.23 + 4.56 = 5.79");
    }

    @Test
    void substrahiere() {
        KommazahlUebungen.substrahiere(4.56d, 1.23d);

        assertSystemOutEquals("4.56 - 1.23 = 3,33");
    }

    @Test
    void multipliziere() {
        KommazahlUebungen.multipliziere(4.56d, 1.23d);

        assertSystemOutEquals("4.56 * 1.23 = 5,6088");
    }

    @Test
    void dividiere() {
        KommazahlUebungen.dividiere(4.56d, 1.23d);

        assertSystemOutEquals("4.56 / 1.23 = 3,7073170732");
    }

    @Test
    void durchschnitt() {
        KommazahlUebungen.durchschnitt(1.23d, 4.56d, 7.98d);

        assertSystemOutEquals("Durchschnitt von 1.23, 4.56 7.98 ist 4,56");
    }
}