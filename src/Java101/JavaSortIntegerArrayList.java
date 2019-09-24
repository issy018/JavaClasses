package Java101;

import java.util.ArrayList;
import java.util.Collections;

public class JavaSortIntegerArrayList {

	public static void main(String[] args) {
		
ArrayList<Integer> cars = new ArrayList<Integer>();
		
		cars.add(22);
		cars.add(46);
		cars.add(78);
		cars.add(102);
		cars.add(48);
		
		Collections.sort(cars);
		
		for(int i:cars) {
			System.out.println(i);
		}

	}

}
