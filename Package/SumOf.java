package Package;

public class SumOf {

	public static void main(String[] args) {
		int product=1;
		int sum=0;
		for(int i =1;i<=10;i++) {
			if(product % 2==0) {
				product = product*i;
				System.out.println("p"+product);
			}
			else {
				sum = sum+i;
				System.out.println("s"+sum);
			}
		}

	}

}
