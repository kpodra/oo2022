package Isikukood;

import kujundid.kolmnurk;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AutomaatTestTest {
    // alt + enter --> classpath 4 / 5.8

    @Test
    public void kontrolli_kas_on_naine_kui_isikukoodi_alguses_on_6(){
        IsikukoodEE ee = new IsikukoodEE("60202010879");
        assertEquals(false, ee.isMale());
    }

    @Test
    public void kontrolli_kas_on_synniaasta_1951_kui_isikukoodi_keskel_on_51(){
        IsikukoodLV lv = new IsikukoodLV("120351-51237");
        assertEquals(1951, lv.getBirthYear());
    }

    @Test
    public void kas_kujundi_pindala_arvutatakse_korrektselt(){
        kolmnurk kolmnurk = new kolmnurk(5.0, 6.0, 7.0);
        assertEquals(18, kolmnurk.arvutaYmbermoot(), 0.1);
    }
}