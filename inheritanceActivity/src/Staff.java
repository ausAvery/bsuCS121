public class Staff extends UniversityMember {
    // instance variables
    private int yearsEmployeed;
    private int employeeId;

    // constructor
    public Staff(String firstName, String lastName, int age, int yearsEmployeed, int employeeId) {
        super(firstName, lastName, age);
        this.yearsEmployeed = yearsEmployeed;
        this.employeeId = employeeId;
    }

    // methods
    public int getYearsEmployeed() {
        return yearsEmployeed;
    }

    public void setYearsEmployeed(int yearsEmployeed) {
        this.yearsEmployeed = yearsEmployeed;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public String toString() {
        return String.format("Name(last, first): %s, %s\n" +
                "Age: %d\n" +
                "Years Employeed: %d\n" +
                "Employee ID: %d\n",
                lastName, firstName, age, yearsEmployeed, employeeId);
    }
}
