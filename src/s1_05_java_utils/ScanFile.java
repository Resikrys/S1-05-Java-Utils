package s1_05_java_utils;

import java.io.File;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ScanFile {

    private static File folder = new File("C:\\Users\\elyri\\IdeaProjects\\S1_05_Java_Utils\\src\\s1_05_java_utils");
    private static File[] listOfFiles = folder.listFiles();

    private static List<String> filesInFolder = new ArrayList<String>();

    public static void addFiles() {
        for(int i = 0; i < listOfFiles.length; i++) {
            filesInFolder.add(listOfFiles[i].getName());
        }
    }

    public static void alphabeticOrderList() {
        filesInFolder.stream().sorted().forEachOrdered(System.out::println);
    }



    // Print Current Working Directory using File Systems
//    static void printCurrentWorkingDirectoryUsingFileSystems() {
//
//        Path currentDirectoryPath = FileSystems.getDefault().getPath("");
//        String currentDirectoryName = currentDirectoryPath.toAbsolutePath().toString();
//        System.out.println("Current Directory = \"" + currentDirectoryName + "\"");
//    }
//
//    public static void findAllFilesInFolder(File folder) {
//        for (File file : Objects.requireNonNull(folder.listFiles())) {
//            if (!file.isDirectory()) {
//                System.out.println(file.getName());
//            } else {
//                findAllFilesInFolder(file);
//            }
//        }
//    }
}
