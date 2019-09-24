package Java101;


	class JavaInheritance2 extends JavaInheritance {

		private String modelName = "Mustang";
		
		public static void main (String [] args) {
			
			JavaInheritance2 myCar = new JavaInheritance2();
			
			myCar.honk();
			
			System.out.println(myCar.brand + " " + myCar.modelName);
		}
	
}
