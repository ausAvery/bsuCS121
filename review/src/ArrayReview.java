import java.util.Scanner;

public class ArrayReview {
    String[] movies = new String[5];
    String[] genres = new String[5];
    int[] stars = new int[5];
    String[] ratings = new String[5];

    public void collectData() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter movie title #" + (i + 1) + ": ");
            movies[i] = sc.nextLine();
            System.out.print("Enter genre: ");
            genres[i] = sc.nextLine();
            System.out.print("Enter star rating (1-5): ");
            stars[i] = sc.nextInt();
            sc.nextLine(); // consume newline
        }
    }

    public void assignWordRatings() {
        for (int i = 0; i < stars.length; i++) {
            if (stars[i] == 5) {
                ratings[i] = "Excellent";
            }
            else if (stars[i] == 4) {
                ratings[i] = "Above Average";
            }
            else if (stars[i] == 3) {
                ratings[i] = "Average";
            }
            else if (stars[i] == 2) {
                ratings[i] = "Below Average";
            }
            else if (stars[i] == 1) {
                ratings[i] = "Poor";
            }
            else {
                ratings[i] = "Invalid";
            }
        }
    }

    public void printTable() {
        System.out.println("Movie | Genre | Stars | Rating");
        for (int i = 0; i < movies.length; i++) {
            System.out.println(movies[i] + " | " + genres[i] + " | " + stars[i] + " | " + ratings[i]);
        }
    }
}
