public class Enemy {
    private String name;
    private int health;
    private int strength;
    private int enemyCount;
    private static int totEnemyCount;

    public Enemy(String name, int health, int strength) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.enemyCount++;
        totEnemyCount++;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getStrength() {
        return strength;
    }

    public int getEnemyCount() {
        return enemyCount;
    }

    public static int getTotEnemyCount() {
        return totEnemyCount;
    }
}
