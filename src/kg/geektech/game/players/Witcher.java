package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Witcher extends Hero{

    public Witcher(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.RESURRECTION);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth()==0 && heroes[i]!=this){
                int hp = this.setHealth(this.getHealth());
                heroes[i].setHealth(hp);
                this.setHealth(0);
                System.out.println("Shaman King передал свою жизнь герою: "+ heroes[i].getName());
                break;

            }

        }


    }
}
