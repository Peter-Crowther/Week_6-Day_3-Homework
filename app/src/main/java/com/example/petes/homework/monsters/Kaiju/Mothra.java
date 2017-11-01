package com.example.petes.homework.monsters.Kaiju;

/**
 * Created by petes on 01/11/2017.
 */

public class Mothra extends Kaiju {
    public Mothra(String name, int healthValue, int attackValue) {
        super(name, healthValue, attackValue);
    }

    public String roar() {
        return "Mothra squeel!";
    }
}
