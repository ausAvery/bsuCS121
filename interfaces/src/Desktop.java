public class Desktop implements Computer {
    // instance variables
    private String gpu;
    private String cpu;
    private int ram;
    private String towerSize;

    // constructor
    public Desktop(String gpu, String cpu, int ram, String towerSize) {
        this.gpu = gpu;
        this.cpu = cpu;
        this.ram = ram;
        this.towerSize = towerSize;
    }

    // methods
    public String getTowerSize() {
        return towerSize;
    }

    public void setTowerSize(String towerSize) {
        this.towerSize = towerSize;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String computerBrand() {
        return "Lenovo\n";
    }
}