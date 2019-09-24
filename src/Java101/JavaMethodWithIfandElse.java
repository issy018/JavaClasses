package Java101;

public class JavaMethodWithIfandElse {

	static void checkAge(double age) {
		if (age< 18) {
			System.out.println("Access denied - You are not old enough!");
		}else {
			
			System.out.println("Access granted - You are old enough!");
		}
	}
	public static void main (String args[]) {
		
		checkAge(20);
		
		}

	}


