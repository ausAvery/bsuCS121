import java.util.Scanner;

public class MovieSimulationOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int NUM_MOVIE_DETAILS;

        System.out.print("Enter the number of movies: ");
        NUM_MOVIE_DETAILS = Integer.parseInt(scanner.nextLine());
        System.out.println();

        String[] movieNames = new String[NUM_MOVIE_DETAILS];
        String[] movieTypes = new String[NUM_MOVIE_DETAILS];
        int[] movieAvailability = new int[NUM_MOVIE_DETAILS];
        double[] moviePrices = new double[NUM_MOVIE_DETAILS];

        for (int i = 0; i < NUM_MOVIE_DETAILS; i++) {
            System.out.printf("Enter movie %d name: ", i + 1);
            movieNames[i] = scanner.nextLine();

            System.out.printf("Enter movie %d type: ", i + 1);
            movieTypes[i] = scanner.nextLine();

            System.out.printf("Enter 0 if movie %d has available seats, 1 if unavailable: ", i + 1);
            movieAvailability[i] = Integer.parseInt(scanner.nextLine());

            System.out.printf("Enter movie %d price: ", i + 1);
            moviePrices[i] = Double.parseDouble(scanner.nextLine());

            System.out.println();
        }

        displayMovieDetails(movieNames, movieTypes, movieAvailability, moviePrices);
    }
    static void displayMovieDetails(String[] names, String[] types, int[] availability, double[] prices) {
        System.out.printf("\n%s Movie Details %s\n", "=".repeat(28), "=".repeat(28));
        System.out.printf("%-25s%-20s%-22s%-22s\n", "Movie Name", "Movie Type", "Available Seats", "Movie Price");

        for (int i = 0; i < names.length; i++) {
            System.out.printf("Movie %d: %-18s %-23s %-17d %.2f\n", i + 1, names[i], types[i], availability[i], prices[i]);
        }
    }
}
