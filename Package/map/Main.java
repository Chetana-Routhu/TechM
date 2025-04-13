package map;

public class Main {

	public static void main(String[] args) {
		System.out.println("=========== WELCOME TO HAPPY RESTAURANT ===========\n");
		 Restaur restaurant = new Restaur();
	        Customer customer = new Customer();

	        restaurant.displayMenu();
	        customer.placeOrder();
	        customer.rateItems();
	        customer.selectPaymentType();
	        customer.printBill();
	        
	    }
	}


	


