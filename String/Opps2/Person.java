package Opps2;

public class Person {
	String name;
	int age;
	Person(String name, int age){
		this.name = name;
		this.age = age;
		}
	void disp() {
		System.out.println(name+ " " +age);
		System.out.println(" ");
	}

	public static void main(String[] args) {
		Person person = new Person("mani",21);
		Person per = new Person("sagar",23);
		person.disp();
		per.disp();
		
	}

}
