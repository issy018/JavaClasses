package Java101;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class JavaFormattingDateAndTime {

	public static void main(String[] args) {
		
	
		LocalDateTime myDateObj = LocalDateTime.now();
		
		System.out.println("Before formatting:" + " " + myDateObj);
		
		
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd  HH:MM:SS");
		
		
		String formattedDate = myDateObj.format(myFormatObj);
		
		
		System.out.println("After formatting:" + " " + formattedDate);
		

	}

}
