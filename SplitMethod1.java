package javaProgram;

public class SplitMethod1 {

	public static void main(String[] args) {
		String a = "chey routhu";
		String[] arr = a.split("");
		for(int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i]);
		}

	}

}
