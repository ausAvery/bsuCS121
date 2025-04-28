public class UndergradStudent extends Student {
    private String major;

    // constructor
    public UndergradStudent(String name, int id, String major) {
        super(name, id);
        this.major = major;
    }

    // methods
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return String.format("Undergraduate Student - Major: %s\n", major);
    }
}
