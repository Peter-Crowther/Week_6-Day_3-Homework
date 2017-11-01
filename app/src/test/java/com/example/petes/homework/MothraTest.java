package com.example.petes.homework;

import com.example.petes.homework.monsters.Kaiju.Mothra;

import org.junit.*;

import static org.junit.Assert.assertEquals;

/**
 * Created by petes on 01/11/2017.
 */

public class MothraTest {

    Mothra mothra;

    @Before
    public void before() {
        mothra = new Mothra("Mothra", 100, 65);
    }


    @Test
    public void hasName() {
        assertEquals("Mothra", mothra.getName());
    }

    @Test
    public void hasHealthValue() {
        assertEquals(100, mothra.getHealthValue());
    }

    @Test
    public void hasAttackValue() {
        assertEquals(65, mothra.getAttackValue());
    }


}
