package PlayerType;

public enum HealHit {
    POTIONS(8),
    HERBS(2),
    DIVINESHIELD(100);

    private int health;

    HealHit(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
