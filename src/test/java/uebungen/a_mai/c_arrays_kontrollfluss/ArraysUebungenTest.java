package uebungen.a_mai.c_arrays_kontrollfluss;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ArraysUebungenTest {

    @Test
    void leeresArray() {
        int[] ergebnis = ArraysUebungen.leeresArray();

        assertThat(ergebnis).hasSize(10);
    }

    @Test
    void primzahlen() {
        int[] ergebnis = ArraysUebungen.primzahlen();

        assertThat(ergebnis).containsExactly(2, 3, 5);
    }

    @Test
    void zahlenVonNullBisZehn() {
        int[] ergebnis = ArraysUebungen.zahlenVonNullBisZehn();

        assertThat(ergebnis).containsExactly(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
    }

    @Test
    void zahlenVonABisB() {
        int[] ergebnis = ArraysUebungen.zahlenVonABisB(10, 15);

        assertThat(ergebnis).containsExactly(10, 11, 12, 13, 14);
    }

    @Test
    void laenge() {
        int ergebnis = ArraysUebungen.laenge(new int[]{0, 1, 2, 3, 4, 5});

        assertThat(ergebnis).isEqualTo(6);
    }

    @Test
    void aendereEintragAnIndex3() {
        int[] zahlen = {0, 1, 2, 3, 4, 5};
        ArraysUebungen.aendereEintragAnIndex3(zahlen, 10);

        assertThat(zahlen).containsExactly(0, 1, 2, 10, 4, 5);
    }

    @Test
    void aendereEintragAnIndexI() {
        int[] zahlen = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        ArraysUebungen.aendereEintragAnIndexI(zahlen, 5, 10);

        assertThat(zahlen).containsExactly(0, 1, 2, 3, 4, 10, 6, 7, 8, 9);
    }

    @Test
    void gerade() {
        int[] zahlen = {1, 2, 4, 9};

        boolean[] ergebnis = ArraysUebungen.gerade(zahlen);

        assertThat(ergebnis).containsExactly(false, true, true, false);
    }

    @Test
    void hinzufuegen() {
        int[] zahlen = {0, 1, 2};

        int[] ergebnis = ArraysUebungen.hinzufuegen(zahlen, 3);

        assertThat(ergebnis).containsExactly(0, 1, 2, 3);
    }

    @Test
    void entfernen() {
        int[] zahlen = {0, 1, 2, 3};

        int[] ergebnis = ArraysUebungen.entfernen(zahlen, 1);

        assertThat(ergebnis).containsExactly(0, 2, 3);
    }

    @Test
    void groesserAlsPi() {
        double[] zahlen = {5d, 3d, 4d};

        int[] ergebnis = ArraysUebungen.groesserAlsPi(zahlen);

        assertThat(ergebnis).containsExactlyInAnyOrder(0, 2);
    }
}