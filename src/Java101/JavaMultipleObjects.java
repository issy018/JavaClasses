package Java101;

public class JavaMultipleObjects {

    
	int x = 5 ;
	
	 
	public static void main(String[] args) {
		
		JavaMultipleObjects myObj1 = new JavaMultipleObjects();
		JavaMultipleObjects myObj2 = new JavaMultipleObjects();
		
		
		System.out.println(myObj1.x);
		System.out.println(myObj2.x);
	}

}
