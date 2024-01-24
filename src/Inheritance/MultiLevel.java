package Inheritance;

//parent class
class Aa {
	int a;
	
	void displayA(){
		System.out.println("Class A: "+ a);
	}
}

//child class
class Bb extends Aa{
	int b;
	
	void displayB(){
		System.out.println("Class B: "+ b);
	}
}

//GrandChild class
class Cc extends Bb{
	int c;
	
	void displayC() {
		System.out.println("Class C: "+ c);
	}
}



//here we perform multi level inheritance, where one child class and one grandChild accessing the variable and method of parent class.

public class MultiLevel {

	public static void main(String[] args) {
		
		Aa obj1 = new Aa();
		obj1.a = 90;
		obj1.displayA();
		
		System.out.println("below is the child class(B) which accessing all variables nd methods of parent class(A) including its own class");
		
		Bb obj2 = new Bb();
		obj2.b = 900;
		obj2.a = 91;
		
		obj2.displayA();
		obj2.displayB();
		
		System.out.println("below is the grandChild class(C) which accessing all variables nd methods of parent class(A and B) including its own class");
		
		Cc obj3 = new Cc();
		obj3.a = 92;
		obj3.b = 901;
		obj3.c = 20;
		
		obj3.displayA();
		obj3.displayB();
		obj3.displayC();
				
	}

}
