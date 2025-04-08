package Collections;

import java.util.*;

public class HashMapTab {

	public static void main(String[] args) {
		
	        Hashtable<String, String> table = new Hashtable<>();
	        table.put("Red", "colour");
	        table.put("Apple", "Fruit");
	        table.put("Carrot", "Vegetable");
	        table.put("Dog", "Animal");
	        table.put("parrot", "bird");
	        table.put("shiva", "human");
	        
	      

	        
	        System.out.println("HashMap: " + table);

	        System.out.println("Red is a: " + table.get("Red"));
	        System.out.println("Apple is a: " + table.get("Apple"));
	        System.out.println("Carrot is a: " + table.get("Carrot"));
	        System.out.println("Dog is a: " + table.get("Dog"));
	        System.out.println("parrot is a: " + table.get("parrot"));
	        System.out.println("shiva is a: " + table.get("shiva"));
	        System.out.println(table.containsKey("Red"));
	        System.out.println(table.size());
		     
	        System.out.println(table.getOrDefault("Dog","Animal"));
	        System.out.println(table.getOrDefault("Carrot","bird"));
	        System.out.println(table.remove("Dog"));
	        System.out.println(table.isEmpty());
	        System.out.println(table.keys());
	        System.out.println(table.size());
		      
		     
		     
		     
	     
	        
	    }
	

	}


