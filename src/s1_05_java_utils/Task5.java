package s1_05_java_utils;

import static s1_05_java_utils.ScanFile.*;

public class Task5 {
    public static void main(String[] args) {

        Person person1 = new Person("Allegretto", 23);
        String filepath = "persona.ser";

        ScanFile.addAndOrderFile();
        ScanFile.findAllFilesInFolder(ScanFile.rootFolder);
        ScanFile.readAndPrintTextFile(ScanFile.fileEx4);

        serializerObject(person1, filepath);

        Object obj = deserializerObject(filepath);
        if (obj instanceof Person) {
            System.out.println(obj);
        }

    }
}
