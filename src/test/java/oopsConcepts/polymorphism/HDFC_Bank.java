package oopsConcepts.polymorphism;

public class HDFC_Bank extends RBI_Bank{

	public double homeLoanRateOfInterest() {
		System.out.println("I am in HDFC_Bank ");
		//return 6.5; // Base rate of interest
		return 8.0;  // (Rate of interest)
	}
	
	public double personalLoanRateOfInterest() {
		System.out.println("I am in HDFC_Bank ");
		//return 8.9;
		return 11.50;
	}

	public double creditCardRateOfInterest() {
		System.out.println("I am in HDFC_Bank ");
		return 24.99;
	}
}
