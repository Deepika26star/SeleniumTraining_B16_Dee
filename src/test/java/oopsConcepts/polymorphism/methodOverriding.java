package oopsConcepts.polymorphism;

public class methodOverriding {

	public static void main(String[] args) {
		
		RBI_Bank rbSBI = new SBI_Bank();
		
		System.out.println(rbSBI.homeLoanRateOfInterest());
		System.out.println(rbSBI.personalLoanRateOfInterest());
		System.out.println("##################################");
		
		RBI_Bank rb_icici = new ICICI_Bank();
		
		System.out.println(rb_icici.homeLoanRateOfInterest());
		System.out.println(rb_icici.personalLoanRateOfInterest());
		System.out.println("##################################");
		
		RBI_Bank rb_HD = new HDFC_Bank();
		
		System.out.println(rb_HD.homeLoanRateOfInterest());
		System.out.println(rb_HD.personalLoanRateOfInterest());
		System.out.println("##################################");
		
		System.out.println("####################RBI S#############");
		RBI_Bank rb = new RBI_Bank();
		System.out.println(rb.homeLoanRateOfInterest());
		System.out.println(rb.personalLoanRateOfInterest());
		System.out.println("####################RBI E#############");
		
	}
}
