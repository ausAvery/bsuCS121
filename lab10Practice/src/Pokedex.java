import java.util.ArrayList;

public class Pokedex {
    // instance variables
    private ArrayList<Pokemon> pokemonArrayList = new ArrayList<>();

    // default constructor
    public Pokedex() {} /* don't need to write */


    // methods
    public void addPokemon(Pokemon pokemon) {
        pokemonArrayList.add(pokemon);
    }

    public void removePokemon(Pokemon pokemon) {
        pokemonArrayList.remove(pokemon);
    }

    public Pokemon getPokemon(String pokemonName) {
        Pokemon foundPokemon = null;
        for (Pokemon pokemon : pokemonArrayList) {
            if (pokemon.getName().equals(pokemonName)) {
                foundPokemon = pokemon;
                break;
            }
        }
        return foundPokemon;
    }

    public String getAllPokemon() {
        String allPokemon = "";
        for (Pokemon pokemon : pokemonArrayList) {
            allPokemon += pokemon.toString() + "\n";
        }
        return allPokemon;
    }
}
