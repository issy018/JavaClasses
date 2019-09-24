package Java101;


enum Size {
	
	LOW,
	MEDIUM,
	HIGH
}


public class JavaLoopThroughAnEnum {

	public static void main(String[] args) {
		

	for (Size myVar: Size.values()) {
		
		System.out.println(myVar);
		
	}
	}

}
