package Abstract_cls;

public class B extends A { // class created because of i want to call test 1 and test 2 methid using object with inheritance 
	//(Concreate class)// need to complete incomplete method from class A

	
	public static void main(String[] args) {
		
		B b = new B();
		b.test5();
		b.test1();
		b.test3();
		b.test4();
		
		
	}
	
	@Override
	public void test3() {
		System.out.println("Class A method completed in concrete class");
		
	}

	@Override
	public void test4() {
	
		System.out.println("Class A method completed in concrete class");
	} 
	
	public void test5() {
		System.out.println("Class B own method	");
	}
	
	
	
	
	
}
