import java.util.Scanner;

public class RestaurantSelector {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        boolean vegetarian;
        boolean vegan;
        boolean glutenFree;
        String REST_1 = "\n\tJoe's Gourmet Burgers";
        String REST_2 = "\n\tMain Street Pizza Company";
        String REST_3 = "\n\tCorner Cafe";
        String REST_4 = "\n\tMama's Fine Italian";
        String REST_5 = "\n\tThe Chef's Kitchen";

        System.out.print("Is anyone in your party a vegetarian? ");
        vegetarian = console.nextLine().equalsIgnoreCase("yes");

        System.out.print("Is anyone in your party a vegan? ");
        vegan = console.nextLine().equalsIgnoreCase("yes");

        System.out.print("Is anyone in your party a gluten-free? ");
        glutenFree = console.nextLine().equalsIgnoreCase("yes");

        System.out.print("\nHere are your restaurant choices:");
        if (vegetarian) {
            if (vegan) {
                if (glutenFree) {
                    System.out.println(REST_3 + REST_5);
                }
                else {
                    System.out.println(REST_3 + REST_5);
                }
            }
            else {
                if (glutenFree) {
                    System.out.println(REST_2 + REST_3 + REST_5);
                }
                else {
                    System.out.println(REST_2 + REST_3 + REST_4 + REST_5);
                }
            }
        }
        else {
            if (vegan) {
                if (glutenFree) {
                    System.out.println(REST_3 + REST_5);
                }
                else {
                    System.out.println(REST_3 + REST_5);
                }
            }
            else {
                if (glutenFree) {
                    System.out.println(REST_2 + REST_3 + REST_5);
                }
            }
        }
        if (!vegan) {
            if (!vegetarian) {
                if (!glutenFree) {
                    System.out.println(REST_1 + REST_2 + REST_3 + REST_4 + REST_5);
                }
            }
        }
    }
}
