import java.util.Scanner;

public class Menu {
    private ResourcesAvailable resourcesAvailable = new ResourcesAvailable();
    private Scanner scanner = new Scanner(System.in);

    public void displayMenu() {
        resourcesAvailable.readJsonToResourcesAvailable();
        Recipe matchedRecipe = null;
        int userChoice;
        String userResource;
        int userQuantity;
        boolean keepGoing = true;

        // display initial menu options and get users choice
        System.out.printf("%s%s%s\n\n" +
                "1) Display available resources.\n" +
                "2) Display detailed crafting information.\n" +
                "3) I know what I want to make.\n" +
                "4) Exit.\n" +
                "Enter your choice (1-4) >> ", "=".repeat(3), "Satisfactory Calculator", "=".repeat(3));
        userChoice = Integer.parseInt(scanner.nextLine());

        while (keepGoing) {
            switch (userChoice) {
                case 1:
                    resourcesAvailable.printRecipeList();
                    keepGoing = false;
                    break;
                case 2:
                    resourcesAvailable.printRecipeInformation();
                    displayMenu();
                    keepGoing = false;
                    break;
                case 3:
                    keepGoing = false;
                    break;
                case 4:
                    System.out.println("Exiting calculator...");
                    System.exit(0);
                default:
                    System.out.print("Invalid entry, please try again.\n" +
                            "\t>> ");
                    userChoice = Integer.parseInt(scanner.nextLine());
            }
        }

        // display secondary menu options
        // gather info to use for calculations
        while (matchedRecipe == null) {
            System.out.print("Enter the resource(item name) you would like to make: ");
            userResource = scanner.nextLine();

            // take the userResource and check validity
            for (Recipe resource : resourcesAvailable.getRecipeArrayList()) {
                if (userResource.equalsIgnoreCase(resource.getRecipe())) {
                    matchedRecipe = resource;
                }
            }


            if (matchedRecipe == null) {
                System.out.println("That resource is currently not available. Please try again! :)");
            }
            else {
                System.out.printf("Enter the quantity of %s(s) / min you would like to make: ", matchedRecipe.getRecipe());
                userQuantity = Integer.parseInt(scanner.nextLine());

                if (userQuantity <= 0) {
                    System.out.println("Invalid quantity, please try again.");
                    matchedRecipe = null;
                }
                else {
                    calcResources(matchedRecipe, userQuantity);
                }
            }

        }
    } // end displayMenu()

    public Recipe calcResources(Recipe recipe, int quantity) {
        Recipe tempRecipe = null;
        String[] ignoredIngredient = {"Iron Ore", "Copper Ore", "Limestone"};
        int tempAmountIn;
        double totalAmountIn;
        double machineCount;
        double powerUsage;

        // take amountIn / amountOut * by userQuantity to get totalAmountIn
        totalAmountIn = (double) recipe.getAmountIn() / recipe.getAmountOut() * quantity;
        tempAmountIn = (int) totalAmountIn;

        // take userQuantity divided by the output of the machine used
        machineCount = (double) quantity / recipe.getOutputPerMachine();

        // take machineCount * powerUsage for the machine
        powerUsage = machineCount * recipe.getPowerUsage();

        System.out.print(printCalcResults(recipe, quantity, totalAmountIn, machineCount, powerUsage));

        // verify ingredient isn't in ignoredIngredient array
        for (String ingredient : ignoredIngredient) {
            if (recipe.getIngredient().equalsIgnoreCase(ingredient)) { // base case
                System.out.printf("Collect %.0f %s manually.\n\n", totalAmountIn, recipe.getIngredient());
                displayMenu(); // sends user back to beginning of program after the calculation is done
            }
        }

        // use recursion to identify, if any, additional recipes that need to be created to get to final product
        for (Recipe resource : ResourcesAvailable.getRecipeArrayList()) {
            if (recipe.getIngredient().equalsIgnoreCase(resource.getProduct())) {
                tempRecipe = resource;
                break;
            }
        }

        if (tempRecipe != null) {
            return calcResources(tempRecipe, tempAmountIn);
        }
        else {
            System.out.printf("Collect %.0f %s manually (no current recipe found).\n", totalAmountIn, recipe.getIngredient());
            return null;
        }
    } // end calcResources()

    public String printCalcResults(Recipe recipe, int qty, double amountIn, double machines, double power) {
        return String.format("\nTo craft %d %s(s) / min:\n" +
                        "\t- You need %.0f %s / min\n" +
                        "\t- Use %.3f %s(s)\n" +
                        "\t- Power usage: %.3f MW\n",
                qty, recipe.getRecipe(), amountIn, recipe.getIngredient(), machines, recipe.getMachine(), power);
    }
}