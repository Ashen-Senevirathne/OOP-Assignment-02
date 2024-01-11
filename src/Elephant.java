import java.util.List;

class Elephant extends Animal {
    public Elephant(String name) {
        super(name, List.of("walker"));
    }

    @Override
    public void eat() {
        System.out.println(this.getClass().getSimpleName() + " - " + this.getName() + " eat leaves!");
    }
}