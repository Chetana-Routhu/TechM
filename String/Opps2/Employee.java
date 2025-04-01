package Opps2;

public class Employee {
	String name;
	String JobTitle;
	int salary;
	Employee(String name,String JObTitle,int salary){
		this.name = name;
		this.JobTitle = JobTitle;
		this.salary = salary;
		
	}
	void calSalary() {
		System.out.println(name+ " salary is: "+salary);
	}
	void updateSal(int newSal) {
		salary = newSal;
		System.out.println(name+ " updated salary is : "+newSal);
		
		
	}

	public static void main(String[] args) {
		Employee emp = new Employee("Chetana","DEveloper",50000);
		emp.calSalary();
		emp.updateSal(70000);
		
	}

}
