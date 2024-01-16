import animals.Animal;
import behaviours.IFlyer;
import behaviours.ISwimmer;
import behaviours.IWalker;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private final List<Animal> animals;

    public Zoo() {
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void makeAllAnimalsSleep() {
        animals.forEach(animal -> animal.sleep());
    }

    public void makeAllAnimalsWakeUp() {
        animals.forEach(animal -> animal.wakeUp());
    }

    public void makeAllAnimalsEat() {
       animals.forEach(animal -> animal.eat());
    }

    public int getNumberOfAnimals() {
        return animals.size();
    }

    private List<Animal> getWalkers() {
        return animals.stream().filter(Animal::isWalker).toList();
    }

    private List<Animal> getSwimmers() {
        return animals.stream().filter(Animal::isSwimmer).toList();
    }

    private List<Animal> getFlyers() {
        return animals.stream().filter(Animal::isFlyer).toList();
    }

    public void makeSwimmersSwim() {
        getSwimmers().forEach(swimmer -> ((ISwimmer) swimmer).swim());
    }

    public void makeWalkersWalk() {
        getWalkers().forEach(walker -> ((IWalker) walker).walk());
    }

    public void makeFlyersFly() {
        getFlyers().forEach(flyer -> ((IFlyer) flyer).fly());
    }

    void showAnimalsCountByCategory(){
        System.out.println(
                "Number of swimmers in the zoo: " +  getSwimmers().size() + "\n" +
                "Number of flyers in the zoo: " +  getFlyers().size() + "\n" +
                "Number of walkers in the zoo: " +  getWalkers().size()
                );
    }
}