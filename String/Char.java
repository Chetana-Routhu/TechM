//10.question
package String;

import java.util.Scanner;

public class Char {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
				System.out.println("enter the character :");
				char ch = sc.nextLine().toLowerCase().charAt(0);
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
					System.out.println("is vowel");
				}
				else {
					System.out.println("is consonant");
				}
	}

}
