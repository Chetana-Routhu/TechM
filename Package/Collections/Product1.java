package Collections;

public class Product1 {

	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		inventory.addProduct(new Product("samsung"));
		inventory.addProduct(new Product("nothing phone"));
		inventory.addProduct(new Product("realme"));
		inventory.displayProduct();
		inventory.CheckLowInventory();
		inventory.removeProduct("samsung");
		inventory.displayProduct();
		inventory.CheckLowInventory();
		
	}

}
