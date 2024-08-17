package Polymorphism;// Method overloading example

public class Sample {
	
	public static void main(String[] args) {
		Sample sample = new Sample();
		sample.sum();
		sample.sum(1,1);// passing paramter 2nd method call
	}
	
	public void sum() { // 1 calss me multiple method with same method name but diff paramter in same class called method overloading
		 // compile time poly
		int a = 10;
		int b = 20;
		int sum = a+b;
		
		System.out.println("Sum is "+sum);
	}

	public void sum(int a, int b) {
		
		int sum = a+b;
		System.out.println("Sum is "+sum);
		
	}
}
