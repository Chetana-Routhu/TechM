package javaProgram;

import java.util.Scanner;

public class Swaping {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of a :");
		int a = sc.nextInt();
		System.out.println("enter the value of b:");
		int b = sc.nextInt();
		System.out.println("before swaping a ="+a+ "b=" +b);
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("after swapping a=" +a+ "b="+b);
	}

}
