public class CFTable {
    public static void main(String[] args) {
        int celsius;
        double fahrenheit = 0.0;

        System.out.println("Celsius\t\tFahrenheit\n**********************");

        for (celsius = 0; celsius <= 20; celsius++) {
            fahrenheit = (9.0 / 5.0) * celsius + 32.0;
            System.out.printf(" %d\t\t\t%.1f\n", celsius, fahrenheit);
        }
    }
}
