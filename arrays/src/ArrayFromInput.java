import java.util.Scanner;

public class ArrayFromInput {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        String[] firstNames = new String[3];
        String[] lastNames = new String[3];
        double[] gpas = new double[3];

        for (int i = 0; i < 3; ++i) {
            System.out.print("First Name: ");
            firstNames[i] = scnr.nextLine();
            System.out.print("Last Name: ");
            lastNames[i] = scnr.nextLine();
            System.out.print("GPA: ");
            gpas[i] = Double.parseDouble(scnr.nextLine());
            System.out.println();
        }

        System.out.printf("%-18s %s\n", "Name", "GPA");

        for (int i = 0; i < gpas.length; ++i) {
            System.out.printf("%-18s %.2f\n", lastNames[i] + ", " + firstNames[i], gpas[i]);
        }
        scnr.close();
    }
}
