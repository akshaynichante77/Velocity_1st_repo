package Abstract_cls;

public abstract class A {

	public static void main(String[] args) {
		
		// we can not create body for abstrtact class because we have dont have body for test3() so compilar confuse what shold i run. 

	}
	
	public void test1() {
	System.out.println("Test 1 method");
		
	}
	
	public void test2() {
		System.out.println("test 2 method");
	}
	
	public abstract void test3();//incomplete method because method without body, so it should be abstrat class
	// CLASS AND METHOD BOTH ARE ABSTARCT KEYWORD
	
	public abstract void test4();
	

}
