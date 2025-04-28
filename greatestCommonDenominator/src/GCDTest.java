import java.util.Scanner;

public class GCDTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;

        System.out.print("Enter a integer: ");
        num1 = Integer.parseInt(sc.nextLine());
        System.out.print("Enter a second integer: ");
        num2 = Integer.parseInt(sc.nextLine());

        GCD gcd = new GCD();

        System.out.printf("GCD using for loop: %d\n", gcd.findGCDForLoop(num1, num2));
        System.out.printf("GCD using while loop: %d\n", gcd.findGCPWhileLoop(num1, num2));
        System.out.printf("GCD using Recursion: %d\n", gcd.findGCDRecursively(num1, num2));
        System.out.println();

        System.out.println("===Bonus===");
        System.out.print("Enter a positive integer: ");
        num1 = Integer.parseInt(sc.nextLine());
        System.out.print("Enter a negative integer: ");
        num2 = Integer.parseInt(sc.nextLine());
        System.out.printf("GCD using negatives: %d\n", gcd.findGCDNegative(num1, num2));
    }
}
