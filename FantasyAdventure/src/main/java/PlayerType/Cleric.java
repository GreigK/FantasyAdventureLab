package PlayerType;

public class Cleric extends Player {

    private int faith;

    public Cleric(String name, Integer health, int faith) {
        super(name, health);
        this.faith = faith;
    }

    public int getFaith() {
        return faith;
    }

    public void setFaith(int faith) {
        this.faith = faith;
    }
}
