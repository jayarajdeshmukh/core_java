package fileHandling.fileDemos;

import java.io.File;

public class Demo5DeleteFolder {
    public static void main(String[] args) {
        String path = "C:\\ISJ009\\tempfiles";
        File folder = new File(path);
        boolean deleted = folder.delete();
        System.out.println(deleted);
    }
}
