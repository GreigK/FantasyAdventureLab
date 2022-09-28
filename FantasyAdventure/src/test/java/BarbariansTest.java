import Area.Enemies;
import PlayerType.Barbarians;
import PlayerType.MeleeHit;
import PlayerType.Player;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbariansTest {

    Barbarians barbarians;
    Enemies enemies;

    @Before
    public void before(){
        barbarians = new Barbarians("Conan", 100, 2, MeleeHit.SWORD);
        enemies = new Enemies("Todd", 20, MeleeHit.CLUB);
    }

    @Test
    public void canGetProperties(){
        assertEquals("Conan", barbarians.getName());
        assertEquals(100, barbarians.getHealth(), 0);
        assertEquals(2, barbarians.getRage(), 0);
        assertEquals(MeleeHit.SWORD, MeleeHit.SWORD);
    }

    @Test
    public void canHitHarderWithRage(){
        assertEquals(4, barbarians.enrageHit(2));
    }


    @Test
    public void canHitEnemies(){
        barbarians.swingWeapon(enemies);
        assertEquals(10, enemies.getHealth());
    }

    @Test
    public void canEnrageHitEnemies(){
        barbarians.enrageHit(2);
        barbarians.swingWeapon(enemies);
        assertEquals(12, enemies.getHealth());
    }

    @Test
    public void beHitByEnemies(){
        enemies.swingWeapon(barbarians);
        assertEquals(95, barbarians.getHealth());
    }






}
