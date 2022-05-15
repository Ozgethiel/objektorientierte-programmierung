package uebungen.a_mai.c_arrays_kontrollfluss;

import org.apache.commons.lang3.StringUtils;
import org.assertj.core.data.Percentage;
import org.junit.jupiter.api.Test;
import uebungen.a_mai.SystemOutMockingTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.data.Percentage.withPercentage;
import static org.junit.jupiter.api.Assertions.*;

class SchleifenUebungenTest extends SystemOutMockingTest {

    @Test
    void timer() throws InterruptedException {
        long vorher = System.currentTimeMillis();

        SchleifenUebungen.timer(300);

        long nachher = System.currentTimeMillis();

        assertSystemOutEquals("Alarm");
        assertThat(nachher - vorher).isCloseTo(300L, withPercentage(10d));
    }

    @Test
    void zaehlen() {
        SchleifenUebungen.zaehlen();

        String zahlenMitZeilenumbruch = String.join(System.lineSeparator(), "10", "11", "12", "13", "14", "15", "16", "17", "18", "19");
        assertSystemOutEquals(zahlenMitZeilenumbruch);
    }

    @Test
    void gluecksspiel() {
        int spiele = SchleifenUebungen.gluecksspiel(100, 4);

        String wuerfelwuerfe = getSystemOutContent();
        int treffer = StringUtils.countMatches(wuerfelwuerfe, '4');
        int wuerfe = StringUtils.countMatches(wuerfelwuerfe, System.lineSeparator());
        assertThat(spiele).isEqualTo(wuerfe);
        assertThat(wuerfe).isEqualTo(treffer * 2 + 100);
    }
}