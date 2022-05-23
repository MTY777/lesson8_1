package kg.geektech.game.players;

public class Berserk extends Hero {
    private int savedDamage;
    public Berserk(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int damageBosss = boss.getDamage() / 2;
        for (int i = 0; i < heroes.length; i++) {
            if (heroes.length > 0){
                boss.setHealth(boss.getHealth()-damageBosss);
                System.out.println("Берсерк поглотил половину урона босса ");
                break;
            }
        }

    }

    public int getSavedDamage() {
        return savedDamage;
    }

    public void setSavedDamage(int savedDamage) {
        this.savedDamage = savedDamage;
    }
}
