import java.util.Scanner;

public class Menu {
    // instance variables
    private Scanner scanner = new Scanner(System.in);
    private Pokedex pokedex = new Pokedex();

    // default constructor -- don't need to write

    // methods
    public void displayMenu() {
        int selection;
        String stars = "*".repeat(9);
        while (true) {
            System.out.printf("\n%s MENU %s\n", stars, stars);
            System.out.print("Please make a selection:\n" +
                    "1) Add a Pokemon\n" +
                    "2) Remove a Pokemon\n" +
                    "3) Display Pokemon Info\n" +
                    "4) Display All Pokemon Info\n" +
                    "5) Exit\n" +
                    ">>> ");
            selection = Integer.parseInt(scanner.nextLine());
            if (selection == 1) {
                createPokemon();
            }
            else if (selection == 2) {
                deletePokemon();
            }
            else if (selection == 3) {
                displayPokemon();
            }
            else if (selection == 4) {
                displayAllPokemon();
            }
            else if (selection == 5) {
                System.out.println("Exiting...");
                break;
            }
            else {
                System.out.println("Invalid entry");
            }
        } // end while loop
        scanner.close();
    } // end displayMenu()

    private void createPokemon() {
        String pokemonName;
        int hp;
        Pokemon pokemon;
        String moveName;
        int movePower;
        int moveSpeed;
        Move move;

        System.out.print("Enter Pokemon name: ");
        pokemonName = scanner.nextLine();
        System.out.print("Enter Pokemon HP: ");
        hp = Integer.parseInt(scanner.nextLine());
        pokemon = new Pokemon(pokemonName, hp);

        System.out.printf("Enter Moves for %s.\n", pokemonName);
        while (true) {
            System.out.print("\tEnter a move name or 'q' if finished: ");
            moveName = scanner.nextLine();
            if (moveName.equals("q")) {
                break;
            }
            System.out.print("\tEnter move's power: ");
            movePower = Integer.parseInt(scanner.nextLine());
            System.out.print("\tEnter move's speed: ");
            moveSpeed = Integer.parseInt(scanner.nextLine());
            move = new Move(moveName, movePower, moveSpeed);
            pokemon.addMove(move);
        } // end while loop
        pokedex.addPokemon(pokemon);
        System.out.printf("%s added to Pokedex\n\n", pokemonName);
    } // end createPokemon()

    private void deletePokemon() {
        String pokemonName;
        Pokemon pokemon;
        System.out.print("Enter the name of the Pokemon you want to delete: ");
        pokemonName = scanner.nextLine();
        pokemon = pokedex.getPokemon(pokemonName);
        if (pokemon == null) {
            System.out.print("Pokemon not found.");
        }
        else {
            pokedex.removePokemon(pokemon);
            System.out.printf("%s removed from Pokedex.\n", pokemonName);
        }
    } // end deletePokemon()

    private void displayPokemon() {
        String pokemonName;
        Pokemon pokemon;
        System.out.print("Enter the name of the Pokemon you want to display: ");
        pokemonName = scanner.nextLine();
        pokemon = pokedex.getPokemon(pokemonName);
        if (pokemon == null) {
            System.out.print("Pokemon not found.");
        }
        else {
            System.out.println(pokemon);
        }
    } // end displayPokemon()

    private void displayAllPokemon() {
        System.out.println(pokedex.getAllPokemon());
    } // end displayAllPokemon()

} // end Menu class
