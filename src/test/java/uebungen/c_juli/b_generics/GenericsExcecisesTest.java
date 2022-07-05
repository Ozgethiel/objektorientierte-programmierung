package uebungen.c_juli.b_generics;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class GenericsExcecisesTest {

    @Test
    void numbersFromZeroToTenAsString() {
        Object result = GenericsExcecises.numbersFromZeroToTenAsString();

        assertThat(result).isInstanceOf(ArrayList.class);
        assertThat((List<String>) result).contains("1", "2", "3", "4", "5", "6", "7", "8", "9", "10");
    }

    @Test
    void numbersFromZeroToTenAsInt() {
        Object result = GenericsExcecises.numbersFromZeroToTenAsInt();

        assertThat(result).isInstanceOf(ArrayList.class);
        assertThat((List<Integer>) result).contains(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    }

    @Test
    void testWrapString() {
        Box result = GenericsExcecises.wrap("abc");

        assertThat(result).isInstanceOf(Box.class);
        assertThat(result.getContent()).isEqualTo("abc");
    }

    @Test
    void testUnwrapString() {
        Object result = GenericsExcecises.unwrap(new Box("abc"));

        assertThat(result).isInstanceOf(String.class);
        assertThat(result).isEqualTo("abc");
    }

    @Test
    void testWrapInteger() {
        Box result = GenericsExcecises.wrap(123);

        assertThat(result).isInstanceOf(Box.class);
        assertThat(result.getContent()).isEqualTo(123);
    }

    @Test
    void testUnwrapInteger() {
        Object result = GenericsExcecises.unwrap(new Box(123));

        assertThat(result).isInstanceOf(Integer.class);
        assertThat(result).isEqualTo(123);
    }
}