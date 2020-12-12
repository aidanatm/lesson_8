package Game;

import players.*;

public class RPG_Game {

    public static void start() {
        Boss boss = new Boss(700, 50);
        Warrior warrior = new Warrior(250, 25,25);
        Hunter hunter = new Hunter(260, 15);
        Medic medic = new Medic(300, 20);
        Magic magic = new Magic(350, 45);
        Golem golem = new Golem(340, 40, 40);
        Hero[] heroes = {warrior, hunter, medic, magic};

        printStatistics(boss, heroes);

        while (!isGameFinished(boss, heroes)) {
            round(boss, heroes);
        }
    }


    private static void printStatistics(Boss boss, Hero[] heroes) {
        System.out.println("---------------");
        System.out.println("Boss health: " + boss.getHealth());
        for (int i = 0; i < heroes.length; i++) {
            System.out.println(heroes[i].getClass().getSimpleName() + "health: " + heroes[i].getHealth());
        }
        System.out.println("---------------");
    }

    private static void round(Boss boss, Hero[] heroes) {
        if (boss.getHealth() > 0) {
            bossHit(boss, heroes);
        }
        heroesHits(boss, heroes);
        applySuper(boss, heroes);
        printStatistics(boss, heroes);
    }


    private static void applySuper(Boss boss, Hero[] heroes) {

        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0) {
                heroes[i].applySuperAbility(boss, heroes);
            }
        }
    }


    private static boolean isGameFinished(Boss boss, Hero[] heroes) {
        if (boss.getHealth() <= 0) {
            System.out.println("HEROES WON");
            return true;
        }
        boolean allHeroesDead = true;
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0) {
                allHeroesDead = false;
                break;
            }

        }
        if (allHeroesDead) {
            System.out.printf("BOSS WON");
        }
        return allHeroesDead;
    }

    private static void bossHit(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0) {
                heroes[i].setHealth(heroes[i].getHealth() - boss.getDamage());
            } else {
                heroes[i].setHealth(0);
            }
        }

    }

    private static void heroesHits(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (boss.getHealth() > 0 && heroes[i].getHealth() > 0) {
                //если босс жив и герои живы
                boss.setHealth(Math.max(boss.getHealth() - heroes[i].getDamage(), 0));
//                устанавливается жизнь босса сминусованная от урона героев
            }
        }
    }
}
