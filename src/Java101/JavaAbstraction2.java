package Java101;

class JavaAbstraction2 extends JavaAbstraction {
	
	public void animalSound() {
		
		System.out.println("The pig says : fuck off");
		
		}
	
	
	
	public static void main(String[] args) {

		JavaAbstraction2 myPig = new JavaAbstraction2();
		
		myPig.animalSound();
		myPig.sleep();
		
	}

}
	


