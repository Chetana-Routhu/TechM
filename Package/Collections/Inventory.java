package Collections;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
	List<Product>products;
	public Inventory() {
		this.products = new ArrayList<>();
	}
	public void addProduct(Product prod) {
		this.products.add(prod);
		
	}
	public void removeProduct(String name) {
		boolean productFound = false;
		for(Product prod:products) {
			if(prod.name.equals(name)) {
				products.remove(prod);
				productFound=true;
				break;
				
			}
			
		}
		if(productFound) {
			System.out.println("product not found with name : "+name);
			
		}
	}
	public void displayProduct() {
		for(Product prod:products) {
			System.out.println(prod);
		}
	}
	public void CheckLowInventory() {
		if(products.size()<3) {
			System.out.println("low inventory detected with size : "+products.size());
			
		}
		else {
			System.out.println("inventory is with the size: "+products.size());
		}
	}
}
	

	