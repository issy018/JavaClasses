package Java101;

public class JavaMultipleObjects2 {

	
	  int x = 5;
	
	
	public static void main(String[] args) {
		
		JavaMultipleObjects2 myObj1 = new JavaMultipleObjects2();
		JavaMultipleObjects2 myObj2 = new JavaMultipleObjects2();
		
		myObj1.x = 6;
		//myObj2.x = 9;
		
		System.out.println(myObj1.x);
		//System.out.println(myObj1.x);

	}

}
