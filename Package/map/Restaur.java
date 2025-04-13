package map;
import java.util.*;
import java.util.Map.Entry;
public class Restaur {

	 private Map<String, Integer> tiffins;
	    private Map<String, Integer> vegItems;
	    private Map<String, Integer> nonVegItems;
	    private Map<String, Integer> drinks;

    public Restaur() {
        tiffins = new HashMap<>();
        tiffins.put("idle", 30);
        tiffins.put("poori", 50);
        tiffins.put("pongal",60);
        tiffins.put("upma", 40);
        tiffins.put("vada",45);
        tiffins.put("dosa",35);
        
        
        vegItems = new HashMap<>();
        vegItems.put("paneerFriedRice",  180 );
        vegItems.put("mashroomFriedRice", 200 );
        vegItems.put("babycornfriedRice", 250 );
        vegItems.put("manchurianFriedRice",260 );
        
        nonVegItems = new HashMap<>();
        nonVegItems.put("chickenFriedRrice", 250);
        nonVegItems.put("chickenDumBiryani", 280);
        nonVegItems.put("chickenFryPieceBiryani", 250);
        nonVegItems.put("chickenCurry", 200);
        nonVegItems.put("chickenFry", 230);
        
        drinks = new HashMap<>();
        drinks.put("tea", 20);
        drinks.put("coffee", 30);
        drinks.put("juice", 50);
        
        
    }

    public void displayMenu() {
        System.out.println("----------- MENU -----------");
        System.out.println("\n** Tiffins **");
        for (Entry<String, Integer> entry : tiffins.entrySet()) {
            System.out.println(entry.getKey() +"  -  "+  entry.getValue()+"Rs");
        }
        System.out.println("\n** Veg Items **");
        for (Entry<String, Integer> entry : vegItems.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue()+"Rs");
        }

        System.out.println("\n** Non-Veg Items **");
        for (Entry<String, Integer> entry : nonVegItems.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue()+"Rs");
        }
        System.out.println("\n** Drinks **");
        for (Entry<String, Integer> entry : drinks.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue()+"Rs");
        }
        System.out.println("----------------------");
    }

    public int getPrice(String item) {
    	if (tiffins.containsKey(item)) {
            return tiffins.get(item);
        } else if (vegItems.containsKey(item)) {
            return vegItems.get(item);
        } else if (nonVegItems.containsKey(item)) {
            return nonVegItems.get(item);
        } else if (drinks.containsKey(item)) {
            return drinks.get(item);
        } else {
            return -1; // Item not found
        }
    }
        
    

    public boolean hasItem(String item) {
        return tiffins.containsKey(item)||
         vegItems.containsKey(item)||
         nonVegItems.containsKey(item)||
         drinks.containsKey(item);
    }
}


	