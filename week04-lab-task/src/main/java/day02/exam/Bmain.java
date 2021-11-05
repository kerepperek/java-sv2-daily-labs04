package day02.exam;

public class Bmain {
    public static void main(String[] args) {
        NumberOfPlayers numberOfPlayers = new NumberOfPlayers(2,5);
        BoardGame boardGame = new BoardGame("Catan telepesei", numberOfPlayers, 1.25);
        boardGame.setPrice(8998);
        System.out.println(boardGame.getName());
        System.out.println(boardGame.getPrice());
        System.out.println(boardGame.getGameLengthInMinutes());//75
        System.out.println(boardGame.getIdealNumberOfPlayers());//3

    }

}
