import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        // Math.random()
        double randomDouble = Math.random() * 50 + 1;
        int randomInt = (int) (Math.random() * 50 + 1);

        System.out.printf("%.2f\n", randomDouble);
        System.out.println(randomInt);

        // Random class
        Random random = new Random();
        int intRandom = random.nextInt(50);
        double doubleRandom = random.nextDouble() * 50;

        System.out.printf("random int: %d\n", intRandom);
        System.out.printf("random double: %.2f", doubleRandom);
    }
}
