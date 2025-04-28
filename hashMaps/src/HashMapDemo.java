import java.util.HashMap;

public class HashMapDemo {
    private HashMap<String, Integer> gradesMap = new HashMap<>();

    public void addToGradesList(String course, int score) {
        gradesMap.put(course, score);
    }

    public void removeFromGradesList(String course) {
        gradesMap.remove(course);
    }
    public String getCourseScore(String course) {
        String score = null;
        if (gradesMap.containsKey(course)) {
            score = String.valueOf(gradesMap.get(course));
        }
        return score;
    }

    public StringBuilder getAllScores() {
        StringBuilder allScores = new StringBuilder();
        gradesMap.forEach((course, score) -> {
            allScores.append(String.format("Course: %s | Grade: %d\n", course, score));
        });
        return allScores;
    }
}
