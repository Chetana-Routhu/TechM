package FileIO;
import java.io.*;

public class FileIOEx {
    public static void main(String[] args) {
        try {
           
            FileWriter writer = new FileWriter("example.txt");
            writer.write("Hello, File I/O in Java!");
            writer.close();
            System.out.println("File written successfully.");           
            BufferedReader reader = new BufferedReader(new FileReader("example.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Read from file: " + line);
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


