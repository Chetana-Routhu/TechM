package javaProgram;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of a :");
		int a = sc.nextInt();
		System.out.println("enter the value of b :");
		int b = sc.nextInt();
		System.out.println("enter the value of c :");
		int c = sc.nextInt();
		System.out.println("beforw swapping a :"+a+ ", b="+b+ "and c ="+c);
		a = a+b+c;
		a= a-c;
		c = a-a;
		b=a-b;
		
		System.out.println("after swapping a="+a+ ",b="+b+"and c ="+c);
	}

}
