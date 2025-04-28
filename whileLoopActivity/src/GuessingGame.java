import java.util.Objects;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int guesses = 0;
        int answer = 47;
        String userGuess;
        int guess;
        // if I declare and assign this boolean and try to use it in the while (condition) as while (keepGoing),
        // instead of using break;
        // why does it throw errors when the input is "q"?
        //boolean keepGoing = true;

        System.out.print("Guess a number between 1 and 100, or enter \"q\" if you give up: ");

        //while (keepGoing) {}
        while (true) {
            userGuess = console.nextLine();

            if (userGuess.equals("q")) {
                System.out.printf("Quitter! The correct number is %d.", answer);
                break;
                //keepGoing = false; // this returns errors
            }

            guesses++;
            guess = Integer.parseInt(userGuess);

            if (guess == answer) {
                System.out.printf("Winner winner, chicken dinner!\nNumber of guesses: %d", guesses);
                break;
                //keepGoing = false; // this does not return errors
            }
            else if (guess > answer) {
                System.out.print("Too high! Try again: ");
            }
            else {
                System.out.print("Too low! Try again: ");
            }
        }
        console.close();
    }
}
