package String;

public class Equals {

	public static void main(String[] args) {
		String a = "Chetana";
		String a1= new String("samba shiva");
		String a2 = "Chetana";
		if(a==a2) {
			System.out.println("equal");
			
		}
		else {
			System.out.println("not equal");
		}
		if(a.equals(a1)) {
System.out.println("equal");
			
		}
		else {
			System.out.println("not equal");
		
		}
		int x = a1.compareTo(a);
		System.out.println(x);
		}
	}


