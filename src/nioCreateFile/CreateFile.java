package nioCreateFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateFile {
    public static void main(String[] args) {
        Path path = Paths.get("src/nioDemo/demo.txt");
        try {
            path = Files.createFile(path);
            System.out.println("Created a file at: " + path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
