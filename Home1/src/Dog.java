public class Dog extends Animal implements AnimalVoice, AnimalPet, AnimalFeed{
    String nickname;


    @Override
    public void feed() {
        System.out.println("Thanks sir, this bone is delicious!");
    }

    @Override
    public void pet() {
        System.out.println("I like it!");
    }

    @Override
    public void voice() {
        System.out.println("Bark-bark!");
    }
}