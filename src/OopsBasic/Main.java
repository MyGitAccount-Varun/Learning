package OopsBasic;

public class Main {

	public static void main(String[] args) {
		
		//here we are calling method from "ByMethod" class.
		//creating object where 'new' is object of class and 'student1/2' is reference variable

		ByMethod student1 = new ByMethod();
		ByMethod student2 = new ByMethod();
		
		//initialize object/store data to the object student1 and student2
		student1.insertRecords("Varun", 101);
		student2.insertRecords("Swati", 102);
		
		//print information of student1/2
		
		student1.displayInformation();
		student2.displayInformation();
	}

}
