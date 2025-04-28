import java.util.Scanner;

public class IfAll {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 15;
        int num3 = 9;
        int num4 = 20;

        // first assume num1 is greatest
        int greatest = num1;

        if (num2 > greatest) {
            greatest = num2;
        }
        if (num3 > greatest) {
            greatest = num3;
        }
        if (num4 > greatest) {
            greatest = num4;
        }
        System.out.printf("%d is the greatest number", greatest);
    }
}
