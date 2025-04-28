import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListReview {
    ArrayList<String> movies = new ArrayList<String>();
    ArrayList<String> genres = new ArrayList<String>();
    ArrayList<Integer> stars = new ArrayList<Integer>();
    ArrayList<String> ratings = new ArrayList<String>();

    public void collectData() {
        Scanner sc = new Scanner(System.in);
        String again = "y";
        while (again.equalsIgnoreCase("y")) {
            System.out.print("Enter movie title: ");
            movies.add(sc.nextLine());

            System.out.print("Enter genre: ");
            genres.add(sc.nextLine());

            System.out.print("Enter star rating (1-5): ");
            stars.add(sc.nextInt());
            sc.nextLine(); // consume newline

            System.out.print("Do you want to enter another movie? (y/n): ");
            again = sc.nextLine();
        }
    }

    public void assignWordRatings() {
        for (int i = 0; i < stars.size(); i++) {
            int star = stars.get(i);
            if (star == 5) {
                ratings.add("Excellent");
            }
            else if (star == 4) {
                ratings.add("Above Average");
            }
            else if (star == 3) {
                ratings.add("Average");
            }
            else if (star == 2) {
                ratings.add("Below Average");
            }
            else if (star == 1) {
                ratings.add("Poor");
            }
            else {
                ratings.add("Invalid");
            }
        }
    }

    public void printTable() {
        System.out.println("Movie | Genre | Stars | Rating");
        for (int i = 0; i < movies.size(); i++) {
            System.out.println(movies.get(i) + " | " + genres.get(i) + " | " + stars.get(i) + " | " + ratings.get(i));
        }
    }
}
