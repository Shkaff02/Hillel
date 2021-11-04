package second;

public class App14 {
    public static void main(String[] args) throws Throwable {
        try {
            Throwable t = new Exception();
            throw t;
        }catch (Exception e) {
            System.out.println("Catched!");
        }
    }
}
