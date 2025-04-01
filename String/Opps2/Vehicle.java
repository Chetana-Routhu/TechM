package Opps2;
class Vehicle1{
	void drive() {
		System.out.println("i am driving vehicle");
	}
	
}
class bike extends Vehicle1{
	void drive() {
		System.out.println("i am driving bike");
	}
}

public class Vehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bike bk = new bike();
		bk.drive();

	}

}
