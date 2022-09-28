package PlayerType;

public enum Spellhit {
    PYROBLAST(12),
    FIREBALL(2),
    BOLT(4);


    private int hitpoint;

    Spellhit(int hitpoint) {
        this.hitpoint = hitpoint;
    }

    public int getHitpoint() {
        return hitpoint;
    }

    public void setHitpoint(int hitpoint) {
        this.hitpoint = hitpoint;
    }
}
