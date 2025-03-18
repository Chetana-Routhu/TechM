package Package;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		int num = sc.nextInt();
		for(int i = 1;i<=num; i++) {
			for(int j= num; j>i;j++) {
				System.out.print(" ");
				
			}
			for(int k= 1; k<=(2 * i - 1);k++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
