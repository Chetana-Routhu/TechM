package FileIO;
import java.io.*;
class Student implements Serializable {
 int id;
 String name;

 Student(int id, String name) {
     this.id = id;
     this.name = name;
 }
}
public class SerializeDemo {
 public static void main(String[] args) {
     Student s1 = new Student(101, "Chey");

     try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("student.ser"))) {
         out.writeObject(s1);
         System.out.println("Object has been serialized");
     } catch (IOException e) {
         e.printStackTrace();
     }
     try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("student.ser"))) {
         Student s2 = (Student) in.readObject();
         System.out.println("Deserialized: " + s2.name + ", ID: " + s2.id);
     } catch (IOException | ClassNotFoundException e) {
         e.printStackTrace();
     }
 }
}


