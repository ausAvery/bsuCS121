public class Room {
    private String name;
    private String contents = "";

    // constructor
    public Room(String name) {
        this.name = name;
    }

    // methods
    public String getName() {
        return name;
    }

    public boolean checkContents() {
        if (this.contents.isEmpty()) {
            return false;
        }
        else {
            return true;
        }
    }

    public String getContent() {
        return contents;
    }
}
