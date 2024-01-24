package Overriding;

/* Rules of overriding
 * method must have the same name as in the parent class.
 * method must have the same parameter as in the parent class.
 * a method declared as 'final' cannot be overridden.
 * a method declared as 'static' cannot be overridden.
 * the access level of method cannot be more restrictive than the overridden methods access level.
 */




class Bank{
	
	double getRateOfInterest() {
		
		return 2.5;
	}
}


class AxisBank extends Bank{
	
	double getRateOfInterest() {  // same method definition as parent class : overridden
		return 4;
	}
}


class SBIBank extends Bank{
	
	double getRateOfInterest() {
		return 6;
	}
}


class HDFCBank extends Bank{
	
	double getRateOfInterest() {
		return 7;
	}
}


public class overRiding {
	
	public static void main(String[] args) {
		
		AxisBank objAxis = new AxisBank();
		double rate1 = objAxis.getRateOfInterest();
		System.out.println("rate of interest of axis bank is: " + rate1);
		
		SBIBank objSBI = new SBIBank();
		double rate2 = objSBI.getRateOfInterest();
		System.out.println("rate of interest of SBI bank is: " + rate2);
		
		HDFCBank objHDFC = new HDFCBank();
		double rate3 = objHDFC.getRateOfInterest();
		System.out.println("rate of interest of HDFC bank is: " + rate3);

	}

}
