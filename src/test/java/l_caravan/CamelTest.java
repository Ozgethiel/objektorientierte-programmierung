package l_caravan;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import l_caravan.Camel;
import uebungen.b_juni.l_caravan.Caravan;

import static org.junit.jupiter.api.Assertions.*;

class CamelTest {
    @Test
    public void createNewCamel() {


        Camel camel1 = new Camel("Thomas", null, 8, 5);
        Camel camel2 = new Camel("Eva", camel1, 5, 2);
        Camel camel3 = new Camel("Erwin", camel2, 6, 1);

        //Caravan caravan = new Caravan(camel3);

       // int paceOfCaravan = caravan.getMaxPace();

        System.out.println("MaxPace is :" + camel3.getPace());
        assertThat(camel3.getName()).isEqualTo("Erwin");
        assertThat(camel2.getNext()).isEqualTo(camel3);


    }
}