package Exception;

import java.io.*;

public class FileFormat {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("Test.txt");
            System.out.println("File found");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
