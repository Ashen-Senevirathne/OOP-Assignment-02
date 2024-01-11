class ElephantFactory implements IAnimalFactory {
    @Override
    public Animal createAnimal(String name) {
        return new Elephant(name);
    }
}