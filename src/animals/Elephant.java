package animals;

import behaviours.IWalker;

public class Elephant extends Animal implements IWalker {
    public Elephant(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(this.getClassName() + " - " + this.getName() + " eat leaves.");
    }

    @Override
    public void walk() {
        System.out.println(this.getClassName() + " - " + this.getName() + " walking.");
    }
}