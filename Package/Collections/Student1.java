package Collections;
import java.util.Arrays;

class Student2 implements Comparable<Student2> {
    String name;
    int age;

    
    Student2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    
    public int compareTo(Student2 s) {
        return this.age - s.age;
    }
}

public class Student1 {
    public static void main(String[] args) {
        Student2[] students = {
            new Student2("Alice", 22),
            new Student2("Bob", 18),
            new Student2("Charlie", 20)
        };

        
        System.out.println("Before sorting:");
        for (Student2 s : students) {
            System.out.println(s.name + " - " + s.age);
        }

       
        Arrays.sort(students);

        
        System.out.println("\nAfter sorting by age:");
        for (Student2 s : students) {
            System.out.println(s.name + " - " + s.age);
        }
    }
}


