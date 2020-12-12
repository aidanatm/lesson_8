package players;

import players.Boss;
import players.Hero;
import players.SuperAbility;

public class Golem extends Hero {

    int damageConst;

    public int getDamageConst() {
        return damageConst;
    }

    public Golem(int health, int damage, int damageConst) {
        super(health, damage, SuperAbility.SUPER_HIT);
        this.damageConst = damageConst;
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        if (getHealth() > 0 && boss.getHealth() > 0) {
            setDamage(getDamageConst() + boss.getDamage() / 5);
        }
    }
}
