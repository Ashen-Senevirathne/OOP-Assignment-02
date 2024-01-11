import java.util.List;

// Animal interface
public abstract class Animal {
    private String name;
    private List<String> categories;
    private boolean isSleeping;

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
}