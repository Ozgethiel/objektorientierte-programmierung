package uebungen.a_mai.b_dreizehner;

import org.junit.jupiter.api.Test;
import uebungen.a_mai.SystemOutMockingTest;

class BooleanUebungenTest extends SystemOutMockingTest {

    @Test
    void wahr() {
        BooleanUebungen.wahr();

        assertSystemOutEquals("true");
    }

    @Test
    void falsch() {
        BooleanUebungen.falsch();

        assertSystemOutEquals("false");
    }

    @Test
    void istWahrIstTrue() {
        BooleanUebungen.istWahr(true);

        assertSystemOutEquals("true");
    }

    @Test
    void istWahrIstFalse() {
        BooleanUebungen.istWahr(false);

        assertSystemOutEquals("false");
    }

    @Test
    void istFalschIstTrue() {
        BooleanUebungen.istFalsch(true);

        assertSystemOutEquals("false");
    }

    @Test
    void istFalschIstFalse() {
        BooleanUebungen.istFalsch(false);

        assertSystemOutEquals("true");
    }

    @Test
    void istGleichIstFalse() {
        BooleanUebungen.istGleich(true, false);

        assertSystemOutEquals("false");
    }

    @Test
    void istGleichIstTrue1() {
        BooleanUebungen.istGleich(true, true);

        assertSystemOutEquals("true");
    }

    @Test
    void istGleichIstTrue2() {
        BooleanUebungen.istGleich(false, false);

        assertSystemOutEquals("true");
    }

    @Test
    void istUngleichIstWahr() {
        BooleanUebungen.istUngleich(true, false);

        assertSystemOutEquals("true");
    }

    @Test
    void istUngleichIstFalsch1() {
        BooleanUebungen.istUngleich(false, false);

        assertSystemOutEquals("false");
    }

    @Test
    void istUngleichIstFalsch2() {
        BooleanUebungen.istUngleich(true, true);

        assertSystemOutEquals("false");
    }

    @Test
    void oderIstTrue() {
        BooleanUebungen.oder(true, false);

        assertSystemOutEquals("true");
    }

    @Test
    void oderIstFalse() {
        BooleanUebungen.oder(false, false);

        assertSystemOutEquals("false");
    }

    @Test
    void undIstWahr() {
        BooleanUebungen.und(true, true);

        assertSystemOutEquals("true");
    }

    @Test
    void undIstFalse() {
        BooleanUebungen.und(false, true);

        assertSystemOutEquals("false");
    }

    @Test
    void nichtIstWahr() {
        BooleanUebungen.nicht(false);

        assertSystemOutEquals("true");
    }

    @Test
    void nichtIstFalse() {
        BooleanUebungen.nicht(true);

        assertSystemOutEquals("false");
    }
}