package Package1;

import java.util.Scanner;

public class RigthSArr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i;
		
		int arr[]=new int[5];
		System.out.println("enter the numbers");
		for( i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		int first =arr[arr.length-1];
		for( i=arr.length-1;i>0;i--) {
			arr[i]=arr[i-1];
			
			
		}
		arr[i]=first;
		System.out.println("the left shift elements are");
		for( i =0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
