package Java101;

public class JavaConstructorParameter2 {
	
	int modelYear;
	String modelName;

	public JavaConstructorParameter2(int year , String name) {
		
		modelYear = year;
		modelName = name;
	}
	
	
	public static void main(String[] args) {
		
		JavaConstructorParameter2 myCar = new JavaConstructorParameter2(1969 , "Mustang");
		
		System.out.println(myCar.modelYear + " " + myCar.modelName);

	}

}
