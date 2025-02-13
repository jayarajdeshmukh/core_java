package fileHandling.fileDemos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Demo6FileWriter {
    public static void main(String[] args) throws IOException {
        File myfile = new File("jay.txt");
        boolean isFileCreated = myfile.createNewFile();
        System.out.println("File created" + isFileCreated);

        FileWriter fileWriter = new FileWriter("jay.txt");
        fileWriter.write("this is our file writer");
        fileWriter.close();
    }
}

