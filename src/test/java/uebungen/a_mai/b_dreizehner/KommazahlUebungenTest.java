package uebungen.a_mai.b_dreizehner;

import org.junit.jupiter.api.Test;
import uebungen.a_mai.SystemOutMockingTest;

class KommazahlUebungenTest extends SystemOutMockingTest {

    @Test
    void pi() {
        KommazahlUebungen.pi();

        assertSystemOutEquals("Pi entspricht circa ");
    }

    @Test
    void addiere() {
        KommazahlUebungen.addiere(1.23d, 4.56d);

        assertSystemOutEquals("Summe von a=1.23 + b=4.56 ist: 5.79");
    }

    @Test
    void substrahiere() {
        KommazahlUebungen.substrahiere(4.56d, 1.23d);

        assertSystemOutEquals("Differenz von a=4.56 und b=1.23 ist: 3,33");
    }

    @Test
    void durchschnitt() {
        KommazahlUebungen.durchschnitt(1.23d, 4.56d, 7.98d);

        assertSystemOutEquals("Durchschnitt von a=1.23, b=4.56 und c=7.98 ist: 4,56");
    }
}