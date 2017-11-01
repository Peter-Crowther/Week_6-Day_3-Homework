package com.example.petes.homework.monsters.Vehicles;

/**
 * Created by petes on 01/11/2017.
 */

abstract public class Vehicle {
    String type;
    int healthValue;

    public Vehicle(String type, int healthValue) {
        this.type = type;
        this.healthValue = healthValue;
    }

    public String getType() {
        return this.type;
    }

    public int getHealthValue() {
        return this.healthValue;
    }

}
