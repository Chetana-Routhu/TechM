package Package1;
import java.util.*;
public class RandomMatri {

	public static void main(String[] args) {
		int arr[][] = new int[3][3];
		Random r=new Random();
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				arr[i][j]=r.nextInt(10);
			}
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr[i][j]+" ");
			}
		
		System.out.println(" ");
	}

}
}
