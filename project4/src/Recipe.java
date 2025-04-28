public class Recipe {
    // instance variables
    private String recipe;
    private String ingredient;
    private int amountIn;
    private String product;
    private int amountOut;
    private int outputPerMachine;
    private String machine;
    private int craftingTime;
    private int powerUsage;

    // constructor
    public Recipe(String recipe, String ingredient, int amountIn, String product, int amountOut,
                  int outputPerMachine, String machine, int craftingTime, int powerUsage) {
        this.recipe = recipe;
        this.ingredient = ingredient;
        this.amountIn = amountIn;
        this.product = product;
        this.amountOut = amountOut;
        this.outputPerMachine = outputPerMachine;
        this.machine = machine;
        this.craftingTime = craftingTime;
        this.powerUsage = powerUsage;
    }

    // methods
    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public int getAmountIn() {
        return amountIn;
    }

    public void setAmountIn(int amountIn) {
        this.amountIn = amountIn;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getAmountOut() {
        return amountOut;
    }

    public void setAmountOut(int amountOut) {
        this.amountOut = amountOut;
    }

    public int getOutputPerMachine() {
        return outputPerMachine;
    }

    public void setOutputPerMachine(int outputPerMachine) {
        this.outputPerMachine = outputPerMachine;
    }

    public String getMachine() {
        return machine;
    }

    public void setMachine(String machine) {
        this.machine = machine;
    }

    public void setCraftingTime(int craftingTime) {
        this.craftingTime = craftingTime;
    }

    public void setPowerUsage(int powerUsage) {
        this.powerUsage = powerUsage;
    }

    public int getCraftingTime() {
        return craftingTime;
    }

    public int getPowerUsage() {
        return powerUsage;
    }

    @Override
    public String toString() {
        return String.format("Recipe: %s\n" +
                        "Ingredient: %s [x%d]\n" +
                        "Product: %s [x%d]\n" +
                        "Machine needed: %s\n" +
                        "Power usage: %d MW\n" +
                        "Output of Machine: %d/min\n" +
                        "Crafting time: %d sec\n",
                recipe, ingredient, amountIn, product, amountOut, machine, powerUsage, outputPerMachine, craftingTime);
    }
} // end Recipe{}

