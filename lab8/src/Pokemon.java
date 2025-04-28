public class Pokemon {
    /* instance variables */
    private String name;
    private int healthPoints;
    private int speed;
    private String move;
    private int power;

    /* constructor */
    public Pokemon(String pokeName, int hp, int spd, String pokeMove, int pwr) {
        this.name = pokeName;
        this.healthPoints = hp;
        this.speed = spd;
        this.move = pokeMove;
        this.power = pwr;
    }

    /* default constructor */
    public Pokemon() {
        this.name = "Mewtwo";
        this.healthPoints = 106;
        this.speed = 130;
        this.move = "Future Sight";
        this.power = 110;
    }

    /* getters and setters */
    protected String getName() {
        return name;
    }

    protected void setName(String pokeName) {
        name = pokeName;
    }

    protected int getHealthPoints() {
        return healthPoints;
    }

    protected void setHealthPoints(int hp) {
        healthPoints = hp;
    }

    protected int getSpeed() {
        return speed;
    }

    protected void setSpeed(int spd) {
        speed = spd;
    }

    protected String getMove() {
        return move;
    }

    protected void setMove(String pokeMove) {
        move = pokeMove;
    }

    protected int getPower() {
        return power;
    }

    protected void setPower(int pwr) {
        power = pwr;
    }

    public String getPokeStats() {
        return String.format("\nName: %s\n" +
                "HP: %d\n" +
                "Speed: %d\n" +
                "Move: %s\n" +
                "Power: %d\n", name, healthPoints, speed, move, power);
    }

}
