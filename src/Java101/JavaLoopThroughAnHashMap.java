package Java101;

import java.util.HashMap;

public class JavaLoopThroughAnHashMap {

	public static void main(String[] args) {
		
  HashMap<String, String> capitalCities = new HashMap<String, String>();
		
		capitalCities.put("England", "London");
		capitalCities.put("Germany", "Berlin");
		capitalCities.put("Norway", "Oslo");
		capitalCities.put("Nigeria", "Abuja");
		
		
		//Print Keys
	/*for (String i :capitalCities.keySet()) {
		System.out.println(i);
		
		
		//Print Values
		
	for (String i :capitalCities.values()) {
		System.out.println(i);
	}*/
		
	
		//Print keys and values
		
		for (String i :capitalCities.keySet()) {
			System.out.println("key:" + i + "value:" + capitalCities.get(i));
			

	}
		
	}

}
