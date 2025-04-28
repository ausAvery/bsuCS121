public class MovieTest {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Paddington", "2D", 4);
        Movie movie2 = new Movie("Mufasa", "3D", 3);
        DayAndTime day1 = new DayAndTime("Saturday", 2, "afternoon");
        DayAndTime day2 = new DayAndTime("Friday", 10, "evening");

        movie1.getMoviePrice();
        movie1.getMovieInfo();

        System.out.println();

        movie2.getMoviePrice();
        movie2.getMovieInfo();

        System.out.println();

        day1.getTimeOfDayInfo();
        day2.getTimeOfDayInfo();
    }
}
