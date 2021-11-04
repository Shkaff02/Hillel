package first;

import com.sun.source.tree.NewClassTree;

import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
//        System.out.println(getAreaValue(-1, 100));
        int result = 0;
        try {
            result = getAreaValue(-1, 100);
        }catch (IllegalArgumentException e){
            Logger.getLogger(NewClassTree.class.getName()).log(new LogRecord(Level.WARNING, "В метод вычисления площади " +
                    "был передан аргумент с негативным значением!"));
            throw e;
        }
        System.out.println("Result is: " + result);
    }

    public static  int getAreaValue(int x, int y){
        if (x < 0 || y < 0) throw new IllegalArgumentException("value of 'x' or 'y' is negative");
        return x*y;
    }

}
