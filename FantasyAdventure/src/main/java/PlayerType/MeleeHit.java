package PlayerType;

public enum MeleeHit {
    SWORD(10),
    CLUB(5),
    AXE(15);

    private int hitPoints;

    MeleeHit(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getHitPoint(){
        return this.hitPoints;
    }
}
