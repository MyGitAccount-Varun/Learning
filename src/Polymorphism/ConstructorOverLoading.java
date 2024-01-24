package Polymorphism;

public class ConstructorOverLoading {

	
	//Constructor Overloading
	
	ConstructorOverLoading(int a){
		System.out.println("print int data type: " + a);
	}
	
	ConstructorOverLoading(double a){
		System.out.println("print double data type: "+ a);
	}
	
	ConstructorOverLoading(int a, int b){
		System.out.println("print sum of int data type"+ (a+b));
	}
		
	
	
	public static void main(String[] args) {
		
		ConstructorOverLoading obj1 = new ConstructorOverLoading(5);
		ConstructorOverLoading obj2 = new ConstructorOverLoading(5.5);
		ConstructorOverLoading obj3 = new ConstructorOverLoading(5,5);
		
	}

}
