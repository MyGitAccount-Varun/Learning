package Exceptions;

public class ExceptionHandling {

	public static void main(String[] args) {
	
		//Arithmetic Exception Handling
//		try {
//		int a = 100/0;
//		}
//		catch(ArithmeticException e) {
//		System.out.println(e.toString());
//		}
//		
		
		
		//Null Point Exception handling
//		try {
//		String a = null;
//		System.out.println(a.length());
//		}
//		catch(NullPointerException e){
//		System.out.println(e.toString());
//		}
		
		
		//Array Index Out of Bond
//		try {
//		int a[] = new int[5];
//		a[5]= 7;
//		System.out.println(a[4]);
//		}
//		catch(ArrayIndexOutOfBoundsException e) {
//		System.out.println(e.toString());
//		}
		
		
		//Number format Exception
//		try {
//		String a = "abc";
//		int b = Integer.parseInt(a);
//		System.out.println(b);
//		}
//		catch(NumberFormatException e) {
//			System.out.println(e.toString());
//		}
		
		
		//finally keyword 
		// if execution found exception in try block then goes to catch and then finally block
		// if execution found no exception in try block then goes directly to finally block.
		// means finally block execute for sure no matter execution occur or not.
		try {
			String a = "abc";
			int b = Integer.parseInt(a);
			System.out.println(b);
			}
			catch(NumberFormatException e) {
				System.out.println(e.toString());
			}
		finally{
			System.out.println("final block executed");
		}
		
		
		
		
		
		
		
		
	}

}
