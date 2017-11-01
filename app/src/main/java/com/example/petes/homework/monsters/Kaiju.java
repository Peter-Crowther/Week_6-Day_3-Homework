package com.example.petes.homework.monsters;

/**
 * Created by petes on 01/11/2017.
 */

public abstract class Kaiju {
    String name;
    int healthValue;
    int attackValue;

    abstract String roar();

    public Kaiju(String name, int healthValue, int attackValue) {
        this.name = name;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }

    public String getName(){
        return this.name;
    }

    public int getHealthValue() {
        return this.healthValue;
    }

    public int getAttackValue() {
        return this.attackValue;
    }


//    public String roar(){
//        return "Roar!";
//    }

}


