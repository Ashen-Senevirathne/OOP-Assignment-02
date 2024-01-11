class SeaBirdFactory implements IAnimalFactory {
    @Override
    public Animal createAnimal(String name) {
        return new SeaBird(name);
    }
}