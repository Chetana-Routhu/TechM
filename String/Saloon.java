package abstraction;

public class Saloon {
	String name;
	String Location;
	public Saloon(String name,String Location) {
		this.name = name;
		this.Location = Location;
	}
	public void display() {
		System.out.println("saloon name:" +name);
		System.out.println("saloon Location:" +Location);
	}

	
	}


