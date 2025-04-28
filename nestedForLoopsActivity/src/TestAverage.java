import java.util.Scanner;

public class TestAverage {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int students;
        int tests;
        int testScores;
        int totalScore = 0;
        double average;

        System.out.print("Enter number of students: ");
        students = Integer.parseInt(console.nextLine());
        System.out.print("Enter number of tests per students: ");
        tests = Integer.parseInt(console.nextLine());

        for (int i = 1; i <= students; i++) {
            System.out.printf("\nStudent number %d\n-----------------\n", i);

            for (int j = 1; j <= tests; j++) {
                System.out.printf("Enter score %d: ", j);
                testScores = Integer.parseInt(console.nextLine());
                totalScore += testScores;
            }

            average = totalScore / tests;
            System.out.printf("The average for student %d is %.2f\n", i, average);
            totalScore = 0;
        }
        console.close();
    }
}
