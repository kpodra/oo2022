package com.company.teineosa;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AutomaatTestid {

    @Test
    public void arvutaKoguMassKuiJookiPole(){
        JoogiPudel joogipudel = new JoogiPudel(12.0, "Klaas", 20.0, 0.2);
        double mass = joogipudel.getMass();
        assertEquals(20.0, mass, 0.1);


    }

    @Test
    public void arvutaKoguMassKuiJookOn(){
        JoogiPudel joogiPudel = new JoogiPudel(12.0, "klaas", 20.0, 0.2);
        Jook coca = new Jook("coca cola", 0.6, 1.4);
        joogiPudel.jook = coca;
        double mass = joogiPudel.getMass();
        assertEquals(20.0, 0.1);
    }
}
