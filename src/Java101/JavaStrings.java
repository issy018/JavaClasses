package Java101;

public class JavaStrings {
	public static void main (String []args) {
		
		
	String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String txt1 = "Hello World";
	String txt2 = "Please locate where 'locate' occurs !";
	String FirstName = "Josh";
	String LastName = "Doe";
	
	
	
	//Print UpperCase
	System.out.println(txt1.toUpperCase());
	
	//Print LowerCase
	System.out.println(txt1.toLowerCase());
	
	//Return the length of the string
	System.out.println("the length of the txt string is:" +" " + txt.length());
	
	//finding a string in a string
	System.out.println(txt2.indexOf("locate"));
	
	
	//String Concatenaion
	System.out.println(FirstName.concat(LastName));
	}

}
