package FileIO;
import java.io.*;

public class ByteStream {
    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream("image.jpg");
        FileOutputStream out = new FileOutputStream("copy.jpg");

        int data;
        while ((data = in.read()) != -1) {
            out.write(data);
        }

        in.close();
        out.close();
        System.out.println("Image copied using byte stream.");
    }
}


