import java.util.ArrayList;

public class Animal {

    // ===== Instance Variables =====
    private String animalType;

    // ===== Static Variables =====
    private static int animalCount = 0;

    // Optional: a fixed menu of animal types to choose from
    private static final String[] TYPES = {
        "Lion", "Bear", "Cat", "Dog", "Horse", "Cow", "Snake", "Monkey"
    };

    // ===== Constructors =====

    /**
     * No-arg constructor:
     * REQUIRED: choose a random animal type
     * REQUIRED: increment animalCount
     */
    public Animal() {
        // TODO: set animalType to a random type from TYPES
        // TODO: increment animalCount
        int num = (int)(Math.random()*8);
        animalType = TYPES[num];
        animalCount++;

    }

    /**
     * Parameterized constructor:
     * REQUIRED: set animalType to type
     * REQUIRED: increment animalCount
     */
    public Animal(String type) {
        // TODO: set animalType
        // TODO: increment animalCount
        animalType = type;
        animalCount++;
    }

    // ===== Getters / Setters =====

    public String getAnimalType() {
        return animalType;
    }

    // ===== Class-level getter =====
    public static int getAnimalCount() {
        return animalCount;
    }

    // ===== Behaviors =====

    /**
     * REQUIRED: returns a sound based on animalType.
     * You may choose your own sounds; keep it consistent.
     */
    public String speak() {
        // TODO: return a sound depending on animalType
        // Example idea:
        // if (animalType.equals("Lion")) return "Roar!";
        if(animalType.equals("Lion"))
        return "Roar";
        else if(animalType.equals("Bear"))
        return "Grrr";
        else if(animalType.equals("Cat"))
        return "Meow";
        else if(animalType.equals("Dog"))
        return "Bark";
        else if(animalType.equals("Horse"))
        return "Neigh";
        else if(animalType.equals("Cow"))
        return "Moo";
        else if(animalType.equals("Snake"))
        return "Hiss";
        else if(animalType.equals("Monkey"))
        return "Ooh Ooh";
        else{
         return "";
        }
    }

    /**
     * OPTIONAL helper: return a random animal type from TYPES.
     */
    private static String randomAnimalType() {
        int num = (int)(Math.random()*8);
        String type = TYPES[num];
        return type;
    }

    public String toString() {
        return "A "+animalType;
    }
}