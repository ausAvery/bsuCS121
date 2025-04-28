import java.util.Scanner;

public class StringEquals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "Kokomo";
        String response;

        System.out.print("Where is Avery, Austin from? ");
        response = scanner.nextLine();

        if (response.equals(answer)) {
            System.out.print("Correct!");
        } else {
            System.out.printf("Incorrect! The correct answer is %s", answer);
        }
    }
}
