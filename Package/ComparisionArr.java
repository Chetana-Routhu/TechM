package Package1;

import java.util.Scanner;

public class ComparisionArr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr1[] = new int[5];
		int arr2[] = new int[5];
		System.out.println("enter the elements of arr1");
		for(int i = 0;i<arr1.length;i++) {
			arr1[i]= sc.nextInt();
		}
		
		System.out.println("enter the elements of arr2");
		for(int i = 0;i<arr2.length;i++) {
			arr2[i]= sc.nextInt();
		}
		
		if(arr1[0]==arr2[arr2.length-1]) {
			System.out.println("1st element of arr1 is equal to last element of arr2");
		}
		else if(arr1[0]>arr2[arr2.length-1]) {
			System.out.println("1st element of arr1 is greater than last element of arr2");
			
		}
		else if(arr1[0]<arr2[arr2.length-1]) {
			System.out.println("ist element of arr1 is less than last element of arr2 ");
		}
		else {
			System.out.println("retry");
		}
		

	}

}
