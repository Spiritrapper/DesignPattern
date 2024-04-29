package Observer;

import java.util.LinkedList;

public abstract class DiceGame {
    protected LinkedList<Player> playerList = new LinkedList<Player>();

    public void addPlater(Player player) {
        playerList.add(player);
    }

    public abstract void play();
}
