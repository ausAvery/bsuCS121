import java.util.Scanner;

public class BookClubPoints {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int books;
        int points;

        System.out.print("How many books have you purchased this month? ");
        books = Integer.parseInt(console.nextLine());

        if (books == 0) {
            points = 0;
            System.out.printf("You have %d points.", points);
        } else if (books == 1) {
            points = 5;
            System.out.printf("You have %d points.", points);
        } else if (books == 2) {
            points = 15;
            System.out.printf("You have %d points.", points);
        } else if (books == 3) {
            points = 30;
            System.out.printf("You have %d points.", points);
        } else if (books >= 4) {
            points = 60;
            System.out.printf("You have %d points.", points);
        }
    }
}
