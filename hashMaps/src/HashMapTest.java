import java.util.Scanner;

public class HashMapTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMapDemo demo = new HashMapDemo();
        String course;
        int score;

        while (true) {
            System.out.print("Enter a course or q to quit: ");
            course = sc.nextLine();
            if (course.equals("q")) {
                System.out.println("Exiting...");
                break;
            }
            System.out.print("\tEnter course's score: ");
            score = Integer.parseInt(sc.nextLine());
            demo.addToGradesList(course, score);
        }

        System.out.println();
        System.out.print("Enter a course to get score: ");
        String getCourse = sc.nextLine();
        String courseScore = demo.getCourseScore(getCourse);
        if (courseScore == null) {
            System.out.println("Course not found.");
        }
        else {
            System.out.printf("%s score = %s\n", getCourse, courseScore);
        }
        System.out.println();
        System.out.println(demo.getAllScores());

        System.out.println();
        System.out.print("Enter a course to remove: ");
        String removeCourse = sc.nextLine();
        demo.removeFromGradesList(removeCourse);

        System.out.println();
        System.out.println(demo.getAllScores());
    }
}
