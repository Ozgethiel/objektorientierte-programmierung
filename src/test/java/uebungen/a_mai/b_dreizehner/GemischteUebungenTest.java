package uebungen.a_mai.b_dreizehner;

import org.junit.jupiter.api.Test;
import uebungen.a_mai.SystemOutMockingTest;

import static org.junit.jupiter.api.Assertions.*;

class GemischteUebungenTest extends SystemOutMockingTest {

    @Test
    void ganzzahlenSindGleichTrue() {
        GemischteUebungen.ganzzahlenSindGleich(10, 10);

        assertSystemOutEquals("true");
    }

    @Test
    void ganzzahlenSindGleichFalse() {
        GemischteUebungen.ganzzahlenSindGleich(10, 5);

        assertSystemOutEquals("false");
    }

    @Test
    void ganzzahlenSindUngleichTrue() {
        GemischteUebungen.ganzzahlenSindUngleich(10, 5);

        assertSystemOutEquals("true");
    }

    @Test
    void ganzzahlenSindUngleich() {
        GemischteUebungen.ganzzahlenSindUngleich(10, 10);

        assertSystemOutEquals("false");
    }

    @Test
    void aIstGroesserGanzzahlBTrue() {
        GemischteUebungen.aIstGroesserGanzzahlB(10, 5);

        assertSystemOutEquals("true");
    }

    @Test
    void aIstKleinerGanzzahlBTrue() {
        GemischteUebungen.aIstKleinerGanzzahlB(5, 10);

        assertSystemOutEquals("true");
    }

    @Test
    void aIstGroesserGanzzahlBFalse() {
        GemischteUebungen.aIstGroesserGanzzahlB(10, 10);

        assertSystemOutEquals("true");
    }

    @Test
    void aIstKleinerGanzzahlBFalse() {
        GemischteUebungen.aIstKleinerGanzzahlB(10, 10);

        assertSystemOutEquals("true");
    }

    @Test
    void aIstGroesserGleichGanzzahlBTrueEchtGroesser() {
        GemischteUebungen.aIstGroesserGleichGanzzahlB(10, 5);

        assertSystemOutEquals("true");
    }

    @Test
    void aIstKleinerGleichGanzzahlBTrueEchtGroesser() {
        GemischteUebungen.aIstKleinerGleichGanzzahlB(10, 5);

        assertSystemOutEquals("true");
    }

    @Test
    void aIstGroesserGleichGanzzahlTrueGleich() {
        GemischteUebungen.aIstGroesserGleichGanzzahlB(5, 5);

        assertSystemOutEquals("true");
    }

    @Test
    void aIstKleinerGleichGanzzahlTrueGleich() {
        GemischteUebungen.aIstKleinerGleichGanzzahlB(5, 5);

        assertSystemOutEquals("true");
    }

    @Test
    void aIstGroesserGleichGanzzahlFalse() {
        GemischteUebungen.aIstGroesserGleichGanzzahlB(5, 10);

        assertSystemOutEquals("false");
    }

    @Test
    void aIstKleinerGleichGanzzahlFalse() {
        GemischteUebungen.aIstKleinerGleichGanzzahlB(5, 10);

        assertSystemOutEquals("false");
    }

    @Test
    void kommazahlenSindGleichTrue() {
        GemischteUebungen.kommazahlenSindGleich(1.23d, 1.23d);

        assertSystemOutEquals("true");
    }

    @Test
    void kommazahlenSindGleichFalse() {
        GemischteUebungen.kommazahlenSindGleich(1.23d, 4.56d);

        assertSystemOutEquals("false");
    }

    @Test
    void kommazahlenSindUngleichTrue() {
        GemischteUebungen.kommazahlenSindUngleich(1.23d, 4.56d);

        assertSystemOutEquals("true");
    }

    @Test
    void kommazahlenSindUngleichFalse() {
        GemischteUebungen.kommazahlenSindUngleich(1.23d, 1.23d);

        assertSystemOutEquals("false");
    }

    @Test
    void aIstGroesserKommazahlBTrue() {
        GemischteUebungen.aIstGroesserKommazahlB(10, 5);

        assertSystemOutEquals("true");
    }

    @Test
    void aIstKleinerKommazahlBTrue() {
        GemischteUebungen.aIstKleinerKommazahlB(5, 10);

        assertSystemOutEquals("true");
    }

    @Test
    void aIstGroesserKommazahlBFalse() {
        GemischteUebungen.aIstGroesserKommazahlB(10, 10);

        assertSystemOutEquals("true");
    }

    @Test
    void aIstKleinerKommazahlBFalse() {
        GemischteUebungen.aIstKleinerKommazahlB(10, 10);

        assertSystemOutEquals("true");
    }

    @Test
    void aIstGroesserGleichKommazahlBTrueEchtGroesser() {
        GemischteUebungen.aIstGroesserGleichKommazahlB(10, 5);

        assertSystemOutEquals("true");
    }

    @Test
    void aIstKleinerGleichKommazahlBTrueEchtGroesser() {
        GemischteUebungen.aIstKleinerGleichKommazahlB(10, 5);

        assertSystemOutEquals("true");
    }

    @Test
    void aIstGroesserGleichKommazahlTrueGleich() {
        GemischteUebungen.aIstGroesserGleichKommazahlB(5, 5);

        assertSystemOutEquals("true");
    }

    @Test
    void aIstKleinerGleichKommazahlTrueGleich() {
        GemischteUebungen.aIstKleinerGleichKommazahlB(5, 5);

        assertSystemOutEquals("true");
    }

    @Test
    void aIstGroesserGleichKommazahlFalse() {
        GemischteUebungen.aIstGroesserGleichKommazahlB(5, 10);

        assertSystemOutEquals("false");
    }

    @Test
    void aIstKleinerGleichKommazahlFalse() {
        GemischteUebungen.aIstKleinerGleichKommazahlB(5, 10);

        assertSystemOutEquals("false");
    }
}