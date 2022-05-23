package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Magic extends Hero {
    public Magic(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.BOOST);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int magic_baf = RPG_Game.random.nextInt(10);
        for (int i = 0; i < heroes.length; i++) {

            heroes[i].setDamage(heroes[i].getDamage() + magic_baf);


        }
        System.out.println("Маг увеличил урон героям  " + magic_baf);
    }
}


