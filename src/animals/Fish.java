package animals;

import behaviours.ISwimmer;

public class Fish extends Animal implements ISwimmer {
    public Fish(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(this.getClass().getSimpleName() + " - " + this.getName() + " eat small fishes and leaves!");
    }

    @Override
    public void swim() {
        System.out.println(this.getClass().getSimpleName() + " - " + this.getName() + " swimming.");
    }
}