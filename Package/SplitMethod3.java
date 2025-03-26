package javaProgram;

public class SplitMethod3 {

	public static void main(String[] args) {
		String a= "i love my dad and mom";
		String[] arr = a.split(" ");
		for(int i=0; i<arr.length;i++) {
			if(arr[i].contains("a")==false) {
			System.out.print(arr[i]+" ");
			}
		}
	}

}
