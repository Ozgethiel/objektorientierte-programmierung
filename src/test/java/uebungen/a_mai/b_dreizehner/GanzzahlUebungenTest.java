package uebungen.a_mai.b_dreizehner;

import org.junit.jupiter.api.Test;
import uebungen.a_mai.SystemOutMockingTest;

class GanzzahlUebungenTest extends SystemOutMockingTest {

    @Test
    void zehn() {
        GanzzahlUebungen.zehn();

        assertSystemOutEquals("Zehn ist 10");
    }

    @Test
    void addiere() {
        GanzzahlUebungen.addiere(1, 2);

        assertSystemOutEquals("Summe von a=1 + b=2 ist: 3");
    }

    @Test
    void substrahiere() {
        GanzzahlUebungen.substrahiere(10, 5);

        assertSystemOutEquals("Differenz von a=10 + b=5 ist: 5");
    }

    @Test
    void durchschnitt() {
        GanzzahlUebungen.durchschnitt(10, 5, 6);

        assertSystemOutEquals("Durchschnitt von a=10, b=5 und c=8 ist: 21");
    }
}