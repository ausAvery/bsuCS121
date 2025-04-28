import java.util.Scanner;

public class TestScores {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int testScore1;
        int testScore2;
        int testScore3;
        int averageScore;

        System.out.print("Enter your first test score (0-100): ");
        testScore1 = Integer.parseInt(console.nextLine());

        System.out.print("Enter your second test score (0-100): ");
        testScore2 = Integer.parseInt(console.nextLine());

        System.out.print("Enter your third test score (0-100): ");
        testScore3 = Integer.parseInt(console.nextLine());

        averageScore = (testScore1 + testScore2 + testScore3) / 3;

        if (averageScore < 60) {
            System.out.printf("Your test score average is %d. Your grade is an F.", averageScore);
        } else if (averageScore <= 69) {
            System.out.printf("Your test score average is %d. Your grade is an D.", averageScore);
        } else if (averageScore <= 79) {
            System.out.printf("Your test score average is %d. Your grade is an C.", averageScore);
        } else if (averageScore <= 89) {
            System.out.printf("Your test score average is %d. Your grade is an B.", averageScore);
        } else {
            System.out.printf("Your test score average is %d. Your grade is an A.", averageScore);
        }
    }
}