import java.util.Random;

public class MovieSimulationTwo {
    public static void main(String[] args) {
        // declare and initialize the movie details
        String[] movieNames = {"Barbie", "Oppenheimer", "Spider-Man", "Dune: Pt.2"};
        String[] movieTypes = {"2D", "2D", "3D", "3D"};
        double[] moviePrices = {8.00, 12.00, 14.00, 10.00};

        // create 2D movieAvailability array
        final int ROWS = 5;
        final int COLUMNS = 10;
        int[][] movieAvailability = new int[ROWS][COLUMNS];

        // call all methods
        displayMovieDetails(moviePrices, movieNames, movieTypes);
        setSeatAvailability(movieAvailability);
        displaySeatAvailability(movieAvailability);
        randomizeAvailability(movieAvailability);
        displaySeatAvailability(movieAvailability);

    } // end main method

    static void displayMovieDetails(double[] moviePrices, String[] movieNames, String[] movieTypes) {
        // print a formated header
        System.out.printf("%s%s%s\n", "-".repeat(22), "Movie Details", "-".repeat(22));
        System.out.printf("%-23s%-22s%s\n", "Movie Name", "Movie Type", "Movie Price");

        // loop through the movies and print details
        for (int i = 0; i < movieNames.length; i++) {
            System.out.printf("Movie %d: %-17s %-20s $%.2f\n", i + 1, movieNames[i], movieTypes[i], moviePrices[i]);
        } // end for loop
        System.out.println();
    } // end displayMovieDetails method

    static void setSeatAvailability(int[][] movieAvailability) {
        // print a formated header
        System.out.printf("%s%s%s\n\n", "-".repeat(22), "INITIAL SEATS", "-".repeat(22));
        System.out.printf("\t%s\n", "Seating Availability: [1 = unavailable ; 0 = available]\n");

        // loop through movieAvailability 2D array and set all seat availability to zero
        for (int i = 0; i < movieAvailability.length; i++) {
            for (int j = 0; j < movieAvailability[i].length; j++) {
                movieAvailability[i][j] = 0;
            }
        } // end nested for loop
    } // end setSeatAvailability method

    static void displaySeatAvailability(int[][] movieAvailability) {
        // loop through the 2D array and print a formated table of seat availability
        for (int row = 0; row < movieAvailability.length; row++) {
            for (int column = 0; column < movieAvailability[row].length; column++) {
                System.out.printf("%-3d", movieAvailability[row][column]);
            }
            System.out.println();
        } // end nested for loop
        System.out.println();
    } // end displaySeatAvailability method

    static void randomizeAvailability(int[][] movieAvailability) {
        // print a formatted header
        System.out.printf("%s%s%s\n\n", "-".repeat(18), "RANDOM GENERATED SEATS", "-".repeat(18));
        System.out.printf("\t%s\n", "Seating Availability: [1 = unavailable ; 0 = available]\n");

        // import the random module and declare the random variable
        Random random = new Random();

        // loop through the movieAvailability 2D array and give each seat a random num (0-1)
        for (int i = 0; i < movieAvailability.length; i++) {
            for (int j = 0; j < movieAvailability[i].length; j++) {
                int rng = random.nextInt(2);
                movieAvailability[i][j] = rng;
            }
        } // end nested for loop
    } // end randomizedAvailability method
} // end class
