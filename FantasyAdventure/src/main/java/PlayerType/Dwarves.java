package PlayerType;

public class Dwarves extends Player{

    private int bonusHealth;

    public Dwarves(String name, Integer health, int bonusHealth) {
        super(name, health);
        this.bonusHealth = bonusHealth;
    }

    public int getBonusHealth() {
        return bonusHealth;
    }

    public void setBonusHealth(int bonusHealth) {
        this.bonusHealth = bonusHealth;
    }
}
