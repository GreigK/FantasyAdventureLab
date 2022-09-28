import Area.Enemies;
import PlayerType.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarlockTest {

    Cleric cleric;
    Enemies enemies;
    Barbarians barbarians;

    Warlock warlock;

    @Before
    public void before() {
        cleric = new Cleric("Conan", 100, 50, HealHit.POTIONS);
        enemies = new Enemies("Todd", 20, MeleeHit.CLUB);
        barbarians = new Barbarians("Ewan", 100, 2, MeleeHit.SWORD);
        warlock = new Warlock("Stuart", 80, MythicalCreature.MURLOC, Spellhit.BOLT);
    }


    @Test
    public void canCastSpells(){
        warlock.castSpell(enemies);
        assertEquals(16, enemies.getHealth());
    }





}
