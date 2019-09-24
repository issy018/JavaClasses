package Java101;

public class JavaExceptionsTryCatch {

		static void checkAge (int age) {
			if (age < 18) {
				throw new ArithmeticException ("Access denied - You must be at least 18 years old");
			} else {
				System.out.println("Access granted - You are old enough!");
			}
		}
		
		public static void main(String[] args) {
		   // checkAge(15);
		    
		    
		/*try {
			int [] myNumber = {1,2,3};
			System.out.println(myNumber[10]);
		} catch(Exception e) {
			System.out.println("Something went wrong");
			
		}*/
		
		// finally
		
		try {
			int [] myNumber = {1,2,3};
			System.out.println(myNumber[10]);
		} catch(Exception e) {
			System.out.println("Something went wrong");
			
		} finally {
			System.out.println("The 'try catch' is finished");
		}

		// The Throw Keyword
		
		
	}
}

