class FishFactory implements IAnimalFactory {
    @Override
    public Animal createAnimal(String name) {
        return new Fish(name);
    }
}