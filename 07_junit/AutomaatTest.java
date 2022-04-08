import Kodutoo.Car;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AutomaatTest {

    @Test
    public void Kontrolli_kas_auto_mootorit_on_vaja_vahetada() {
        Car Car = new Car("Lada", "Oranž", 1970, 10000, 2000001);
        assertEquals(true, Car.mootoriVahetus());
    }

    @Test
    public void Kontrolli_kas_auto_mark_on_ikka_Lada() {
        Car Car = new Car("Lada", "Oranž", 1970, 10000, 2000001);
        assertEquals(true, Car.õigeMark());
    }
    @Test
    public void Kontrolli_kas_auto_väljalaskmisest_on_moodas_rohkem_kui_40_aastat() {
        Car Car = new Car("Lada", "Oranž", 1970, 10000, 2000001);
        assertEquals(true, Car.aastadMoodas());
    }
}
