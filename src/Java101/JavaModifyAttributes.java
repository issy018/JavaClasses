package Java101;

public class JavaModifyAttributes {

	int x = 10;
	final int y =20;
	
	public static void main(String[] args) {
		
		JavaModifyAttributes myObj = new JavaModifyAttributes();
		myObj.x = 100;
		//myObj.y = 20;
		System.out.println(myObj.x);
		
		System.out.println(myObj.y);

	}

}
