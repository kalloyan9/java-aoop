package blogic;

import java.security.interfaces.XECKey;

public class Animal {
    // constants
    public final static String[] REGIONS = {"Africa", "Asia", "Australia", "Europe", "America"};

    // data members
    private String name;
    private AnimalType animalType;
    private boolean predator;
    private String region;
    private boolean endangered;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AnimalType getAnimalType() {
        return animalType;
    }

    public void setAnimalType(AnimalType animalType) {
        this.animalType = animalType;
    }

    public boolean isPredator() {
        return predator;
    }

    public void setPredator(boolean predator) {
        this.predator = predator;
    }

    public String getRegion() {
        return region;
    }
// ID = String.format("%s %03d", "animalName", counter++)
    public void setRegion(String region) {
        boolean unknownRegion = true;
        if (region == null) {
            this.region = "Unknown";
            return;
        }

        for (int i = 0; i < REGIONS.length; ++i) {
            if (REGIONS[i].equals(region)) {
                unknownRegion = false;
                break;
            }
        }

        if (unknownRegion) {
            this.region = "Unknown";
        } else {
            this.region = region;
        }
    }

    private Animal(String name, AnimalType animalType, boolean predator, String region, boolean endangered) {
        setName(name);
        setAnimalType(animalType);
        setPredator(predator);
        setRegion(region);
        setEndangered(endangered);
    }

    public String toString() {
        String retString = "Животно{" +
                name + ",тип= " + animalType.getTypeName() +
                ",хищник= " + (predator ? "Да" : "Не") +
                ",район= " + region + "застрашен= " +
                (endangered ? "Да" : "Не") + "}";
        return retString;
    }

    public boolean isEndangered() {
        return endangered;
    }

    public void setEndangered(boolean endangered) {
        this.endangered = endangered;
    }
}
