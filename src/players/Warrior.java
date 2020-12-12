package players;

import java.util.Random;

public class Warrior extends Hero {
    private int damageConst;

    public int getDamageConst() {
        return damageConst;
    }

    public Warrior(int health, int damage, int damageConst) {
        super(health, damage, SuperAbility.CRITICAL_DAMAGE);
        this.damageConst = damageConst;
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        Random random = new Random();
        if (getHealth()> 0 && boss.getHealth()>0) {
            int t = random.nextInt(3) + 2;
            setDamage(getDamageConst() * t);
        }
        //устанавливается урон умноженный на рандом
    }


}
