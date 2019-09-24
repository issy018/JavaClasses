package Java101;

public class JavaArrays {

	public static void main(String[] args) {
		
		
		//String [] cars = {"BMW","Benz","Peoguet","Mazda"};
		//cars[0] = "Opel";
		
		// Position of an element in an Array
		
		//System.out.println(cars[0]);
		
		//length of an Array
		
		//System.out.println(cars.length);
		
		//Loop through an Array with the For-Loop*/
		
		/*for (int i = 3; i < cars.length; i++) {
		
			System.out.println(cars[i] + " ");
			
		}*/
		
		//Loop through an Array with the FOR-EACH Loop
		/*for (String i : cars) {
			System.out.println(i);
		}*/
		
		// Multi-Dimentional Array
		
		int [][] myNumbers = {{1,2,3,4},{5,6,7}};
		int x = myNumbers [1][2];
		System.out.println(x);
		
		//Using the For-Loop inside another For-Loop to print the elements of a two-dimensional array
		
		for (int i = 0; i < myNumbers.length; ++i) {
			for (int j = 0; j < myNumbers[i].length; ++j) {
				System.out.println(myNumbers[i][j]);
			}
		}

	}

}
