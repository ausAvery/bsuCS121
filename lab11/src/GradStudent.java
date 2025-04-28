public class GradStudent extends Student {
    private String dissertationTitle;

    // constructor
    public GradStudent(String name, int id, String dissertationTitle) {
        super(name, id);
        this.dissertationTitle = dissertationTitle;
    }

    // methods
    public String getDissertationTitle() {
        return dissertationTitle;
    }

    public void setDissertationTitle(String dissertationTitle) {
        this.dissertationTitle = dissertationTitle;
    }

    @Override
    public String toString() {
        return String.format("Graduate Student - Dissertation Title: %s\n", dissertationTitle);
    }
}
