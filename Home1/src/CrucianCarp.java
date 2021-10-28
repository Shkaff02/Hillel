public class CrucianCarp extends Animal implements AnimalFeed {
    @Override
    public void feed() {
        System.out.println("I like this food!");
    }

    @Override
    public void move () {
        System.out.println("I am a professional swimmer!");
    }
}