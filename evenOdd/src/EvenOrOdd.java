import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int userInput = scnr.nextInt();

        if (userInput % 2 == 0) {
            System.out.printf("%s is even.", userInput);
        }
        else {
            System.out.printf("%s is odd.", userInput);
        }
    }
}
