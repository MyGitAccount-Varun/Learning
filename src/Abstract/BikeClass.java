package Abstract;

/*
 * An abstract class must be declared with an abstract keyword.
 * abstract class can have abstract and non-abstract methods. 
 * abstract method does not have body. The body is provided by subclass/child class
 * It can not be directly instantiated. To access it, it must be inherited from another class.
 * It can have constructors and static methods.
 * It can have final method, which can force the subclass not to change body of the method.
 */

public abstract class BikeClass {
	
	//constructor
	BikeClass(){
		
		System.out.println("I am BikeClass constructor");
	}
	
	//abstract method
	abstract void run(); //Rule: abstract method does not have body
	                     //we cannot implement abstract method in abstract class, So we do in subclass by extend.
	
	
	//non-abstracted method
	void start() {
		System.out.println("I am non abstracted method(start) :)");
	}
	
	
	//static method
	static void stop() {
		System.out.println("I am static method(stop) :)");
	}
	
	//final method
	final void halt() {
		System.out.println("I am final method, i cannot be override");
	}
	
	

}
