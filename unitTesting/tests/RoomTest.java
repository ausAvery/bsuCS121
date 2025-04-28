import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {
    private Room hall = new Room("Hall");

    @org.junit.jupiter.api.Test
    void getName() {
        assertEquals("Hall", hall.getName());
    }

    @Test
    void checkContents() {
        assertFalse(hall.checkContents());
    }

    @Test
    void getContent() {
        assertEquals("", hall.getContent());
    }
}