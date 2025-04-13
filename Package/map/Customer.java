package map;


	import java.util.*;


	public class Customer extends Restaur {
	    private List<String> orderList = new ArrayList<>();
	    private ArrayList<Integer> quantities = new ArrayList<>();
	    private int totalAmount = 0;
	    private Map<String, Integer> ratings = new HashMap<>();
	    private String paymentType;


	    public void placeOrder() {
	        Scanner scanner = new Scanner(System.in);
	        String input;

	        System.out.println("Enter your order (type 'done' to finish):");

	        while (true) {
	            System.out.print("Item: ");
	            input = scanner.nextLine();

	            if (input.equalsIgnoreCase("done")) {            	
	                break;
	            }

	            if (super.hasItem(input)) {
	            	 System.out.print("Enter quantity: ");
	                 int quantity = scanner.nextInt();
	                 scanner.nextLine(); 
	                orderList.add(input);
	                quantities.add(quantity);
	                int price = super.getPrice(input);
	                int itemTotal = super.getPrice(input) * quantity;
	                totalAmount += price;
	                System.out.println(input + " added. Price: " + price+"Rs");
	            } else {
	                System.out.println("Sorry, " + input + " is not on the menu.");
	            }
	        }
	    }
	    public void rateItems() {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("\n⭐ Please rate the following items (1 to 5):");
	        for (String item : orderList) {
	            int rating = 0;
	            
	            while (rating < 1 || rating > 5) {
	                System.out.print(item + ": ");
	                rating = scanner.nextInt();
	                if (rating < 1 || rating > 5) {
	                    System.out.println("Invalid rating. Please provide a rating between 1 and 5.");
	                }
	            }
	            ratings.put(item, rating); 
	        }
	    }
	    public void selectPaymentType() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("\nChoose payment method:");
	        System.out.println("1. Cash");
	        System.out.println("2. PhonePe");
	        System.out.println("3. Google Pay");
	        System.out.println("4. Paytm");
	        int choice;

	        while (true) {
	            System.out.print("Enter choice (1-4): ");
	            choice = scanner.nextInt();
	            switch (choice) {
	                case 1:
	                    paymentType = "Cash";
	                    return;
	                case 2:
	                    paymentType = "PhonePe";
	                    return;
	                case 3:
	                    paymentType = "Google Pay";
	                    return;
	                case 4:
	                    paymentType = "Paytm";
	                    return;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        }
	    }

	    
	    public void printBill() {
	    	
	        System.out.println("---------- YOUR BILL ------------");
	        System.out.println("Item\t\tPrice\tQuantity\tTotal\trating");
	        int itemTotal=0;
	        int fin=0;
	        for (int i = 0; i < orderList.size(); i++) {
	        	 String item = orderList.get(i);
	             int qty = quantities.get(i);
	             int price = super.getPrice(item);
	             itemTotal = price * qty;
	             fin = fin+itemTotal;
	             int rating = ratings.getOrDefault(item, 0); 
	             System.out.println(item + "\t\t₹" + price + "\t" + qty + "\t\t₹" + itemTotal+"\t⭐ " + rating);
	        }
	        double discountRate = 0.0;
	        if (fin > 500) {
	            discountRate = 0.10;
	        } else if (fin > 200) {
	            discountRate = 0.05;
	        }
	        
	        double discountAmount = fin * discountRate;
	        double amountAfterDiscount = fin - discountAmount;

	        double gstRate = 0.18; 
	        double gstAmount = fin * gstRate;
	        double finalAmount =fin + gstAmount;
	        
	        System.out.println("-------------------------------");
	        System.out.println("Total Amount: " +fin +"Rs");
	        System.out.println("Subtotal (before GST): ₹" + fin);
	        System.out.printf("Discount (%.0f%%): ₹%.2f\n", discountRate * 100, discountAmount);
	        System.out.printf("Amount after discount: ₹%.2f\n", amountAfterDiscount);
	        System.out.println("GST (18%): ₹" + Math.round(gstAmount));
	        System.out.println("Total Amount (with GST): ₹" + Math.round(finalAmount));
	        System.out.println("Payment Method: " + paymentType);
	        System.out.println("\nScan QR below to pay (if applicable):");
	        System.out.println("[========= QR CODE =========]");
	        System.out.println("[   SCAN WITH PAYMENT APP   ]");
	        System.out.println("============================");
	        System.out.println("\n✨ Thank you for dining with us! ✨");
	    }


	}

	

