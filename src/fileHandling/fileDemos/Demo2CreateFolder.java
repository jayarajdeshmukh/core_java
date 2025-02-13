package fileHandling.fileDemos;

import java.io.File;

class Demo2 {
    public static void main(String[] args) {
        String path = "C:\\ISJ009\\tempfiles";
        File folder = new File(path);
        boolean isFolderCreated = folder.mkdir();
        System.out.println(isFolderCreated);

    }
}
