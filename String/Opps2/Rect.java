package Opps2;

public class Rect {
	int width;
	int height;
	Rect(int width,int height){
		this.width = width;
		this.height = height;
	}
	void area() {
		System.out.println("area is " +(width*height) );
		System.out.println(" ");
	}
	void perimeter() {
		System.out.println("perimeter is "+(2*(width+height)));
	}

	public static void main(String[] args) {
		Rect rect = new Rect(5,7) ;
		rect.area();
		rect.perimeter();
	}

}
