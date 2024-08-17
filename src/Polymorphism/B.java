package Polymorphism;// method overriding

public class B extends A{
	
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		
		b.greeting();// only need to change object then reseult shown of both class A and B
	}
	
	public void greeting() { // same method but diff priting statment
		System.out.println("Good Evening");
	}

}
