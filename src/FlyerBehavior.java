class FlyerBehavior implements IAnimalBehavior {
    @Override
    public boolean matches(Animal animal) {
        return animal.isFlyer();
    }
}