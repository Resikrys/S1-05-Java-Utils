package s1_05_java_utils;

import java.io.File;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.util.*;

public class ScanFile {

    private static File folder = new File("C:\\Users\\elyri\\IdeaProjects\\S1_05_Java_Utils\\src\\s1_05_java_utils");
    public static File rootFolder = new File("C:\\Program Files");
    private static File[] listOfFiles = folder.listFiles();

    private static List<String> filesInFolder = new ArrayList<String>();

    //Exercise 1
    public static void addFiles() {
        for(int i = 0; i < listOfFiles.length; i++) {
            filesInFolder.add(listOfFiles[i].getName());
        }
    }

    public static void alphabeticOrderList() {
        filesInFolder.stream().sorted().forEachOrdered(System.out::println);
    }

    public static void addAndOrderFile() {
        addFiles();
        alphabeticOrderList();
    }

    //Exercise 2
    public static void findAllFilesInFolder(File folder) {
        findAllFilesInFolder(folder, "");
    }

    private static void findAllFilesInFolder(File folder, String indent) {
        File[] files = folder.listFiles();

        if (files == null) return;

        // Ordenar por nombre alfabéticamente
        Arrays.sort(files, Comparator.comparing(File::getName, String.CASE_INSENSITIVE_ORDER));

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        for (File file : files) {
            String lastMod = sdf.format(new Date(file.lastModified()));
            if (file.isDirectory()) {
                System.out.println(indent + "D: " + file.getName() + " [ " + lastMod + " ]");
                findAllFilesInFolder(file, indent + "    "); // Aumentar sangría
            } else {
                System.out.println(indent + "F: " + file.getName() + " [ " + lastMod + " ]");
            }
        }
    }

//    public static void findAllFilesInFolder(File folder) {
//        List<String> filesInFolder = new ArrayList<String>();
//        try{
//            for (File file : Objects.requireNonNull(folder.listFiles())) {
//                if (!file.isDirectory()) {
//                    filesInFolder.add("F: " + file.getName() + " [ " + file.lastModified() + " ] ");
//                } else {
//                    filesInFolder.add("D: " + file.getName() + " [ " + file.lastModified() + " ] ");
//                    findAllFilesInFolder(file);
//                }
//            }
//            filesInFolder.stream().sorted().forEachOrdered(System.out::println);
//        } catch(Exception e) {
//
//        }
//
//    }



    // Print Current Working Directory using File Systems
//    static void printCurrentWorkingDirectoryUsingFileSystems() {
//
//        Path currentDirectoryPath = FileSystems.getDefault().getPath("");
//        String currentDirectoryName = currentDirectoryPath.toAbsolutePath().toString();
//        System.out.println("Current Directory = \"" + currentDirectoryName + "\"");
//    }

}

