package Package;

import java.util.Scanner;

public class Div {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = 1;
		System.out.println("enter the number:");
		int num = sc.nextInt();
		if(num%3==0 && num%5==0) {
			System.out.println(num+"is divisible by 3 and 5");
			
		}
		else {
			System.out.println(num+ "not divisible by 3 and 5");
		}
	}

}
