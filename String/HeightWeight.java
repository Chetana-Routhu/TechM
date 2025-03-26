//9.question
package String;

import java.util.Scanner;

public class HeightWeight {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the height of the person :");
		float height=sc.nextFloat();
		System.out.print("enter the wieght of the person :");
		int weight = sc.nextInt();
		if(height>=5.5 && weight>55) {
			System.out.println("person is eligible for physical test");
			
		}
		else {
			System.out.println("not eligible for physical test");
		}
		
	}

}
