package Polymorphism;

public class MethodOverloading {

	//polymorphism: it is of multiple forms and overloading is an approach to implement polymorphism.
	//two types of overloading are -> 1) method overloading 2) constructor overloading
	//Method Overloading: with method overloading, multiple methods can have the same name but with different parameter numbers and data types.
	// method overloading saves the memory and increase the readability of the program.
	// we can overload the methods by changing no. of parameters and by changing the data type.
	
	void add(int a, int b) {
		System.out.println("addition of both int data type: " + (a+b));
	}
	
	void add(int a, double b) {
		System.out.println("addition of one int and one double data type"+ (a+b));
	}
	
	void add(double a, double b) {
		System.out.println("addition of both double data type: "+ (a+b));
	}
	
	void add(int a, int b, int c) {
		System.out.println("addition of 3 int data type: "+ (a+b+c));
	}
	
	//above methods have same method name but different data type and different parameters.
	
	public static void main(String[] args) {
		
	//below we calling all above methods present with same name but passing different data types values.

		MethodOverloading obj = new MethodOverloading();
		
		obj.add(5, 5);
		obj.add(2.5, 5.2);
		obj.add(5 , 1.8);
		obj.add(2, 2,6);
		obj.add(2.7, 5);
		
		
		
		
		
	}

}
