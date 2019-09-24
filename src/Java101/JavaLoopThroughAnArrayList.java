package Java101;

import java.util.ArrayList;

public class JavaLoopThroughAnArrayList {

	public static void main(String[] args) {
		
	
	ArrayList<String> cars = new ArrayList<String>();
	
	cars.add("VW");
	cars.add("Fiat");
	cars.add("Peoguet");
	cars.add("Mercedez");
	cars.add("BMW");
	
	for (int i = 0; i<cars.size(); i++) {
		System.out.println(cars.get(i));
	}

	}

}
