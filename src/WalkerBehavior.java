class WalkerBehavior implements IAnimalBehavior {
    @Override
    public boolean matches(Animal animal) {
        return animal.isWalker();
    }
}