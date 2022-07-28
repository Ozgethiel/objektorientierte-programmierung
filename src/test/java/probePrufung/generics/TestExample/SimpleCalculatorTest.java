package probePrufung.generics.TestExample;

import org.junit.jupiter.api.Test;
import probePrufung.generics.Test.Calculator;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {
    @Test

    void twoPlusTwoEqualsFour(){

        SimpleCalculator calculator= new SimpleCalculator();
        assertThat(calculator.add(2,2)).isEqualTo(4);

    }

    @Test
    void sevenPlusEqualsThree(){
        SimpleCalculator calculator= new SimpleCalculator();
        assertThat(calculator.add(7,3)).isEqualTo(10);

    }

    @Test
    void tenIsDividedToFive(){
        SimpleCalculator calculator= new SimpleCalculator();
        assertThat(calculator.divide(10,5)).isEqualTo(2);
    }

}