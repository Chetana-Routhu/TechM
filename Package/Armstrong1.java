package Package;

import java.util.Scanner;

public class Armstrong1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		int num = sc.nextInt();
		int total =num;
		int count = 0;
		while(total != 0) {
			total/=10;
			count++;
			
		}
		total=num;
		int sum =0;
		int rem;
		while(total != 0) {
			rem= total%10;
			sum += Math.pow(rem,  count);
			total /= 10;
			
		}
		if(sum==num) {
			System.out.println(num+ "is amstrong");
		}
		else {
			System.out.println(num+ "is not a armstrong");
		}
	}

}
