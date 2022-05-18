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

}
