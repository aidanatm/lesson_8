package players;

import players.Boss;
import players.Hero;
import players.SuperAbility;

public class Medic extends Hero {


    public Medic(int health, int damage) {
        super(health, damage, SuperAbility.HEAL);
    }


    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {

    }
}
