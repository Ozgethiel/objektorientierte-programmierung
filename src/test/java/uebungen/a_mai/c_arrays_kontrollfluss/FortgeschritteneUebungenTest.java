package uebungen.a_mai.c_arrays_kontrollfluss;

import org.assertj.core.data.Index;
import org.junit.jupiter.api.Test;
import uebungen.a_mai.SystemOutMockingTest;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.data.Index.atIndex;
import static org.junit.jupiter.api.Assertions.*;

class FortgeschritteneUebungenTest extends SystemOutMockingTest {

    @Test
    void umkehrenMitUngeraderAnzahl() {
        int[] zahlen = {0, 1, 2};

        FortgeschritteneUebungen.umkehren(zahlen);

        assertThat(zahlen).containsExactly(2, 1, 0);
    }

    @Test
    void dame() {
        char[][] dame = FortgeschritteneUebungen.dame();

        assertThat(dame).hasDimensions(8, 8);
        assertThat(dame).contains(new char[]{'W', ' ', 'W', ' ', 'W', ' ', 'W', ' '}, atIndex(0));
        assertThat(dame).contains(new char[]{' ', 'W', ' ', 'W', ' ', 'W', ' ', 'W'}, atIndex(1));
        assertThat(dame).contains(new char[]{'W', ' ', 'W', ' ', 'W', ' ', 'W', ' '}, atIndex(2));
        assertThat(dame).contains(new char[]{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}, atIndex(3));
        assertThat(dame).contains(new char[]{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}, atIndex(4));
        assertThat(dame).contains(new char[]{' ', 'S', ' ', 'S', ' ', 'S', ' ', 'S'}, atIndex(5));
        assertThat(dame).contains(new char[]{'S', ' ', 'S', ' ', 'S', ' ', 'S', ' '}, atIndex(6));
        assertThat(dame).contains(new char[]{' ', 'S', ' ', 'S', ' ', 'S', ' ', 'S'}, atIndex(7));
    }

    @Test
    void umkehrenMitGeraderAnzahl() {
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
    void siebDesEratosthenesGrosseZahlen() {
        boolean[] result = FortgeschritteneUebungen.siebDesEratosthenes(100000);

        assertThat(result).hasSize(100000);
    }

    @Test
    void sortieren() {
        final int anzahlZahlen = 2000;
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

    @Test
    void roemischeZahlen1964() {
        FortgeschritteneUebungen.roemischeZahlen(1964);

        assertSystemOutEquals("MDCDLXIV");
    }

    @Test
    void roemischeZahlen1666() {
        FortgeschritteneUebungen.roemischeZahlen(1666);

        assertSystemOutEquals("MDCLXVI");
    }
}