package uebungen.a_mai.b_datentypen;

import org.junit.jupiter.api.Test;
import uebungen.a_mai.SystemOutMockingTest;

class FortgeschritteneUebungenTest extends SystemOutMockingTest {

    @Test
    void aGroesserAlsBUndKleinerAlsCTrue() {
        FortgeschritteneUebungen.aGroesserAlsBUndKleinerAlsC(2, 1, 3);

        assertSystemOutEquals("true");
    }

    @Test
    void aGroesserAlsBUndKleinerAlsCFalse1() {
        FortgeschritteneUebungen.aGroesserAlsBUndKleinerAlsC(1, 2, 3);

        assertSystemOutEquals("false");
    }

    @Test
    void aGroesserAlsBUndKleinerAlsCFalse2() {
        FortgeschritteneUebungen.aGroesserAlsBUndKleinerAlsC(2, 1, 1);

        assertSystemOutEquals("false");
    }

    @Test
    void ceasarVerschluesselungA() {
        FortgeschritteneUebungen.ceasarVerschluesselung('m');

        assertSystemOutEquals("r");
    }

    @Test
    void ceasarVerschluesselungZ() {
        FortgeschritteneUebungen.ceasarVerschluesselung('z');

        assertSystemOutEquals("e");
    }

    @Test
    void restwertBeiKommazahlenOhneRestwert() {
        FortgeschritteneUebungen.restwertBeiKommazahlen(10.98d, 5.43d);

        assertSystemOutEquals("0");
    }

    @Test
    void restwertBeiKommazahlenMitRestwert() {
        FortgeschritteneUebungen.restwertBeiKommazahlen(10.98d, 4.43d);

        assertSystemOutEquals("2");
    }

    @Test
    void abrunden() {
        FortgeschritteneUebungen.abrunden(Math.PI);

        assertSystemOutEquals("3.141");
    }
}