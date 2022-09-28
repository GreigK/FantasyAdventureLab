package PlayerType;

import Area.Enemies;

public class Warlock extends Player{

    MythicalCreature mythicalCreature;

    Spellhit spellhit;


    public Warlock(String name, int health, MythicalCreature mythicalCreature, Spellhit spellhit) {
        super(name, health);
        this.mythicalCreature = mythicalCreature;
        this.spellhit = spellhit;
    }

    public MythicalCreature getMythicalCreature() {
        return mythicalCreature;
    }

    public void setMythicalCreature(MythicalCreature mythicalCreature) {
        this.mythicalCreature = mythicalCreature;
    }

    public Spellhit getSpellhit() {
        return spellhit;
    }

    public void setSpellhit(Spellhit spellhit) {
        this.spellhit = spellhit;
    }

    public void castSpell(Enemies enemies){
        int newHealth = enemies.getHealth() - spellhit.getHitpoint();
        enemies.setHealth(newHealth);
    }
}
