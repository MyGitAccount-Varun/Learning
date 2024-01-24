package Inheritance;

class parent{
	int a;
	
	void displayParent() {
		System.out.println("parent class: " + a);
	}

}

class child1 extends parent{
	int b;
	
	void displayChild1() {
		
		System.out.println("child1 class: " + b);
	}
	
}

class child2 extends parent{
	int c;
	
	void displayChild2() {
		System.out.println("child2 class: "+ c);
	}
}

public class HierarchicalLevel {

	public static void main(String[] args) {
		
		parent obj1 = new parent();
		obj1.a = 5;
		obj1.displayParent();
		
		System.out.println("below is child1 class execution");
		
		child1 obj2 = new child1();
		obj2.a = 50;
		obj2.displayParent();
		obj2.b = 5;
		obj2.displayChild1();
		
		System.out.println("below is child2 class execution");
		
		child2 obj3 = new child2();
		obj3.a = 51;
		obj3.displayParent();
		obj3.c = 10;
		obj3.displayChild2();
		
	}

}
