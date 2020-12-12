package players;

import players.Boss;
import players.Hero;
import players.SuperAbility;

import java.util.Random;

public class Magic extends Hero {


    public Magic(int health, int damage ){
        super(health,damage, SuperAbility.BOOST );
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        Random random = new Random();
        int m = random.nextInt(20);

            for (int i = 0; i < heroes.length; i++) {
                if (getHealth()> 0 && boss.getHealth() > 0 && heroes[i].getHealth() >0)
                heroes[i].setDamage(heroes[i].getDamage() + m);
                //в массиве каждый герой подставляется под цикл
                //и в условии проверяется на жизнь
                //и устанавливает у каждого героя урон увеличенный на рандомное число
            }
        }

}
