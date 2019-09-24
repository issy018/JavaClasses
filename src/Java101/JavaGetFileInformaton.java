package Java101;

import java.io.File;

public class JavaGetFileInformaton {

	public static void main(String[] args) {
		
     File myObj = new File("filename.txt");
		
		if(myObj.exists()) { 
			
			System.out.println("The file name:" + myObj.getName());
			System.out.println("Absolute path:" + myObj.getAbsolutePath());
			System.out.println("Writable:" + myObj.canWrite());
			System.out.println("Readable:" + myObj.canRead());
			System.out.println("File size in bytes:" + myObj.length());
			
			
			
		}else {
			System.out.println("The file does not exist");
		}

		
		
	}

}
