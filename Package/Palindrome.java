package Package;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		int num = sc.nextInt();
		int total=num;
		int rem;
		int rev=0;
		while(num!=0) {
			rem = num%10;
			rev= rev*10+rem;
			num=num/10;
			
		}
		if(total==rev) {
			System.out.println("is a palindrome");
		}
		else {
			System.out.println("is not palindrome");
		}
		
	}

}
