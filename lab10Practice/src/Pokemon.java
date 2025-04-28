import java.util.ArrayList;

public class Pokemon {
    // instance variables
    private String name;
    private int hp;
    private ArrayList<Move> moveArrayList = new ArrayList<>();

    // constructor
    public Pokemon(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    // methods
    public void addMove(Move move) {
        moveArrayList.add(move);
    }

    public void removeMove(Move move) {
        moveArrayList.remove(move);
    }

    public Move getMove(String moveName) {
        Move foundMove = null;
        for (Move move : moveArrayList) {
            if (move.getMoveName().equals(moveName)) {
                foundMove = move;
                break;
            }
        }
        return foundMove;
    }

    public ArrayList<Move> getAllMoves() {
        return moveArrayList;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("Pokemon: %s\n" +
                "HP: %d\n",
                name, hp);
    }
}
