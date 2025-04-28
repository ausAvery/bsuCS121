import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileAppend {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("fileActivity.txt", true);

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter another course name: ");
            String course = sc.next();

            System.out.print("Enter credits: ");
            int credits = sc.nextInt();

            System.out.print("Enter score: ");
            int score = sc.nextInt();

            writer.write(course + " " + credits + " " + score + "\n");

            System.out.println("Data appended successfully!");

            writer.close();
            sc.close();

        } catch (IOException e) {
            System.out.println("Error appending to file.");
        }
    }
}
