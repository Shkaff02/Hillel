public class Lion extends Animal implements AnimalVoice {

    boolean isPrideLeader;

    Lion(String name, int age, String foodType, boolean isPrideLeader) {
        this.name = name;
        System.out.println("My name is " + name);
        System.out.println("I am " + age + " years old");
        this.age = age;
        System.out.println("I looove " + foodType);
        this.foodType = foodType;
        System.out.println("And I am a pride leader " + isPrideLeader);
        this.isPrideLeader = isPrideLeader;
        eat();
        move();
        voice();
    }

    @Override
    public void eat() {
        System.out.println("I love eat meat!");
    }

    @Override
    public void move() {
        System.out.println("I am not the fastest predator :(");
    }

    @Override
    public void voice() {
        System.out.println("Roaaarrr!!!");
    }

}