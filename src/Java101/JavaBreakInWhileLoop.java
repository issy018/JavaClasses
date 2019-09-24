package Java101;

public class JavaBreakInWhileLoop {

	public static void main(String[] args) {
		int i=4;
		while(i<10) {
			System.out.println(i);
			i++;
			if(i==4) {
				break;
			}
		}
		
	}

}
