package String;

import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {

		        double balance = 0;
		        Scanner sc = new Scanner(System.in);
		        
		        while (true) {
		            System.out.println("1. Deposit");
		            System.out.println("2. Withdraw");
		            System.out.println("3. View Balance");
		            System.out.println("4. Exit");
		            System.out.print("Choose an option: ");
		            
		            int choice = sc.nextInt();

		            if (choice == 1) {
		                System.out.print("Enter deposit amount: ");
		                double deposit = sc.nextDouble();
		                balance =balance+deposit;
		                System.out.println("Deposited: " + deposit);
		            } 
		            else if (choice == 2) {
		                System.out.print("Enter withdraw amount: ");
		                double withdraw = sc.nextDouble();
		                if (withdraw <= balance) {
		                    balance =balance- withdraw;
		                    System.out.println("Withdrew: " + withdraw);
		                } else {
		                    System.out.println("Insufficient funds.");
		                }
		            } 
		            else if (choice == 3) {
		                System.out.println("Current balance: " + balance);
		            } 
		            else if (choice == 4) {
		                System.out.println("Thank you for using the Simple Bank App!");
		                break;
		            } 
		            else {
		                System.out.println("Invalid option. Please try again.");
		            }
		        }
		        
		    }
		


	}


