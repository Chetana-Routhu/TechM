package Package;

import java.util.Scanner;

public class Diamond {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int k=1;
	System.out.println("enter the number:");
	int num = sc.nextInt();
	for(int i = 1; i<=num;i++) {
		for(int j = i;j<=num;j++) {
			System.out.print(k+" ");
			k++;
		}
		System.out.println(" ");
		}
		
	}
	}


