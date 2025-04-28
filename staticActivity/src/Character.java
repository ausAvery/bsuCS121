public class Character {
    private String name;
    private int health;
    private int atk;
    private static int classCount;

    public Character(String charName, int charHealth, int charAtk) {
        this.name = charName;
        this.health = charHealth;
        this.atk = charAtk;
        classCount++;
    }

    public static int getClassCount() {
        return classCount;
    }
}
