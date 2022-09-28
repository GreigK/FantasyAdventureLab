package PlayerType;

import Area.Enemies;
import behavious.IAttack;

public class Barbarians extends Player {

    private int rage;

    MeleeHit meleeHit;

    public Barbarians(String name, Integer health, Integer rage, MeleeHit meleeHit) {
        super(name, health);
        this.rage = rage;
        this.meleeHit = meleeHit;
    }


    public Integer getRage() {
        return rage;
    }

    public void setRage(Integer rage) {
        this.rage = rage;
    }

    public MeleeHit getMeleeHit() {
        return meleeHit;
    }

    public void setMeleeHit(MeleeHit meleeHit) {
        this.meleeHit = meleeHit;
    }

    public int enrageHit(int multiple){
        return rage * multiple;
    }

    public void swingWeapon(Enemies enemies){
        int newHealth = enemies.getHealth() - meleeHit.getHitPoint();
        enemies.setHealth(newHealth);
    }





}
