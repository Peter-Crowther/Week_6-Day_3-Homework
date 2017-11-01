package com.example.petes.homework;

import com.example.petes.homework.monsters.*;

import org.junit.*;

import static junit.framework.Assert.assertEquals;

/**
 * Created by petes on 01/11/2017.
 */

public class TankTest {

    Tank tank;

    @Before
    public void before(){
        tank = new Tank("Sherman", 100);
    }

    @Test
    public void hasType() {
        assertEquals("Sherman", tank.getType());
    }

    @Test
    public void hasHealthValue() {
        assertEquals(100, tank.getHealthValue());
    }


}
