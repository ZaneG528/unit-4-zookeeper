import java.util.ArrayList;

public class Cage {

    // ===== Instance Variables =====
    private ArrayList<Animal> animals;

    // ===== Constructors =====

    /**
     * No-arg constructor:
     * REQUIRED: create animals list
     * REQUIRED: add at least 1 random Animal
     */
    public Cage() {
        // TODO: instantiate animals
        // TODO: add at least one new Animal() to the list
        animals = new ArrayList<Animal>();
        Animal animal = new Animal();
        animals.add(animal);
    }

    /**
     * Parameterized constructor:
     * REQUIRED: create animals list
     * REQUIRED: add the provided animal to the list
     */
    public Cage(Animal animal) {
        // TODO: instantiate animals
        // TODO: add provided animal
        animals = new ArrayList<Animal>();
        animals.add(animal);
    }

    // ===== Getters / Setters (careful!) =====
    public int getNumAnimals() {
        // TODO: return the number of animals in the cage
        return animals.size();
    }

    public Animal getAnimalAtIndex(int index) {
        // TODO: return the animal at index (or null if invalid)
        if(index <animals.size()&&index>=0){
           return animals.get(index);
        }
        else{
            return null;
         }
        }

    // ===== Behaviors =====

    /**
     * REQUIRED: add an animal;
     */
    public void addAnimal(Animal animal) {
       animals.add(animal);
    }

    /**
     * REQUIRED: remove an animal if it exists; return true if removed.
     */
    public void removeAnimal(Animal animal) {
        if(animals.contains(animal)){
            animals.remove(animal);
        }
    }
    public boolean containsAnimal (Animal animal){
      if(animals.contains(animal)){
         return true;
      } 
      else
      return false;
    }

    @Override
    public String toString() {
        // TODO: return a friendly description including all animals
        // Example: "Cage with 3 animals: [Animal{...}, Animal{...}]"
        return "A cage with "+animals.size()+" animal(s): "+animals;
        //+ animals.getNumAnimals()+animals;
    }
}  