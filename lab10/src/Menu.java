import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private Scanner scanner = new Scanner(System.in);
    private Pokedex pokedex = new Pokedex();

    public void displayMenu() {
        while (true) {
            System.out.println("\n=====================");
            System.out.println("      MAIN MENU      ");
            System.out.println("=====================");
            System.out.println("Please make a selection:");
            System.out.println("\n1. Create Pokemon");
            System.out.println("2. Delete Pokemon");
            System.out.println("3. Display Pokemon");
            System.out.println("4. Display All Pokemon");
            System.out.println("5. Exit");
            System.out.print("Enter your selection: ");

            String selection = scanner.nextLine();

            if (selection.equals("1")) {
                createPokemon();
            } else if (selection.equals("2")) {
                deletePokemon();
            } else if (selection.equals("3")) {
                displayPokemon();
            } else if (selection.equals("4")) {
                displayAllPokemon();
            } else if (selection.equals("5")) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid entry, please try again.");
            }
        }
    }

    private void createPokemon() {
        System.out.print("Enter Pokemon name: ");
        String name = scanner.nextLine();

        System.out.print("Enter HP: ");
        int hp = Integer.parseInt(scanner.nextLine());

        Pokemon pokemon = new Pokemon(name, hp);

        while (true) {
            System.out.print("Enter Move name (or 'q' to finish): ");
            String moveName = scanner.nextLine();
            if (moveName.equalsIgnoreCase("q")) {
                break;
            }
            System.out.print("Enter Power: ");
            int power = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter Speed: ");
            int speed = Integer.parseInt(scanner.nextLine());

            Move move = new Move(moveName, power, speed);
            pokemon.addMove(move);
        }

        pokedex.addPokemon(pokemon);
        System.out.println(name + " has been added to the Pokedex.");
    }

    private void deletePokemon() {
        System.out.print("Enter the name of the Pokemon to delete: ");
        String name = scanner.nextLine();
        boolean removed = pokedex.removePokemon(name);
        if (removed) {
            System.out.println(name + " was deleted.");
        } else {
            System.out.println("Pokemon not found.");
        }
    }

    private void displayPokemon() {
        System.out.print("Enter the name of the Pokemon to display: ");
        String name = scanner.nextLine();
        Pokemon p = pokedex.getPokemon(name);
        if (p != null) {
            System.out.println(p);
        } else {
            System.out.println("Pokemon not found.");
        }
    }

    private void displayAllPokemon() {
        ArrayList<Pokemon> allPokemon = pokedex.getAllPokemon();
        if (allPokemon.isEmpty()) {
            System.out.println("Pokedex is empty.");
        } else {
            for (Pokemon p : allPokemon) {
                System.out.println(p);
            }
        }
    }
}
