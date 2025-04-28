package Animals;

public class Dog extends Animal{
    @Override
    public void makeSound() {
        System.out.println("woof woof!");
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();

        Dog dog = new Dog();
        dog.makeSound();

        Animal dog2 = new Dog();
        dog2.makeSound();
    }
}
