package Lessons;

import java.util.ArrayList;
import java.util.List;

public class VetClinic {
    private final ArrayList<Animal> animals;

    public VetClinic() {
        this.animals = new ArrayList<>();
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public VetClinic addNewAnimal(Animal animal) {
        animals.add(animal);
        return this;
    }

    public List<Animal> getFlyAnimals() {
        List<Animal> result = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal instanceof Flyable) {
                result.add(animal);
            }
        }
        return result;
    }

    public List<Animal> getGoAnimals() {
        List<Animal> result = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal instanceof Runnable) {
                result.add(animal);
            }
        }
        return result;
    }

    public List<Animal> getSpeakAnimals() {
        List<Animal> result = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal instanceof Speakable) {
                result.add(animal);
            }
        }
        return result;
    }

    public List<Animal> getSwimAnimals() {
        List<Animal> result = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal instanceof Swimable) {
                result.add(animal);
            }
        }
        return result;
    }



}
