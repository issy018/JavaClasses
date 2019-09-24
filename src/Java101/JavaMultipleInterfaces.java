package Java101;

  interface JavaMultipleInterfaces {

  public void myMethod();
  
  }

  interface SecondInterface {
	  
  public void myOtherMethod();
  
  }
	
  
  class DemoClass implements JavaMultipleInterfaces, SecondInterface {
	  
	  public void myMethod() {
		  System.out.println("Some text.....");
	  }
	  
	  public void myOtherMethod() {
		  System.out.println("Some other text.....");
	  }
	  
  }
  
  class MyMainClass {
	  
	  public static void main(String[] args) {
		  
		  DemoClass myObj = new DemoClass();
		  myObj.myMethod();
		  myObj.myOtherMethod();
  }
	

		
		
		
	}


