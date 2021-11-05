package day02.elearning;

public class Chess {
    private BlackOrWhite blackOrWhite;
    private Type type;

    public Chess(BlackOrWhite blackOrWhite, Type type) {
        this.blackOrWhite = blackOrWhite;
        this.type = type;
    }

    public BlackOrWhite getBlackOrWhite() {
        return blackOrWhite;
    }

    public Type getType() {
        return type;
    }

    public static void main(String[] args) {
        Chess chess=new Chess(BlackOrWhite.BLACK,Type.BISHOP);
        System.out.println(chess.getBlackOrWhite());
        System.out.println(chess.getType());
    }
}
