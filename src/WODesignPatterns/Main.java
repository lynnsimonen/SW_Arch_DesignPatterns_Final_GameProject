package WODesignPatterns;

public class Main {

    public static void main(String[] args) {
        //SINGLETON PATTERN!!!
        GamePlay newGame = GamePlay.getInstance();
        newGame.startGame();

    }
}

