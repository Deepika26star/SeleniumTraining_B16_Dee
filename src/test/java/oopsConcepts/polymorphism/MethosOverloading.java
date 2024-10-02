package oopsConcepts.polymorphism;

public class MethosOverloading {
	
	public static void main(String[] args) {
		addtion(10,20);
		addtion(10,2059353224354.575454564);
		
		addtion(10,20, "hello");
		addtion(10,20,4535);
		
		
	}
	
	public static void addtion(int a, int b) {
		System.out.println("Addition :" +(a+b));
		
	}
	
	public static void addtion(int a, double b) {
		System.out.println("Addition :" +(a+b));
		
	}
	
	public static void addtion(int a, int b, int c) {
		System.out.println("Addition :" +(a+b+c));
		
	}
	
	public static void addtion(int a, int b, String msg) {
		System.out.println("Addition :" +(a+b)+msg);
		
	}
	
}
