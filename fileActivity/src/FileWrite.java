import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWrite {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("fileActivity.txt");

            // Write header
            writer.write("course credits score\n");

            Scanner sc = new Scanner(System.in);

            // Get input from user
            System.out.print("Enter course name: ");
            String course = sc.next();

            System.out.print("Enter credits: ");
            int credits = sc.nextInt();

            System.out.print("Enter score: ");
            int score = sc.nextInt();

            // Write user input to file
            writer.write(course + " " + credits + " " + score + "\n");

            System.out.println("Data written successfully!");

            writer.close();
            sc.close();

        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }
    }
}
