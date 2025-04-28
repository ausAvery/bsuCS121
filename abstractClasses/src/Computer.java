public abstract class Computer {
    // instance variables
    private String gpu;
    private String cpu;
    private int ram;

    // constructor
    public Computer(String gpu, String cpu, int ram) {
        this.gpu = gpu;
        this.cpu = cpu;
        this.ram = ram;
    }

    // methods
    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public abstract String computerBrand();
}
