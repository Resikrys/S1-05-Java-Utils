# SPRINT 1
## TASK 5: Java Utils

### LEVEL 1 - EXERCISE 1
Create a class that lists alphabetically the contents of a 
directory received by parameter.

### LEVEL 1 - EXERCISE 2
Add to the class from the previous exercise the functionality 
of listing a directory tree with the content of all its levels 
(recursively) so that they are printed on the screen in alphabetical 
order within each level, also indicating whether it is a directory 
(D) or a file (F), and its last modification date.

### LEVEL 1 - EXERCISE 3
Modify the previous exercise. Now, instead of displaying the result 
on the screen, save the result in a TXT file.

### LEVEL 1 - EXERCISE 4
Add the functionality to read any TXT file and display its 
contents on the console.

### LEVEL 1 - EXERCISE 5
Now the program must serialize a Java Object to a .ser file and 
then deserialize it.

### TECHNOLOGIES
| Package     | Version | Description                |
|-------------|---------|----------------------------|
| `java`      | ^24.0.1 | Principal project language |
| `java.util` | ^24.0.1 | Java standard library      |
| `java.io`   | ^24.0.1 | Java standard library      |
| `java.nio`  | ^24.0.1 | Java standard library      |
| `java.text.SimpleDateFormat` | ^24.0.1 | Java standard library      |

### REQUIREMENTS
- Local environment: `IntelliJ or Eclipse`
- JDK 8 or superior
- Compatible file system (Windows, Linux, etc.)

###  INTELLIJ EXECUTION
To Run code, press `Ctrl F5` or click the `play` icon in the gutter.

### 🛠️ SCRIPTS

- Step 1: Create program's font code
- Step 2: Compile & Run the program

```bash
cd C:\Users\elyri\IdeaProjects\S1_05_Java_Utils   # Go to root file directory
javac -d out src\s1_05_java_utils\*.java   # -d out indicates that the compiled .classes will be placed in an out folder
java -cp out s1_05_java_utils.Task5  # -cp out tells Java where to look for the .class
```