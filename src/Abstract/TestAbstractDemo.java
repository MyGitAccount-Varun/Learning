package Abstract;

public class TestAbstractDemo {

	public static void main(String[] args) {
		
		
		System.out.println("Yamaha Class");
		System.out.println("");
		
	//	BikeClass obj = new BikeClass(); //cannot directly instantiate the abstract class
		BikeClass obj = new Yamaha(); // by this BikeClass constructor will call first automatically
		
		
		obj.start(); //non-abstract method
		obj.run();   //abstract method
		BikeClass.stop();  //static method
	//	obj.halt();            // throw error while executing overridden method halt
		
		System.out.println("");
		System.out.println("Honda Class");
		System.out.println("");

		obj = new Honda();
		
		obj.start(); //non-abstract method
		obj.run();   //abstract method
		BikeClass.stop();  //static method,,,,, static method can only called by class name not by object
		
		System.out.println("");
		System.out.println("Bajaj Class");
		System.out.println("");
		
		obj = new Bajaj();
		
		obj.start(); //non-abstract method
		obj.run();   //abstract method
		BikeClass.stop();  //static method
		
		
		
		
	}

}
