import animals.*;

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
        zoo.makeSwimmersSwim();
        System.out.println("----------------------------------------------------------------------------");
        zoo.makeFlyersFly();
        System.out.println("----------------------------------------------------------------------------");
        zoo.makeWalkersWalk();

        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Number of animals in the zoo: " + zoo.getNumberOfAnimals());

        System.out.println("----------------------------------------------------------------------------");
        zoo.showAnimalsCountByCategory();
        System.out.println("----------------------------------------------------------------------------");
    }
}