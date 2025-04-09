package Map;
import java.util.*;


public class Customer extends Restur {
    private List<String> orderList = new ArrayList<>();
    private ArrayList<Integer> quantities = new ArrayList<>();
    private int totalAmount = 0;

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

    public void printBill() {
        System.out.println(" YOUR BILL ");
        System.out.println("Item\t\tPrice\tQuantity\tTotal");
        int itemTotal=0;
        int fin=0;
        for (int i = 0; i < orderList.size(); i++) {
        	 String item = orderList.get(i);
             int qty = quantities.get(i);
             int price = super.getPrice(item);
             itemTotal = price * qty;
             fin = fin+itemTotal;
             System.out.println(item + "\t\t₹" + price + "\t" + qty + "\t\t₹" + itemTotal);
        }
        double gstRate = 0.18; 
        double gstAmount = fin * gstRate;
        double finalAmount =fin + gstAmount;
        System.out.println("-------------------------------");
        System.out.println("Total Amount: " +fin +"Rs");
        System.out.println("Subtotal (before GST): ₹" + fin);
        System.out.println("GST (18%): ₹" + Math.round(gstAmount));
        System.out.println("Total Amount (with GST): ₹" + Math.round(finalAmount));
    }


}
	