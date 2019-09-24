package Java101;

public class JavaConstructorParameter {

	int x;
	
	public JavaConstructorParameter(int y) {
		
		x = y;
	}
	
	
	public static void main(String[] args) {
		
		JavaConstructorParameter myObj = new JavaConstructorParameter(5);
		
		System.out.println(myObj.x);

		
		
	}

}
