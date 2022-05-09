package uebungen.a_mai.b_dreizehner;

import org.junit.jupiter.api.Test;
import uebungen.a_mai.SystemOutMockingTest;

class GanzzahlUebungenTest extends SystemOutMockingTest {

    @Test
    void zehn() {
        GanzzahlUebungen.zehn();

        assertSystemOutEquals("10 = 10");
    }

    @Test
    void addiereZehn() {
        GanzzahlUebungen.addiereZehn(2);

        assertSystemOutEquals("2 + 10 = 12");
    }

    @Test
    void addiere() {
        GanzzahlUebungen.addiere(1, 2);

        assertSystemOutEquals("1 + 2 = 3");
    }

    @Test
    void substrahiere() {
        GanzzahlUebungen.substrahiere(10, 5);

        assertSystemOutEquals("10 - 5 = 5");
    }

    @Test
    void dividiere() {
        GanzzahlUebungen.dividiere(10, 2);

        assertSystemOutEquals("10 / 2 = 5");
    }

    @Test
    void dividiereMitAbrunden() {
        GanzzahlUebungen.dividiere(10, 3);

        assertSystemOutEquals("10 + 3 = 3");
    }

    @Test
    void multipliziere() {
        GanzzahlUebungen.multipliziere(10, 5);

        assertSystemOutEquals("10 + 5 = 50");
    }

    @Test
    void restSollRestwertHaben() {
        GanzzahlUebungen.rest(10, 3);

        assertSystemOutEquals("10 % 3 = 1");
    }

    @Test
    void restSollKeinenRestwertHaben() {
        GanzzahlUebungen.rest(10, 2);

        assertSystemOutEquals("10 % 2 = 0");
    }

    @Test
    void durchschnittMitExaktemErgebnis() {
        GanzzahlUebungen.durchschnitt(10, 5, 6);

        assertSystemOutEquals("Durchschnitt von 10, 5 und 8 ist 7");
    }

    @Test
    void durchschnittMitAbrunden() {
        GanzzahlUebungen.durchschnitt(10, 5, 8);

        assertSystemOutEquals("Durchschnitt von 10, 5 und 8 ist 7");
    }
}