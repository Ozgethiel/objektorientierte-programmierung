package uebungen.a_mai.b_datentypen;

import org.junit.jupiter.api.Test;
import uebungen.a_mai.SystemOutMockingTest;

class KommazahlUebungenTest extends SystemOutMockingTest {

    @Test
    void pi() {
        KommazahlUebungen.pi();

        assertSystemOutEquals("3.14");
    }

    @Test
    void addierePi() {
        KommazahlUebungen.addierePi(1.23d);

        assertSystemOutEquals("4.37");
    }

    @Test
    void addiere() {
        KommazahlUebungen.addiere(1.75d, 4.5d);

        assertSystemOutEquals("6.25");
    }

    @Test
    void substrahiere() {
        KommazahlUebungen.substrahiere(4.75d, 1.5d);

        assertSystemOutEquals("3.25");
    }

    @Test
    void multipliziere() {
        KommazahlUebungen.multipliziere(4.56d, 1.23d);

        assertSystemOutEquals("5.6088");
    }

    @Test
    void dividiere() {
        KommazahlUebungen.dividiere(10d, 4d);

        assertSystemOutEquals("2.5");
    }


    @Test
    void dividiereDurchNull() {
        KommazahlUebungen.dividiere(10d, 0d);

        assertSystemOutEquals("Infinity");
    }

    @Test
    void durchschnitt() {
        KommazahlUebungen.durchschnitt(1.23d, 4.56d, 7.89d);

        assertSystemOutEquals("4.56");
    }
}