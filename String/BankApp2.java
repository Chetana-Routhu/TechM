package String;
import java.util.Scanner;
public class BankApp2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);       
        int[] accountNumbers = new int[10]; 
        double[] balances = new double[10];          
        System.out.println("Enter 10 account numbers: ");
        for (int i = 0; i < 10; i++) {
            accountNumbers[i] = sc.nextInt();
            balances[i] = 0.0;
        }
        while (true) {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. View Balance");
            System.out.println("4. End Task");
            System.out.print("Choose an option: ");            
            int choice = sc.nextInt();
            if (choice >= 1 && choice <= 3) {
                System.out.print("Enter account number: ");
                int accNo = sc.nextInt();                       
                int index = -1;
                for (int i = 0; i < 10; i++) {
                    if (accountNumbers[i] == accNo) {
                        index = i;
                        break;
                    }
                }
                if (index == -1) {
                    System.out.println("Invalid account number. Try again.");
                    continue;
                }
                if (choice == 1) { 
                    System.out.print("Enter deposit amount: ");
                    double deposit = sc.nextDouble();
                    balances[index] =balances[index]+ deposit;
                    System.out.println("Deposited: " + deposit);
                } 
                else if (choice == 2) {
                    System.out.print("Enter withdrawal amount: ");
                    double withdraw = sc.nextDouble();
                    if (withdraw <= balances[index]) {
                        balances[index] =balances[index]- withdraw;
                        System.out.println("Withdrew: " + withdraw);
                    } else {
                        System.out.println("Insufficient funds.");
                    }
                } 
                else { 
                    System.out.println("Current balance for account " + accNo + ": " + balances[index]);
                }
            } 
            else if (choice == 4) {
                System.out.println("Thank you for using the Bank App!");
                break;
            } 
            else {
                System.out.println("Invalid option. Please try again.");
            }
        }    
    }
}
