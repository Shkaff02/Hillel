import java.util.Scanner;

public class FeedMachine {
    private String animalType = "fish";
    private int portion;
    private int sum;

    public void getFood() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter number of portions: ");
        this.portion = scanner.nextInt();
        if (animalType.equals("fish")) {
            sum = 30 * portion;
            System.out.println("Total sum is " + sum);
        }
    }
}