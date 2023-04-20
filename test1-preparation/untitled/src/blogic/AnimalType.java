package blogic;

public enum AnimalType {
    BIRD("Птица"),
    MAMMA("Бозайник"),
    REPTILE("Влечуго"),
    FISH("Риба");

    private final String typeName;

    AnimalType(String typename) {
        this.typeName = typename;
    }

    public String getTypeName() {
        return typeName;
    }

}
