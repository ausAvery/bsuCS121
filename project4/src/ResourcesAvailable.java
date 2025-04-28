import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class ResourcesAvailable {
    protected static ArrayList<Recipe> recipeArrayList = new ArrayList<>();
    private int option;

    public void readJsonToResourcesAvailable() {
        try {
            Gson gson = new Gson();

            BufferedReader reader = new BufferedReader(new FileReader("recipes.json"));

            // get the type of the ArrayList
            Type recipeListType = new TypeToken<ArrayList<Recipe>>(){}.getType();

            // creates an instance of the type and adds it to the ArrayList
            recipeArrayList = gson.fromJson(reader, recipeListType);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void printRecipeList() {
        option = 0;
        System.out.println("\nAvailable resources:");
        for (Recipe recipe : recipeArrayList) {
            option++;
            System.out.println(option + ") " + recipe.getRecipe());
        }
    }

    public static ArrayList<Recipe> getRecipeArrayList() {
        return recipeArrayList;
    }

    public void printRecipeInformation() {
        option = 0;
        System.out.println("\nRecipe Information:");
        for (Recipe recipe : recipeArrayList) {
            option++;
            System.out.println(option + ")\n" + recipe);
        }
    }

}
