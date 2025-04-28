import java.util.ArrayList;

public class Pokedex {
    private ArrayList<Pokemon> pokemonArrayList;

    public Pokedex() {
        pokemonArrayList = new ArrayList<>();
    }

    public void addPokemon(Pokemon pokemon) {
        pokemonArrayList.add(pokemon);
    }

    public Pokemon getPokemon(String name) {
        for (Pokemon pokemon : pokemonArrayList) {
            if (pokemon.getName().equalsIgnoreCase(name)) {
                return pokemon;
            }
        }
        return null;
    }

    public boolean removePokemon(String name) {
        Pokemon pokemon = getPokemon(name);
        if (pokemon != null) {
            pokemonArrayList.remove(pokemon);
            return true;
        }
        return false;
    }

    public ArrayList<Pokemon> getAllPokemon() {
        return pokemonArrayList;
    }
}
