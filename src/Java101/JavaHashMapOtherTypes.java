package Java101;

import java.util.HashMap;

public class JavaHashMapOtherTypes {

	public static void main(String[] args) {
		
		HashMap<String, Integer> people = new HashMap<String, Integer>();
		
		
	people.put("John", 32);
	people.put("Steve", 34);
	people.put("Angie", 38);
	
	
	for (String i : people.keySet() ) {
		System.out.println("Key:" + i + " " + "value:" + people.get(i));
	}

	}

}
