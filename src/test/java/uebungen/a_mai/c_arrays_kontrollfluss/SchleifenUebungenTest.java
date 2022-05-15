package uebungen.a_mai.c_arrays_kontrollfluss;

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
    void alkoholSollTrueErgeben() {
        int[] alter = {16, 17, 15, 18, 17, 19, 20};

        boolean alkohol = SchleifenUebungen.alkohol(alter);

        assertThat(alkohol).isTrue();
    }

    @Test
    void alkoholSollFalseErgeben() {
        int[] alter = {16, 17, 15, 17, 14, 15};

        boolean alkohol = SchleifenUebungen.alkohol(alter);

        assertThat(alkohol).isFalse();
    }

    @Test
    void zaehlen() {
        SchleifenUebungen.zaehlen();

        String zahlenMitZeilenumbruch = String.join(System.lineSeparator(), "10", "11", "12", "13", "14", "15", "16", "17", "18", "19");
        assertSystemOutEquals(zahlenMitZeilenumbruch);
    }
}