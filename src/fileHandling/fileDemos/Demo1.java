package fileHandling.fileDemos;

import java.io.File;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        //Absolute path : complete path --> C:\Work\ISJ010\core-java\src\fileHandling\Demo1.java
         String path = "abc1.txt";
        File file = new File(path);
        boolean isFileCreated = file.createNewFile();
        System.out.println("File created" + isFileCreated);
    }
}
