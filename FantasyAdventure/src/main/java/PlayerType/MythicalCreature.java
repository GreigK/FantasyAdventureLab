package PlayerType;

public enum MythicalCreature {
    OGRE(10, 5),
    DRAGON(12,20),
    MURLOC(30,1);

    private int health;

    private int growl;


    MythicalCreature(int health, int growl) {
        this.health = health;
        this.growl = growl;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getGrowl() {
        return growl;
    }

    public void setGrowl(int growl) {
        this.growl = growl;
    }
}
