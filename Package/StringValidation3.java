package javaProgram;

public class StringValidation3 {

	public static void main(String[] args) {
		String a = "abcdef";
		String b = "xyz1234";
		String c = "abcxy";
		/*if(a.length()>c.length() && a.length()<b.length()) {
			System.out.println("pass");
			
		}
		else {
			System.out.println("fail");
		}*/
		/*if(a.length()!=b.length() && a.length()!= c.length()) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}*/
		/*if(c.equalsIgnoreCase(a)) {
			System.out.println("true");
			
		}
		else {
			System.out.println("false");
		}*/
		/*if(a.contains("cd")==true && a.contains("xy")==false) {
			System.out.println("true");
			
		}else {
			System.out.println("false");
		}*/
		if(b.toUpperCase().contains("Z")==true && b.contains("z")==false) {
			System.out.println("true");
			
		}else {
			System.out.println("false");
		}

	}

}
