package 행위_Observer;

public class MainEntry {
    public static void main(String[] args) {
        DiceGame diceGame = new FairDiceGame(); 

        Player player1 = new EvenBettingPlayer("a");
        Player player2 = new OddBettingPlayer("b");
        Player player3 = new OddBettingPlayer("c");

        diceGame.addPlater(player1);
        diceGame.addPlater(player2);
        diceGame.addPlater(player3);

        for(int i=0; i<5; i++){
            diceGame.play();
            System.out.println();
        }
    }
    
}
