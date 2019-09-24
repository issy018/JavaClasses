package Java101;



public class DataTypeCasting {
	
	// Narrowing data type Cast 
		double myDouble = 9.78;
		int myInt = (int) myDouble;
	
	
	
	public static void main (String []args) {
		
		DataTypeCasting G = new DataTypeCasting ();
		
		// Widening data type Cast 
		int myInt = 9;
		double myDouble = myInt;
		
		System.out.println(myInt);
		System.out.println(myDouble);
		System.out.println(G.myInt);
		System.out.println(G.myDouble);
	}

	
	
	
}
