import java.util.Scanner;

public class IfElse3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println();

        if (number % 2 == 0) {
            System.out.print("The number is even.");
        } else {
            System.out.print("The number is odd.");
        }
    }
}