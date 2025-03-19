package Package1;

import java.util.Scanner;

public class LeftSArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i;
		
		int arr[]=new int[5];
		System.out.println("enter the numbers");
		for( i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		int first =arr[0];
		for( i=0;i<arr.length-1;i++) {
			arr[i]=arr[i+1];
			
			
		}
		arr[i]=first;
		for( i =0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		

	}

}
