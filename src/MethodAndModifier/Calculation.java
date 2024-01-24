package MethodAndModifier;

 /*
  Here we cover - 
  1. Syntax of method.
  2. How to create method.
  3. How to call method.
  4. Static vs Non-Static method.
  5. what is parameter and arguments and their difference.
  6. return type.
  7. public and private and default modifier(in AccessModifier class)

 */
public class Calculation {
	
	/*     SYNTAX OF METHOD
	
	AccessModifier returnType nameOfMethod(Parameter List) {
		
		method body
		return();       -> method will exit after return statement and should be equal to returnType.
	}
   */
	
	
	
	
	
	// STATIC METHOD
	static void methodOne() {
		
		System.out.println("Welcome Java");
	}
	
	
	// NON-STATIC METHOD
	void methodTwo() {
		System.out.println("Welcome again Java");
	}
	
	
	
	
	
	
	//Parameter List
	static void methodThree(int a, int b) {                           // here (int a, int b) is parameter.
		
		System.out.println("sum of a and b is: " + (a+b));
		
	}
	
	
	//return type method
	static int methodFour(int c, int d) {
		
		return(c*d);
	}
	
	//return type method - 2
	static int minimum(int e, int f) {
		if(e>f) 
			return f;
		else
			return e;
		
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {

		//calling static method
		methodOne();    //for static method we can call it by only its name
		
		//calling non-static method
		Calculation NonStatMethd = new Calculation();
		NonStatMethd.methodTwo();
		
		
		//calling parameterList method
		methodThree(2,3);                                                       //here (2,3) is argument
		
		//calling return type method
		int cal = methodFour(2,3);
		System.out.println("calculation of c and d is: " + cal);
		
		//calling return method-2
		int min = minimum(4,5);
		System.out.println("minimum value inside minimum method is: " + min);
		System.out.println(minimum(4,5));    //can also write statement in this way
		
		
		
		
		
		
		
	}

}

/*
 - Keywords are reserved words in Java that serve as a code key. 
 - These words can't be used for anything else because they're predefined. 
 - They can't be used as a variable name, object name, or any other identifier. 
 - There are 51 reserved terms or keywords in Java.
 
abstract -	Indicates the class or method that follows this keyword is abstract and that will have to be implemented by a subclass.
assert	 -  Assert keyword helps the programmer to declare assertions or assumptions in a program. If an assertion is true, program progresses normally otherwise the AssertionError is thrown at runtime and program aborts.
boolean	 -  Defines two Boolean values, true or false, 0 and 1.
break	 -  Used to break out of loops or iterative constructs.
byte	 -  Data type capable of holding 8-bit data.
case	 -  Marks blocks of text (cases) in a Switch statement.
catch	 -  Used to catch exceptions generated in the try block.
char	 -  Data type able to hold unsigned 16-bit Unicode characters.
class	 -  Used to declare a new class.
continue -  It helps to take control outside the loop and continue to the next iteration.
default	 -  Defines the "block of code" that will execute by default in a Switch statement.
do	     -  Starting keyword for "do-while" loop.
double	 -  Data type holding 64-bit numbers (floating-point).
else	 -  Defines else part in the 'if' statements.
enum	 -  Used to declare enumerations in Java.
extends	 -  Indicates inheritance. A class is derived or inherited from another class.
final	 -  Defines a variable which will hold constant values or a method that cannot be overridden.
finally	 -  Defines the finally block that executes after the try-catch block irrespective of whether the exception was caught or not.
float	 -  Data type able to hold 32-bit floating-point values.
for	     -  Indicates the start of a 'for' loop.
if	     -  Start of 'if' statement.
implements-	Indicates that a class implements an interface.
import	 -  Used to include or reference other packages/classes into the program.
instanceOf-	Used to check if the given object is an instance of another class.
int	     -  Data type to hold a 32-bit integer value.
interface- 	Used for declaring an interface.
long	 -  Data type holding 64-bit integer values.
native	 -  Used to indicate native code (platform-specific).
new	     -  Operator to create a new object.
null	 -  Indicates null reference.
package	 -  Keyword to declare Java package.
private	 -  Indicates private access specified which means a variable or method can be accessed only by the class in which it is declared.
protected-	This keyword indicates a protected access specifier. When a variable or method is protected then that variable or method can be accessed only by the class they are declared in, its subclass, and other classes in the same package.
public	 -  The public keyword is used to indicate public access specifier. A variable, method, classes, interfaces declared as public can be accessed throughput the application.
return	 -  Return is used to send back the value of a method to the calling method. It also is used to return the control to the calling method.
short	 -  Data type holding 16-bit integer number values.
static	 -  The static keyword indicates the method or a variable is static and cannot be instantiated.
strictfp -	The keyword strictfp restricts the rounding and precision of floating point values calculation. It ensures portability.
super	 -  Indicates base or superclass of the class.
switch	 -  Indicates a Switch statement that tests a condition and executes multiple cases depending on the test value.
synchronized-	Indicates synchronized sections for multithreaded code like critical section.
this	 -  The keyword 'this' indicates the current object.
throw	 -  Throws an exception.
throws	 -  This indicates the exception that can be thrown by a method.
transient-	Specifies transient variable that is not part of the persistent state of an object.
try	     -  Try keywords start a block that contains code that might raise exceptions.
void	 -  Indicates no return value.
volatile -	Used to define variables that are not stored in Main Memory. They can be changed asynchronously.
while	 -  Keyword while starts a while loop.
const	 -  The 'const' keyword is no more supported in Java
goto	 -  The 'goto' keyword is no more supported in Java
true, false and null -  The words "true, false, null" are literals. Still, we cannot use them as identifiers in the program.
*/