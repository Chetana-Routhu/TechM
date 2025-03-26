//1.if all the numbers greater than a value x
package String;

public class GreaterNumber {

	public static void main(String[] args) {
		int arr[]= {2,43,66,92,3,5,13,123,432,44,78};
		int x=100;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>x) {
				System.out.println(arr[i]);
			}
			
		}
	}

}
