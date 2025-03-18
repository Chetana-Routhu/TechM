package Package;

public class Fib {

	public static void main(String[] args) {
		int n = 0;
		int m = 1;
		int c;
		System.out.print(n);
		System.out.print(m);
		for(int i = 1; i<=5; i++) {
			c = n+m;
			n=m;
			m=c;
			System.out.print(c);
			
		}
	}

}
