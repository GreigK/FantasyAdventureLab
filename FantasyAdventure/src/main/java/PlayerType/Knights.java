package PlayerType;

public class Knights extends Player {

    private int armour;


    public Knights(String name, Integer health, int armour) {
        super(name, health);
        this.armour = armour;
    }


    public int getArmour() {
        return armour;
    }

    public void setArmour(int armour) {
        this.armour = armour;
    }
}
