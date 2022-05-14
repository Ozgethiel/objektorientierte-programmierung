package uebungen.a_mai.c_arrays_kontrollfluss;

import org.assertj.core.data.Index;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.data.Index.atIndex;
import static org.junit.jupiter.api.Assertions.*;

class FortgeschritteneUebungenTest {

    @Test
    void umkehrenMitUngeraderAnzahl() {
        int[] zahlen = {0, 1, 2};

        FortgeschritteneUebungen.umkehren(zahlen);

        assertThat(zahlen).containsExactly(2, 1, 0);
    }

    @Test
    void umkehrenMitGeraderAnzahl() {
        int[] zahlen = {0, 1, 2, 3};

        FortgeschritteneUebungen.umkehren(zahlen);

        assertThat(zahlen).containsExactly(3, 2, 1, 0);
    }

    @Test
    void umkehrenGeradeAnzahl() {
        int[] zahlen = {0, 1, 2, 3};

        FortgeschritteneUebungen.umkehren(zahlen);

        assertThat(zahlen).containsExactly(3, 2, 1, 0);
    }

    @Test
    void siebDesEratosthenes() {
        boolean[] result = FortgeschritteneUebungen.siebDesEratosthenes(10);

        assertThat(result).hasSize(10);
        assertThat(result).contains(false, atIndex(0));
        assertThat(result).contains(false, atIndex(1));
        assertThat(result).contains(true, atIndex(2));
        assertThat(result).contains(true, atIndex(3));
        assertThat(result).contains(false, atIndex(4));
        assertThat(result).contains(true, atIndex(5));
        assertThat(result).contains(false, atIndex(6));
        assertThat(result).contains(true, atIndex(7));
        assertThat(result).contains(false, atIndex(8));
        assertThat(result).contains(false, atIndex(9));
    }

    @Test
    void sortieren() {
        final int anzahlZahlen = 20;
        final double maxWert = 100.0d;
        int[] zahlen = new int[anzahlZahlen];
        int[] sortiert = new int[anzahlZahlen];
        for (int i = 0; i < zahlen.length; i++) {
            zahlen[i] = (int) (Math.random() * maxWert);
        }
        System.arraycopy(zahlen, 0, sortiert, 0, anzahlZahlen);
        Arrays.sort(sortiert);

        FortgeschritteneUebungen.sortieren(zahlen);

        assertThat(zahlen).containsExactly(sortiert);
    }
}