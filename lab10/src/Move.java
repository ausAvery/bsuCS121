public class Move {
    private String name;
    private int power;
    private int speed;

    public Move(String name, int power, int speed) {
        this.name = name;
        this.power = power;
        this.speed = speed;
    }

    public String toString() {
        return "Move: " + name + " (Power: " + power + ", Speed: " + speed + ")";
    }
}
