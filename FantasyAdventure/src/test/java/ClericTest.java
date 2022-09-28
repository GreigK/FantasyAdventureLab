import Area.Enemies;
import PlayerType.Barbarians;
import PlayerType.Cleric;
import PlayerType.HealHit;
import PlayerType.MeleeHit;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;
    Enemies enemies;

    Barbarians barbarians;

    @Before
    public void before(){
        cleric = new Cleric("Conan", 100, 50, HealHit.POTIONS);
        enemies = new Enemies("Todd", 20, MeleeHit.CLUB);
        barbarians = new Barbarians("Ewan", 100, 2, MeleeHit.SWORD);
    }

    @Test
    public void canTakeDamage(){
        enemies.swingWeapon(cleric);
        assertEquals(95, cleric.getHealth());
    }

    @Test
    public void canSeeMaxFaithHealth(){
        assertEquals(150, cleric.maxFaithHealth());
    }


    @Test
    public void canHealSelf(){
        cleric.healSelf(cleric);
        assertEquals(108, cleric.getHealth());
    }

    @Test
    public void canHealPlayers(){
        cleric.healSelf(barbarians);
        assertEquals(108, barbarians.getHealth());
    }




}
