import java.util.List;

class SeaBird extends Animal {
    public SeaBird(String name) {
        super(name, List.of("flyer", "swimmer"));
    }

    @Override
    public void eat() {
        System.out.println(this.getClass().getSimpleName() + " - " + this.getName() + " eat small fishes!");
    }
}
