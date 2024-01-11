import java.util.List;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        IAnimalFactory elephantFactory = new ElephantFactory();
        IAnimalFactory fishFactory = new FishFactory();
        IAnimalFactory seaBirdFactory = new SeaBirdFactory();
        IAnimalFactory parrotFactory = new ParrotFactory();

        zoo.addAnimal(elephantFactory.createAnimal("Tom"));
        zoo.addAnimal(fishFactory.createAnimal("Nemo"));
        zoo.addAnimal(seaBirdFactory.createAnimal("Seagull"));
        zoo.addAnimal(parrotFactory.createAnimal("Polly"));
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
        for (Animal swimmer:
             swimmers) {
            System.out.println( swimmer.getClass().getSimpleName() + " - " + swimmer.getName() + " is swimming.");
        }
        System.out.println("Number of swimmers in the zoo: " + swimmers.size());

        System.out.println("----------------------------------------------------------------------------");
        List<Animal> flyers = zoo.getAnimalsWithBehavior(flyerBehavior);
        for (Animal flyer:
                flyers) {
            System.out.println( flyer.getClass().getSimpleName() + " - " + flyer.getName() + " is flying.");
        }
        System.out.println("Number of flyers in the zoo: " + flyers.size());

        System.out.println("----------------------------------------------------------------------------");
        List<Animal> walkers = zoo.getAnimalsWithBehavior(walkerBehavior);
        for (Animal walker:
                walkers) {
            System.out.println( walker.getClass().getSimpleName() + " - " + walker.getName() + " is walking.");
        }
        System.out.println("Number of walkers in the zoo: " + walkers.size());
        System.out.println("----------------------------------------------------------------------------");
    }
}