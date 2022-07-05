package uebungen.c_juli.a_exceptions;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.data.Percentage.withPercentage;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ExceptionExercisesTest {

    @Test
    void testThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, ExceptionExercises::throwIllegalArgumentException);
    }

    @Test
    void testThrowArgumentException() throws InterruptedException {
        long before = System.currentTimeMillis();

        ExceptionExercises.sleepOneSecond();

        long after = System.currentTimeMillis();

        assertThat(after - before).isCloseTo(1000, withPercentage(10));
    }
}