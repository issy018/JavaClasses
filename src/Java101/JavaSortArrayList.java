package Java101;

import java.util.ArrayList;
import java.util.Collections;

public class JavaSortArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> cars = new ArrayList<String>();
		
		cars.add("VW");
		cars.add("Fiat");
		cars.add("Peoguet");
		cars.add("Mercedez");
		cars.add("BMW");
		
		
		Collections.sort(cars);
		
		for(String  i:cars) {
			System.out.println(i);
		}

	}

}
