package packagesDemo;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car(1996, "Honda", "Prelude", "Navy", "Used");

        System.out.println(car1.year);
        System.out.println(car1.make);
        System.out.println();
//        System.out.println(car1.model);
//        System.out.println(car1.color);
//        System.out.println(car1.condition);

        car1.printCarInfo();
        System.out.println();

//        car1.printMakeAndModel();

        car1.printCondition();
        System.out.println();

        car1.printYearMakeModel();
        System.out.println();
    }
}
