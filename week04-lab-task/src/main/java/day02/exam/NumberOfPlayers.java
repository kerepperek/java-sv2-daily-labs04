package day02.exam;

public class NumberOfPlayers {
    private int minimumPlayers;
    private int maximumPlayers;

    public NumberOfPlayers(int minimumPlayers, int maximumPlayers) {
        this.minimumPlayers = minimumPlayers;
        this.maximumPlayers = maximumPlayers;
    }

    public int getMinimumPlayers() {
        return minimumPlayers;
    }

    public int getMaximumPlayers() {
        return maximumPlayers;
    }
}
