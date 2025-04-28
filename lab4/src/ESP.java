import java.util.Random;
import java.util.Scanner;

public class ESP {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Random rng = new Random();
        int randomInt;
        int guesses = 0;
        String color;
        String userGuess;
        int numCorrect = 0;

        System.out.println("Welcome to the ESP Game.\nPlease choose between: red, yellow, green, blue, or orange.");

        while (guesses <= 9) {
            guesses++;
            randomInt = rng.nextInt(5);

            if (randomInt == 0) {
                color = "red";
            }
            else if (randomInt == 1) {
                color = "green";
            }
            else if (randomInt == 2) {
                color = "blue";
            }
            else if (randomInt == 3) {
                color = "orange";
            }
            else {
                color = "yellow";
            }

            System.out.printf("\n%d. What color has the computer chosen? ", guesses);
            userGuess = console.nextLine();

            System.out.printf("\n>>> The computer chose %s\n", color);

            if (userGuess.equals(color)) {
                numCorrect++;
            }
        }
        System.out.printf("\nYou got %s out of 10 correct.", numCorrect);

        console.close();
    }
}
