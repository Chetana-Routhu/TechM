package oopsConcept;
interface Bank5 {
    void deposit();
    void withdraw();
}
interface LoanBank extends Bank5 {
    void provideLoan();
}
class SBI2 implements LoanBank {
    public void deposit() {
    System.out.println("SBI: Deposit successful."); }
    public void withdraw() { 
    System.out.println("SBI: Withdrawal successful."); }
    public void provideLoan() {
    System.out.println("SBI: Loan provided."); }
}

class HDFC2 implements Bank5{
    public void deposit() { System.out.println("HDFC: Deposit successful."); }
    public void withdraw() { System.out.println("HDFC: Withdrawal successful."); }
}
public class Bank4 {
    public static void main(String[] args) {
        LoanBank sbi = new SBI2();
        sbi.deposit();
        sbi.withdraw();
        sbi.provideLoan();

        Bank5 hdfc = new HDFC2();
        hdfc.deposit();
        hdfc.withdraw();
    }
}


