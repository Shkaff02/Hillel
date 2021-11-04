package first;

import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class MyException extends Exception {
    public  MyException(Throwable e) {
        initCause(e);
    }
}

class NewClass {
    public static void main(String[] args) throws MyException {
        int result = 0;
        try {
            result = getAreaValue(-1, 100);
        }catch (IllegalArgumentException e) {
            Logger.getLogger(NewClass.class.getName()).log(new LogRecord(Level.WARNING, "In counting method" +
                    "was pushed negative value"));
            throw new MyException(e);
        }
        System.out.println("Result is: " + result);
    }

    public static int getAreaValue(int x, int y) {
        if (x < 0 || y < 0) throw new IllegalArgumentException("value of 'x' or 'y' is negative!");
        return x*y;
    }
}
