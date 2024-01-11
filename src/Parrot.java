import java.util.List;

class Parrot extends Animal {
    public Parrot(String name) {
        super(name, List.of("flyer"));
    }

    @Override
    public void eat() {
        System.out.println(this.getClass().getSimpleName() + " - " + this.getName() + " eat fruits!");
    }
}