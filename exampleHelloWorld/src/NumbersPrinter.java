import java.util.Scanner;

public class NumbersPrinter {
    public static void main(String[] args) {
        int numCount = 6;

        printSelectedNumbers(numCount);
    }

    public static void printSelectedNumbers(int numCount) {
        Scanner scnr = new Scanner(System.in);
        int i;
        int number;

        for (i = 0; i < numCount; ++i) {
            number = scnr.nextInt();
            if (number < 8) {
                System.out.println(number);
            }
        }
    }
}
