package first;

public class Main {
    public static void main(String[] args) {
        System.out.println(getAreaValue(-1, 100));
    }

    public static  int getAreaValue(int x, int y){
        if (x < 0 || y < 0) throw new IllegalArgumentException("value of 'x' or 'y' is negative");
        return x*y;
    }
}
