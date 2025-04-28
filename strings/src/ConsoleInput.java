import java.util.Scanner;

public class ConsoleInput {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Please enter your first name: ");
        String firstName = console.nextLine();
        System.out.print("Please enter your age: ");
        int age = console.nextInt();    // or you can use "int age = Integer.parseInt(console.nextLine());"
        console.nextLine();             // and not have to use this line
        System.out.print("Please enter your last name: ");
        String lastName = console.nextLine();
        System.out.printf("It is nice to meet you %s %s!\nWow, I am %d too!! :)", firstName, lastName, age);
    }
}
