public class UniversityMember {
    // instance variables
    protected String firstName;
    protected String lastName;
    protected int age;

    // constructor
    public UniversityMember(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // methods
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("Name(last, first): %s, %s\n" +
                "Age: %d\n", lastName, firstName, age);
    }
}
