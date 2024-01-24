package MethodAndModifier;

public class AccessModifier {
	
	//access modifier can be used with both instance variable(IV) and methods.
	//public:  IV and methods with public access modifier are accessible anywhere within project only.
	//default: IV and methods with default access modifier are accessible anywhere within package only.
	//private: IV and methods with private access modifier are accessible anywhere within class only.
	
	public String name = "swati";
	
	public void welcomeMessage(String a ) {
		System.out.println("Welcome to testing industry: "+ a);
	}
	
	//if no modifier is written, then it automatically set to default.
	
	
	
	

}
