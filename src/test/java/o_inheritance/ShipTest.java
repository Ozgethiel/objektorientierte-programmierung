package o_inheritance;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ShipTest {
    @Test
    public void createShipTest() {

        Radio radio1 = new Radio(true);


        Feuermelder feuermelder1= new Feuermelder();


        Elektrogeräte[] geräte = new Elektrogeräte[6];

        boolean zustand = radio1.isZustand();
        //System.out.println("radio is:"+ radio1.volumeUp());
        assertThat(radio1.getVolume()).isEqualTo(true);
    }
}