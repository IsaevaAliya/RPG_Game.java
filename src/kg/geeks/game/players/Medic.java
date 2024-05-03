package kg.geeks.game.players;

public class Medic extends Hero {
    public Medic(int health, int damage, SuperAbility ability, String name) {
        super(health, damage, ability, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (Hero hero: heroes){
        for (int i = 0; i < heroes.length ; i++) {
        if (hero.getHealth()<100 && hero != this) {
            hero.setHealth(hero.getHealth()+this.getHealth());
        }
        }


        }

    }
}

