import java.util.Random;
import java.util.Scanner;

public class MovieSimulationThree {
    public static void main(String[] args) {
        // declare and initialize the movie details
        String[] movieNames = {"Barbie", "Oppenheimer", "Spider-Man", "Dune: Pt.2"};
        String[] movieTypes = {"2D", "2D", "3D", "3D"};
        double[] moviePrices = {8.00, 12.00, 14.00, 10.00};

        // create 2D movieAvailability array
        final int ROWS = 5;
        final int COLUMNS = 10;
        int[][] movieAvailability = new int[ROWS][COLUMNS];

        // calling all methods... rollout
        displayMovieDetails(moviePrices, movieNames, movieTypes);
        int index = selectMovie(movieNames);
        displaySelectedMovie(movieNames, movieTypes, moviePrices, index);
        randomizeAvailability(movieAvailability);
        displaySeatAvailability(movieAvailability);

    }

    static void displayMovieDetails(double[] moviePrices, String[] movieNames, String[] movieTypes) {
        System.out.printf("%s%s%s\n", "-".repeat(22), "Movie Details", "-".repeat(22));
        System.out.printf("%-23s%-22s%s\n", "Movie Name", "Movie Type", "Movie Price");

        for (int i = 0; i < movieNames.length; i++) {
            System.out.printf("Movie %d: %-17s %-20s $%.2f\n", i + 1, movieNames[i], movieTypes[i], moviePrices[i]);
        }
        System.out.println();
    }

    static void displaySeatAvailability(int[][] movieAvailability) {
        char[] letter = {'A', 'B', 'C', 'D', 'E'};
        System.out.println("  1  2  3  4  5  6  7  8  9  10");
        System.out.printf("  %s\n", "--".repeat(15));
        for (int row = 0; row < movieAvailability.length; row++) {
            System.out.printf("%c |", letter[row]);
            for (int column = 0; column < movieAvailability[row].length; column++) {
                System.out.printf("%-3d", movieAvailability[row][column]);
            }
            System.out.println();
        }
        System.out.println();
    }

    static void randomizeAvailability(int[][] movieAvailability) {
        System.out.printf("\n%s%s%s\n", "-".repeat(18), "Available Seats", "-".repeat(18));
        System.out.printf("%s\n", "Seating Availability: [1 = unavailable ; 0 = available]\n");

        Random random = new Random();

        for (int i = 0; i < movieAvailability.length; i++) {
            for (int j = 0; j < movieAvailability[i].length; j++) {
                int rng = random.nextInt(2);
                movieAvailability[i][j] = rng;
            }
        }
    }

    static int selectMovie(String[] movieNames) {
        Scanner scanner = new Scanner(System.in);
        String userMovie;
        int index;

        while (true) {
            System.out.print("Enter the movie name you are purchasing tickets for: ");
            userMovie = scanner.nextLine();
            for (int i = 0; i < movieNames.length; i++) {
                if (userMovie.equalsIgnoreCase(movieNames[i])) {
                    index = i;
                    return index;
                }
            }
            System.out.println("Movie not found! Try again.\n");
        }
    }

    static void displaySelectedMovie(String[] movieNames, String[] movieTypes, double[] moviePrices, int index) {
        System.out.printf("\n%s%s%s\n", "-".repeat(22), "Movie Selection", "-".repeat(22));
        System.out.printf("%-23s%-22s%s\n", "Movie Selected", "Movie Type", "Movie Price");
        System.out.printf("%-27s%-21s$%.2f\n", movieNames[index], movieTypes[index], moviePrices[index]);
        System.out.println();
    }
}

