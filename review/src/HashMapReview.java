import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapReview {
    HashMap<String, Integer> movieRatings = new HashMap<String, Integer>();

    public void collectData() {
        Scanner sc = new Scanner(System.in);
        String again = "y";
        while (again.equalsIgnoreCase("y")) {
            System.out.print("Enter movie title: ");
            String title = sc.nextLine();

            System.out.print("Enter rating (1-5): ");
            int rating = sc.nextInt();
            sc.nextLine(); // consume newline

            movieRatings.put(title, rating);

            System.out.print("Do you want to enter another movie? (y/n): ");
            again = sc.nextLine();
        }
    }

    public void printTable() {
        System.out.println("Movie | Rating");
        for (Map.Entry<String, Integer> entry : movieRatings.entrySet()) {
            System.out.println(entry.getKey() + " | " + entry.getValue());
        }
    }
}
