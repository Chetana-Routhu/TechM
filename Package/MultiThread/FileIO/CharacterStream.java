package FileIO;
import java.io.*;

public class CharacterStream {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("data.txt");
        FileWriter writer = new FileWriter("copy.txt");

        int ch;
        while ((ch = reader.read()) != -1) {
            writer.write(ch);
        }

        reader.close();
        writer.close();
        System.out.println("Text copied using character stream.");
    }
}


