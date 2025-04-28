import java.util.Scanner;

public class DistanceTraveled {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int speed;
        int hours;

        System.out.println("Enter the speed of the vehicle in mph:");
        speed = console.nextInt();
        System.out.println("Enter the number of hours traveling:");
        hours = console.nextInt();
        System.out.println("Hour\tDistance Traveled\n-------------------------");

        for (int hour = 1; hour <= hours; hour++) {
            int distance = speed * hour;
            System.out.printf("%d\t\t\t%d\n", hour, distance);
        }
    }
}
