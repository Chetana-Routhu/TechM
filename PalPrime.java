package Package1;

import java.util.Scanner;

public class PalPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the numnber:");
		int n = sc.nextInt();
		int total=n;
		int sum = 0;
		int rev;
		int count=0;
		while(n!=0) {
			rev =n%10;
			sum =sum*10+rev;
			n=n/10;
		}
			if(sum==total) {
				System.out.println(sum+" " + "it is palindrome number:");
			}
			else {
				System.out.println(sum+"  "+"it is not palindrome number ");
			}
			for(int i = 1;i<=total;i++) {
				if(total%i==0) {
					count++;
					
				}
				
				
			}
			if(count==2) {
				System.out.println( "it is prime number");
			}
			else {
				System.out.println("it is not prime number");
				
			}
			if(sum==total && count==2) {
				System.out.println("it is palprime");
			}
			else {
				System.out.println("it is not palprime");
			}
		}
	



	}


