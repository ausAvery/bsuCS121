public class Laptop implements Computer {
    // instance variables
    private String gpu;
    private String cpu;
    private int ram;
    private int sizeScreen;

    // constructor
    public Laptop(int screenSize, String gpu, String cpu, int ram) {
        this.gpu = gpu;
        this.cpu = cpu;
        this.ram = ram;
        this.sizeScreen = screenSize;
    }

    // methods
    public int getSizeScreen() {
        return sizeScreen;
    }

    public void setSizeScreen(int sizeScreen) {
        this.sizeScreen = sizeScreen;
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
        return "HP\n";
    }
}
