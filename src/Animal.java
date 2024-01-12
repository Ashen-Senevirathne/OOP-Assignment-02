import java.util.List;

// Animal interface
public abstract class Animal {
    protected String name;
    protected List<String> categories;
    protected boolean isSleeping;

    public Animal(String name, List<String> categories) {
        this.name = name;
        this.categories = categories;
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
        return categories.contains("swimmer");
    }

    public boolean isFlyer() {
        return categories.contains("flyer");
    }

    public boolean isWalker() {
        return categories.contains("walker");
    }

    public void makeMove() {
        if (isSwimmer()) {
            swim();
        }

        if (isFlyer()) {
            fly();
        }

        if (isWalker()) {
            walk();
        }
    }

    public void swim(){
        System.out.println(this.getClass().getSimpleName() + " - " + name  + " swimming.");
    }

    public void fly(){
        System.out.println(this.getClass().getSimpleName() + " - " + name  + " flying.");
    }

    public void walk(){
        System.out.println(this.getClass().getSimpleName() + " - " + name  + " walking");
    }
}