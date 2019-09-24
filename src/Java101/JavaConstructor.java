package Java101;

public class JavaConstructor {

	
	int x;
	
	public JavaConstructor() {
		x = 60;
	}
	
	public static void main(String[] args) {
		
		JavaConstructor myObj = new JavaConstructor();
		
		System.out.println(myObj.x);

	}

}
