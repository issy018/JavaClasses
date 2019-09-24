package Java101;

import java.io.FileWriter;
import java.io.IOException;

public class JavaWriteToAFile {

	public static void main(String[] args) {
		
		try {
			FileWriter myWriter = new FileWriter("filename.txt");
			
			myWriter.write("Files in Java might be tricky, but its fun");
			
			myWriter.close();
			
			System.out.println("Succesfully wrote to the file");
		}
		catch(IOException e){
			System.out.println("An error ocurred");
			e.printStackTrace();
			
		}

	}

}
