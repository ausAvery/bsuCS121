import java.util.Random;
import java.util.Scanner;

public class TestScores {
    public static void main(String[] args) {
        /* import require packages and create a
        constant int variable using random num 3-10 */
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        final int SIZE = random.nextInt(3, 11);

        /* declare & initialize two arrays with length of constant SIZE */
        int[] testScores = new int[SIZE];
        char[] letterGrades = new char[SIZE];

        /* ask user for test scores */
        System.out.printf("Enter your %d test scores\n", SIZE);
        for (int i = 0; i < testScores.length; i++) {
            System.out.printf("Enter test %d score: ", i+1);
            testScores[i] = Integer.parseInt(scanner.nextLine());
        }

        /* assign returned value from getLetterGrade() to letterGrades[] */
        for (int i = 0; i < testScores.length; i++) {
            letterGrades[i] = getLetterGrade(testScores[i]);
        }

        /* calling all methods... rollout */
        printGrades(testScores, letterGrades);

        printHighestScore(testScores);

        printLowestScore(testScores);

        printAverageScore(testScores);

        scanner.close();
    }

    static char getLetterGrade(int testScore) {
        char letterGrade;

        if (testScore >= 90) {
            letterGrade = 'A';
        }
        else if (testScore >= 80) {
            letterGrade = 'B';
        }
        else if (testScore >= 70) {
            letterGrade = 'C';
        }
        else if (testScore >= 60) {
            letterGrade = 'D';
        }
        else {
            letterGrade = 'F';
        }

        return letterGrade;
    }

    static void printGrades(int[] scores, char[] grades) {
        System.out.printf("\n%-10s%s\n", "Score", "Grade");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf(" %-11d%c\n", scores[i], grades[i]);
        }
    }

    static void printHighestScore(int[] scores) {
        int highScore = 0;

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > highScore) {
                highScore = scores[i];
            }
        }
        System.out.printf("The highest score is %d", highScore);
        System.out.println();
    }

    static void printLowestScore(int[] scores) {
        int lowScore = 100;

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < lowScore) {
                lowScore = scores[i];
            }
        }
        System.out.printf("The lowest score is %d", lowScore);
        System.out.println();
    }

    static void printAverageScore(int[] scores) {
        double avgScore = 0.0;

        for (int i = 0; i < scores.length; i++) {
            avgScore = avgScore + scores[i];
        }

        avgScore = avgScore / scores.length;

        System.out.printf("Average score is %.1f", avgScore);
        System.out.println();
    }
}
