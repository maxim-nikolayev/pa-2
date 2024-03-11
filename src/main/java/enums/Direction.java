package enums;

public enum Direction {
    RIGHT(1), LEFT(-1);
    private final int move;
    Direction(int move) { this.move = move; }
    public int getMove() { return move; }
}
