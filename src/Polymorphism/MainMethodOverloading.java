package Polymorphism;

public class MainMethodOverloading {

	void main(int a) {
		System.out.println("a: "+ a);
	}
	
	void main(double a) {
		System.out.println("a: "+ a);
	}
	
	void main(int a, int b) {
		System.out.println("a: "+ a);
		System.out.println("b: "+ b);
	}
	
	
	public static void main(String[] args) {
		
		MainMethodOverloading obj1 = new MainMethodOverloading();
		obj1.main(5);
		obj1.main(5.5);
		obj1.main(5,5);
		
		
		
	}

}
