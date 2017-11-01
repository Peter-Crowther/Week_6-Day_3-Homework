package com.example.petes.homework.monsters;

/**
 * Created by petes on 01/11/2017.
 */

public class Godzilla extends Kaiju {
    public Godzilla(String name, int healthValue, int attackValue) {
        super(name, healthValue, attackValue);
    }

    public String roar() {
        return " Godzilla roar!";
    }
}
