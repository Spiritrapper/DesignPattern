package Observer;

import java.util.Iterator;
import java.util.Random;

public class UnfairDiceGame extends DiceGame{
    private Random random1 = new Random();
    private int fixedResult; // 고정된 주사위 결과를 저장할 변수

    public UnfairDiceGame(int fixedResult) {
        this.fixedResult = fixedResult;
    }

    @Override
    public void play() {
        System.out.println("조작된 주사위 던지기~ 결과: " + fixedResult);

        Iterator<Player> iter = playerList.iterator();
        while (iter.hasNext()) {
            iter.next().update(fixedResult);
        }
    }
}
