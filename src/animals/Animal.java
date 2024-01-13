package animals;

import behaviours.IFlyer;
import behaviours.ISwimmer;
import behaviours.IWalker;

// animal.Animal interface
public abstract class Animal {
    protected String name;
    protected boolean isSleeping;

    public Animal(String name) {
        this.name = name;
        this.isSleeping = false;
    }

    public String getName() {
        return name;
    }

    public void sleep() {
        isSleeping = true;
        System.out.println(this.getClass().getSimpleName() + " - " + name  + " is sleeping.");
    }

    public void wakeUp() {
        isSleeping = false;
        System.out.println(this.getClass().getSimpleName() + " - " + name  + " woke up.");
    }

    public abstract void eat();

    public boolean isSwimmer() {
        return this instanceof ISwimmer;
    }

    public boolean isFlyer() {
        return this instanceof IFlyer;
    }

    public boolean isWalker() {
        return this instanceof IWalker;
    }

}