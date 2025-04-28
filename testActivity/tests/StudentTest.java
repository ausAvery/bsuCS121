import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    private Student student = new Student("Austin", 1008);

    @org.junit.jupiter.api.Test
    void getStuName() {
        assertEquals("Austin", student.getStuName());
    }

    @org.junit.jupiter.api.Test
    void getStuID() {
        assertEquals(1008, student.getStuID());
    }
}