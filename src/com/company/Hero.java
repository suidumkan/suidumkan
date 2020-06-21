package com.company;

public class Hero {
    private int health;
    private int damage;
    private int abilities;

    public Hero(int health, int damage, int abilities){
        this.health = health;
        this.damage = damage;
        this.abilities = abilities;

        }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public int getAbilities() {
        return abilities;
    }

    public Hero(int damage, int health){
        this.damage = damage;
        this.health = health;
    }
}
