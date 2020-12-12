package players;

import players.Boss;
import players.Hero;
import players.SuperAbility;

public class Hunter extends Hero {

    public Hunter(int health, int damage)
    { super(health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT); }


    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {


    }
}
