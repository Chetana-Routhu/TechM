package Map;

public class Main {
    public static void main(String[] args) {
        Restur restaurant = new Restur();
        Customer customer = new Customer();

        restaurant.displayMenu();
        customer.placeOrder();
        customer.printBill();
    }
}


	