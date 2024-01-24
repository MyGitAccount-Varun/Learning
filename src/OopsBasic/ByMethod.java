package OopsBasic;

public class ByMethod {
	
	//instance variable
	String name;
	int rollNo;
	
	//method to insert records
	void insertRecords(String Name, int RollNo) {
		
		name = Name;
		rollNo = RollNo;
	}
	
	//method to display information
	void displayInformation() {
		
		System.out.println("Name of student: "+ name);
		System.out.println("RollNo. of student: " + rollNo);
		
	}
	
	//here the main method covers in "Main" class because execution always starts with main method
	//and as per the JAVA OOPS standards, main method should be separate
	
	
	
}
