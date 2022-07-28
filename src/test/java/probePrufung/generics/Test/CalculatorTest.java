package probePrufung.generics.Test;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;


class CalculatorTest {
    @Test
    void testAdd() {
        Calculator calculator = new Calculator();

       // assertEquals(5, calculator.add(2, 3));
        assertThat(calculator.add (2,3)).isEqualTo(5);

    }
}
