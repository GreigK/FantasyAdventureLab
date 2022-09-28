package PlayerType;

public class Warlock extends Player{

    MythicalCreature mythicalCreature;

    public Warlock(String name, Integer health, MythicalCreature mythicalCreature) {
        super(name, health);
        this.mythicalCreature = mythicalCreature;
    }

    public MythicalCreature getMythicalCreature() {
        return mythicalCreature;
    }

    public void setMythicalCreature(MythicalCreature mythicalCreature) {
        this.mythicalCreature = mythicalCreature;
    }
}
