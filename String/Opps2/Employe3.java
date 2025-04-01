package Opps2;

 class Employe1 {
	int salary;
	void work() {
		System.out.println("working");
	}
	int getsal(int sal){
		return sal;
		
	}
 }
	public class Employe3 extends Employe1 {
		void work() {
			System.out.println("not working");
		}
		void em() {
			System.out.println("new emp is add");
		}
	

	public static void main(String[] args) {
		Employe1 emp = new Employe1();
		Employe3 emp1 = new Employe3();
		emp.work();
		emp1.work();
		emp1.em();
		
	}

	
}