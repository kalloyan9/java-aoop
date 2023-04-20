package blogic;

import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;

public class AnimalInstance {
    // data members
    private int animalKey;
    private String animalName;
    private int animalAge;

    public final String INSTANCE_ID;
    private static int count = 0;

    public AnimalInstance(int animalKey, String animalName, int animalAge) {
        this.animalKey = animalKey;
        this.animalName = animalName;
        this.animalAge = animalAge;
        INSTANCE_ID = String.format("%s %03d", animalName, count++);
    }

    public String getInstanceId() {
        return String.format("%s ,Възраст: ", "%d", INSTANCE_ID, animalAge);
    }

    public int getAnimalKey() {
        return animalKey;
    }

    public void setAnimalKey(int animalKey) {
        this.animalKey = animalKey;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        if (animalName != null) {
            this.animalName = animalName;
        }
    }

    public int getAnimalAge() {
        return animalAge;
    }

    public void setAnimalAge(int animalAge) {
        this.animalAge = animalAge;
    }
}
