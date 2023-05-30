package serialize;

import com.fasterxml.jackson.annotation.JsonProperty;
public class PhoneDetailsAnnotated {
    @JsonProperty("phone_name")
    private String name;

    @JsonProperty("display_size")
    private String displaySize;

    @JsonProperty("internal_memory")
    private String memory;


    // Needs canonical constructor for  serialization!!
    public PhoneDetailsAnnotated(String name, String displaySize, String memory) {
        this.name = name;
        this.displaySize = displaySize;
        this.memory = memory;
    }
    // Needs default constructor for deserialization!!
    public PhoneDetailsAnnotated() {
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
        return "PhoneDetailsAnnotated{" +
                "name='" + name + '\'' +
                ", displaySize='" + displaySize + '\'' +
                ", memory='" + memory + '\'' +
                '}';
    }
}
