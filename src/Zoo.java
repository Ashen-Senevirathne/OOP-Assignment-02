import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animals;

    public Zoo() {
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void makeAllAnimalsSleep() {
        for (Animal animal : animals) {
            animal.sleep();
        }
    }

    public void makeAllAnimalsWakeUp() {
        for (Animal animal : animals) {
            animal.wakeUp();
        }
    }

    public void makeAllAnimalsEat() {
        for (Animal animal : animals) {
            animal.eat();
        }
    }

    public int getNumberOfAnimals() {
        return animals.size();
    }

    public List<Animal> getAnimalsWithBehavior(IAnimalBehavior behavior) {
        List<Animal> result = new ArrayList<>();
        for (Animal animal : animals) {
            if (behavior.matches(animal)) {
                result.add(animal);
            }
        }
        return result;
    }
}