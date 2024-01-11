class SwimmerBehavior implements IAnimalBehavior {
    @Override
    public boolean matches(Animal animal) {
        return animal.isSwimmer();
    }
}
