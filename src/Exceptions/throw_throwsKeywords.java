package Exceptions;

public class throw_throwsKeywords {
	
	/* throws Keyword:
	   throws keywords indicates what exception type may be thrown by a method. It give information to the programmer 
	   that there may occur an exception in the method, so it is better to do exception handling in the code so that 
	   normal flow can be maintained.
	   syntax: return_type method_name() throws exception_class_name{
	           }
	   It only indicates that this method may give mentioned exception.
	*/
	
	
	/* throw keyword
			the throw keyword is used to create a custom error. It is used to throw a single exception for a method.
			it is not used to handle exception.
			syntax: throw new exception_class("error message")
			Example: throw an exception if age is below 18 - "access denied"
			         if age is 18 or greater than print    - "access granted"
	*/
	
	static void checkAge(int age) throws ArithmeticException {
		
		if(age <18) {
			throw new ArithmeticException("Access denied: age must be greater than 18.");
		}
		else {
			System.out.println("access granted");
			
		}
	}

	public static void main(String[] args) {
		
		//if we make exception true than "Hello" will not print because here we did not handle the exception.
//		checkAge(11);
//		System.out.println("Hello");
		
		
		// here we handle the exception so the rest of the code after exception will be printed.
		try {
			checkAge(1);
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
		
		System.out.println("After handling the exception i printed successfully");
		
		
		
	}

}
