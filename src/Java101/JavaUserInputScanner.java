package Java101;

import java.util.Scanner;

class JavaUserInputScanner {

	public static void main(String[] args) {
		
	Scanner myObj = new Scanner (System.in);
	
	
	System.out.println("Enter username");
	
	
	String username  = myObj.nextLine();
	
	System.out.println("Username is" + username);
	
		
	}

}
