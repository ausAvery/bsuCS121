import java.util.Scanner;

public class WordGame {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String name;
        int age;
        String city;
        String college;
        String major;
        String animal;
        String petName;

        System.out.print("Enter your name: ");
        name = console.nextLine();

        System.out.print("Enter your age: ");
        age = Integer.parseInt(console.nextLine());

        System.out.print("Enter your city: ");
        city = console.nextLine();

        System.out.print("Enter your college: ");
        college = console.nextLine();

        System.out.print("Enter your major: ");
        major = console.nextLine();

        System.out.print("Type of animal: ");
        animal = console.nextLine();

        System.out.print("Enter a pet name: ");
        petName = console.nextLine();

        System.out.printf("\n%s, a %d-year-old from %s, had a peculiar problem.\nTheir pet %s, named %s, had developed a " +
                "strange habit of stealing %s textbooks from the shelf.\n\"%s, not again!\" %s groaned, chasing them around " +
                "the house. Despite their degree from %s, nothing had prepared them for this level of chaos.\n" +
                "In the end, %s gave up, sat on the floor, and laughed.\nLife with %s was messy, but never boring",
                name, age, city, animal, petName, major, petName, name, college, name, petName);

    }
}
