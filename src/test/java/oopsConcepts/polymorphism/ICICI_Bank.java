package oopsConcepts.polymorphism;

public class ICICI_Bank extends RBI_Bank{

	public double homeLoanRateOfInterest() {
		System.out.println("I am in ICICI_Bank ");
		//return 6.5; // Base rate of interest
		return 7.5;  // (Rate of interest)
	}
	
	public double personalLoanRateOfInterest() {
		System.out.println("I am in ICICI_Bank ");
		//return 8.9;
		return 10.9;
	}

	public double creditCardRateOfInterest() {
		System.out.println("I am in ICICI_Bank ");
		return 23.29;
	}
}
