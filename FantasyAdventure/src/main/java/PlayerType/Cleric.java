package PlayerType;

import Area.Enemies;

public class Cleric extends Player {

    private int faith;

    HealHit healHit;

    public Cleric(String name, int health, int faith, HealHit healHit) {
        super(name, health);
        this.faith = faith;
        this.healHit = healHit;
    }

    public int getFaith() {
        return faith;
    }

    public void setFaith(int faith) {
        this.faith = faith;
    }

    public int maxFaithHealth() {
        int newHealth = this.getHealth() + faith;
        return newHealth;
    }

    public void healSelf(Player player) {
        int newHealth = player.getHealth() + healHit.getHealth();
        player.setHealth(newHealth);
    }



}
