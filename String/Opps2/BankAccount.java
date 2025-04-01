package Opps2;

 class Bank {
	int AccNo;
	int balance;
	String name;
	Bank(int AccNo,int balance,String name){
		this.AccNo =AccNo;
		this.balance = balance;
		this.name = name;
	}
	void deposite(int depositAm) {
		balance = balance+depositAm;
		 System.out.println("deposite successful into account : "+AccNo+name);
	}
	void withdraw(int wd) {
		if(wd<balance) {
			balance = balance-wd;
			System.out.println("withdraw successful from account: "+AccNo   +name);
			
		}
		else {
			System.out.println("insufficient balance");
		}
	}
	void balance() {
		System.out.println("account balance: "+balance);
	}
 }
	class Interest extends Bank{
	double interest;
	Interest(int AccNo,int balance,String name,double interest){
		super(AccNo, balance, name);
		this.interest = interest;
		
	}
	void inter(double no) {
		balance += balance*(interest/100);
		System.out.println("balance after interest"+balance);
	}
	}
public class BankAccount{
	public static void main(String[] args) {
		Bank ba = new Bank(987,2000,"chey");
		Interest intere = new Interest(1,30000,"chey",5);
		ba.deposite(7000);
		ba.balance();
		ba.withdraw(5000);
		ba.balance();
		intere.inter(0.3);
	}

}
