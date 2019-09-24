package Java101;

import java.io.File;
import java.io.IOException;

public class JavaCreateFile {

	public static void main(String[] args) {
		
	try {	File myObj = new File("filename.txt");
		
		if(myObj.createNewFile()) {
		System.out.println("File created:" + myObj.getName());
		
		}
		else {
			
			System.out.println("File already exists");
		}

	}
	catch(IOException e) {
		System.out.println("An error occured");
	}
	
	
	}

}
