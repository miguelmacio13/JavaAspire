package chapter12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class Collections {
	public static void main(String args[]) {
		
		
		//Set (unique and unordered)
		HashSet<String> fruit = new HashSet<String>();
		
		fruit.add("apple");
		fruit.add("lemon");
		fruit.add("banana");
		fruit.add("orange");
		fruit.add("lemon");
		
		System.out.println(fruit.size());
		System.out.println(fruit);
		
		
		//List (ordered and duplicates allowed)
		List<String> fruit2 = new ArrayList<String>();
		
		fruit2.add("apple");
		fruit2.add("lemon");
		fruit2.add("banana");
		fruit2.add("orange");
		fruit2.add("lemon");
		
		System.out.println(fruit2.get(2));
		System.out.println(fruit2.size());
		System.out.println(fruit2);
		
		
		//Queue: ordered elements to be processed FIFO
		Queue<String> fruit3 = new LinkedList<String>();

		fruit3.add("apple");
		fruit3.add("lemon");
		fruit3.add("banana");
		fruit3.add("orange");
		fruit3.add("lemon");
		
		System.out.println(fruit3.size());
		System.out.println(fruit3);
		
		fruit3.remove();
		System.out.println(fruit3);
		
		System.out.println(fruit3.peek());
		
		
		//Map Unordered unique key-value pairs.
		Map<String, Integer> fruitCalories = new HashMap<String, Integer>();
		fruitCalories.put("apple", 95);
		fruitCalories.put("lemon", 20);
		fruitCalories.put("banana", 105);
		fruitCalories.put("orange", 45);
		fruitCalories.put("lemon", 17);
		
		System.out.println(fruitCalories.size());
		System.out.println(fruitCalories);
		
		System.out.println(fruitCalories.get("lemon"));
		
		System.out.println(fruitCalories.entrySet());
		
		fruitCalories.remove("orange");
		System.out.println(fruitCalories);
		
	}
	
	
}
