package com.example.petes.homework;

import com.example.petes.homework.monsters.Vehicles.*;

import org.junit.*;

import static junit.framework.Assert.assertEquals;

/**
 * Created by petes on 01/11/2017.
 */

public class HelicopterTest {

    Helicopter helicopter;

    @Before
    public void before(){
        helicopter  =new Helicopter("Blackhawk", 100);
    }

    @Test
    public void hasType() {
        assertEquals("Blackhawk", helicopter.getType());
    }

    @Test
    public void hasHealhtValue() {
        assertEquals(100, helicopter.getHealthValue());
    }

}
