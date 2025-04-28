public class Main {
    public static void main(String[] args) {
        Enemy troll = new Enemy("Troll", 15, 30);
        Enemy goblin = new Enemy("Goblin", 10, 20);
        System.out.printf("Troll health: %d%n", troll.getHealth());
        System.out.printf("Goblin health: %d%n", goblin.getHealth());
        System.out.printf("Troll count: %d%n", troll.getEnemyCount());
        System.out.printf("Goblin count: %d%n", goblin.getEnemyCount());
        System.out.printf("Enemy count: %d%n", Enemy.getTotEnemyCount());
    }
}
