package fileHandling.fileDemos;

import java.io.File;

public class Demo4DeleteFile {
    public static void main(String[] args) {
        String path = "abc1.txt";
        File file = new File(path);
        boolean deleted = file.delete();
        System.out.println(deleted);
    }
}
