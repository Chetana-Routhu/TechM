package Map;
import java.util.*;
import java.util.Map.Entry;
public class Restur {
    private Map<String, Integer> menu;

    public Restur() {
        menu = new HashMap<>();
        menu.put("idle", 30);
        menu.put("poori", 50);
        menu.put("pongal",60);
        menu.put("upma", 40);
        menu.put("vada",45);
        menu.put("dosa",35);
        
    }

    public void displayMenu() {
        System.out.println(" MENU ");
        for (Entry<String, Integer> entry : menu.entrySet()) {
            System.out.println(entry.getKey() +"  -  "+  entry.getValue()+"Rs");
        }
    }

    public int getPrice(String item) {
        return menu.get(item);
    }

    public boolean hasItem(String item) {
        return menu.containsKey(item);
    }
}



