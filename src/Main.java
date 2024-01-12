import java.util.List;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        zoo.addAnimal(new Elephant("Tom"));
        zoo.addAnimal(new Fish("Nemo"));
        zoo.addAnimal(new SeaBird("Seagull"));
        zoo.addAnimal(new Parrot("Polly"));
        System.out.println("----------------------------------------------------------------------------");

        zoo.makeAllAnimalsSleep();
        System.out.println("----------------------------------------------------------------------------");
        zoo.makeAllAnimalsWakeUp();
        System.out.println("----------------------------------------------------------------------------");
        zoo.makeAllAnimalsEat();

        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Number of animals in the zoo: " + zoo.getNumberOfAnimals());

        IAnimalBehavior swimmerBehavior = new SwimmerBehavior();
        IAnimalBehavior flyerBehavior = new FlyerBehavior();
        IAnimalBehavior walkerBehavior = new WalkerBehavior();

        System.out.println("----------------------------------------------------------------------------");
        List<Animal> swimmers = zoo.getAnimalsWithBehavior(swimmerBehavior);
        System.out.println("Number of swimmers in the zoo: " + swimmers.size());

        System.out.println("----------------------------------------------------------------------------");
        List<Animal> flyers = zoo.getAnimalsWithBehavior(flyerBehavior);
        System.out.println("Number of flyers in the zoo: " + flyers.size());

        System.out.println("----------------------------------------------------------------------------");
        List<Animal> walkers = zoo.getAnimalsWithBehavior(walkerBehavior);
        System.out.println("Number of walkers in the zoo: " + walkers.size());
        System.out.println("----------------------------------------------------------------------------");
    }
}