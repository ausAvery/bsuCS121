public class Move {
    // instance variables
    private String moveName;
    private int movePower;
    private int moveSpeed;

    // constructor
    public Move(String moveName, int movePower, int moveSpeed) {
        this.moveName = moveName;
        this.movePower = movePower;
        this.moveSpeed = moveSpeed;
    }

    // methods
    @Override
    public String toString() {
        return String.format("Move: %s\n" +
                        "Power: %d\n" +
                        "Speed: %d\n",
                moveName, movePower, moveSpeed);
    }

    public String getMoveName() {
        return moveName;
    }
}
