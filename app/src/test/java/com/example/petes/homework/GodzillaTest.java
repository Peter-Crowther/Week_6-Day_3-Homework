package com.example.petes.homework;


import com.example.petes.homework.monsters.Kaiju.Godzilla;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * Created by petes on 01/11/2017.
 */




public class GodzillaTest {

    Godzilla godzilla;

    @Before
    public void before() {
        godzilla = new Godzilla("Godzilla", 100, 80 );
    }

    @Test
    public void hasName() {
        assertEquals("Godzilla", godzilla.getName());
    }

    @Test
    public void hasHealthValue() {
        assertEquals(100, godzilla.getHealthValue());
    }

    @Test
    public void hasAttackValue() {
        assertEquals(80, godzilla.getAttackValue());
    }
}
