package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Haker extends Hero{
    public Haker(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.HACK);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        boolean round = RPG_Game.random.nextBoolean();
        int damage_boss = boss.getDamage()- RPG_Game.random.nextInt(50);
        for (int i = 0; i < heroes.length; i++) {
            if (round){
                boss.setHealth(boss.getHealth()-damage_boss);
                i=RPG_Game.random.nextInt(heroes.length);
                heroes[i].setHealth(heroes[i].getHealth()+damage_boss);
                System.out.println("Stallker зобрал " + damage_boss);
                break;
            }else {
                System.out.println("Stallker не забрал");
                break;
            }
        }
    }
}
