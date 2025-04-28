import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {
    public static void main(String[] args) {
        try {
            File file = new File("fileActivity.txt");
            Scanner sc = new Scanner(file);

            System.out.println("Reading contents of fileActivity.txt:\n");

            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }

            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found!");
        }
    }
}
