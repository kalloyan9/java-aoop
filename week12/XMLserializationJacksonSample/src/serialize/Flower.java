package serialize;

public class Flower {

    private String name;

    private Color color;

    private Integer petals;

    public Flower() { }

    public Flower(String name, Color color, Integer petals) {
        this.name = name;
        this.color = color;
        this.petals = petals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Integer getPetals() {
        return petals;
    }

    public void setPetals(Integer petals) {
        this.petals = petals;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", color=" + color +
                ", petals=" + petals +
                '}';
    }
}
  enum Color {
    PINK, BLUE, YELLOW, RED;
}