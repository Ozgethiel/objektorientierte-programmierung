package uebungen.a_mai.c_arrays_kontrollfluss;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GemischteUebungenTest {

    @Test
    void zahlenVonNullBisZehn() {
        int[] ergebnis = GemischteUebungen.zahlenVonNullBisZehn();

        assertThat(ergebnis).containsExactly(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
    }

    @Test
    void zahlenVonABisB() {
        int[] ergebnis = GemischteUebungen.zahlenVonABisB(10, 15);

        assertThat(ergebnis).containsExactly(10, 11, 12, 13, 14);
    }

    @Test
    void gerade() {
        int[] zahlen = {1, 2, 4, 9};

        boolean[] ergebnis = GemischteUebungen.gerade(zahlen);

        assertThat(ergebnis).containsExactly(false, true, true, false);
    }

    @Test
    void hinzufuegen() {
        int[] zahlen = {0, 1, 2};

        int[] ergebnis = GemischteUebungen.hinzufuegen(zahlen, 3);

        assertThat(ergebnis).containsExactly(0, 1, 2, 3);
    }

    @Test
    void entfernen() {
        int[] zahlen = {0, 1, 2, 3};

        int[] ergebnis = GemischteUebungen.entfernen(zahlen, 1);

        assertThat(ergebnis).containsExactly(0, 2, 3);
    }

    @Test
    void groesserAlsPi() {
        double[] zahlen = {5d, 3d, 4d};

        int[] ergebnis = GemischteUebungen.groesserAlsPi(zahlen);

        assertThat(ergebnis).containsExactlyInAnyOrder(0, 2);
    }

    @Test
    void ceasar() {
        char[] klartext = {'m', 'a', 'y', ' ',
                't', 'h', 'e', ' ',
                'f', 'o', 'r', 'c', 'e', ' ',
                'b', 'e', ' ',
                'w', 'i', 't', 'h', ' ',
                'y', 'o', 'u'};

        GemischteUebungen.ceasarVerschluesselung(klartext);

        assertThat(klartext).containsExactly('r', 'f', 'e', ' ',
                'y', 'm', 'j', ' ',
                'k', 't', 'w', 'h', 'j', ' ',
                'g', 'j', ' ',
                'c', 'n', 'y', 'm', ' ',
                'e', 't', 'a');
    }
}