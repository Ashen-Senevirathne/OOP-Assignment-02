class ParrotFactory implements IAnimalFactory {
    @Override
    public Animal createAnimal(String name) {
        return new Parrot(name);
    }
}