package Package;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		int num = sc.nextInt();
		int total=num;
		int rem;
		int rev=0;
		while(num!=0) {
			rem = num%10;
			rev= rev+(rem*rem*rem);
			num=num/10;
			
		}
		if(total==rev) {
			System.out.println("is a armstrong");
		}
		else {
			System.out.println("is not armstrong");

	}

}
}
