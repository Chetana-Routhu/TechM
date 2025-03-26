package javaProgram;

public class SplitMethod2 {

	public static void main(String[] args) {
		String a= "i love my dad and mom";
		String[] arr = a.split(" ");
		for(int i=0; i<arr.length;i++) {
			if(arr[i].length()==3) {
			System.out.print(arr[i]+" ");
			}
		}

	}

}
