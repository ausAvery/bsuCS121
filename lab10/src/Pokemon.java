import java.util.ArrayList;

public class Pokemon {
    private String name;
    private int hp;
    private ArrayList<Move> moveArrayList;

    public Pokemon(String name, int hp) {
        this.name = name;
        this.hp = hp;
        this.moveArrayList = new ArrayList<>();
    }

    public void addMove(Move move) {
        moveArrayList.add(move);
    }

    public String getName() {
        return name;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Pokemon: ").append(name).append(", HP: ").append(hp).append("\nMoves:\n");
        for (Move move : moveArrayList) {
            stringBuilder.append(" - ").append(move.toString()).append("\n");
        }
        return stringBuilder.toString();
    }
}
