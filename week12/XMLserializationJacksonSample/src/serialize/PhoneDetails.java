package serialize;

public class PhoneDetails {
    private String name;
    private String displaySize;
    private String memory;

    // Needs canonical constructor for  serialization!!
    public PhoneDetails(String name, String displaySize, String memory) {
        this.name = name;
        this.displaySize = displaySize;
        this.memory = memory;
    }
    // Needs default constructor for deserialization!!
    public PhoneDetails() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(String displaySize) {
        this.displaySize = displaySize;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }
// getters and setters

    @Override
    public String toString() {
        return "PhoneDetails{" +
                "name='" + name + '\'' +
                ", displaySize='" + displaySize + '\'' +
                ", memory='" + memory + '\'' +
                '}';
    }
}
