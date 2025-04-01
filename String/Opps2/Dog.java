package Opps2;

public class Dog {
	String breed;
	String name;
	Dog(String breed,String name){
		this.breed = breed;
		this.name = name;
		
	}
	void display() {
		System.out.println(name+ " "+breed);
		System.out.println(" ");
	}
	void set(String breed,String name){
		this.breed = breed;
		this.name = name;
		
	}
	public static void main(String[] args) {
		Dog dg = new Dog("cubs","pug");
		dg.display();
		dg.set("lab", "sunny");
		dg.display();
	}

}
