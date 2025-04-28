import java.util.Scanner;

public class RecursionTester {
    public static void main(String[] args) {
        RecursionDemo demo = new RecursionDemo();

        Scanner console = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = Integer.parseInt(console.nextLine());
        System.out.printf("The factorial of %d is %d\n", number, demo.calcFactorial(number));

        int x = 10;
        int y = 20;
        System.out.printf("Printing result of x + 1 = %d\n", x + 1);
        System.out.printf("Printing result of y - 1 = %d\n", y - 1);
        System.out.println();

        x = 10;
        y = 20;
        System.out.printf("Printing result of postfix of x++: %d\n", x++);
        System.out.printf("Printing result of postfix of y--: %d\n", y--);
        System.out.printf("Printing x after postfix increment: %d\n", x);
        System.out.printf("Printing y after postfix decrement: %d\n", y);
        System.out.println();

        x = 10;
        y = 20;
        System.out.printf("Printing x prefix increment: %d\n", ++x);
        System.out.printf("Printing y prefix decrement: %d\n", --y);
        System.out.println();
    }
}
