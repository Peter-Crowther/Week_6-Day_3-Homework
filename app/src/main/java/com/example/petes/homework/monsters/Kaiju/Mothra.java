package com.example.petes.homework.monsters.Kaiju;

import com.example.petes.homework.monsters.Behaviours.Movement;

/**
 * Created by petes on 01/11/2017.
 */

public class Mothra extends Kaiju implements Movement {
    public Mothra(String name, int healthValue, int attackValue) {
        super(name, healthValue, attackValue);
    }

    public String roar() {
        return "Mothra squeel!";
    }


    @Override
    public String move() {
        return "Man in moth costume, flap wings!";
    }
}
