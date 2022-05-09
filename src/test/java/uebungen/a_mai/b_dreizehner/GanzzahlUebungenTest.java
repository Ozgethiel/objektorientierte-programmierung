package uebungen.a_mai.b_dreizehner;

import org.junit.jupiter.api.Test;
import uebungen.a_mai.SystemOutMockingTest;

class GanzzahlUebungenTest extends SystemOutMockingTest {

    @Test
    void zehn() {
        GanzzahlUebungen.zehn();

        assertSystemOutEquals("10");
    }

    @Test
    void addiereZehn() {
        GanzzahlUebungen.addiereZehn(2);

        assertSystemOutEquals("12");
    }

    @Test
    void addiere() {
        GanzzahlUebungen.addiere(1, 2);

        assertSystemOutEquals("3");
    }

    @Test
    void substrahiere() {
        GanzzahlUebungen.substrahiere(10, 5);

        assertSystemOutEquals("5");
    }

    @Test
    void dividiere() {
        GanzzahlUebungen.dividiere(10, 2);

        assertSystemOutEquals("5");
    }

    @Test
    void dividiereMitAbrunden() {
        GanzzahlUebungen.dividiere(10, 3);

        assertSystemOutEquals("3");
    }

    @Test
    void multipliziere() {
        GanzzahlUebungen.multipliziere(10, 5);

        assertSystemOutEquals("50");
    }

    @Test
    void restSollRestwertHaben() {
        GanzzahlUebungen.rest(10, 3);

        assertSystemOutEquals("1");
    }

    @Test
    void restSollKeinenRestwertHaben() {
        GanzzahlUebungen.rest(10, 2);

        assertSystemOutEquals("0");
    }

    @Test
    void durchschnittMitExaktemErgebnis() {
        GanzzahlUebungen.durchschnitt(10, 5, 6);

        assertSystemOutEquals("7");
    }

    @Test
    void durchschnittMitAbrunden() {
        GanzzahlUebungen.durchschnitt(10, 5, 8);

        assertSystemOutEquals("7");
    }
}