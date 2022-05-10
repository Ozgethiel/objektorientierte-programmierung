package uebungen.a_mai.c_arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ArrayUebungenTest {

    @Test
    void leeresArray() {
        int[] ergebnis = ArrayUebungen.leeresArray();

        assertThat(ergebnis).hasSize(10);
    }

    @Test
    void primzahlen() {
        int[] ergebnis = ArrayUebungen.primzahlen();

        assertThat(ergebnis).containsExactly(2, 3, 5);
    }

    @Test
    void zahlenVonNullBisZehn() {
        int[] ergebnis = ArrayUebungen.zahlenVonNullBisZehn();

        assertThat(ergebnis).containsExactly(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
    }

    @Test
    void zahlenVonABisB() {
        int[] ergebnis = ArrayUebungen.zahlenVonABisB(10, 15);

        assertThat(ergebnis).containsExactly(10, 11, 12, 13, 14);
    }

    @Test
    void laenge() {
        int ergebnis = ArrayUebungen.laenge(new int[]{0, 1, 2, 3, 4, 5});

        assertThat(ergebnis).isEqualTo(6);
    }

    @Test
    void aendereEintragAnIndex3() {
        int[] zahlen = {0, 1, 2, 3, 4, 5};
        ArrayUebungen.aendereEintragAnIndex3(zahlen, 10);

        assertThat(zahlen).containsExactly(0, 1, 2, 10, 4, 5);
    }

    @Test
    void aendereEintragAnIndexI() {
        int[] zahlen = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        ArrayUebungen.aendereEintragAnIndexI(zahlen, 5, 10);

        assertThat(zahlen).containsExactly(0, 1, 2, 3, 4, 10, 6, 7, 8, 9);
    }

    @Test
    void gerade() {
        int[] zahlen = {1, 2, 4, 9};

        boolean[] ergebnis = ArrayUebungen.gerade(zahlen);

        assertThat(ergebnis).containsExactly(false, true, true, false);
    }

    @Test
    void groesserAlsPi() {
        double[] zahlen = {5d, 3d, 4d};

        int[] ergebnis = ArrayUebungen.groesserAlsPi(zahlen);

        assertThat(ergebnis).containsExactlyInAnyOrder(0, 2);
    }

    @Test
    void hinzufuegen() {
        int[] zahlen = {0, 1, 2};

        int[] ergebnis = ArrayUebungen.hinzufuegen(zahlen, 3);

        assertThat(ergebnis).containsExactly(0, 1, 2, 3);
    }

    @Test
    void entfernen() {
        int[] zahlen = {0, 1, 2, 3};

        int[] ergebnis = ArrayUebungen.erntfernen(zahlen, 1);

        assertThat(ergebnis).containsExactly(0, 2, 3);
    }

    @Test
    void umkehren() {
        int[] zahlen = {0, 1, 2};

        ArrayUebungen.umkehren(zahlen);

        assertThat(zahlen).containsExactly(2, 1, 0);
    }
}