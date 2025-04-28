public class ReviewTest {
    public static void main(String[] args) {
        System.out.println("=== Array Review ===");
        ArrayReview ar = new ArrayReview();
        ar.collectData();
        ar.assignWordRatings();
        ar.printTable();

        System.out.println("\n=== ArrayList Review ===");
        ArrayListReview alr = new ArrayListReview();
        alr.collectData();
        alr.assignWordRatings();
        alr.printTable();

        System.out.println("\n=== HashMap Review ===");
        HashMapReview hmr = new HashMapReview();
        hmr.collectData();
        hmr.printTable();
    }
}
