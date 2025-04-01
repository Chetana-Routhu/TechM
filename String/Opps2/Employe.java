package Opps2;

public class Employe {
	String name;
	int salary;
	int hireYear;
	boolean isPermanent;
	Employe(String name, int salary,int hireYear,boolean isPerminante){
		this.name= name;
		this.salary = salary;
		this.hireYear = hireYear;
		this.isPermanent = isPermanent;
		
	}
	void calYearOfSalary(int presentYear) {
		int year = presentYear-hireYear;
		System.out.println(name+ " has "+year+ " of service");
	
	if(year>3) {
		System.out.println(name+ " is a permanent employee ");
	}
	else {
		System.out.println(name+ " is temporary employe");
	}
	System.out.println(" ");
	}
	public static void main(String[] args) {
		Employe Pemp = new Employe("mani",50000,2021,true);
		Employe Temp = new Employe("sagar",60000,2020,true);
		Pemp.calYearOfSalary(2025);
		 Temp.calYearOfSalary(2025);
		

	}

}
