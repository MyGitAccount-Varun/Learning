package Constructor;

public class Main {

	//1. constructor name must be the same as its class name.
	//2. constructor must have no explicit return type.
	//3. java constructor cannot be abstract, static and final.
	//     static: because constructor is called through object and static method can be called directly without object.
	//     final:  because constructor nature is to be modified and final method cannot be modified.
	//4. constructor can be private, protected, public or default.
	
	
	//attribute of class
	int a; 
	
	//zero parameterize constructor
	Main(){                            //here method name is same as class name
	a=10;	//initialize value to the attribute
	}
	
	
	public static void main(String[] args) {

		Main one = new Main();
		System.out.println(one.a);
		one.a = 20;
		System.out.println(one.a);
		
	}

}
