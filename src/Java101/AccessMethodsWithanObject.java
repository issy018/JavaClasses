package Java101;

public class AccessMethodsWithanObject {
	
	public void fullThrottle() {
		System.out.println("The car is going as fast as it can !");
	}
	
	public void speed(int maxspeed) {
		System.out.println("Max speed is:" + maxspeed);
	}

	public static void main(String[] args) {
		AccessMethodsWithanObject myCar = new AccessMethodsWithanObject();
		
		myCar.fullThrottle();
		myCar.speed(200);

	}

}

