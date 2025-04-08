package Collections;
import java.util.*;

public class HashMapEx {

	public static void main(String[] args) {
		        HashMap<String, String> map = new HashMap<>();
		        map.put("Red", "colour");
		        map.put("Apple", "Fruit");
		        map.put("Carrot", "Vegetable");
		        map.put("Dog", "Animal");
		        map.put("parrot", "bird");
		        map.put("shiva", "human");
		        
		      

		        
		        System.out.println("HashMap: " + map);

		        System.out.println("Red is a: " + map.get("Red"));
		        System.out.println("Apple is a: " + map.get("Apple"));
		        System.out.println("Carrot is a: " + map.get("Carrot"));
		        System.out.println("Dog is a: " + map.get("Dog"));
		        System.out.println("parrot is a: " + map.get("parrot"));
		        System.out.println("shiva is a: " + map.get("shiva"));
		       
		        
		    }
		}

	


