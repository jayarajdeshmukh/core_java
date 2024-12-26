package ExceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("abc");
        FileInputStream fileInputStream = new FileInputStream(file);
        System.out.println("rest of the main");
    }
}
