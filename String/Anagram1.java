//5.question
package String;

import java.util.*;

public class Anagram1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the str1");
		String str1=sc.nextLine();
		System.out.println("enter the str2");
		String str2=sc.nextLine();
		char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        
        if (Arrays.equals(arr1, arr2)) {
            System.out.println(" anagram");
        } else {
            System.out.println("not anagram");
        }

		

	}

}
