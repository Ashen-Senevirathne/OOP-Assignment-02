package animals;

import behaviours.IFlyer;

public class Parrot extends Animal implements IFlyer {
    public Parrot(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(this.getClass().getSimpleName() + " - " + this.getName() + " eat fruits!");
    }

    @Override
    public void fly() {
        System.out.println(this.getClass().getSimpleName() + " - " + this.getName() + " flying.");
    }
}