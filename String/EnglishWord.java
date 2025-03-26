//3.question
package String;

import java.util.Scanner;

public class EnglishWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the three words");
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		String str3 = sc.nextLine();
		    
		
		
		String s1=str1.replaceAll("[AEIOUaeiou]","*");
		String s2=str2.replaceAll("[bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ]","@");
		String s3=str3.toUpperCase();
		System.out.println(s1+s2+s3);
		
		
	}

}
