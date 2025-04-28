import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DataStructure {
    private ArrayList<String> studentList = new ArrayList<>();
    private int[] ageList = new int[3];
    private HashMap<String, Double> majorGpaMap = new HashMap<>();
    private LinkedList<String> nationalityList = new LinkedList<>();
    private Stack<String> hometownStack = new Stack<>();
    private Queue<String> homeStateQueue = new LinkedList<>();

    private int ageIndex = 0;

    public void addStudent(String name) {
        studentList.add(name);
    }

    public void removeStudent() {
        if (!studentList.isEmpty()) {
            studentList.remove(0);
        }
    }

    public void printStudentList() {
        System.out.println("Students: " + studentList);
    }

    public void addAge(int age) {
        if (ageIndex < ageList.length) {
            ageList[ageIndex] = age;
            ageIndex++;
        } else {
            System.out.println("Age list is full.");
        }
    }

    public void removeAge() {
        if (ageIndex > 0) {
            ageIndex--;
            ageList[ageIndex] = 0;
        }
    }

    public void printAgeList() {
        System.out.print("Ages: ");
        for (int i = 0; i < ageIndex; i++) {
            System.out.print(ageList[i] + " ");
        }
        System.out.println();
    }

    public void addMajorGpa(String major, double gpa) {
        majorGpaMap.put(major, gpa);
    }

    public void removeMajor(String major) {
        majorGpaMap.remove(major);
    }

    public void printMajorGpaMap() {
        System.out.println("Majors and GPAs: " + majorGpaMap);
    }

    public void addNationality(String nationality) {
        nationalityList.add(nationality);
    }

    public void removeNationality() {
        if (!nationalityList.isEmpty()) {
            nationalityList.removeFirst();
        }
    }

    public void printNationalityList() {
        System.out.println("Nationalities: " + nationalityList);
    }

    public void addHometown(String hometown) {
        hometownStack.push(hometown);
    }

    public void removeHometown() {
        if (!hometownStack.isEmpty()) {
            hometownStack.pop();
        }
    }

    public void printHometownStack() {
        System.out.println("Hometowns (Stack): " + hometownStack);
    }

    public void addHomeState(String state) {
        homeStateQueue.add(state);
    }

    public void removeHomeState() {
        if (!homeStateQueue.isEmpty()) {
            homeStateQueue.remove();
        }
    }

    public void printHomeStateQueue() {
        System.out.println("Home States (Queue): " + homeStateQueue);
    }
}
