package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss(50, 150, 97 );

        System.out.println("Damage Босса" + " " + boss.getDamage() );
        System.out.println("Health Босса" + " " + boss.getHealth() );
        System.out.println("DefenceType Босса" + " " + boss.getDefenceType());
    }
}
