package Java101;

class JavaPolymorphism {


	
	public void animalSound() {
	
	System.out.println("The animals makes a sound");
}	
	
	
}

    class Pig extends JavaPolymorphism  {
    	
    	public void animalSound1() {
    		System.out.println("The Pig says yo");
    		
    	}
    }
    
    class Dog extends JavaPolymorphism {
    
    	public void animalSound() {
    	System.out.println("The dog says bow wow wow yipee yaay yipee yoo");
    	
    }
    
    	
    }  
    
    class MyMainClass {

public static void main(String[] args) {
	
	JavaPolymorphism myAnimal = new JavaPolymorphism();
	Pig myPig = new Pig();
	Dog myDog = new Dog();
	
	
	//myAnimal.animalSound();
	myPig.animalSound1();
	myDog.animalSound();
	

		
		
	}

}
