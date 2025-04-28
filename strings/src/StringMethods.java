import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your home town: ");
        String town = input.nextLine();     // gets input from console
        System.out.println("Enter your home state: ");
        String state = input.nextLine();

        // compare Strings to see if they are the same
        System.out.println("Enter your home city: ");
        String city = input.nextLine();
        Boolean equals = town.equals(city);     // returns true if exactly equal
        Boolean equivalent = town.equalsIgnoreCase(city);   // returns true if equal while ignoring case
        System.out.println(equals);
        System.out.println(equivalent);

        String homeTown = town.concat(", " + state);    // another way to concatenate strings
        String upper = homeTown.toUpperCase();
        String lower = homeTown.toLowerCase();
        char letter = homeTown.charAt(4);
        int size = homeTown.length();
        Boolean empty = homeTown.isEmpty();

        System.out.printf("Hometown: %s\n", homeTown);      // use printf. \n = newline
        System.out.printf("HOMETOWN: %s\n", upper);
        System.out.printf("hometown: %s\n", lower);
        System.out.printf("Hometown (3rd char): %c\n", letter);
        System.out.printf("Hometown (length): %d\n", size);
        System.out.printf("%s", empty);
    }
}
