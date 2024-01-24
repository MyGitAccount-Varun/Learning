package OopsBasic;


public class ByReferenceVariable {

	//instance variable
	String name;
	int rollNo;
	
	//method to display information
	void displayInformation() {
		System.out.println("Name of Student: " + name);
		System.out.println("Roll No. of student: " + rollNo);
	}
	
	public static void main(String[] args) {
		
		//creating object where 'new' is object of class and 'student1/2' is reference variable
		ByReferenceVariable student1 = new ByReferenceVariable();
		ByReferenceVariable student2 = new ByReferenceVariable();
		
		//initialize object/store data to the object student1 and student2
		student1.name = "Varun";
		student1.rollNo = 101;
		
		student2.name = "Swati";
		student2.rollNo = 102;
		
		//print information of student1/2
		
		student1.displayInformation();
		student2.displayInformation();
		
		
	}

}
