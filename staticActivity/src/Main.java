public class Main {
    public static void main(String[] args) {
        Character character1 = new Character("Invincible", 100, 500);
        Character character2 = new Character("Omni-Man", 500, 1000);

        System.out.println("Instance 1 w/ static method: " + character1.getClassCount());
        System.out.println("Instance 2 w/ static method: " + character2.getClassCount());

        System.out.println("Class w/ static method: " + Character.getClassCount());
    }
}
