package Inheritance;

//parent class
class A {
	int a;
	
	void displayA(){
		System.out.println("Class A: "+ a);
	}
}

//child class
class B extends A{
	int b;
	
	void displayB(){
		System.out.println("Class B: "+ b);
	}
}


//here we perform single level inheritance, where one child class accessing the variable and method of parent class.

public class SingleLevel {

	public static void main(String[] args) {
		
		A obj1 = new A();
		obj1.a = 90;
		obj1.displayA();
		
		System.out.println("below is the child class(B) which accessing all variables nd methods of parent class(A) including its own class");
		
		B obj2 = new B();
		obj2.b = 900;
		obj2.a = 91;
		
		obj2.displayA();
		obj2.displayB();
		
		
		
	}

}
