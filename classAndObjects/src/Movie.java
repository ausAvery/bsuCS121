public class Movie {
    String movieName;
    String movieType;
    int movieRating;
    double moviePrice;

    public Movie(String name, String type, int rating) {
        this.movieName = name;
        this.movieType = type;
        this.movieRating = rating;
    }

    void getMoviePrice() {
        int moviePremium;
        if (movieType.equalsIgnoreCase("2D")) {
            moviePremium = 2;
        }
        else if (movieType.equalsIgnoreCase("3D")) {
            moviePremium = 4;
        }
        else {
            moviePremium = 0;
        }
        if (movieRating <= 2) {
            moviePremium = moviePremium + 1;
        }
        else if (movieRating <= 4) {
            moviePremium = moviePremium + 2;
        }
        else {
            moviePremium = moviePremium + 5;
        }
        moviePrice = 5.00 + moviePremium;
    }

    void getMovieInfo() {
        System.out.printf("Movie Title: %s\n" +
                            "Type: %s\n" +
                            "Rating (1-5 stars): %d\n" +
                            "Price: $%.2f\n",
                            movieName, movieType, movieRating, moviePrice);
    }
}
