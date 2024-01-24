package Constructor;

public class Parameterized {

	String name;
	int manufacture;
	
	Parameterized(String carName, int year){
	 
		this.manufacture = year;    
		this.name = carName;
	}
	
	
	
	
	public static void main(String[] args) {
	

		Parameterized obj = new Parameterized("Amaze",2022);
		System.out.println("Car description is: "+ obj.name + " " + obj.manufacture);
		
		
	}

}
