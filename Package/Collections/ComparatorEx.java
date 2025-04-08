package Collections;
import java.util.*;


class Student5 {
 String name;
 int marks;

 Student5(String name, int marks) {
     this.name = name;
     this.marks = marks;
 }

 public String toString() {
     return name + " - " + marks;
 }
}


class MarksComparator implements Comparator<Student5> {
 public int compare(Student5 s1, Student5 s2) {
     return Integer.compare(s1.marks, s2.marks);  
 }
}

public class ComparatorEx {
 public static void main(String[] args) {
     List<Student5> students = new ArrayList<>();

     students.add(new Student5("shyam", 85));
     students.add(new Student5("sagar", 75));
     students.add(new Student5("Chey", 90));
     students.add(new Student5("mani", 80));
     students.add(new Student5("honey", 80));
     students.add(new Student5("bobby", 70));
     students.add(new Student5("lucky", 80));
     students.add(new Student5("ammu", 100));

     System.out.println("Before sorting:");
     for (Student5 s : students) {
         System.out.println(s);
     }

     
     Collections.sort(students, new MarksComparator());

     System.out.println("\nAfter sorting by marks:");
     for (Student5 s : students) {
         System.out.println(s);
     }
 }
}


