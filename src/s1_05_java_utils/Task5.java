package s1_05_java_utils;

import static s1_05_java_utils.ScanFile.*;

public class Task5 {
    public static void main(String[] args) {
        ScanFile.addAndOrderFile();
        ScanFile.findAllFilesInFolder(ScanFile.rootFolder);
        ScanFile.readAndPrintTextFile(ScanFile.fileEx4);

    }
}
