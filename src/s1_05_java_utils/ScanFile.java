package s1_05_java_utils;

import java.io.*;
import java.nio.file.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class ScanFile {

    private static File folder = new File("C:\\Users\\elyri\\IdeaProjects\\S1_05_Java_Utils\\src\\s1_05_java_utils");
    private static File[] listOfFiles = folder.listFiles();
    private static List<String> filesInFolder = new ArrayList<String>();

    public static File rootFolder = new File("C:\\Users\\elyri\\IdeaProjects");
    public static File fileEx4 = new File("C:\\Users\\elyri\\IdeaProjects\\S1_05_Java_Utils\\src\\s1_05_java_utils\\Task5_Ex4.txt");



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

    //Exercise 2 + 3
    public static void findAllFilesInFolder(File folder) {
        findAllFilesInFolder(folder, "");
    }

    private static void findAllFilesInFolder(File folder, String indent) {
        File[] files = folder.listFiles();

        if (files == null) return;

        Arrays.sort(files, Comparator.comparing(File::getName, String.CASE_INSENSITIVE_ORDER));

        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        for (File file : files) {
            String lastModification = date.format(new Date(file.lastModified()));
            String text;
            if (file.isDirectory()) {
                text = indent + "D: " + file.getName() + " [ " + lastModification + " ]\n";
                System.out.print(text);
                try {
                    Files.writeString(Paths.get("C:/Users/elyri/IdeaProjects/S1_05_Java_Utils/textExercise3.txt"), text, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
                } catch (Exception e) {

                }
                findAllFilesInFolder(file, indent + "    ");
            } else {
                text = indent + "F: " + file.getName() + " [ " + lastModification + " ]\n";
                System.out.print(text);
                try {
                    Files.writeString(Paths.get("C:/Users/elyri/IdeaProjects/S1_05_Java_Utils/textExercise3.txt"), text, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
                } catch (Exception e) {

                }
            }
        }
    }

    //Exercise 4
    public static void readAndPrintTextFile(File file) {
        if (!file.exists() || !file.getName().endsWith(".txt")) {
            System.out.println("File not found.");
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            System.out.println("File content:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error at file reading: " + e.getMessage());
        }
    }

    //Exercise 5
    public static void serializerObject(Object obj, String filepath) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filepath))) {
            out.writeObject(obj);
            System.out.println("Object serialized at " + filepath);
        } catch (IOException e) {
            System.out.println("Error with serialization: " + e.getMessage());
        }
    }

    public static Object deserializerObject(String filepath) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filepath))) {
            Object obj = in.readObject();
            System.out.println("Object deserialized.");
            return obj;
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error with deserialization: " + e.getMessage());
            return null;
        }
    }
}
