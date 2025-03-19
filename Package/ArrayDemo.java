package Package1;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the 5 elements in the array");
		int arr[] = new int[5];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		
		
		}
		for(int a : arr) {
			System.out.println(a);
		}
		Arrays.sort(arr);
		System.out.println("sorted elements of array are");
		for(int a:arr) {
			System.out.println(a);
		}
		System.out.println("first largest element is"+arr[arr.length-1]);

		System.out.println("second largest element is"+arr[arr.length-2]);
		System.out.println("third largest element is"+arr[arr.length-3]);
		
	}

}
