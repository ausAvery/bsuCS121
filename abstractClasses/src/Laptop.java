public class Laptop extends Computer {
    // instance variables
    private int sizeScreen;

    // constructor
    public Laptop(int screenSize, String gpu, String cpu, int ram) {
        super(gpu, cpu, ram);
        this.sizeScreen = screenSize;
    }

    // methods
    public int getSizeScreen() {
        return sizeScreen;
    }

    public void setSizeScreen(int sizeScreen) {
        this.sizeScreen = sizeScreen;
    }

    @Override
    public String computerBrand() {
        if (sizeScreen <= 15) {
            return "Dell\n";
        }
        else {
            return "HP\n";
        }
    }
}
