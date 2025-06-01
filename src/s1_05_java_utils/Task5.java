package s1_05_java_utils;

import static s1_05_java_utils.ScanFile.*;

public class Task5 {
    public static void main(String[] args) {

        Person p = new Person("Allegretto", 23);
        String filepath = "persona.ser";

        ScanFile.addAndOrderFile();
       // ScanFile.findAllFilesInFolder(ScanFile.rootFolder);
        ScanFile.readAndPrintTextFile(ScanFile.fileEx4);

        // Serialitzar
        serializerObject(p, filepath);

        // Desserialitzar
        Object obj = deserializerObject(filepath);
        if (obj instanceof Person) {
            System.out.println(obj);
        }

    }
}
