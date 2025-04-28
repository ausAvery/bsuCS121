public class Main {
    public static void main(String[] args) {
        DataStructure ds = new DataStructure();

        ds.addStudent("Alice");
        ds.addStudent("Bob");
        ds.addStudent("Charlie");

        ds.addAge(18);
        ds.addAge(19);
        ds.addAge(20);

        ds.addMajorGpa("CS", 3.5);
        ds.addMajorGpa("Math", 3.8);
        ds.addMajorGpa("Bio", 3.2);

        ds.addNationality("American");
        ds.addNationality("Canadian");
        ds.addNationality("Mexican");

        ds.addHometown("Denver");
        ds.addHometown("Austin");
        ds.addHometown("Seattle");

        ds.addHomeState("CO");
        ds.addHomeState("TX");
        ds.addHomeState("WA");

        System.out.println("=== Initial ===");
        ds.printStudentList();
        ds.printAgeList();
        ds.printMajorGpaMap();
        ds.printNationalityList();
        ds.printHometownStack();
        ds.printHomeStateQueue();

        ds.removeStudent();
        ds.removeAge();
        ds.removeMajor("Math");
        ds.removeNationality();
        ds.removeHometown();
        ds.removeHomeState();
        
        System.out.println("\n=== After Removal ===");
        ds.printStudentList();
        ds.printAgeList();
        ds.printMajorGpaMap();
        ds.printNationalityList();
        ds.printHometownStack();
        ds.printHomeStateQueue();
    }
}
