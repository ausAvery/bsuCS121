import java.util.Scanner;

public class PokemonArray {
    /* variables */
    Scanner scanner = new Scanner(System.in);
    Pokemon[] pokedex;

    /* methods */
    public void addPokemon() {
        System.out.print("How many Pokemon would you like to add to the pokedex? ");
        final int NUM_POKEMON = Integer.parseInt(scanner.nextLine());

        pokedex = new Pokemon[NUM_POKEMON];

        for (int i = 0; i < pokedex.length; i++) {
            System.out.printf("\nEnter Pokemon %d name\n>>> ", i+1);
            String pokeName = scanner.nextLine();

            System.out.printf("Enter Pokemon %d HP\n>>> ", i+1);
            int pokeHP = Integer.parseInt(scanner.nextLine());

            System.out.printf("Enter Pokemon %d speed\n>>> ", i+1);
            int pokeSpeed = Integer.parseInt(scanner.nextLine());

            System.out.printf("Enter Pokemon %d move\n>>> ", i+1);
            String pokeMove = scanner.nextLine();

            System.out.printf("Enter Pokemon %d power\n>>> ", i+1);
            int pokePower = Integer.parseInt(scanner.nextLine());

            Pokemon pokemon = new Pokemon(pokeName, pokeHP, pokeSpeed, pokeMove, pokePower);
            pokedex[i] = pokemon;
        }
    }
    public void displayPokedex() {
        for (int i = 0; i < pokedex.length; i++) {
            System.out.println(pokedex[i].getPokeStats());
        }
        scanner.close();
    }
}
