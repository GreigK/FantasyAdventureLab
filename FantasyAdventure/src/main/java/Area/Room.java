package Area;

import java.util.ArrayList;

public class Room {

    private Integer treasure;

    private ArrayList<Enemies> enemy;

    public Room(Integer treasure, ArrayList<Enemies> enemy) {
        this.treasure = treasure;
        this.enemy = enemy;
    }


}
