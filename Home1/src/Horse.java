public class Horse extends Animal implements AnimalVoice, AnimalPet, AnimalFeed {
    boolean canRide;

    @Override
    public void feed() {
        System.out.println("Mmm thanks!");
    }

    @Override
    public void pet() {
        System.out.println("Ohh, it is so cute ))");
    }

    @Override
    public void voice() {
        System.out.println("Ihohhhoooooo!");
    }

    @Override
    public void move () {
        System.out.println("I am running at a gallop!");
    }
}