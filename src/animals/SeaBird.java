package animals;

import behaviours.IFlyer;
import behaviours.ISwimmer;

public class SeaBird extends Animal implements IFlyer, ISwimmer {
    public SeaBird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(this.getClass().getSimpleName() + " - " + this.getName() + " eat small fishes!");
    }

    @Override
    public void fly() {
        System.out.println(this.getClass().getSimpleName() + " - " + this.getName() + " flying.");
    }

    @Override
    public void swim() {
        System.out.println(this.getClass().getSimpleName() + " - " + this.getName() + " swimming.");
    }
}
