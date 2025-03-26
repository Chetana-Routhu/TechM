//7.question
package String;

import java.util.Scanner;

public class Operations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char d='y';
			
	
		System.out.println("enter the first number ");
		int num1 = sc.nextInt();
		System.out.println("enter the second number");
		int num2= sc.nextInt();
		System.out.println("enter the operations:(+,-,*,/)");
		char c = sc.next().charAt(0);
	
		switch(c) {
		case '+':System.out.println(num1+num2);
		break;
		case '-':System.out.println(num1-num2);
		break;
		case '*':System.out.println(num1*num2);
		break;
		case '/':System.out.println(num1/num2);
		break;
		}
		
		
	}

}
