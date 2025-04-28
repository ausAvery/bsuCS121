public class Desktop extends Computer {
    // instance variables
    private String towerSize;

    // constructor
    public Desktop(String gpu, String cpu, int ram, String towerSize) {
        super(gpu, cpu, ram);
        this.towerSize = towerSize;
    }

    // methods
    public String getTowerSize() {
        return towerSize;
    }

    public void setTowerSize(String towerSize) {
        this.towerSize = towerSize;
    }

    @Override
    public String computerBrand() {
        return "Lenovo\n";
    }
}
