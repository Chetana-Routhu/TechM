//8.question
package String;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				System.out.println("enter the average marks of the student:");
				int a = sc.nextInt();
				if(a>=80)
				{
					System.out.println("A grade");
				}
				else if(a>=60 && a<80) {
					System.out.println("B grade");
				}
				else if(a>=40 && a<60) {
					System.out.println("C grade");
				}
				else {
					System.out.println("D grade");
				}
	}

}
