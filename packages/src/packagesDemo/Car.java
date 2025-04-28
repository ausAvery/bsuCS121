package packagesDemo;

public class Car {
    // instance variables
    public int year;
    public String make;
    private String model;
    private String color;
    private String condition;

    // constructor
    public Car(int year, String make, String model, String color, String condition) {
        this.year = year;
        this.make = make;
        this.model = model;
        this.color = color;
        this.condition = condition;
    }

    public void printCarInfo() {
        System.out.printf("Year: %d\n" +
                "Make: %s\n" +
                "Model: %s\n" +
                "Color: %s\n" +
                "Condition: %s\n",
                year, make, model, color, condition);
    }

    private void printMakeAndModel() {
        System.out.printf("Make: %s\n" +
                "Model: %s\n",
                make, model);
    }

    protected void printCondition() {
        System.out.printf("Make: %s\n" +
                "Model: %s\n" +
                "Condition: %s\n",
                make, model, condition);
    }

    void printYearMakeModel() {
        System.out.printf("%d %s %s\n",
                year, make, model);
    }
}
