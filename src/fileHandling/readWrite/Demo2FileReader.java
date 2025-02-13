package fileHandling.readWrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class Demo2FileReader {
    public static void main(String[] args) throws IOException {
        String path = "abc.txt";
        File file = new File(path);
        FileReader fileReader = new FileReader(file);
        int input = fileReader.read();

        while (input != -1) {
            System.out.print((char) input);
            input = fileReader.read();
        }
        fileReader.close();
    }
}
