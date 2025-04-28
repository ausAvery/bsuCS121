import java.util.Scanner;

public class MathMethods {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int x;
        int y;
        double z;

        System.out.print("Enter a number: ");
        x = keyboard.nextInt();
        keyboard.nextLine();
        System.out.print("Enter another number: ");
        y = keyboard.nextInt();
        keyboard.nextLine();
        System.out.print("Enter a number with 2 decimals at the end: ");
        z = keyboard.nextDouble();
        keyboard.nextLine();
        System.out.printf("Maximum of x and y is %d\n", Math.max(x, y));
        System.out.printf("Sum of x and y is %d", Math.addExact(x, y));
        System.out.printf("\nMinimum of x and y is %d", Math.min(x, y));
        System.out.printf("\nRounded decimal to the nearest value is %d", Math.round(z));
    }
}
