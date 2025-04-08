package Collections;
import java.util.ArrayList;
import java.util.Collections;


class Student4 implements Comparable<Student4> {
    String name;
    int age;

    
    Student4(String name, int age) {
        this.name = name;
        this.age = age;
    }

    
    public int compareTo(Student4 other) {
        return this.age - other.age;
    }

   @Override
    public String toString() {
        return "{ " +name + " (" + age + ")"+"}";
    }
}


public class Student3 {
    public static void main(String[] args) {
        
        ArrayList<Student4> students = new ArrayList<>();
        students.add(new Student4("shaym", 22));
        students.add(new Student4("saga", 18));
        students.add(new Student4("mani", 20));

       
        System.out.println("Before sorting:");
        for (Student4 s : students) {
            System.out.println(s);
        }

        
        Collections.sort(students);

       
        System.out.println("After sorting by age:");
        for (Student4 s : students) {
            System.out.print(s);
        }
    }
}


