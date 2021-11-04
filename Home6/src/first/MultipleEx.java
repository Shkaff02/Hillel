package first;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MultipleEx {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("filename");
        }catch (FileNotFoundException ex){
            System.out.println("Oops, FileNotFoundException caught");
        }catch (IOException e) {
            System.out.println("IOException");
        }

    }
}
