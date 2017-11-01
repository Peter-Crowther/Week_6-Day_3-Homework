package com.example.petes.homework.monsters.Kaiju;

import com.example.petes.homework.monsters.Behaviours.Movement;

/**
 * Created by petes on 01/11/2017.
 */

public class Godzilla extends Kaiju implements Movement{
    public Godzilla(String name, int healthValue, int attackValue) {
        super(name, healthValue, attackValue);
    }

    public String roar() {
        return " Godzilla roar!";
    }


    public String move() {
        return "Man in rubber monster suite, shuffle!";
    }
}
