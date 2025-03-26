package String;

import java.util.Scanner;

public class BankApp3 {
		    public static int findAccountIndex(int[] accountNumbers, int accNo) {
		        for (int i = 0; i < accountNumbers.length; i++) {
		            if (accountNumbers[i] == accNo) {
		                return i;
		            }
		        }
		        return -1;
		    }

		    public static void main(String[] args) {
		        final int MAX_ACCOUNTS = 10;
		        Scanner sc = new Scanner(System.in);
		        
		        int[] accountNumbers = new int[MAX_ACCOUNTS];
		        double[] balances = new double[MAX_ACCOUNTS];

		        System.out.println("Enter 10 account numbers: ");
		        for (int i = 0; i < MAX_ACCOUNTS; i++) {
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
		                
		                int index = findAccountIndex(accountNumbers, accNo);
		                if (index == -1) {
		                    System.out.println("Invalid account number. Try again.");
		                    continue;
		                }

		                switch (choice) {
		                    case 1: 
		                        System.out.print("Enter deposit amount: ");
		                        double deposit = sc.nextDouble();
		                        if (deposit <= 0) {
		                            System.out.println("Deposit amount must be positive.");
		                        } else {
		                            balances[index] =balances[index]+ deposit;
		                            System.out.println("Deposited: " + deposit);
		                        }
		                        break;

		                    case 2:
		                        System.out.print("Enter withdrawal amount: ");
		                        double withdraw = sc.nextDouble();
		                        if (withdraw <= 0) {
		                            System.out.println("Withdrawal amount must be positive.");
		                        } else if (withdraw <= balances[index]) {
		                            balances[index] =balances[index]- withdraw;
		                            System.out.println("Withdrew: " + withdraw);
		                        } else {
		                            System.out.println("Insufficient funds.");
		                        }
		                        break;

		                    case 3:
		                        System.out.println("Current balance for account " + accNo + ": " + balances[index]);
		                        break;
		                }
		            } else if (choice == 4) {
		                System.out.println("Thank you for using the Bank App!");
		                break;
		            } else {
		                System.out.println("Invalid option. Please try again.");
		            }
		        }

		        
		    }
		}

	


