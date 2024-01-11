import java.util.List;

class Fish extends Animal {
    public Fish(String name) {
        super(name, List.of("swimmer"));
    }

    @Override
    public void eat() {
        System.out.println(this.getClass().getSimpleName() + " - " + this.getName() + " eat small fishes and leaves!");
    }
}