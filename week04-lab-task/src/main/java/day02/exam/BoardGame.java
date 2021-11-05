package day02.exam;

public class BoardGame {
    private String name;
    private NumberOfPlayers numberOfPlayer;
    private double gameLengthInHours;
    private int price;

    public BoardGame(String name, NumberOfPlayers numberOfPlayers, double gameLengthInHours) {
        this.name = name;
        this.numberOfPlayer = numberOfPlayers;
        this.gameLengthInHours = gameLengthInHours;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getGameLengthInMinutes() {
        return (int)(gameLengthInHours*60);
    }

    public int getIdealNumberOfPlayers() {
        return (numberOfPlayer.getMinimumPlayers()+numberOfPlayer.getMaximumPlayers())/2;
    }


}
