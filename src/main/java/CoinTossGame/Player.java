package CoinTossGame;

public class Player {
    private String name;
    private String guess;

    public Player(String name){
        this.name = name;
    }


    public String getGuess() {
        return guess;
    }

    public void setGuess(String guess) {
        this.guess = guess;
    }
}
