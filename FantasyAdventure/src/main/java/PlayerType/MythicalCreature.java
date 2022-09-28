package PlayerType;

public enum MythicalCreature {
    OGRE(10),
    DRAGON(12),
    MURLOC(30);

    private Integer health;

    MythicalCreature(Integer health) {
        this.health = health;
    }
}
