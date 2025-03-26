package javaProgram;

public class SplitMethod {

	public static void main(String[] args) {
		String a = "i love my mom hi";
		String[] arr = a.split(" ");
		for(int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println(arr[3]);
	}
	

}
