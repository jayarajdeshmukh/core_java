package fileHandling.readWrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        String path = "abc.txt";
        File file = new File(path);
        FileInputStream fileInputStream = new FileInputStream(file);
        int input = fileInputStream.read();

        while (input != -1) {
            System.out.print((char) input);
            input = fileInputStream.read();
        }
        fileInputStream.close();
    }
}
