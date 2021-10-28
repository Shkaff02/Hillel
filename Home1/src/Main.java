public class Main {
    public static void main(String[] args) {
        // создаем объект класса Lion, заполняем его поля и вызываем методы в конструкторе
        Lion simba = new Lion("Simba", 14, "meat", true);
        simba.hasOwner = false;
        simba.weight = 34;
        System.out.println("-----------------------------------------------------");

        // создаем автомат для выдачи корма, который узнает количество необходимых порций и выдает сумму.
        FeedMachine machine = new FeedMachine();
        machine.getFood();

    }
}