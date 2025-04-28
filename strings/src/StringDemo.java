public class StringDemo {
    public static void main(String[] args){
        String name = "John" + " " + "Doe";
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;
        int age = 20;
        double gpa = 3.8;
        char grade = 'A';
        String info = String.format("name: %s %s, age: %d, gpa: %.2f, grade: %c", firstName, lastName, age, gpa, grade);

        System.out.println(name);
        System.out.println();
        System.out.println(firstName + " " + lastName);
        System.out.println();
        System.out.println(fullName);
        System.out.println();
        System.out.println(info);
        System.out.printf("Name: %s %s\nAge: %d\nGPA: %.1f\nGrade: %c", firstName, lastName, age, gpa, grade);
    }
}
