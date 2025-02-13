package fileHandling.fileDemos;

import java.io.File;
import java.io.IOException;

public class Demo3FileLength {
    public static void main(String[] args) throws IOException {
        String path = "abc1.txt";
        File file = new File(path);
        boolean isCreated = file.createNewFile();
        System.out.println("file is created " + isCreated);
        System.out.println("file lenght" + file.length());
    }
}
