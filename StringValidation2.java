package javaProgram;

public class StringValidation2 {

	public static void main(String[] args) {
		//String a = "chetana";
		//String b = "chetana";
		//System.out.println(a.equals(b));
		String a = "Chey";
		String b = "chey";
		String c = "ExcelR chey";
		String d = " ";
				System.out.println(a.equals(b));
				System.out.println(a.equalsIgnoreCase(b));
				System.out.println(a.contains("a"));
				System.out.println(a.contains("e"));
				System.out.println(c.startsWith("E") && c.contains("x"));
				/*if(c.startsWith("E")==true && c.contains("n")) {
					System.out.println("pass");
				}else {
					System.out.println("fail");
				}*/
				/*if(a.startsWith("C")==true && a.endsWith("y")) {
					System.out.println("pass");
				}
				else {
					System.out.println("fail");
				}*/
				if(c.length()<10 && c.endsWith("lR")) {
					System.out.println("pass");
				}
				else {
					System.out.println("fail");
				}
        System.out.println(d.isEmpty());
        System.out.println(a.concat(b));
        System.out.println(c.charAt(4));
        System.out.println(c.indexOf('x'));
        System.out.println(c.trim());
        System.out.println(c.replace("chey","chetana" ));
	}

}
