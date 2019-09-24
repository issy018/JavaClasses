package Java101;

interface JavaInterface {

	public void animalsound();
	
	public void sleep();

	}

   class Pig implements JavaInterface {

	public void animalsound() {
		
		System.out.println("The pig says jack is a plum");
			
    }
	
	public void sleep() {
		System.out.println("zzz");
	}
}

    class JavaInterface3 {

	public static void main(String[] args) {

		Pig myPig = new Pig();
		
		myPig.animalsound();
		myPig.sleep();
		
	}

}
