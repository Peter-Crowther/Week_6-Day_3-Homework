package com.example.petes.homework;


import com.example.petes.homework.monsters.*;

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

}
