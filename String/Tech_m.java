//11.question
package String;

import java.util.Scanner;

public class Tech_m {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		int n = sc.nextInt();
		if(n>=1 && n<=100)
		{
			
		if(n%2!=0)
		{
			System.out.println(n+"odd");
		}
		else {
			
		 if(n>=2 && n<=5) {
			System.out.println("not weird");
		}
		else if(n>=6 && n<=20) {
			System.out.println("wweird");
		}
		else if(n>20) {
			System.out.println(" not weird");
		}
		
		}
	}

	}
}
