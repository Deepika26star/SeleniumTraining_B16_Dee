package oopsConcepts.polymorphism;

public class SBI_Bank extends RBI_Bank{
	
	public double homeLoanRateOfInterest() {
		System.out.println("I am in SBI_Bank ");
		//return 6.5; // Base rate of interest
		return 7.0;  // (Rate of interest+profit)
	}
	
	public double personalLoanRateOfInterest() {
		System.out.println("I am in SBI_Bank ");
		//return 8.9;
		return 10.50;
	}

	public double creditCardRateOfInterest() {
		System.out.println("I am in SBI_Bank ");
		return 20.29;
	}
}
