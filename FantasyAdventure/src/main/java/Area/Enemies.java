package Area;

import PlayerType.Barbarians;
import PlayerType.Cleric;
import PlayerType.MeleeHit;
import PlayerType.Player;


public class Enemies extends Player {

    MeleeHit meleeHit;

    public Enemies(String name, int health, MeleeHit meleeHit) {
        super(name, health);
        this.meleeHit = meleeHit;
    }

    public void swingWeapon(Player player){
        int newHealth = player.getHealth() - meleeHit.getHitPoint();
        player.setHealth(newHealth);
    }




}
