package com.company;

import players.Boss;
import players.Hero;
import players.SuperAbility;

public class Thor extends Hero {
    public Thor(int health, int damage, SuperAbility superAbility) {
        super(health, damage, superAbility);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {

    }
}
