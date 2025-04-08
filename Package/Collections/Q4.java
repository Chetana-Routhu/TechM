package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q4 {

	public static void main(String[] args) {
		List<Integer> li = new ArrayList<>();
		li.add(4);
		li.add(3);
		li.add(2);
		li.add(5);
		li.add(6);
		Collections.sort(li);
		System.out.println("min:"+li.get(0));
		System.out.println("max:"+li.get(li.size()-1));

	}

}
