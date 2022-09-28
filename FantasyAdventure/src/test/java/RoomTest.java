import Area.Enemies;
import Area.Room;
import PlayerType.*;
import org.junit.Before;

import java.util.ArrayList;

public class RoomTest {

    Cleric cleric;
    Enemies enemies;
    Barbarians barbarians;
    Warlock warlock;

    Room room;

    @Before
    public void before() {
        cleric = new Cleric("Conan", 100, 50, HealHit.POTIONS);
        enemies = new Enemies("Todd", 20, MeleeHit.CLUB);
        barbarians = new Barbarians("Ewan", 100, 2, MeleeHit.SWORD);
        warlock = new Warlock("Stuart", 80, MythicalCreature.MURLOC, Spellhit.BOLT);
    }



}
