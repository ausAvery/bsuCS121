import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        int[] scores; // declares a variable "scores" to reference an array of ints
        char[] letterGrades;
        double[] gpas;

        // alternative way: dataType variableName[]; will run, but not preferred

        scores = new int[3];
        int[] scores2 = new int[3];

//        String[] names = new String[5];
//        names[0] = "Mary";
//        names[1] = "Tom";
//        names[2] = "John";
//        names[3] = "Jane";
//        names[4] = "Lisa";
//        String[] names = {"Mary", "Tom", "John", "Jane", "Lisa"};
//        for (int i = 0; i < names.length; i++) {
//            System.out.println(names[i]);
//        }

//        String[] firstNames = {"Mary", "Tom", "John", "Jane", "Lisa"};
//        String[] lastNames = {"Johnson", "Riddle", "Dutton", "Doe", "Allen"};
//        int[] ages = {19, 21, 20, 18, 22};
//
//        //print the header: -14 is for 14 characters (including blank spaces) left justified
//        System.out.printf("%-14s %s\n", "Name", "Age");
//
//        for (int i = 0; i < firstNames.length; i++) {
//            System.out.printf("%-14s %d\n", firstNames[i] + " " + lastNames[i], ages[i]);
//        }

        Scanner scnr = new Scanner(System.in);

        String[] firstNames = new String[5];
        String[] lastNames = new String[5];
        int[] ages = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("First Name: ");
            firstNames[i] = scnr.nextLine();
            System.out.print("Last Name: ");
            lastNames[i] = scnr.nextLine();
            System.out.print("Age: ");
            ages[i] = Integer.parseInt(scnr.nextLine());
            System.out.println();
        }

        System.out.printf("%-14s %s\n", "Name", "Age");

        for (int i = 0; i < firstNames.length; i++) {
            System.out.printf("%-14s %d\n", firstNames[i] + " " + lastNames[i], ages[i]);
        }
        scnr.close();
    }
}
