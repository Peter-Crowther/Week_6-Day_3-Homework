package com.example.petes.homework;

import com.example.petes.homework.monsters.*;

import org.junit.*;

import static junit.framework.Assert.assertEquals;

/**
 * Created by petes on 01/11/2017.
 */

public class FighterJetTest {

    FighterJet fighterJet;

    @Before
    public void before() {
        fighterJet = new FighterJet( "Mig", 100);
    }

    @Test
    public void hasType() {
        assertEquals("Mig", fighterJet.getType());
    }

    @Test
    public void hasHealhtValue() {
        assertEquals(100, fighterJet.getHealthValue());
    }

}
