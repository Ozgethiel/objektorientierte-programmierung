package uebungen.a_mai.b_dreizehner;

import org.junit.jupiter.api.Test;
import uebungen.a_mai.SystemOutMockingTest;

import static org.junit.jupiter.api.Assertions.*;

class CharUebungenTest extends SystemOutMockingTest {

    @Test
    void buchstabeA() {
        CharUebungen.buchstabeA();

        assertSystemOutEquals("A");
    }

    @Test
    void sonderzeichenTab() {
        CharUebungen.sonderzeichenTab();

        assertSystemOutEquals("\t");
    }

    @Test
    void grossbuchstabeA() {
        CharUebungen.grossbuchstabe('a');

        assertSystemOutEquals("A");
    }

    @Test
    void grossbuchstabeM() {
        CharUebungen.grossbuchstabe('m');

        assertSystemOutEquals("M");
    }
}