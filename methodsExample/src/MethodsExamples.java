import java.util.Scanner;

public class MethodsExamples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fahrenheit;
        double celsius;

        System.out.print("Enter a fahrenheit temperature: ");
        fahrenheit = Integer.parseInt(scanner.nextLine());
        System.out.printf("Celsius: %.1f\n", convertToCelsius(fahrenheit));

        System.out.print("Enter a celsius temperature: ");
        celsius = Double.parseDouble(scanner.nextLine());
        System.out.printf("Fahrenheit: %d\n", convertToFahrenheit(celsius));
    }

    static double convertToCelsius(int fTemp) {
        double celsius = ((fTemp - 32) * 5.0 / 9.0);
        return celsius;
    }

    static int convertToFahrenheit(double cTemp) {
        int fahrenheit = (int)(9.0 / 5 * cTemp + 32);
        return fahrenheit;
    }

    // example of method with multiple parameters
//    static void printStudentInfo(String name, int age, double gpa) {
//        System.out.printf("Name: %s\nAge: %d\nGPA: %.1f\n", name, age, gpa);
//    }
//
//    static void printName(String testName) {
//        System.out.println(testName);
//    }
}
